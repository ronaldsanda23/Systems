/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Articulos;

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
public class IngresoArticulos extends javax.swing.JFrame {
      DefaultTableModel model;
    Connection conn;
    Statement sent;
    Joption icon = new Joption();
   Joptionx save = new Joptionx(); 

    /**
     * Creates new form IngresoArticulos
     */
    public IngresoArticulos() {
        initComponents();
         invisible();
         cajaexplicacion.setVisible(false);
         cajafecha.setText(fechaActual());
         bloqueo();
         setTitle("Registro de Equipos");
        setResizable(false);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("computer.png")).getImage());
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
    void cargar(){           
   String [] titulos ={"Equipo","Marca","Modelo","Serie","Ubicacion","Estado","Custodio","Fecha de Registro"};
 String sql = "SELECT * FROM articulos";

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
            fila[4] = rs.getString("eq_ubicacion");
            fila[5] = rs.getString("eq_estado"); 
            fila[6] = rs.getString("eq_custodio"); 
            fila[7] = rs.getString("eq_fecharegistro");
            
       
           
      model.addRow(fila);
       
  }
        t_evento2.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(IngresoArticulos.class.getName()).log(Level.SEVERE, null, ex);
        }

      }
    void invisible(){
        
        resolucion.setVisible(false);
        cajaresolucion.setVisible(false);
        ram.setVisible(false);
        cajaram.setVisible(false);
        pulgadas.setVisible(false);
        cajapulgadas.setVisible(false);
        dd.setVisible(false);
        cajadd.setVisible(false);
        lector.setVisible(false);
        combolector.setVisible(false);
        tipoteclado.setVisible(false);
        cajatipoteclado.setVisible(false);
        impresora.setVisible(false);
        cajaimpresora.setVisible(false);
        hdmi.setVisible(false);
        combohdmi.setVisible(false);
        usb.setVisible(false);
        combousb.setVisible(false);
        sistemaoperativo.setVisible(false);
        cajasistemaoperativo.setVisible(false);
        marcaprocesador.setVisible(false);
        cajamarcaprocesador.setVisible(false);
        generacionprocesador.setVisible(false);
        cajageneracionprocesador.setVisible(false);
        marcatargrafica.setVisible(false);
        cajamarcatargrafica.setVisible(false);
        tipoups.setVisible(false);
        cajatipoups.setVisible(false);
        voltentrada.setVisible(false);
        cajavoltentrada.setVisible(false);
        voltsalida.setVisible(false);
        cajavoltsalida.setVisible(false);
        cantidadtomas.setVisible(false);
        cajacantidadtomas.setVisible(false);
        tipomouse.setVisible(false);
        cajatipomouse.setVisible(false);
        
        
    }
    void limpiar(){
        //caracteristicas
    equipo.setSelectedIndex(0);
    cajaresolucion.setText("");
    cajapulgadas.setText("");
    cajadd.setText("");
    cajaram.setText("");
    cajasistemaoperativo.setText("");
    cajamarcaprocesador.setText("");
    cajageneracionprocesador.setText("");
    cajamarcatargrafica.setText("");
    combolector.setSelectedIndex(0);
    cajatipoups.setText("");
    cajavoltentrada.setText("");
    cajavoltsalida.setText("");
    cajacantidadtomas.setText("");
    cajatipomouse.setText("");
    cajatipoteclado.setText("");
    cajaimpresora.setText("");
    cajamarca.setText("");
    cajamodelo.setText("");
    cajaserie.setText("");
    combohdmi.setSelectedIndex(0);
    combousb.setSelectedIndex(0);
    //gral
     cajacustodio.setText("");
     cajaubicacion.setText("");
     comboestado.setSelectedIndex(0);
     observacion.setText("");
        
    }
    void bloqueo(){
        equipo.setEnabled(false);
        cajaubicacion.setEnabled(false);
        comboestado.setEnabled(false);
        guardar.setEnabled(false);
        cancelar.setEnabled(false);
        observacion.setEnabled(false);
        cajacustodio.setEnabled(false);
        cajamodelo.setEnabled(false);
        cajamarca.setEnabled(false);
        cajaserie.setEnabled(false);

    }
        void desbloqueo(){
        equipo.setEnabled(true);
        cajaubicacion.setEnabled(true);
        comboestado.setEnabled(true);
        guardar.setEnabled(true);
        cancelar.setEnabled(true);
        observacion.setEnabled(true);
        cajacustodio.setEnabled(true);
        cajamodelo.setEnabled(true);
        cajamarca.setEnabled(true);
        cajaserie.setEnabled(true);

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
        jLabel4 = new javax.swing.JLabel();
        resolucion = new javax.swing.JLabel();
        cajaresolucion = new javax.swing.JTextField();
        cajapulgadas = new javax.swing.JTextField();
        ram = new javax.swing.JLabel();
        cajadd = new javax.swing.JTextField();
        dd = new javax.swing.JLabel();
        pulgadas = new javax.swing.JLabel();
        lector = new javax.swing.JLabel();
        combolector = new javax.swing.JComboBox();
        cajaram = new javax.swing.JTextField();
        tipoteclado = new javax.swing.JLabel();
        impresora = new javax.swing.JLabel();
        marca = new javax.swing.JLabel();
        modeloddd = new javax.swing.JLabel();
        serie = new javax.swing.JLabel();
        cajaserie = new javax.swing.JTextField();
        cajamodelo = new javax.swing.JTextField();
        cajamarca = new javax.swing.JTextField();
        cajaimpresora = new javax.swing.JTextField();
        cajatipoteclado = new javax.swing.JTextField();
        hdmi = new javax.swing.JLabel();
        usb = new javax.swing.JLabel();
        combousb = new javax.swing.JComboBox();
        combohdmi = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cajacustodio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cajaubicacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        comboestado = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_evento2 = new javax.swing.JTable();
        cajafecha = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        cajasistemaoperativo = new javax.swing.JTextField();
        marcaprocesador = new javax.swing.JLabel();
        cajamarcaprocesador = new javax.swing.JTextField();
        cajageneracionprocesador = new javax.swing.JTextField();
        sistemaoperativo = new javax.swing.JLabel();
        generacionprocesador = new javax.swing.JLabel();
        cajamarcatargrafica = new javax.swing.JTextField();
        marcatargrafica = new javax.swing.JLabel();
        tipoups = new javax.swing.JLabel();
        voltentrada = new javax.swing.JLabel();
        voltsalida = new javax.swing.JLabel();
        cantidadtomas = new javax.swing.JLabel();
        cajacantidadtomas = new javax.swing.JTextField();
        cajavoltsalida = new javax.swing.JTextField();
        cajavoltentrada = new javax.swing.JTextField();
        cajatipoups = new javax.swing.JTextField();
        tipomouse = new javax.swing.JLabel();
        cajatipomouse = new javax.swing.JTextField();
        cajaexplicacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        equipo.setBackground(new java.awt.Color(0, 102, 255));
        equipo.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        equipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Seleccione--", "Impresora", "Cpu", "Laptop", "Servidor", "Scanner", "Proyector", "Monitor", "Ups", "Mouse", "Teclado" }));
        equipo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        equipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo de Equipo* :");

        resolucion.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        resolucion.setForeground(new java.awt.Color(255, 255, 255));
        resolucion.setText("Resolucion :");

        cajaresolucion.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        cajaresolucion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajaresolucion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajaresolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaresolucionActionPerformed(evt);
            }
        });

        cajapulgadas.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        cajapulgadas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajapulgadas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajapulgadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajapulgadasActionPerformed(evt);
            }
        });

        ram.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        ram.setForeground(new java.awt.Color(255, 255, 255));
        ram.setText("Tamaño de RAM : ");

        cajadd.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        cajadd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajadd.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaddActionPerformed(evt);
            }
        });

        dd.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        dd.setForeground(new java.awt.Color(255, 255, 255));
        dd.setText("Tamaño de Disco Duro :");

        pulgadas.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        pulgadas.setForeground(new java.awt.Color(255, 255, 255));
        pulgadas.setText("Pulgadas : ");

        lector.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        lector.setForeground(new java.awt.Color(255, 255, 255));
        lector.setText("Cuenta Con Lector DVD :");

        combolector.setBackground(new java.awt.Color(0, 102, 255));
        combolector.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        combolector.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "SI", "NO" }));
        combolector.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        combolector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combolector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combolectorActionPerformed(evt);
            }
        });

        cajaram.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        cajaram.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajaram.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajaram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaramActionPerformed(evt);
            }
        });

        tipoteclado.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        tipoteclado.setForeground(new java.awt.Color(255, 255, 255));
        tipoteclado.setText("Tipo de teclado:");

        impresora.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        impresora.setForeground(new java.awt.Color(255, 255, 255));
        impresora.setText("Tipo de Impresora:");

        marca.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        marca.setForeground(new java.awt.Color(255, 255, 255));
        marca.setText("Marca*  :");

        modeloddd.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        modeloddd.setForeground(new java.awt.Color(255, 255, 255));
        modeloddd.setText("Modelo* :");

        serie.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        serie.setForeground(new java.awt.Color(255, 255, 255));
        serie.setText("No.Serie* :");

        cajaserie.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cajaserie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajaserie.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajaserie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaserieActionPerformed(evt);
            }
        });

        cajamodelo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cajamodelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajamodelo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajamodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajamodeloActionPerformed(evt);
            }
        });

        cajamarca.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cajamarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajamarca.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajamarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajamarcaActionPerformed(evt);
            }
        });

        cajaimpresora.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cajaimpresora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajaimpresora.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajaimpresora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaimpresoraActionPerformed(evt);
            }
        });

        cajatipoteclado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cajatipoteclado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajatipoteclado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajatipoteclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajatipotecladoActionPerformed(evt);
            }
        });

        hdmi.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        hdmi.setForeground(new java.awt.Color(255, 255, 255));
        hdmi.setText("Puerto HMDI :");

        usb.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        usb.setForeground(new java.awt.Color(255, 255, 255));
        usb.setText("Puertos USB :");

        combousb.setBackground(new java.awt.Color(0, 102, 255));
        combousb.setFont(new java.awt.Font("Gulim", 1, 10)); // NOI18N
        combousb.setForeground(new java.awt.Color(255, 255, 255));
        combousb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "SI", "NO" }));
        combousb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        combousb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combousb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combousbActionPerformed(evt);
            }
        });

        combohdmi.setBackground(new java.awt.Color(0, 102, 255));
        combohdmi.setFont(new java.awt.Font("Gulim", 1, 10)); // NOI18N
        combohdmi.setForeground(new java.awt.Color(255, 255, 255));
        combohdmi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "SI", "NO" }));
        combohdmi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        combohdmi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combohdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combohdmiActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Custodio* :");

        cajacustodio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cajacustodio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajacustodio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajacustodio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajacustodioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ubicación* : ");

        cajaubicacion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cajaubicacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajaubicacion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajaubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaubicacionActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estado* :");

        comboestado.setBackground(new java.awt.Color(0, 102, 255));
        comboestado.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        comboestado.setForeground(new java.awt.Color(255, 255, 255));
        comboestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Status", "ACTIVO" }));
        comboestado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comboestado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboestadoActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Observaciones", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gulim", 2, 12), java.awt.Color.white)); // NOI18N

        observacion.setColumns(20);
        observacion.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        observacion.setForeground(new java.awt.Color(0, 51, 102));
        observacion.setRows(5);
        observacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        observacion.setSelectionColor(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(observacion);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

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
        t_evento2.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jScrollPane2.setViewportView(t_evento2);

        cajafecha.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cajafecha.setForeground(new java.awt.Color(255, 255, 255));
        cajafecha.setText("DD/MM/AÑOS");

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Articulos/salir.png"))); // NOI18N
        jButton4.setText("SALIR");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(0, 0, 0));
        guardar.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Articulos/boton-guardar.gif"))); // NOI18N
        guardar.setText("GUARDAR");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(0, 0, 0));
        cancelar.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Articulos/cancelar.png"))); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        nuevo.setBackground(new java.awt.Color(0, 0, 0));
        nuevo.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        nuevo.setForeground(new java.awt.Color(255, 255, 255));
        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Articulos/testimonials-ti-ico.png"))); // NOI18N
        nuevo.setText("NUEVO");
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        cajasistemaoperativo.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        cajasistemaoperativo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajasistemaoperativo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajasistemaoperativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajasistemaoperativoActionPerformed(evt);
            }
        });

        marcaprocesador.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        marcaprocesador.setForeground(new java.awt.Color(255, 255, 255));
        marcaprocesador.setText("Marca Procesador : ");

        cajamarcaprocesador.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        cajamarcaprocesador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajamarcaprocesador.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajamarcaprocesador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajamarcaprocesadorActionPerformed(evt);
            }
        });

        cajageneracionprocesador.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        cajageneracionprocesador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajageneracionprocesador.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajageneracionprocesador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajageneracionprocesadorActionPerformed(evt);
            }
        });

        sistemaoperativo.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        sistemaoperativo.setForeground(new java.awt.Color(255, 255, 255));
        sistemaoperativo.setText("Sistema operativo : ");

        generacionprocesador.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        generacionprocesador.setForeground(new java.awt.Color(255, 255, 255));
        generacionprocesador.setText("Gen Procesador : ");

        cajamarcatargrafica.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        cajamarcatargrafica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajamarcatargrafica.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajamarcatargrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajamarcatargraficaActionPerformed(evt);
            }
        });

        marcatargrafica.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        marcatargrafica.setForeground(new java.awt.Color(255, 255, 255));
        marcatargrafica.setText("Marca T Gráfica : ");

        tipoups.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        tipoups.setForeground(new java.awt.Color(255, 255, 255));
        tipoups.setText("Tipo de Ups :");

        voltentrada.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        voltentrada.setForeground(new java.awt.Color(255, 255, 255));
        voltentrada.setText("Voltaje de Entrada:");

        voltsalida.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        voltsalida.setForeground(new java.awt.Color(255, 255, 255));
        voltsalida.setText("Voltaje de Salida:");

        cantidadtomas.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        cantidadtomas.setForeground(new java.awt.Color(255, 255, 255));
        cantidadtomas.setText("Cantidad de Tomas :");

        cajacantidadtomas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cajacantidadtomas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajacantidadtomas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajacantidadtomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajacantidadtomasActionPerformed(evt);
            }
        });

        cajavoltsalida.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cajavoltsalida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajavoltsalida.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajavoltsalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajavoltsalidaActionPerformed(evt);
            }
        });

        cajavoltentrada.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cajavoltentrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajavoltentrada.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajavoltentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajavoltentradaActionPerformed(evt);
            }
        });

        cajatipoups.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cajatipoups.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajatipoups.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajatipoups.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajatipoupsActionPerformed(evt);
            }
        });

        tipomouse.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        tipomouse.setForeground(new java.awt.Color(255, 255, 255));
        tipomouse.setText("Tipo de Mouse :");

        cajatipomouse.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cajatipomouse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajatipomouse.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajatipomouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajatipomouseActionPerformed(evt);
            }
        });

        cajaexplicacion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cajaexplicacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajaexplicacion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajaexplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaexplicacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cajavoltentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(hdmi)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(combohdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(usb)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(combousb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cajafecha))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pulgadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(resolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(sistemaoperativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(marcaprocesador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(generacionprocesador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(marcatargrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cajamarcatargrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cajageneracionprocesador, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cajamarcaprocesador, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cajasistemaoperativo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(cajaram, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(cajaresolucion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(cajapulgadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(cajadd, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(0, 0, Short.MAX_VALUE)))))))))
                                    .addComponent(cajatipoups, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cajacantidadtomas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cajatipomouse, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cajatipoteclado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cajaimpresora, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cajamarca, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cajamodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cajaserie, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tipoups, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(voltsalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(voltentrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cajavoltsalida, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(impresora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tipoteclado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tipomouse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(modeloddd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(serie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cantidadtomas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(marca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(132, 132, 132)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lector)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combolector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cajaexplicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(cajacustodio, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cajaubicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboestado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cajacustodio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cajaresolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cajaubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pulgadas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajapulgadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ram, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sistemaoperativo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajasistemaoperativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajamarcaprocesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marcaprocesador, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajageneracionprocesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(generacionprocesador, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajamarcatargrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marcatargrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lector, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combolector, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoups, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajatipoups, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajavoltentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(voltentrada))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(voltsalida))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cajavoltsalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantidadtomas)
                            .addComponent(cajacantidadtomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cajatipomouse)
                            .addComponent(tipomouse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cajatipoteclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoteclado, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(impresora)
                            .addComponent(cajaimpresora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajamarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(modeloddd)
                                .addGap(6, 6, 6)
                                .addComponent(serie)
                                .addGap(2, 2, 2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cajamodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cajaserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaexplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajafecha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(combohdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hdmi)))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combousb, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void equipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipoActionPerformed
        // TODO add your handling code here:
        int bloqueo = equipo.getSelectedIndex();
        if(bloqueo == 1){
            
            impresora.setVisible(true);
            cajaimpresora.setVisible(true);
            tipoteclado.setVisible(false);
            cajatipoteclado.setVisible(false);
            resolucion.setVisible(false);
            cajaresolucion.setVisible(false);
            ram.setVisible(false);
            cajapulgadas.setVisible(false);
            dd.setVisible(false);
            cajadd.setVisible(false);
            pulgadas.setVisible(false);
            cajaram.setVisible(false);
            lector.setVisible(false);
            combolector.setVisible(false);
            hdmi.setVisible(false);
            combohdmi.setVisible(false);
            usb.setVisible(false);
            combousb.setVisible(false);
            
            sistemaoperativo.setVisible(false);
            cajasistemaoperativo.setVisible(false);
            marcaprocesador.setVisible(false);
            cajamarcaprocesador.setVisible(false);
            generacionprocesador.setVisible(false);
            cajageneracionprocesador.setVisible(false);
            marcatargrafica.setVisible(false);
            cajamarcatargrafica.setVisible(false);
            tipoups.setVisible(false);
            cajatipoups.setVisible(false);
            voltentrada.setVisible(false);
            cajavoltentrada.setVisible(false);
            voltsalida.setVisible(false);
            cajavoltsalida.setVisible(false);
            cantidadtomas.setVisible(false);
            cajacantidadtomas.setVisible(false);
            tipomouse.setVisible(false);
            cajatipomouse.setVisible(false);
            
        }
        if(bloqueo == 2){
            
            resolucion.setVisible(false);
            cajaresolucion.setVisible(false);
            pulgadas.setVisible(false);
            cajaram.setVisible(true);
            ram.setVisible(true);
            cajapulgadas.setVisible(false);
            dd.setVisible(true);
            cajadd.setVisible(true);
            lector.setVisible(true);
            combolector.setVisible(true);
            hdmi.setVisible(true);
            combohdmi.setVisible(true);
            usb.setVisible(true);
            combousb.setVisible(true);
            tipoteclado.setVisible(false);
            cajatipoteclado.setVisible(false);
            impresora.setVisible(false);
            cajaimpresora.setVisible(false);
            sistemaoperativo.setVisible(true);
            cajasistemaoperativo.setVisible(true);
            marcaprocesador.setVisible(true);
            cajamarcaprocesador.setVisible(true);
            generacionprocesador.setVisible(true);
            cajageneracionprocesador.setVisible(true);
            marcatargrafica.setVisible(true);
            cajamarcatargrafica.setVisible(true);
            tipoups.setVisible(false);
            cajatipoups.setVisible(false);
            voltentrada.setVisible(false);
            cajavoltentrada.setVisible(false);
            voltsalida.setVisible(false);
            cajavoltsalida.setVisible(false);
            cantidadtomas.setVisible(false);
            cajacantidadtomas.setVisible(false);
            tipomouse.setVisible(false);
            cajatipomouse.setVisible(false);

        }
        if(bloqueo == 3){
            
            resolucion.setVisible(true);
            cajaresolucion.setVisible(true);
            ram.setVisible(true);
            cajapulgadas.setVisible(true);
            dd.setVisible(true);
            cajadd.setVisible(true);
            pulgadas.setVisible(true);
            cajaram.setVisible(true);
            lector.setVisible(true);
            combolector.setVisible(true);
            hdmi.setVisible(true);
            combohdmi.setVisible(true);
            usb.setVisible(true);
            combousb.setVisible(true);
            tipoteclado.setVisible(false);
            cajatipoteclado.setVisible(false);
            impresora.setVisible(false);
            cajaimpresora.setVisible(false);
            sistemaoperativo.setVisible(true);
            cajasistemaoperativo.setVisible(true);
            marcaprocesador.setVisible(true);
            cajamarcaprocesador.setVisible(true);
            generacionprocesador.setVisible(true);
            cajageneracionprocesador.setVisible(true);
            marcatargrafica.setVisible(true);
            cajamarcatargrafica.setVisible(true);
            tipoups.setVisible(false);
            cajatipoups.setVisible(false);
            voltentrada.setVisible(false);
            cajavoltentrada.setVisible(false);
            voltsalida.setVisible(false);
            cajavoltsalida.setVisible(false);
            cantidadtomas.setVisible(false);
            cajacantidadtomas.setVisible(false);
            tipomouse.setVisible(false);
            cajatipomouse.setVisible(false);
        }
        if(bloqueo==4){
            resolucion.setVisible(false);
            cajaresolucion.setVisible(false);
            ram.setVisible(true);
            cajapulgadas.setVisible(false);
            dd.setVisible(true);
            cajadd.setVisible(true);
            pulgadas.setVisible(false);
            cajaram.setVisible(true);
            lector.setVisible(true);
            combolector.setVisible(true);
            hdmi.setVisible(true);
            combohdmi.setVisible(true);
            usb.setVisible(true);
            combousb.setVisible(true);
            tipoteclado.setVisible(false);
            cajatipoteclado.setVisible(false);
            impresora.setVisible(false);
            cajaimpresora.setVisible(false);
            sistemaoperativo.setVisible(true);
            cajasistemaoperativo.setVisible(true);
            marcaprocesador.setVisible(true);
            cajamarcaprocesador.setVisible(true);
            generacionprocesador.setVisible(true);
            cajageneracionprocesador.setVisible(true);
            marcatargrafica.setVisible(false);
            cajamarcatargrafica.setVisible(false);
            tipoups.setVisible(false);
            cajatipoups.setVisible(false);
            voltentrada.setVisible(false);
            cajavoltentrada.setVisible(false);
            voltsalida.setVisible(false);
            cajavoltsalida.setVisible(false);
            cantidadtomas.setVisible(false);
            cajacantidadtomas.setVisible(false);
            tipomouse.setVisible(false);
            cajatipomouse.setVisible(false);

        }
        if(bloqueo == 5){
            
            resolucion.setVisible(true);
            cajaresolucion.setVisible(true);
            hdmi.setVisible(true);
            combohdmi.setVisible(true);
            usb.setVisible(true);
            combousb.setVisible(true);
            ram.setVisible(false);
            cajapulgadas.setVisible(false);
            dd.setVisible(false);
            cajadd.setVisible(false);
            pulgadas.setVisible(false);
            cajaram.setVisible(false);
            lector.setVisible(false);
            combolector.setVisible(false);
            impresora.setVisible(false);
            cajaimpresora.setVisible(false);
            tipoteclado.setVisible(false);
            cajatipoteclado.setVisible(false);
            sistemaoperativo.setVisible(false);
            cajasistemaoperativo.setVisible(false);
            marcaprocesador.setVisible(false);
            cajamarcaprocesador.setVisible(false);
            generacionprocesador.setVisible(false);
            cajageneracionprocesador.setVisible(false);
            marcatargrafica.setVisible(false);
            cajamarcatargrafica.setVisible(false);
            tipoups.setVisible(false);
            cajatipoups.setVisible(false);
            voltentrada.setVisible(false);
            cajavoltentrada.setVisible(false);
            voltsalida.setVisible(false);
            cajavoltsalida.setVisible(false);
            cantidadtomas.setVisible(false);
            cajacantidadtomas.setVisible(false);
            tipomouse.setVisible(false);
            cajatipomouse.setVisible(false);

        }
        if(bloqueo == 6){
       
            resolucion.setVisible(true);
            cajaresolucion.setVisible(true);
            hdmi.setVisible(true);
            combohdmi.setVisible(true);
            usb.setVisible(true);
            combousb.setVisible(true);
            ram.setVisible(false);
            cajapulgadas.setVisible(false);
            dd.setVisible(false);
            cajadd.setVisible(false);
            pulgadas.setVisible(false);
            cajaram.setVisible(false);
            lector.setVisible(false);
            combolector.setVisible(false);
            impresora.setVisible(false);
            cajaimpresora.setVisible(false);
            tipoteclado.setVisible(false);
            cajatipoteclado.setVisible(false);
            sistemaoperativo.setVisible(false);
            cajasistemaoperativo.setVisible(false);
            marcaprocesador.setVisible(false);
            cajamarcaprocesador.setVisible(false);
            generacionprocesador.setVisible(false);
            cajageneracionprocesador.setVisible(false);
            marcatargrafica.setVisible(false);
            cajamarcatargrafica.setVisible(false);
            tipoups.setVisible(false);
            cajatipoups.setVisible(false);
            voltentrada.setVisible(false);
            cajavoltentrada.setVisible(false);
            voltsalida.setVisible(false);
            cajavoltsalida.setVisible(false);
            cantidadtomas.setVisible(false);
            cajacantidadtomas.setVisible(false);
            tipomouse.setVisible(false);
            cajatipomouse.setVisible(false);

        }
        if(bloqueo == 7){
       
            resolucion.setVisible(true);
            cajaresolucion.setVisible(true);
            hdmi.setVisible(false);
            combohdmi.setVisible(false);
            usb.setVisible(false);
            combousb.setVisible(false);
            ram.setVisible(false);
            cajapulgadas.setVisible(true);
            dd.setVisible(false);
            cajadd.setVisible(false);
            pulgadas.setVisible(true);
            cajaram.setVisible(false);
            lector.setVisible(false);
            combolector.setVisible(false);
            impresora.setVisible(false);
            cajaimpresora.setVisible(false);
            tipoteclado.setVisible(false);
            cajatipoteclado.setVisible(false);
            sistemaoperativo.setVisible(false);
            cajasistemaoperativo.setVisible(false);
            marcaprocesador.setVisible(false);
            cajamarcaprocesador.setVisible(false);
            generacionprocesador.setVisible(false);
            cajageneracionprocesador.setVisible(false);
            marcatargrafica.setVisible(false);
            cajamarcatargrafica.setVisible(false);
            tipoups.setVisible(false);
            cajatipoups.setVisible(false);
            voltentrada.setVisible(false);
            cajavoltentrada.setVisible(false);
            voltsalida.setVisible(false);
            cajavoltsalida.setVisible(false);
            cantidadtomas.setVisible(false);
            cajacantidadtomas.setVisible(false);
            tipomouse.setVisible(false);
            cajatipomouse.setVisible(false);

        }
        if(bloqueo == 8){
       
            resolucion.setVisible(false);
            cajaresolucion.setVisible(false);
            hdmi.setVisible(false);
            combohdmi.setVisible(false);
            usb.setVisible(false);
            combousb.setVisible(false);
            ram.setVisible(false);
            cajapulgadas.setVisible(false);
            dd.setVisible(false);
            cajadd.setVisible(false);
            pulgadas.setVisible(false);
            cajaram.setVisible(false);
            lector.setVisible(false);
            combolector.setVisible(false);
            impresora.setVisible(false);
            cajaimpresora.setVisible(false);
            tipoteclado.setVisible(false);
            cajatipoteclado.setVisible(false);
            sistemaoperativo.setVisible(false);
            cajasistemaoperativo.setVisible(false);
            marcaprocesador.setVisible(false);
            cajamarcaprocesador.setVisible(false);
            generacionprocesador.setVisible(false);
            cajageneracionprocesador.setVisible(false);
            marcatargrafica.setVisible(false);
            cajamarcatargrafica.setVisible(false);
            tipoups.setVisible(true);
            cajatipoups.setVisible(true);
            voltentrada.setVisible(true);
            cajavoltentrada.setVisible(true);
            voltsalida.setVisible(true);
            cajavoltsalida.setVisible(true);
            cantidadtomas.setVisible(true);
            cajacantidadtomas.setVisible(true);
            tipomouse.setVisible(false);
            cajatipomouse.setVisible(false);

        }
         if(bloqueo == 9){
       
            resolucion.setVisible(false);
            cajaresolucion.setVisible(false);
            hdmi.setVisible(false);
            combohdmi.setVisible(false);
            usb.setVisible(false);
            combousb.setVisible(false);
            ram.setVisible(false);
            cajapulgadas.setVisible(false);
            dd.setVisible(false);
            cajadd.setVisible(false);
            pulgadas.setVisible(false);
            cajaram.setVisible(false);
            lector.setVisible(false);
            combolector.setVisible(false);
            impresora.setVisible(false);
            cajaimpresora.setVisible(false);
            tipoteclado.setVisible(false);
            cajatipoteclado.setVisible(false);
            sistemaoperativo.setVisible(false);
            cajasistemaoperativo.setVisible(false);
            marcaprocesador.setVisible(false);
            cajamarcaprocesador.setVisible(false);
            generacionprocesador.setVisible(false);
            cajageneracionprocesador.setVisible(false);
            marcatargrafica.setVisible(false);
            cajamarcatargrafica.setVisible(false);
            tipoups.setVisible(false);
            cajatipoups.setVisible(false);
            voltentrada.setVisible(false);
            cajavoltentrada.setVisible(false);
            voltsalida.setVisible(false);
            cajavoltsalida.setVisible(false);
            cantidadtomas.setVisible(false);
            cajacantidadtomas.setVisible(false);
            tipomouse.setVisible(true);
            cajatipomouse.setVisible(true);

        }
         if(bloqueo == 10){
       
            resolucion.setVisible(false);
            cajaresolucion.setVisible(false);
            hdmi.setVisible(false);
            combohdmi.setVisible(false);
            usb.setVisible(false);
            combousb.setVisible(false);
            ram.setVisible(false);
            cajapulgadas.setVisible(false);
            dd.setVisible(false);
            cajadd.setVisible(false);
            pulgadas.setVisible(false);
            cajaram.setVisible(false);
            lector.setVisible(false);
            combolector.setVisible(false);
            impresora.setVisible(false);
            cajaimpresora.setVisible(false);
            tipoteclado.setVisible(true);
            cajatipoteclado.setVisible(true);
            sistemaoperativo.setVisible(false);
            cajasistemaoperativo.setVisible(false);
            marcaprocesador.setVisible(false);
            cajamarcaprocesador.setVisible(false);
            generacionprocesador.setVisible(false);
            cajageneracionprocesador.setVisible(false);
            marcatargrafica.setVisible(false);
            cajamarcatargrafica.setVisible(false);
            tipoups.setVisible(false);
            cajatipoups.setVisible(false);
            voltentrada.setVisible(false);
            cajavoltentrada.setVisible(false);
            voltsalida.setVisible(false);
            cajavoltsalida.setVisible(false);
            cantidadtomas.setVisible(false);
            cajacantidadtomas.setVisible(false);
            tipomouse.setVisible(false);
            cajatipomouse.setVisible(false);

        }
    }//GEN-LAST:event_equipoActionPerformed

    private void cajaresolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaresolucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaresolucionActionPerformed

    private void cajapulgadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajapulgadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajapulgadasActionPerformed

    private void cajaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaddActionPerformed

    private void combolectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combolectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combolectorActionPerformed

    private void cajaramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaramActionPerformed

    private void cajaserieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaserieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaserieActionPerformed

    private void cajamodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajamodeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajamodeloActionPerformed

    private void cajamarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajamarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajamarcaActionPerformed

    private void cajaimpresoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaimpresoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaimpresoraActionPerformed

    private void cajatipotecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajatipotecladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajatipotecladoActionPerformed

    private void combousbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combousbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combousbActionPerformed

    private void combohdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combohdmiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combohdmiActionPerformed

    private void cajacustodioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajacustodioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajacustodioActionPerformed

    private void comboestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboestadoActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // TODO add your handling code here:
        nuevo.setEnabled(false);
        desbloqueo();
    }//GEN-LAST:event_nuevoActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        Conexion cc= new Conexion();
 Connection cn = cc.getConnection();
        
        String eq_equipo,eq_marca,eq_modelo,eq_serie,eq_resolucion,eq_pulgadas,eq_tamanodisduro,eq_tamanoram,eq_sistemaoperativo,eq_marcaprocesador,eq_genprocesador,eq_marcatargrafica,eq_lectordvd,eq_tipoups,eq_voltentrada,eq_voltsalida,eq_cantidadtomas,eq_tipomouse,eq_tipoteclado,eq_tipoimpresora,eq_puertohdmi,eq_puertousb,eq_fecharegistro,eq_custodio,eq_ubicacion,eq_estado,eq_observacion,eq_explicacion;
        String sql="";
        
    eq_equipo=equipo.getSelectedItem().toString();
    eq_marca=cajamarca.getText();
    eq_modelo=cajamodelo.getText();
    eq_serie=cajaserie.getText();
    eq_resolucion=cajaresolucion.getText();
    eq_pulgadas=cajapulgadas.getText();
    eq_tamanodisduro=cajadd.getText();
    eq_tamanoram=cajaram.getText();
    eq_sistemaoperativo=cajasistemaoperativo.getText();
    eq_marcaprocesador=cajamarcaprocesador.getText();
    eq_genprocesador=cajageneracionprocesador.getText();
    eq_marcatargrafica=cajamarcatargrafica.getText();
    eq_lectordvd=combolector.getSelectedItem().toString();
    eq_tipoups=cajatipoups.getText();
    eq_voltentrada=cajavoltentrada.getText();
    eq_voltsalida=cajavoltsalida.getText();
    eq_cantidadtomas=cajacantidadtomas.getText();
    eq_tipomouse=cajatipomouse.getText();
    eq_tipoteclado=cajatipoteclado.getText();
    eq_tipoimpresora=cajaimpresora.getText();
    eq_puertohdmi=combohdmi.getSelectedItem().toString();
    eq_puertousb=combousb.getSelectedItem().toString();
    eq_fecharegistro=cajafecha.getText();
    eq_custodio=cajacustodio.getText();
    eq_ubicacion=cajaubicacion.getText();
    eq_estado=comboestado.getSelectedItem().toString();
    eq_observacion=observacion.getText();
    eq_explicacion = cajaexplicacion.getText();
    
    //campos obligatorios
        if(cajaubicacion.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcados (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
              }

        if(cajamarca.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcados (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
              }
        if(cajamodelo.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcados (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
              }
  
       if(cajaserie.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcados (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
              }
       
        if(equipo.getSelectedItem().toString().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcados (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
              } 
        if(comboestado.getSelectedItem().toString().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcados (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
              } 
   
        
        sql="INSERT INTO articulos( eq_equipo,eq_marca,eq_modelo,eq_serie,eq_resolucion,eq_pulgadas,eq_tamanodisduro,eq_tamanoram,eq_sistemaoperativo,eq_marcaprocesador,eq_genprocesador,eq_marcatargrafica,eq_lectordvd,eq_tipoups,eq_voltentrada,eq_voltsalida,eq_cantidadtomas,eq_tipomouse,eq_tipoteclado,eq_tipoimpresora,eq_puertohdmi,eq_puertousb,eq_fecharegistro,eq_custodio,eq_ubicacion,eq_estado,eq_observacion, eq_explicacion) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement psd =cn.prepareStatement(sql);
            psd.setString(1, eq_equipo);
            psd.setString(2, eq_marca);
            psd.setString(3, eq_modelo);
            psd.setString(4, eq_serie);
            psd.setString(5, eq_resolucion);
            psd.setString(6, eq_pulgadas);
            psd.setString(7, eq_tamanodisduro);
            psd.setString(8, eq_tamanoram);
            psd.setString(9, eq_sistemaoperativo);
            psd.setString(10, eq_marcaprocesador);
            psd.setString(11, eq_genprocesador);
            psd.setString(12, eq_marcatargrafica);
            psd.setString(13, eq_lectordvd);
            psd.setString(14, eq_tipoups);
            psd.setString(15, eq_voltentrada);
            psd.setString(16, eq_voltsalida);
            psd.setString(17, eq_cantidadtomas);
            psd.setString(18, eq_tipomouse);
            psd.setString(19, eq_tipoteclado);
            psd.setString(20, eq_tipoimpresora);
            psd.setString(21, eq_puertohdmi);
            psd.setString(22, eq_puertousb);
            psd.setString(23, eq_fecharegistro);
            psd.setString(24, eq_custodio);
            psd.setString(25, eq_ubicacion);
            psd.setString(26, eq_estado);
            psd.setString(27, eq_observacion);
            psd.setString(28, eq_explicacion);
           int n=psd.executeUpdate();
           
           if (n>0){
               JOptionPane.showMessageDialog(null,"Nuevo Equipo Registrado!","CORRECTO",JOptionPane.PLAIN_MESSAGE,icon);
               cargar();
               limpiar();   
               bloqueo();
               nuevo.setEnabled(true);
               invisible();    
               

           }else{
               JOptionPane.showMessageDialog(this,"Su Equipo No Se Guardo ","ERROR",JOptionPane.ERROR_MESSAGE,save);
               
     
               } 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Este No.Serie Ya Existe!","ERROR",JOptionPane.ERROR_MESSAGE,save);
           // Logger.getLogger(IngresoArticulos.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        
        
        
    }//GEN-LAST:event_guardarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
         bloqueo();
        nuevo.setEnabled(true);
        invisible();
    }//GEN-LAST:event_cancelarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cajasistemaoperativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajasistemaoperativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajasistemaoperativoActionPerformed

    private void cajamarcaprocesadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajamarcaprocesadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajamarcaprocesadorActionPerformed

    private void cajageneracionprocesadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajageneracionprocesadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajageneracionprocesadorActionPerformed

    private void cajamarcatargraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajamarcatargraficaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajamarcatargraficaActionPerformed

    private void cajaubicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaubicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaubicacionActionPerformed

    private void cajacantidadtomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajacantidadtomasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajacantidadtomasActionPerformed

    private void cajavoltsalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajavoltsalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajavoltsalidaActionPerformed

    private void cajavoltentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajavoltentradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajavoltentradaActionPerformed

    private void cajatipoupsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajatipoupsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajatipoupsActionPerformed

    private void cajatipomouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajatipomouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajatipomouseActionPerformed

    private void cajaexplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaexplicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaexplicacionActionPerformed

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
            java.util.logging.Logger.getLogger(IngresoArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoArticulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cajacantidadtomas;
    private javax.swing.JTextField cajacustodio;
    private javax.swing.JTextField cajadd;
    private javax.swing.JTextField cajaexplicacion;
    private javax.swing.JLabel cajafecha;
    private javax.swing.JTextField cajageneracionprocesador;
    private javax.swing.JTextField cajaimpresora;
    private javax.swing.JTextField cajamarca;
    private javax.swing.JTextField cajamarcaprocesador;
    private javax.swing.JTextField cajamarcatargrafica;
    private javax.swing.JTextField cajamodelo;
    private javax.swing.JTextField cajapulgadas;
    private javax.swing.JTextField cajaram;
    private javax.swing.JTextField cajaresolucion;
    private javax.swing.JTextField cajaserie;
    private javax.swing.JTextField cajasistemaoperativo;
    private javax.swing.JTextField cajatipomouse;
    private javax.swing.JTextField cajatipoteclado;
    private javax.swing.JTextField cajatipoups;
    private javax.swing.JTextField cajaubicacion;
    private javax.swing.JTextField cajavoltentrada;
    private javax.swing.JTextField cajavoltsalida;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel cantidadtomas;
    private javax.swing.JComboBox comboestado;
    private javax.swing.JComboBox combohdmi;
    private javax.swing.JComboBox combolector;
    private javax.swing.JComboBox combousb;
    private javax.swing.JLabel dd;
    private javax.swing.JComboBox equipo;
    private javax.swing.JLabel generacionprocesador;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel hdmi;
    private javax.swing.JLabel impresora;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lector;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel marcaprocesador;
    private javax.swing.JLabel marcatargrafica;
    private javax.swing.JLabel modeloddd;
    private javax.swing.JButton nuevo;
    private javax.swing.JTextArea observacion;
    private javax.swing.JLabel pulgadas;
    private javax.swing.JLabel ram;
    private javax.swing.JLabel resolucion;
    private javax.swing.JLabel serie;
    private javax.swing.JLabel sistemaoperativo;
    private javax.swing.JTable t_evento2;
    private javax.swing.JLabel tipomouse;
    private javax.swing.JLabel tipoteclado;
    private javax.swing.JLabel tipoups;
    private javax.swing.JLabel usb;
    private javax.swing.JLabel voltentrada;
    private javax.swing.JLabel voltsalida;
    // End of variables declaration//GEN-END:variables
}
