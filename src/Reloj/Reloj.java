/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reloj;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author spark
 */
public class Reloj extends Thread{
    private JLabel cajahora;
    public Reloj (JLabel cajahora){
        this.cajahora=cajahora;
        
    }
    public void run(){
        while (true){
            Date hoy = new Date ();
            SimpleDateFormat s=new SimpleDateFormat ("hh:mm:ss");
            cajahora.setText(s.format(hoy));
            try{sleep(1000);
                
            }catch(Exception ex){
            
            }
        }
    }
}

    

    
    

