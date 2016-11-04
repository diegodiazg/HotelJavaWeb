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
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author diego
 */
public class Habitacion extends Conection {
    private int id, camas;
    public String nombre,  descripcion;
    public float costo;
    
      public int getId()
    {
        return id;
    }
      public String getNombre()
    {
        return nombre;
    }

       public int getCamas()
    {
        return camas;
    }
     public String getDescripcion()
    {
        return descripcion;
    }
       
     public float getCosto()
    {
        return costo;
    }
  
    public void setNombre(String name)
    {
	nombre = name;
    }
 
      public void setCamas(int numcamas)
    {
	camas = numcamas;
    }
       public void setCosto(float precio)
    {
	costo = precio;
    }
          public void setDescripcion(String des)
    {
	descripcion = des;
    }
          
    
     @SuppressWarnings("empty-statement")
     public boolean AddHabitacion(String name,  String descripcion, int camas, float precio, int hotel_id) throws SQLException {
        //Statement st  =conn.createStatement();
       //ResultSet rs = null;
        String consulta="insert into habitacion(nombre, descripcion, camas, costo, hotel_id)" + " values (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = conn.prepareStatement(consulta);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, descripcion);
        preparedStatement.setInt(3, camas);
        preparedStatement.setFloat(4, precio);
        preparedStatement.setInt(5, hotel_id);
            int row = preparedStatement.executeUpdate();
            if (row > 0) {
                return true;
            }
            conn.close();     
        return false;
    }
     
           @SuppressWarnings("empty-statement")
     public boolean UpdateHabitacion(int id, String name, String descripcion, int camas, int hotel_id, float precio) throws SQLException {
        //Statement st  =conn.createStatement();
       //ResultSet rs = null;
        String consulta="update habitacion set nombre=?,  descripcion=?, camas=?, costo=?, hotel_id=? where id=?";

        PreparedStatement preparedStatement = conn.prepareStatement(consulta);
        preparedStatement.setString(1, name);
        preparedStatement.setString(3, descripcion);
        preparedStatement.setInt(4, camas);
        preparedStatement.setFloat(5, precio);
         preparedStatement.setInt(4, hotel_id);
        preparedStatement.setInt(6, id);
            int row = preparedStatement.executeUpdate();
            if (row > 0) {
                return true;
            }
            conn.close();     
        return false;
    }
     
     public ResultSet Consulta() throws SQLException  {
        //LinkedList<Cliente> Lista =new LinkedList<>();
        ResultSet rs = null;
        String consulta="select * from habitacion";
        Statement st =conn.createStatement();
        //PreparedStatement preparedStatement = conn.prepareStatement(consulta);
        rs =st.executeQuery(consulta);
       // Cliente data= new Cliente();
       // while(rs.next()){
       //     data.setNombre(rs.getString("nombre"));
        //    data.setApellido(rs.getString("apellido"));
        //    data.setNit(rs.getString("nit"));
       //     data.setTelefono(rs.getInt("telefono"));
       //     data.setDireccion(rs.getString("direccion"));
       //     Lista.add(data);
       // }
       // Array=rs.;
       //System.out.println(Lista.size()); 
        
       
       return rs;
       // return Lista;
    }
     
}
