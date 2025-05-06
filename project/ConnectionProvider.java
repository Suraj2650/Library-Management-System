/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system.project;
import java.sql.*;
/**
 *
 * @author suraj
 */
public class ConnectionProvider {
    public static Connection getcon(){
        try 
        {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS","Suraj","Klaus");
        return con;
                }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    public static Connection getCon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
            
    
}
