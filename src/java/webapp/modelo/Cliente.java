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

/**
 *
 * @author diego
 */
public class Cliente extends Conection {
    private int id;
    public String nombre, apellido, nit;
    public int telefono;
    
    public Cliente(){}
    
    public int getId()
    {
        return id;
    }
      public String getNombre()
    {
        return nombre;
    }
        public String getApellido()
    {
        return apellido;
    }
       public String getNit()
    {
        return nit;
    }
       
     public int getTelefono()
    {
        return telefono;
    }
  
    public void setNombre(String name)
    {
	nombre = name;
    }
     public void setApellido(String last)
    {
	apellido = last;
    }
      public void setTelefono(int tel)
    {
	telefono = tel;
    }
       public void setNit(String nitin)
    {
	nit = nitin;
    }
       
    @SuppressWarnings("empty-statement")
     public boolean AddCliente(String name, String last, String nitin, int tel, String dir) throws SQLException {
        //Statement st  =conn.createStatement();
       //ResultSet rs = null;
        String consulta="insert into cliente(nombre, apellido, nit, telefono, direccion)" + " values (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = conn.prepareStatement(consulta);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, last);
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
     public boolean UpdateCliente(int id, String name, String last, String nitin, int tel, String dir) throws SQLException {
        //Statement st  =conn.createStatement();
       //ResultSet rs = null;
        String consulta="update cliente set nombre=?, apellido=?, nit=?, telefono=?, direccion=? where id=?";

        PreparedStatement preparedStatement = conn.prepareStatement(consulta);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, last);
        preparedStatement.setString(3, nitin);
        preparedStatement.setInt(4, tel);
        preparedStatement.setString(5, dir);
        preparedStatement.setInt(6, id);
            int row = preparedStatement.executeUpdate();
            if (row > 0) {
                return true;
            }
            conn.close();     
        return false;
    }
     
        public static void main (String[] args) throws SQLException{
        Cliente clientenuevo=new  Cliente();
        System.out.println(clientenuevo.UpdateCliente(1, "diego jose","diaz m", "433", 78663, "ciudad3"));
    }
       
}
