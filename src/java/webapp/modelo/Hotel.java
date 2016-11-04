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
public class Hotel extends Conection  {
     private int id;
    public String nombre, nit, direccion;
    public int telefono;
    
        public int getId()
    {
        return id;
    }
      public String getNombre()
    {
        return nombre;
    }

       public String getNit()
    {
        return nit;
    }
     public String getDireccion()
    {
        return direccion;
    }
       
     public int getTelefono()
    {
        return telefono;
    }
  
    public void setNombre(String name)
    {
	nombre = name;
    }
 
      public void setTelefono(int tel)
    {
	telefono = tel;
    }
       public void setNit(String nitin)
    {
	nit = nitin;
    }
          public void setDireccion(String dir)
    {
	direccion = dir;
    }
                
    @SuppressWarnings("empty-statement")
     public boolean AddHotel(String name,  String nitin, int tel, String dir) throws SQLException {
        //Statement st  =conn.createStatement();
       //ResultSet rs = null;
        String consulta="insert into hotel(nombre, nit, telefono, direccion)" + " values (?, ?, ?, ?)";
        PreparedStatement preparedStatement = conn.prepareStatement(consulta);
        preparedStatement.setString(1, name);
        preparedStatement.setString(3, nitin);
        preparedStatement.setInt(4, tel);
        preparedStatement.setString(5, dir);
            int row = preparedStatement.executeUpdate();
            if (row > 0) {
                return true;
            }
            conn.close();     
        return false;
    }
     
           @SuppressWarnings("empty-statement")
     public boolean UpdateHotel(int id, String name, String nitin, int tel, String dir) throws SQLException {
        //Statement st  =conn.createStatement();
       //ResultSet rs = null;
        String consulta="update hotel set nombre=?,  nit=?, telefono=?, direccion=? where id=?";

        PreparedStatement preparedStatement = conn.prepareStatement(consulta);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, nitin);
        preparedStatement.setInt(3, tel);
        preparedStatement.setString(4, dir);
        preparedStatement.setInt(5, id);
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
        String consulta="select * from hotel";
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
