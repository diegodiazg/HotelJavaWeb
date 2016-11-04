/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webapp.modelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Calendar;

/**
 *
 * @author diego
 */
public class Reservacion extends Conection{
    private int id;
    public String fecha_in, fecha_out, fecha_reservacion;
    public int habitacion_id, cliente_id;
    public boolean estado;
    
          public int getId()
    {
        return id;
    }
   
     public int getHabitacionId()
    {
        return habitacion_id;
    }
     
     
    public int getClienteId()
    {
        return cliente_id;
    
    }
      public Boolean getEstado()
    {
        return estado;
    }
  
          public void setHabitacionId(int habitacionid)
    {
	habitacion_id = habitacionid;
    }
          
    public void setCliente(int clienteid)
    {
	cliente_id = clienteid;
    }
    
     public void setEstado(Boolean status)
    {
	estado = status;
    }
     
                 
    @SuppressWarnings("empty-statement")
     public boolean AddReservacion(String fechain,  String fechaout,int habitacionid, int clienteid, String orden) throws SQLException, ParseException {
        //Statement st  =conn.createStatement();
       //ResultSet rs = null;
       
       Calendar cal = Calendar.getInstance(); 
    java.sql.Timestamp timestamp = new Timestamp(cal.getTimeInMillis());


        String consulta="insert into reservacion(fecha_in, fecha_out, fecha_reservacion, habitacion_id, cliente_id, dir)" + " values (?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = conn.prepareStatement(consulta);
        preparedStatement.setTimestamp(1, timestamp);
        preparedStatement.setTimestamp(2, timestamp);
        preparedStatement.setTimestamp(3, timestamp);
        preparedStatement.setInt(4, habitacionid);
        preparedStatement.setInt(5, clienteid);
        preparedStatement.setString(6, orden);
        int row = preparedStatement.executeUpdate();
        if (row > 0) {
            return true;
        }
        conn.close();     
        return false;
    }
    
    
 
           @SuppressWarnings("empty-statement")
     public boolean UpdaReservacion(int id, String fechain, String fechaout, String fechareservacion, int habitacionid, int clienteid, boolean estado) throws SQLException, ParseException {
        //Statement st  =conn.createStatement();
       //ResultSet rs = null;
        String consulta="update reservacion set fecha_in=?,  fecha_out=?, fecha_reservacion=?, habitacion_id=?, cliente_id=?, estado=? where id=?";
 

        PreparedStatement preparedStatement = conn.prepareStatement(consulta);
        preparedStatement.setString(1, fechain );
        preparedStatement.setString(2, fechaout);
        preparedStatement.setString(3, fechareservacion);
        preparedStatement.setInt(4, habitacionid);
        preparedStatement.setInt(5, clienteid);
         preparedStatement.setBoolean(6, estado);
          preparedStatement.setInt(5, id);
            int row = preparedStatement.executeUpdate();
            if (row > 0) {
                return true;
            }
            conn.close();     
        return false;
    }
     
     public ResultSet Consulta() throws SQLException  {
        ResultSet rs = null;
        String consulta="select * from reservacion";
        Statement st =conn.createStatement();
        rs =st.executeQuery(consulta);
       return rs;
       // return Lista;
    }
     
    public static void main (String[] args) throws SQLException, ParseException {
        Reservacion miconsulta=new  Reservacion();
        Boolean b=  miconsulta.AddReservacion( "11/30/16", "11/30/16", 1, 1,"nada");
        System.out.println(b);
        
       
    }
}
