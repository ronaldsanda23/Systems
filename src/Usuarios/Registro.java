/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import Conexion.Conexion;
import Joption.Joption;
import Joption.Joptionx;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class Registro extends javax.swing.JFrame {
    DefaultTableModel model;
    Connection conn;
    Statement sent;
    Joption icon = new Joption();
    Joptionx save = new Joptionx(); 

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
      //  invisible();
         bloquear();
         fecharegistro.setText(fechaActual());
        setTitle("Registro de Usuarios");
        setResizable(false);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("USER.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("wall.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
    }
public static String fechaActual(){
        Date fecha=new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }
    void limpiar(){
    nombre.setText("");
    apellido.setText("");
    cedula.setText("");
    departamento.setSelectedIndex(0);
    tiposesion.setSelectedIndex(0);
    contrasena.setText("");
    
}
 /* void invisible(){
        cedula.setVisible(true);
    }*/
    void bloquear(){
    nombre.setEnabled(false);
    apellido.setEnabled(false);
    cedula.setEnabled(false);
    departamento.setEnabled(false);
    tiposesion.setEnabled(false); 
    contrasena.setEnabled(false);
    cancelar.setEnabled(false);
    admi.setEnabled(false);
    invi.setEnabled(false);
    }
    void desbloquear(){
    nombre.setEnabled(true);
    apellido.setEnabled(true);
    cedula.setEnabled(true);
    departamento.setEnabled(true);
    tiposesion.setEnabled(true);
    contrasena.setEnabled(true);
    cancelar.setEnabled(true);
    }
    void cargar(){           
     String [] titulos ={"Nombre","Apellido","Cedula","Fecha de Registro","Departamento","Tipo de Sesion"};
 String sql = "SELECT * FROM administrador ";

 model= new DefaultTableModel(null,titulos);
 Conexion cc= new Conexion();
 Connection cn = cc.getConnection();

        try {
          Statement   st = cn.createStatement();
          ResultSet rs=st.executeQuery(sql);
          
          String [] fila = new String[15];

  if(rs.next()){
    
            fila[0] = rs.getString("adm_nombre");
            fila[1] = rs.getString("adm_apellido");
            fila[2] = rs.getString("adm_cedula");
            fila[3] = rs.getString("adm_fecharegistro");
            fila[4] = rs.getString("adm_departamento"); 
            fila[5] = rs.getString("adm_tiposesion");
            
      model.addRow(fila);

  }

        tabla.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }

      }   
void cargarinvi(){
        //String [] titulos ={"Nombre","Apellido","Tipo","No_Ficha","Fecha de Registro","Edificion","Sesion de Accesso"};
        // String sql="SELECT * FROM invitado";
        String [] titulos ={"Nombre","Apellido","Cedula","Fecha de Registro","Departamento","Tipo de Sesion"};
        String sql = "SELECT * FROM invitado";
         model= new DefaultTableModel(null,titulos);
 Conexion cc= new Conexion();
 Connection cn = cc.getConnection();
 try {
          Statement sts=cn.createStatement();

          ResultSet rs1= sts.executeQuery(sql);
          String [] fila = new String[15];
  if(rs1.next()){

          
            
            fila[0] = rs1.getString("inv_nombre");
            fila[1] = rs1.getString("inv_apellido");
            fila[2] = rs1.getString("inv_cedula");
            fila[3] = rs1.getString("inv_fecharegistro");
            fila[4] = rs1.getString("inv_departamento");
            fila[5] = rs1.getString("inv_tiposesion");
        
  
      
      model.addRow(fila);
  }
       tabla1.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        noficha1 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        departamento = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        tiposesion = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        contrasena = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        fecharegistro = new javax.swing.JLabel();
        admi = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        invi = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre(s)*  : ");

        nombre.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        noficha1.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        noficha1.setForeground(new java.awt.Color(255, 255, 255));
        noficha1.setText("Departamento*:");

        cedula.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        cedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cedula.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido(s) : ");

        apellido.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        apellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        apellido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });

        departamento.setBackground(new java.awt.Color(0, 102, 255));
        departamento.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        departamento.setForeground(new java.awt.Color(255, 255, 255));
        departamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Seleccione--", "SISTEMAS" }));
        departamento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        departamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departamentoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cédula* :");

        tiposesion.setBackground(new java.awt.Color(0, 102, 255));
        tiposesion.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        tiposesion.setForeground(new java.awt.Color(255, 255, 255));
        tiposesion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Seleccione--", "ADMINISTRADOR", "INVITADO" }));
        tiposesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tiposesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tiposesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiposesionActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo de Sesion * : ");

        contrasena.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        contrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contrasena.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contraseña* :");

        tabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Cedula", "Fecha de Registro", "Departamento", "Tipo de Sesion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setSelectionBackground(new java.awt.Color(0, 51, 255));
        jScrollPane1.setViewportView(tabla);

        tabla1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Cedula", "Fecha de Registro", "Departamento", "Tipo de Sesion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla1.setSelectionBackground(new java.awt.Color(0, 51, 255));
        jScrollPane3.setViewportView(tabla1);

        fecharegistro.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        fecharegistro.setForeground(new java.awt.Color(255, 255, 255));
        fecharegistro.setText("DD/MM/YYYY");

        admi.setBackground(new java.awt.Color(0, 0, 0));
        admi.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        admi.setForeground(new java.awt.Color(255, 255, 255));
        admi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Usuarios/boton-guardar.gif"))); // NOI18N
        admi.setText("GUARDAR");
        admi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admiActionPerformed(evt);
            }
        });

        nuevo.setBackground(new java.awt.Color(0, 0, 0));
        nuevo.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        nuevo.setForeground(new java.awt.Color(255, 255, 255));
        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Usuarios/testimonials-ti-ico.png"))); // NOI18N
        nuevo.setText("NUEVO");
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(0, 0, 0));
        cancelar.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Usuarios/cancelar.png"))); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        invi.setBackground(new java.awt.Color(0, 0, 0));
        invi.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        invi.setForeground(new java.awt.Color(255, 255, 255));
        invi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Usuarios/boton-guardar.gif"))); // NOI18N
        invi.setText("GUARDAR");
        invi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        invi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inviActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(0, 0, 0));
        salir.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Usuarios/salir.png"))); // NOI18N
        salir.setText("SALIR");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha Registro:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                                .addComponent(jScrollPane3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(tiposesion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contrasena))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noficha1)
                                    .addComponent(departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(113, 113, 113))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cedula)
                                                .addGap(44, 44, 44)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(fecharegistro)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(admi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(invi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fecharegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(noficha1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tiposesion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
        nombre.transferFocus();
    }//GEN-LAST:event_nombreActionPerformed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreKeyTyped

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        // TODO add your handling code here:
        char C = evt.getKeyChar();
        if(C<'0' || C>'9') evt.consume();
        if(cedula.getText().length()>=10){
            evt.consume();
        }
    }//GEN-LAST:event_cedulaKeyTyped

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
        apellido.transferFocus();
    }//GEN-LAST:event_apellidoActionPerformed

    private void tiposesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiposesionActionPerformed
        // TODO add your handling code here:
        int bloqueo = tiposesion.getSelectedIndex();
        if(bloqueo==1){
            admi.setEnabled(true);
            invi.setEnabled(false);

        }else{
            invi.setEnabled(true);
            admi.setEnabled(false);

        }
    }//GEN-LAST:event_tiposesionActionPerformed

    private void contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaActionPerformed
        // TODO add your handling code here:
        contrasena.transferFocus();
    }//GEN-LAST:event_contrasenaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // TODO add your handling code here:
        desbloquear();
        nuevo.setEnabled(false);
    }//GEN-LAST:event_nuevoActionPerformed

    private void admiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admiActionPerformed
        // TODO add your handling code here:
        Conexion cc= new Conexion();
        Connection cn = cc.getConnection();
         if(nombre.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcado (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
             }
             if(apellido.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcado (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
              }
            if(tiposesion.getSelectedItem().toString().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcado (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
             }
        String adm_nombre,adm_apellido,adm_cedula,adm_fecharegistro,adm_departamento,adm_tiposesion,adm_contrasena;
        String sql="";
        
    adm_nombre=nombre.getText();
    adm_apellido=apellido.getText();
    adm_cedula=cedula.getText();
    adm_fecharegistro=fecharegistro.getText();
    adm_departamento=departamento.getSelectedItem().toString();
    adm_tiposesion=tiposesion.getSelectedItem().toString();
    adm_contrasena=contrasena.getText();
   
        sql="INSERT INTO administrador(adm_nombre,adm_apellido,adm_cedula,adm_fecharegistro,adm_departamento,adm_tiposesion,adm_contrasena) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement psd =cn.prepareStatement(sql);
            psd.setString(1, adm_nombre);
            psd.setString(2, adm_apellido);
            psd.setString(3, adm_cedula);
            psd.setString(4, adm_fecharegistro);
            psd.setString(5, adm_departamento);
            psd.setString(6, adm_tiposesion);
            psd.setString(7, adm_contrasena);
       
       
           int n=psd.executeUpdate();
           
           if (n>0){
               JOptionPane.showMessageDialog(null,"Usuario Registrado!","REGISTRO",JOptionPane.PLAIN_MESSAGE,icon);
               limpiar();     
               nuevo.setEnabled(true);
               bloquear();
               cargar();
              
           }
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_admiActionPerformed

    private void inviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inviActionPerformed
        // TODO add your handling code here:
        Conexion cc= new Conexion();
        Connection cn = cc.getConnection();
            if(nombre.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcado (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
             }
             if(apellido.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcado (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
              }
            if(tiposesion.getSelectedItem().toString().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcado (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
             }
       
        String inv_nombre,inv_apellido,inv_cedula,inv_fecharegistro,inv_departamento,inv_tiposesion,inv_contrasena;
        String sql="";
        
    inv_nombre=nombre.getText();
    inv_apellido=apellido.getText();
    inv_cedula=cedula.getText();
    inv_fecharegistro=fecharegistro.getText();
    inv_departamento=departamento.getSelectedItem().toString();
    inv_tiposesion=tiposesion.getSelectedItem().toString();
    inv_contrasena=contrasena.getText();
   
   
        sql="INSERT INTO invitado(inv_nombre,inv_apellido,inv_cedula,inv_fecharegistro,inv_departamento,inv_tiposesion,inv_contrasena) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement psd =cn.prepareStatement(sql);
            psd.setString(1, inv_nombre);
            psd.setString(2, inv_apellido);
            psd.setString(3, inv_cedula);
            psd.setString(4, inv_fecharegistro);
            psd.setString(5, inv_departamento);
            psd.setString(6, inv_tiposesion);
            psd.setString(7, inv_contrasena);
            
       
           int n=psd.executeUpdate();
           
           if (n>0){
               JOptionPane.showMessageDialog(null,"Usuario Registrado!","REGISTRO",JOptionPane.PLAIN_MESSAGE,icon);
               limpiar();     
               nuevo.setEnabled(true);
               bloquear();
               cargarinvi();
           }
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_inviActionPerformed

    private void departamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departamentoActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admi;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField contrasena;
    private javax.swing.JComboBox departamento;
    private javax.swing.JLabel fecharegistro;
    private javax.swing.JButton invi;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel noficha1;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton salir;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla1;
    private javax.swing.JComboBox tiposesion;
    // End of variables declaration//GEN-END:variables
}
