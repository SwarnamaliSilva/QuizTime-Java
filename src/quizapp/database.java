
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;

//db connection
public class database {
    
    public static Connection myconnection(){
        Connection connect = null;
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            
            connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/quizz_time","root","");
        }
        
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
        
        return connect;
    }
        
    }

