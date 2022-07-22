/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cambio;

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
public class CambioEquipo extends javax.swing.JFrame {
    Joption icon = new Joption();
    Joptionx save = new Joptionx(); 
    DefaultTableModel model;
    Connection conn;
    Statement sent;

    /**
     * Creates new form CambioEquipo
     */
    public CambioEquipo() {
        initComponents();
        cargar();
        invisible();
        setTitle("Deshabilitar Equipos");
        setResizable(false);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("buscar.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("wall.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
    }
void invisible(){
    comboestado.setVisible(false);
    explicacion.setVisible(false);
    tabla.setVisible(false);
    cajaserie.setVisible(false);
    equipo.setVisible(false);
    status.setVisible(false);
    equip.setVisible(false);
    seri.setVisible(false);
    }
    void cargar(){           
   String [] titulos ={"Equipo","Marca","Modelo","Serie","Estado","Ubicacion","Fecha de Registro"};
 String sql = "SELECT * FROM articulos WHERE eq_estado = 'ACTIVO'";

 model= new DefaultTableModel(null,titulos);
 Conexion cc= new Conexion();
 Connection cn = cc.getConnection();
        try {
          
          Statement   st = cn.createStatement();
          ResultSet rs=st.executeQuery(sql);
          String [] fila = new String[16];
  while(rs.next()){
        
            fila[0] = rs.getString("eq_equipo");
            fila[1] = rs.getString("eq_marca");
            fila[2] = rs.getString("eq_modelo"); 
            fila[3] = rs.getString("eq_serie"); 
            fila[4] = rs.getString("eq_estado");
            fila[5] = rs.getString("eq_ubicacion");  
            fila[6] = rs.getString("eq_fecharegistro");
            
       
           
      model.addRow(fila);
       
  }
        t_evento2.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(CambioEquipo.class.getName()).log(Level.SEVERE, null, ex);
        }

      }
void cargar(String Valor){           
   String [] titulos ={"Equipo","Marca","Modelo","Serie","Estado","Ubicacion","Fecha de Registro"};
 String sql = "SELECT * FROM articulos WHERE eq_equipo='" + Valor + "'";

 model= new DefaultTableModel(null,titulos);
 Conexion cc= new Conexion();
 Connection cn = cc.getConnection();
        try {
          
          Statement   st = cn.createStatement();
          ResultSet rs=st.executeQuery(sql);
          String [] fila = new String[16];
  while(rs.next()){
        
            fila[0] = rs.getString("eq_equipo");
            fila[1] = rs.getString("eq_marca");
            fila[2] = rs.getString("eq_modelo"); 
            fila[3] = rs.getString("eq_serie"); 
            fila[4] = rs.getString("eq_estado");
            fila[5] = rs.getString("eq_ubicacion");  
            fila[6] = rs.getString("eq_fecharegistro");
            
       
           
      model.addRow(fila);
       
  }
        t_evento2.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(CambioEquipo.class.getName()).log(Level.SEVERE, null, ex);
        }

      }
void cambios(String Valor){           
   String [] titulos ={"Equipo","No.Serie","Motivo"};
 String sql = "SELECT * FROM articulos WHERE eq_estado ='DESHABILITADO'";

 model= new DefaultTableModel(null,titulos);
 Conexion cc= new Conexion();
 Connection cn = cc.getConnection();
        try {
          
          Statement   st = cn.createStatement();
          ResultSet rs=st.executeQuery(sql);
          String [] fila = new String[16];
  while(rs.next()){
        
            fila[0] = rs.getString("eq_equipo");
            fila[1] = rs.getString("eq_serie");
            fila[2] = rs.getString("eq_explicacion");
            
           
      model.addRow(fila);
       
  }
        tabla.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(CambioEquipo.class.getName()).log(Level.SEVERE, null, ex);
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

        busqueda = new javax.swing.JTextField();
        resolucion = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_evento2 = new javax.swing.JTable();
        comboestado = new javax.swing.JComboBox();
        cajaserie = new javax.swing.JTextField();
        equipo = new javax.swing.JComboBox();
        cajaa = new javax.swing.JScrollPane();
        explicacion = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        seri = new javax.swing.JLabel();
        equip = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        busqueda.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        busqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        busqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });
        busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                busquedaKeyTyped(evt);
            }
        });

        resolucion.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        resolucion.setForeground(new java.awt.Color(255, 255, 255));
        resolucion.setText("Nombre del Equipo* :");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cambio/buscar.png"))); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        t_evento2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        t_evento2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_evento2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                t_evento2MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(t_evento2);

        comboestado.setBackground(new java.awt.Color(0, 102, 255));
        comboestado.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        comboestado.setForeground(new java.awt.Color(255, 255, 255));
        comboestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ACTIVO", "DESHABILITADO" }));
        comboestado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comboestado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboestadoActionPerformed(evt);
            }
        });

        cajaserie.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        cajaserie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajaserie.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajaserie.setEnabled(false);
        cajaserie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaserieActionPerformed(evt);
            }
        });

        equipo.setBackground(new java.awt.Color(0, 102, 255));
        equipo.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        equipo.setForeground(new java.awt.Color(255, 255, 255));
        equipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Impresora", "PC", "Laptop", "EQ.Video Conferencia", "Scanner", "Proyector" }));
        equipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equipo.setEnabled(false);
        equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipoActionPerformed(evt);
            }
        });

        explicacion.setColumns(20);
        explicacion.setRows(5);
        explicacion.setText("¡Explicacion!");
        explicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                explicacionKeyTyped(evt);
            }
        });
        cajaa.setViewportView(explicacion);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Equipo", "Explicacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tabla);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cambio/buscar.png"))); // NOI18N
        jButton3.setText("BUSCAR CAMBIADOS");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        status.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setText("Status En :");

        seri.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        seri.setForeground(new java.awt.Color(255, 255, 255));
        seri.setText("No.Serie :");

        equip.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        equip.setForeground(new java.awt.Color(255, 255, 255));
        equip.setText("Equipo :");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cambio/actualizar.png"))); // NOI18N
        jButton2.setText("CAMBIAR");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cambio/salir.png"))); // NOI18N
        jButton4.setText("SALIR");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(status)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(seri)
                                            .addGap(66, 66, 66)
                                            .addComponent(cajaserie, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(equip)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(equipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cajaa, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(resolucion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busqueda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(status))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cajaserie, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seri))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(equipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(equip)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cajaa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedaActionPerformed

    private void busquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_busquedaKeyTyped

    private void t_evento2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_evento2MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_t_evento2MouseClicked

    private void t_evento2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_evento2MousePressed
        // TODO add your handling code here:
        comboestado.setVisible(true);
        cajaserie.setVisible(true);
        equipo.setVisible(true);
        status.setVisible(true);
        equip.setVisible(true);
        seri.setVisible(true);
        int fila = t_evento2.getSelectedRow();
        if(fila>=0){
            comboestado.setSelectedItem(t_evento2.getValueAt(fila, 4).toString());
            cajaserie.setText(t_evento2.getValueAt(fila, 3).toString());
            equipo.setSelectedItem(t_evento2.getValueAt(fila, 0).toString());

        }

    }//GEN-LAST:event_t_evento2MousePressed

    private void comboestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboestadoActionPerformed
        // TODO add your handling code here:
        int bloqueo = comboestado.getSelectedIndex();
        if(bloqueo==1){
            explicacion.setVisible(true);
        }else {
            explicacion.setVisible(false);

        }

    }//GEN-LAST:event_comboestadoActionPerformed

    private void cajaserieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaserieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaserieActionPerformed

    private void equipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_equipoActionPerformed

    private void explicacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_explicacionKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_explicacionKeyTyped

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaMouseClicked

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cargar(this.busqueda.getText());
       busqueda.setText("");
     int fila=t_evento2.getRowCount();
        if(fila<=0){
             JOptionPane.showMessageDialog(null,"No Existe Ningun Equipo!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             busqueda.setText("");
             cargar();
             comboestado.setVisible(false);
    explicacion.setVisible(false);
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Conexion cc= new Conexion();
        Connection cn = cc.getConnection();
        PreparedStatement pps;
        try {
            pps = cn.prepareStatement("UPDATE articulos SET eq_estado='"+comboestado.getSelectedItem().toString()+"', eq_explicacion = '" + explicacion.getText()+"' WHERE eq_serie ='"+cajaserie.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos Actualizados!","CORRECTO",JOptionPane.PLAIN_MESSAGE,icon);         
           cambios("");   
           tabla.setVisible(true);
          
       
        } catch (SQLException ex) {
            Logger.getLogger(CambioEquipo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         cambios("");
        tabla.setVisible(true);
        int buscar = tabla.getRowCount();
        
        if(buscar <= 0 ){
            JOptionPane.showMessageDialog(null,"Ningun Equipo Deshabilitado","ERROR",JOptionPane.ERROR_MESSAGE,save);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CambioEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambioEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField busqueda;
    private javax.swing.JScrollPane cajaa;
    private javax.swing.JTextField cajaserie;
    private javax.swing.JComboBox comboestado;
    private javax.swing.JLabel equip;
    private javax.swing.JComboBox equipo;
    private javax.swing.JTextArea explicacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel resolucion;
    private javax.swing.JLabel seri;
    private javax.swing.JLabel status;
    private javax.swing.JTable t_evento2;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
