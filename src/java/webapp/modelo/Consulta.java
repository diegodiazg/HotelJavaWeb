/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webapp.modelo;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author diego
 */
public class Consulta extends Conection {
    
    public boolean Autenticacion(String user, String pass) throws SQLException {
        Statement st  =conn.createStatement();
        ResultSet rs = null;
        String consulta="Select * from usuario";
        rs =st.executeQuery(consulta);
        
        
       while(rs.next())
       {
            if(user.equals(rs.getString("user")) && pass.equals(rs.getString("pass") ) ){
                return true;
            }
            
        
        }
       
       return false;
    }
    
    public static void main (String[] args) throws SQLException{
        Consulta conn=new  Consulta();
        System.out.println(conn.Autenticacion("diego","123"));
    }
    
}
