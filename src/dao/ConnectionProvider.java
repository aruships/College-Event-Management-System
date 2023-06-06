/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
/**
 *
 * @author arushi shetty
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdc.Driver");
            Connection con=DriverManager.getConnection("jdbcmysql://localhost:3360/ems?useSSL=false","root","0925arushi");
            return con;
        }
       
     
         catch(Exception e){
             return null;
         }
         }
}        
   

