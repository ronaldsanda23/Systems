/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

/**
 *
 * @author spark
 */

import java.sql.*;

public class Conexion {
    
    
    Connection conn = null;
    
    
    public Conexion(){
         try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/controlinventario","root","");
            System.out.println("Exito Consulta Realizada");
        }catch(SQLException e){
            System.out.println(e);
            
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }      
}
    public Connection getConnection(){
        return conn;
    }
    
    public void desconectar(){
 conn = null;       
    }
}
    

