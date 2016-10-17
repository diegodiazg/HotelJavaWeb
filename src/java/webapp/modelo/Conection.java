/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webapp.modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import org.apache.jasper.tagplugins.jstl.core.Catch;
import java.sql.SQLException;
/**
 *
 * @author diego
 */
public class Conection {
    public static final String USERNAME="root";
    public static final String PASSWORD="gruce+15";
    public static final String HOST="localhost";
    public static final String PORT="3307";
    public static final String DATABASE="app";
    public static final String CLASSNAME="com.mysql.jdbc.Driver";
    public static final String URL="jdbc:mysql://"+ HOST + "/"+ DATABASE;
    
    public java.sql.Connection conn;
    
    public Conection (){
        try{
            Class.forName(CLASSNAME);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
        } catch(ClassNotFoundException e){
            System.out.println("Error");
        } catch (SQLException e){
            System.out.println("Error");
        }
    }
    

}
    
    

