/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actualizar;

import Conexion.Conexion;
import Joption.Joption;
import Joption.Joptionx;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JaviieR
 */
public class articulos extends javax.swing.JFrame {
     DefaultTableModel model;
    Connection conn;
    Statement sent;
    Joption icon = new Joption();
    Joptionx save = new Joptionx(); 

    /**
     * Creates new form articulos
     */
    public articulos() {
        initComponents();
        cargar();
        bloquear();
        caracteristicas();
         setTitle("Update Equipos");
        setResizable(false);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("actualizar.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("wall.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
    }
    void bloquear(){
        modificar.setEnabled(false);
        eliminar.setEnabled(false);
        cancelar.setEnabled(false);
      
    }
       void desbloquear(){
        modificar.setEnabled(true);
        eliminar.setEnabled(true);
        cancelar.setEnabled(true);
     
    }
    
    
    
    
    
     void cargar(){           
   String [] titulos ={"Custodio","Equipo","Marca","Modelo","Serie","Ubicacion","Observacion","Estado","Fecha de Registro"};
 String sql = "SELECT * FROM articulos";

 model= new DefaultTableModel(null,titulos);
 Conexion cc= new Conexion();
 Connection cn = cc.getConnection();
        try {
          
          Statement   st = cn.createStatement();
          ResultSet rs=st.executeQuery(sql);
          String [] fila = new String[14];
  while(rs.next()){
            fila[0] = rs.getString("eq_custodio");
            fila[1] = rs.getString("eq_equipo");
            fila[2] = rs.getString("eq_marca");
            fila[3] = rs.getString("eq_modelo"); 
            fila[4] = rs.getString("eq_serie"); 
            fila[5] = rs.getString("eq_ubicacion");
            fila[6] = rs.getString("eq_observacion");
            fila[7] = rs.getString("eq_estado"); 
            fila[8] = rs.getString("eq_fecharegistro");
            
       
           
      model.addRow(fila);
       
  }
        t_evento2.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(articulos.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
         void caracteristicas(){           
   String [] titulos ={"Equipo","Serie","Resolucion","Pulgadas","Disco Duro","Memoria RAM","Sistema operativo","Marca Procesador","Generacion Procesador","Marca T Grafica","Lector DVD","Tipo Ups","Voltaje de entrada","Voltaje de salida","Cantidad de tomas","Tipo de Mouse","Tipo teclado","Tipo de Impresora","Puerto HDMI","Puerto USB"};
 String sql = "SELECT * FROM articulos";

 model= new DefaultTableModel(null,titulos);
 Conexion cc= new Conexion();
 Connection cn = cc.getConnection();
        try {
          
          Statement   st = cn.createStatement();
          ResultSet rs=st.executeQuery(sql);
          String [] fila = new String[21];
  while(rs.next()){
            fila[0] = rs.getString("eq_equipo");
            fila[1] = rs.getString("eq_serie");
            fila[2] = rs.getString("eq_resolucion");
            fila[3] = rs.getString("eq_pulgadas"); 
            fila[4] = rs.getString("eq_tamanodisduro"); 
            fila[5] = rs.getString("eq_tamanoram"); 
            fila[6] = rs.getString("eq_sistemaoperativo");
            fila[7] = rs.getString("eq_marcaprocesador");
            fila[8] = rs.getString("eq_genprocesador");
            fila[9] = rs.getString("eq_marcatargrafica");
            fila[10] = rs.getString("eq_lectordvd");
            fila[11] = rs.getString("eq_tipoups");
            fila[12] = rs.getString("eq_voltentrada");
            fila[13] = rs.getString("eq_voltsalida"); 
            fila[14] = rs.getString("eq_cantidadtomas");
            fila[15] = rs.getString("eq_tipomouse");
            fila[16] = rs.getString("eq_tipoteclado");
            fila[17] = rs.getString("eq_tipoimpresora");
            fila[18] = rs.getString("eq_puertohdmi");
            fila[19] = rs.getString("eq_puertousb");
                 
     
            
       
           
      model.addRow(fila);
       
  }
        t_evento3.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(articulos.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
         void caracteristicas(String valor){           
   String [] titulos ={"Equipo","Serie","Resolucion","Pulgadas","Disco Duro","Memoria RAM","Sistema operativo","Marca Procesador","Generacion Procesador","Marca T Grafica","Lector DVD","Tipo Ups","Voltaje de entrada","Voltaje de salida","Cantidad de tomas","Tipo de Mouse","Tipo teclado","Tipo de Impresora","Puerto HDMI","Puerto USB"};
 String sql = "SELECT * FROM articulos WHERE eq_equipo='" + valor + "'";

 model= new DefaultTableModel(null,titulos);
 Conexion cc= new Conexion();
 Connection cn = cc.getConnection();
        try {
          
          Statement   st = cn.createStatement();
          ResultSet rs=st.executeQuery(sql);
          String [] fila = new String[21];
  while(rs.next()){
            fila[0] = rs.getString("eq_equipo");
            fila[1] = rs.getString("eq_serie");
            fila[2] = rs.getString("eq_resolucion");
            fila[3] = rs.getString("eq_pulgadas"); 
            fila[4] = rs.getString("eq_tamanodisduro"); 
            fila[5] = rs.getString("eq_tamanoram"); 
            fila[6] = rs.getString("eq_sistemaoperativo");
            fila[7] = rs.getString("eq_marcaprocesador");
            fila[8] = rs.getString("eq_genprocesador");
            fila[9] = rs.getString("eq_marcatargrafica");
            fila[10] = rs.getString("eq_lectordvd");
            fila[11] = rs.getString("eq_tipoups");
            fila[12] = rs.getString("eq_voltentrada");
            fila[13] = rs.getString("eq_voltsalida"); 
            fila[14] = rs.getString("eq_cantidadtomas");
            fila[15] = rs.getString("eq_tipomouse");
            fila[16] = rs.getString("eq_tipoteclado");
            fila[17] = rs.getString("eq_tipoimpresora");
            fila[18] = rs.getString("eq_puertohdmi");
            fila[19] = rs.getString("eq_puertousb");
     
            
       
           
      model.addRow(fila);
       
  }
        t_evento3.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(articulos.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
         
         
         
    void cargar(String valor){           
   String [] titulos ={"Custodio","Equipo","Marca","Modelo","Serie","Ubicacion","Observacion","Estado","Fecha de Registro"};
 String sql = "SELECT * FROM articulos WHERE eq_equipo='" + valor + "'";

 model= new DefaultTableModel(null,titulos);
 Conexion cc= new Conexion();
 Connection cn = cc.getConnection();
        try {
          
          Statement   st = cn.createStatement();
          ResultSet rs=st.executeQuery(sql);
          String [] fila = new String[14];
  while(rs.next()){
            fila[0] = rs.getString("eq_custodio");
            fila[1] = rs.getString("eq_equipo");
            fila[2] = rs.getString("eq_marca");
            fila[3] = rs.getString("eq_modelo"); 
            fila[4] = rs.getString("eq_serie"); 
            fila[5] = rs.getString("eq_ubicacion");
            fila[6] = rs.getString("eq_observacion");
            fila[7] = rs.getString("eq_estado"); 
            fila[8] = rs.getString("eq_fecharegistro");
            
       
           
      model.addRow(fila);
       
  }
        t_evento2.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(articulos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        equipo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_evento2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        t_evento3 = new javax.swing.JTable();
        txtid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        equipo.setBackground(new java.awt.Color(0, 102, 255));
        equipo.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        equipo.setForeground(new java.awt.Color(255, 255, 255));
        equipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "¿Que Equipo Buscas?", "Impresora", "Cpu", "Laptop", "Servidor", "Scanner", "Proyector", "Monitor", "Ups", "Mouse", "Teclado" }));
        equipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actualizar/search_16.png"))); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actualizar/actualizar.png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        t_evento2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_evento2.setSelectionBackground(new java.awt.Color(51, 51, 51));
        t_evento2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_evento2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(t_evento2);

        jScrollPane1.setViewportView(jScrollPane2);

        t_evento3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_evento3.setSelectionBackground(new java.awt.Color(51, 51, 51));
        t_evento3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_evento3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(t_evento3);

        txtid.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtid.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtid.setEnabled(false);
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EQUIPOS");

        jLabel2.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CARACTERISCAS");

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actualizar/salir.png"))); // NOI18N
        jButton6.setText("SALIR");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        modificar.setBackground(new java.awt.Color(0, 0, 0));
        modificar.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        modificar.setForeground(new java.awt.Color(255, 255, 255));
        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actualizar/actualizar.png"))); // NOI18N
        modificar.setText("MODIFICAR");
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(0, 0, 0));
        cancelar.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actualizar/cancelar.png"))); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        eliminar.setBackground(new java.awt.Color(0, 0, 0));
        eliminar.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actualizar/borrar.png"))); // NOI18N
        eliminar.setText("ELIMINAR");
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton2)
                                    .addGap(25, 25, 25)
                                    .addComponent(equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addGap(481, 481, 481)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(equipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void equipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_equipoActionPerformed

    private void t_evento2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_evento2MouseClicked
        // TODO add your handling code here:
        desbloquear();
        int fila = t_evento2.getSelectedRow();
        if(fila>=0){
            txtid.setText(t_evento2.getValueAt(fila, 4).toString());

        }

    }//GEN-LAST:event_t_evento2MouseClicked

    private void t_evento3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_evento3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t_evento3MouseClicked

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidKeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        Conexion cc= new Conexion();
        Connection cn = cc.getConnection();

        int fila=t_evento2.getSelectedRow();
        String valor=t_evento2.getValueAt(fila, 4).toString();
        if(fila>=0){
            try {
                int a = JOptionPane.showConfirmDialog(this,"¿Esta Seguro?");
                if(a==JOptionPane.YES_OPTION){
                    PreparedStatement pps= cn.prepareStatement("DELETE FROM articulos WHERE eq_serie='"+valor+"'");
                    pps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "El Equipo Se Ha Eliminado!","CONFIRMACION",JOptionPane.PLAIN_MESSAGE,icon);
                    txtid.setText("");
                    cargar();
                    caracteristicas();
  
                }
            } catch (SQLException ex) {
                Logger.getLogger(articulos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
         DatosEditarB pp = new DatosEditarB();
        pp.setVisible(true);
        int fila = t_evento2.getSelectedRow();
        if(fila>=0){
            DatosEditarB.txtid.setText(t_evento2.getValueAt(fila, 4).toString());
            DatosEditarB.cajacustodio.setText(t_evento2.getValueAt(fila, 0).toString());
            DatosEditarB.equipo.setSelectedItem(t_evento2.getValueAt(fila,1).toString());
            DatosEditarB.cajamarca.setText(t_evento2.getValueAt(fila, 2).toString()); 
            DatosEditarB.cajamodelo.setText(t_evento2.getValueAt(fila, 3).toString());
            DatosEditarB.cajaserie.setText(t_evento2.getValueAt(fila, 4).toString());
            DatosEditarB.cajaubicacion.setText(t_evento2.getValueAt(fila, 5).toString());  
            DatosEditarB.observacion.setText(t_evento2.getValueAt(fila, 6).toString());
            DatosEditarB.comboestado.setSelectedItem(t_evento2.getValueAt(fila,7).toString());      
            DatosEditarB.cajafecha.setText(t_evento2.getValueAt(fila, 8).toString());
            
            //caracteristicas
            DatosEditarB.cajaresolucion.setText(t_evento3.getValueAt(fila, 2).toString());
            DatosEditarB.cajapulgadas.setText(t_evento3.getValueAt(fila, 3).toString());
            DatosEditarB.cajadd.setText(t_evento3.getValueAt(fila, 4).toString());
            DatosEditarB.cajaram.setText(t_evento3.getValueAt(fila, 5).toString());
            DatosEditarB.cajasistemaoperativo.setText(t_evento3.getValueAt(fila, 6).toString());
            DatosEditarB.cajamarcaprocesador.setText(t_evento3.getValueAt(fila, 7).toString());
            DatosEditarB.cajageneracionprocesador.setText(t_evento3.getValueAt(fila, 8).toString());
            DatosEditarB.cajamarcatargrafica.setText(t_evento3.getValueAt(fila, 9).toString());
            DatosEditarB.combolector.setSelectedItem(t_evento3.getValueAt(fila, 10).toString());
            DatosEditarB.cajatipoups.setText(t_evento3.getValueAt(fila, 11).toString());
            DatosEditarB.cajavoltentrada.setText(t_evento3.getValueAt(fila, 12).toString());
            DatosEditarB.cajavoltsalida.setText(t_evento3.getValueAt(fila, 13).toString());
            DatosEditarB.cajacantidadtomas.setText(t_evento3.getValueAt(fila, 14).toString());
            DatosEditarB.cajatipomouse.setText(t_evento3.getValueAt(fila, 15).toString());
            DatosEditarB.cajatipoteclado.setText(t_evento3.getValueAt(fila, 16).toString());
            DatosEditarB.cajaimpresora.setText(t_evento3.getValueAt(fila, 17).toString());
            DatosEditarB.combohdmi.setSelectedItem(t_evento3.getValueAt(fila, 18).toString());
            DatosEditarB.combousb.setSelectedItem(t_evento3.getValueAt(fila, 19).toString());
            
            
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        bloquear();
        caracteristicas();
        cargar();
    }//GEN-LAST:event_cancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           cargar(equipo.getSelectedItem().toString());
        caracteristicas(equipo.getSelectedItem().toString());
            int fila=t_evento2.getRowCount();
        if(fila<=0){
             JOptionPane.showMessageDialog(null,"No Existe Ninguno Registrado!","ERROR",JOptionPane.ERROR_MESSAGE,save); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cargar();
        caracteristicas();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new articulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton eliminar;
    private javax.swing.JComboBox equipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton modificar;
    private javax.swing.JTable t_evento2;
    private javax.swing.JTable t_evento3;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
