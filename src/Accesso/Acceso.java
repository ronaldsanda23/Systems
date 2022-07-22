/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accesso;


import InterfazAdmin.InterfazAdmin;
import Joption.Joption;
import Joption.Joptionx;
import java.sql.*;
import javax.swing.JOptionPane;
import sesion.Login;


public class Acceso {
  
   Joption icon = new Joption();
   Joptionx save = new Joptionx(); 
     
public  void acceso(String usuario ,String contraseña,String tipo_usuario){
  
    
Connection conexion=null;
Statement consulta=null;
ResultSet tabla=null;
try{
    //coneccion a base de datos y acceso al administrador
    Class.forName("com.mysql.jdbc.Driver");
    conexion=DriverManager.getConnection("jdbc:mysql://localhost/controlinventario","root","");
    consulta=conexion.createStatement();
    tabla=consulta.executeQuery("SELECT adm_tiposesion,adm_contrasena from administrador where adm_tiposesion='"+tipo_usuario+"'AND adm_contrasena='"+ contraseña+"'");
    if(tabla.next()){  
    JOptionPane.showMessageDialog(null,"Oo--BIENVENIDO__ADMINISTRADOR--oO"  , "BIENVENIDO",JOptionPane.PLAIN_MESSAGE,icon);
    InterfazAdmin as = new InterfazAdmin();
    as.setVisible(true);
 
    }

    else{
    JOptionPane.showMessageDialog(null,"ADMINISTRADOR NO AUTORIZADO!","ERROR",JOptionPane.ERROR_MESSAGE,save);
    Login.contraseña.setText("");
    Login.usuarioL.setSelectedIndex(0);
    return;
   

    }
    
}catch(ClassNotFoundException|SQLException e ){
JOptionPane.showMessageDialog(null,"BASE DE DATOS NO DISPONIBLE","ERROR",JOptionPane.INFORMATION_MESSAGE,save );
}
  }  




public  void accesoinvitado(String usuario ,String contraseña,String tipo_usuario){
Connection conexion=null;
Statement consulta=null;
ResultSet tabla=null;
try{
    //Conexion a base de datos y acceso al sistema invitado
    Class.forName("com.mysql.jdbc.Driver");
    conexion=DriverManager.getConnection("jdbc:mysql://localhost/controlinventario","root","");
    consulta=conexion.createStatement();
    tabla=consulta.executeQuery("select inv_contrasena, inv_tiposesion from invitado where inv_contrasena='"+contraseña+"'AND inv_tiposesion='"+ tipo_usuario+"'");
    if(tabla.next()){  
    JOptionPane.showMessageDialog(null,"Oo--BIENVENIDO__INVITADO--oO","BIENVENIDO",JOptionPane.PLAIN_MESSAGE,icon);
    InterfazAdmin pi= new InterfazAdmin();
    pi.setVisible(true);
    InterfazAdmin.btnusuario.setVisible(false);
    InterfazAdmin.btnadmin.setVisible(false);
              
    }else{
    JOptionPane.showMessageDialog(null,"EL ADMINISTRADOR NO LO HA REGISTRADO!","ERROR",JOptionPane.ERROR_MESSAGE,save);
    Login.contraseña.setText("");
   Login.contraseña.setText("");
    return;
    }
}catch(ClassNotFoundException |SQLException e){
JOptionPane.showMessageDialog(null,"BASE DE DATOS NO DISPONIBLE","ERROR",JOptionPane.INFORMATION_MESSAGE,save );}

}  

}
