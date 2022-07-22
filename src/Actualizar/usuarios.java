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
public class usuarios extends javax.swing.JFrame {
    Joption icon = new Joption();
    Joptionx save = new Joptionx(); 
    DefaultTableModel model;
    Connection conn;
    Statement sent;

    /**
     * Creates new form usuarios
     */
    public usuarios() {
        initComponents();
        bloquear();
        bloquear1();
        setTitle("Update Usuarios");
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
        eliminar.setEnabled(false);
        modificar.setEnabled(false);
        cancelar.setEnabled(false); 
       
    }
    void bloquear1(){
         eliminar1.setEnabled(false);
        modificar1.setEnabled(false);
        cancelar1.setEnabled(false); 
    }
    void desbloquear(){
        eliminar.setEnabled(true);
        modificar.setEnabled(true);
        cancelar.setEnabled(true); 
        
    }
    void desbloquear1(){
        eliminar1.setEnabled(true);
        modificar1.setEnabled(true);
        cancelar1.setEnabled(true); 
    }
    void invitado(){
        String [] titulos ={"ID","Nombre","Apellido","Cedula","Fecha de Registro","Departamento","Tipo de Sesion","Contraseña"};
         String sql= "SELECT * FROM `invitado`";
         model= new DefaultTableModel(null,titulos);
 Conexion cc= new Conexion();
 Connection cn = cc.getConnection();
 try {
          Statement sts=cn.createStatement();
          ResultSet rs1= sts.executeQuery(sql);
          String [] fila = new String[15];
  if(rs1.next()){
            fila[0] = rs1.getString("inv_id");
            fila[1] = rs1.getString("inv_nombre");
            fila[2] = rs1.getString("inv_apellido");
            fila[3] = rs1.getString("inv_cedula");
            fila[4] = rs1.getString("inv_fecharegistro");
            fila[5] = rs1.getString("inv_departamento");
            fila[6] = rs1.getString("inv_tiposesion");
            fila[7] = rs1.getString("inv_contrasena");
  
      
      model.addRow(fila);
  }
       t_evento3.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void cargarinvi(String valor){
        String [] titulos ={"ID","Nombre","Apellido","Cedula","Fecha de Registro","Departamento","Tipo de Sesion","Contraseña"};
         String sql= "SELECT * FROM invitado WHERE inv_nombre='" + valor + "'";
         model= new DefaultTableModel(null,titulos);
 Conexion cc= new Conexion();
 Connection cn = cc.getConnection();
 try {
          Statement sts=cn.createStatement();
          ResultSet rs1= sts.executeQuery(sql);
          String [] fila = new String[15];
  if(rs1.next()){

            fila[0] = rs1.getString("inv_id");
            fila[1] = rs1.getString("inv_nombre");
            fila[2] = rs1.getString("inv_apellido");
            fila[3] = rs1.getString("inv_cedula");
            fila[4] = rs1.getString("inv_fecharegistro");
            fila[5] = rs1.getString("inv_departamento");
            fila[6] = rs1.getString("inv_tiposesion");
            fila[7] = rs1.getString("inv_contrasena");
      
      model.addRow(fila);
  }
       t_evento3.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
          void administrador(){           
 String [] titulos ={"ID","Nombre","Apellido","Cedula","Fecha de Registro","Departamento","Tipo de Sesion","Contraseña"};
 model= new DefaultTableModel(null,titulos);
 Conexion cc= new Conexion();
 Connection cn = cc.getConnection();
 String sql = "SELECT * FROM administrador";
        try {
            
          Statement   st = cn.createStatement();
          ResultSet rs=st.executeQuery(sql);         
          String [] fila = new String[15];

  if(rs.next()){
            fila[0] = rs.getString("adm_id");
            fila[1] = rs.getString("adm_nombre");
            fila[2] = rs.getString("adm_apellido");
            fila[3] = rs.getString("adm_cedula");
            fila[4] = rs.getString("adm_fecharegistro");
            fila[5] = rs.getString("adm_departamento"); 
            fila[6] = rs.getString("adm_tiposesion");
            fila[7] = rs.getString("adm_contrasena");
      model.addRow(fila);

  }

        t_evento2.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

      }
      void cargar(String valor){           
 String [] titulos ={"ID","Nombre","Apellido","Cedula","Fecha de Registro","Departamento","Tipo de Sesion","Contraseña"};
 model= new DefaultTableModel(null,titulos);
 Conexion cc= new Conexion();
 Connection cn = cc.getConnection();
 String sql = "SELECT * FROM administrador WHERE adm_nombre ='" + valor + "'";
        try {
            
          Statement   st = cn.createStatement();
          ResultSet rs=st.executeQuery(sql);         
          String [] fila = new String[15];

  if(rs.next()){
            fila[0] = rs.getString("admi_id");
            fila[1] = rs.getString("adm_nombre");
            fila[2] = rs.getString("adm_apellido");
            fila[3] = rs.getString("adm_cedula");
            fila[4] = rs.getString("adm_fecharegistro");
            fila[5] = rs.getString("adm_departamento"); 
            fila[6] = rs.getString("adm_tiposesion");
            fila[7] = rs.getString("adm_contrasena");
      model.addRow(fila);

  }

        t_evento2.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
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

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bus = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_evento2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        busqueda = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtid1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        t_evento3 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        cancelar1 = new javax.swing.JButton();
        modificar1 = new javax.swing.JButton();
        eliminar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actualizar/actualizar.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre Completo :");

        bus.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        bus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bus.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busActionPerformed(evt);
            }
        });
        bus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                busKeyTyped(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actualizar/search_16.png"))); // NOI18N
        jButton2.setText("BUSCAR");
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

        jLabel3.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADMINISTRADORES");

        txtid.setEnabled(false);

        busqueda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
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

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actualizar/search_16.png"))); // NOI18N
        jButton7.setText("BUSCAR");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actualizar/actualizar.png"))); // NOI18N
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre Completo :");

        txtid1.setEnabled(false);

        t_evento3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        t_evento3.setSelectionBackground(new java.awt.Color(51, 51, 51));
        t_evento3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_evento3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(t_evento3);

        jLabel5.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("INVITADOS");

        salir.setBackground(new java.awt.Color(0, 0, 0));
        salir.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actualizar/salir.png"))); // NOI18N
        salir.setText("SALIR");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
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

        cancelar1.setBackground(new java.awt.Color(0, 0, 0));
        cancelar1.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        cancelar1.setForeground(new java.awt.Color(255, 255, 255));
        cancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actualizar/cancelar.png"))); // NOI18N
        cancelar1.setText("CANCELAR");
        cancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar1ActionPerformed(evt);
            }
        });

        modificar1.setBackground(new java.awt.Color(0, 0, 0));
        modificar1.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        modificar1.setForeground(new java.awt.Color(255, 255, 255));
        modificar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actualizar/actualizar.png"))); // NOI18N
        modificar1.setText("MODIFICAR");
        modificar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar1ActionPerformed(evt);
            }
        });

        eliminar1.setBackground(new java.awt.Color(0, 0, 0));
        eliminar1.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        eliminar1.setForeground(new java.awt.Color(255, 255, 255));
        eliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actualizar/borrar.png"))); // NOI18N
        eliminar1.setText("ELIMINAR");
        eliminar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar1ActionPerformed(evt);
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bus, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(184, 184, 184)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton8)
                                    .addGap(56, 56, 56)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtid1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eliminar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modificar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelar1)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(bus)
                        .addComponent(jButton2)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtid1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jButton7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busActionPerformed

    private void busKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_busKeyTyped

    private void t_evento2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_evento2MouseClicked
        // TODO add your handling code here:
        desbloquear();
        bloquear1();
        int fila = t_evento2.getSelectedRow();
        if(fila>=0){
            txtid.setText(t_evento2.getValueAt(fila, 0).toString());

        }
    }//GEN-LAST:event_t_evento2MouseClicked

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedaActionPerformed

    private void busquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedaKeyTyped

    private void t_evento3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_evento3MouseClicked
        // TODO add your handling code here:
        desbloquear1();
        bloquear();
        int fila = t_evento3.getSelectedRow();
        if(fila>=0){
            txtid1.setText(t_evento3.getValueAt(fila, 0).toString());
        }
    }//GEN-LAST:event_t_evento3MouseClicked

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        administrador();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         invitado();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(bus.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Escriba Nombre Completo!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
              }
        
        
        
        cargar(this.bus.getText());
        bus.setText("");
        int fila=t_evento2.getRowCount();
        if(fila<=0){
            JOptionPane.showMessageDialog(null,"No Existe Ninguno Registrado!","ERROR",JOptionPane.ERROR_MESSAGE,save);
            bus.setText("");
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         if(busqueda.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Escriba Nombre Completo!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
              }
        cargarinvi(this.busqueda.getText());
        busqueda.setText("");
        int fila=t_evento3.getRowCount();
        if(fila<=0){
            JOptionPane.showMessageDialog(null,"No Existe Ninguno Registrado!","ERROR",JOptionPane.ERROR_MESSAGE,save);
            busqueda.setText("");

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        bloquear();
    }//GEN-LAST:event_cancelarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
        DatosEditarA pp = new DatosEditarA();
       pp.setVisible(true);
       int fila = t_evento2.getSelectedRow();
        if(fila>=0){
            DatosEditarA.txtid.setText(t_evento2.getValueAt(fila, 0).toString());
            DatosEditarA.txtnombre.setText(t_evento2.getValueAt(fila, 1).toString());
            DatosEditarA.txtapellido.setText(t_evento2.getValueAt(fila, 2).toString());
            DatosEditarA.txtcedula.setText(t_evento2.getValueAt(fila, 3).toString());
            DatosEditarA.txtfecha.setText(t_evento2.getValueAt(fila, 4).toString());
            DatosEditarA.combodepartamento.setSelectedItem(t_evento2.getValueAt(fila,5).toString());
            DatosEditarA.txtsesion.setSelectedItem(t_evento2.getValueAt(fila,6).toString());
            DatosEditarA.txtcontraseña.setText(t_evento2.getValueAt(fila, 7).toString());
           // DatosEditarA.empleado.setSelectedItem(t_evento2.getValueAt(fila, 3));
            DatosEditarA.invitado.setVisible(false);
           
            
        }
   
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        Conexion cc= new Conexion();
        Connection cn = cc.getConnection();

        int fila=t_evento2.getSelectedRow();
        String valor=t_evento2.getValueAt(fila, 0).toString();
        if(fila>=0){
            try {
                int a = JOptionPane.showConfirmDialog(this,"¿Esta Seguro?");
                if(a==JOptionPane.YES_OPTION){
                    PreparedStatement pps= cn.prepareStatement("DELETE FROM administrador WHERE adm_id='"+valor+"'");
                    pps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Se Elimino Usuario!","CORRECTO",JOptionPane.PLAIN_MESSAGE,icon);
     
                }
                else{
                    return;
                }

            } catch (SQLException ex) {
                Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_eliminarActionPerformed

    private void eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar1ActionPerformed
        // TODO add your handling code here:
        Conexion cc= new Conexion();
        Connection cn = cc.getConnection();

        int fila=t_evento3.getSelectedRow();
        String valor=t_evento3.getValueAt(fila, 0).toString();
        if(fila>=0){
            try {
                int a = JOptionPane.showConfirmDialog(this,"¿Esta Seguro?");
                if(a==JOptionPane.YES_OPTION){
                    PreparedStatement pps= cn.prepareStatement("DELETE FROM invitado WHERE inv_id='"+valor+"'");
                    pps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Se Elimino Usuario!","CORRECTO",JOptionPane.PLAIN_MESSAGE,icon);
     
                }
                else{
                    return;
                }

            } catch (SQLException ex) {
                Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

         
    }//GEN-LAST:event_eliminar1ActionPerformed

    private void cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar1ActionPerformed
        // TODO add your handling code here:
        bloquear1();
    }//GEN-LAST:event_cancelar1ActionPerformed

    private void modificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar1ActionPerformed
        // TODO add your handling code here:
        DatosEditarA pp = new DatosEditarA();
       pp.setVisible(true);
       int fila = t_evento3.getSelectedRow();
        if(fila>=0){
            DatosEditarA.txtid.setText(t_evento3.getValueAt(fila, 0).toString());
            DatosEditarA.txtnombre.setText(t_evento3.getValueAt(fila, 1).toString());
            DatosEditarA.txtapellido.setText(t_evento3.getValueAt(fila, 2).toString());
            DatosEditarA.txtcedula.setText(t_evento3.getValueAt(fila, 3).toString());
            DatosEditarA.txtfecha.setText(t_evento3.getValueAt(fila, 4).toString());
            DatosEditarA.combodepartamento.setSelectedItem(t_evento3.getValueAt(fila,5).toString());
            DatosEditarA.txtsesion.setSelectedItem(t_evento3.getValueAt(fila,6).toString());
            DatosEditarA.txtcontraseña.setText(t_evento3.getValueAt(fila, 7).toString());
            //DatosEditarA.empleado.setSelectedItem(t_evento3.getValueAt(fila, 3));
            DatosEditarA.admin.setVisible(false);
           
            
        }
       
   
    }//GEN-LAST:event_modificar1ActionPerformed

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
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bus;
    private javax.swing.JTextField busqueda;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton cancelar1;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton eliminar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton modificar;
    private javax.swing.JButton modificar1;
    private javax.swing.JButton salir;
    private javax.swing.JTable t_evento2;
    private javax.swing.JTable t_evento3;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtid1;
    // End of variables declaration//GEN-END:variables
}
