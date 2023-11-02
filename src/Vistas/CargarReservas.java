package Vistas;

import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.Reserva;
import Entidades.TipoDeHabitacion;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

public class CargarReservas extends javax.swing.JInternalFrame {

    private Reserva reservaActual = null;
    private ReservaData reseData = new ReservaData();
    private HabitacionData habitacionSeleccionada = new HabitacionData();
    private Habitacion habitacionActual = null;
    private HuespedData huespedSeleciconado = new HuespedData();
    private Huesped huespedActual = null;

    public CargarReservas() {
        initComponents();

        jtCpersonas.setTransferHandler(null);
        jtPrecioNoche.setTransferHandler(null);
        jtPrecioNoche.setTransferHandler(null);
        jdFechaIngreso.setTransferHandler(null);
        jdFechaIngreso.setTransferHandler(null);
        
       
        ((JTextFieldDateEditor) jdFechaIngreso.getDateEditor()).setEditable(false);
        ((JTextFieldDateEditor) jdFechaSalida.getDateEditor()).setEditable(false);
        CargarComboBox();
        ComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jCheckEstado = new javax.swing.JCheckBox();
        jbSalir = new javax.swing.JButton();
        jdFechaIngreso = new com.toedter.calendar.JDateChooser();
        jdFechaSalida = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jtIDhuesped = new javax.swing.JTextField();
        jtCpersonas = new javax.swing.JTextField();
        jcbHabitacion = new javax.swing.JComboBox<>();
        jtPrecioNoche = new javax.swing.JTextField();
        jtidHabitacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtPrecioTotal = new javax.swing.JTextField();
        jbCalcular = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jCheckEstado1 = new javax.swing.JCheckBox();
        jbGuardar1 = new javax.swing.JButton();
        jbModificar1 = new javax.swing.JButton();
        jbEliminar1 = new javax.swing.JButton();
        jbSalir1 = new javax.swing.JButton();
        jdFechaIngreso1 = new com.toedter.calendar.JDateChooser();
        jdFechaSalida1 = new com.toedter.calendar.JDateChooser();
        jComboBox2 = new javax.swing.JComboBox<>();
        jtIDhuesped1 = new javax.swing.JTextField();
        jtCpersonas1 = new javax.swing.JTextField();
        jcbHabitacion1 = new javax.swing.JComboBox<>();
        jtPrecioNoche1 = new javax.swing.JTextField();
        jtidHabitacion1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtPrecioTotal1 = new javax.swing.JTextField();
        jbCalcular1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(1000, 1000));

        jLabel1.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CARGAR RESERVA");

        jLabel3.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Clientes:");

        jLabel4.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID Habitación:");

        jLabel5.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio x Noche:");

        jLabel6.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("C/Personas:");

        jLabel7.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha de Salida:");

        jLabel9.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha de Ingreso:");

        jLabel8.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estado:");

        jbGuardar.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 16)); // NOI18N
        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jCheckEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckEstadoActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 16)); // NOI18N
        jbSalir.setText("SALIR");
        jbSalir.setToolTipText("");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jdFechaSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdFechaSalidaMouseClicked(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jtIDhuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIDhuespedActionPerformed(evt);
            }
        });
        jtIDhuesped.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIDhuespedKeyTyped(evt);
            }
        });

        jtCpersonas.setEditable(false);
        jtCpersonas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCpersonasKeyTyped(evt);
            }
        });

        jcbHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHabitacionActionPerformed(evt);
            }
        });

        jtPrecioNoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecioNocheActionPerformed(evt);
            }
        });
        jtPrecioNoche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioNocheKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Precio Total:");

        jtPrecioTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioTotalKeyTyped(evt);
            }
        });

        jbCalcular.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 16)); // NOI18N
        jbCalcular.setText("CALCULAR");
        jbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularActionPerformed(evt);
            }
        });

        jInternalFrame1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel10.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 36)); // NOI18N
        jLabel10.setText("Cargar Reserva");

        jLabel11.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel11.setText("Clientes");

        jLabel12.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel12.setText("ID Habitacion");

        jLabel13.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel13.setText("Precio x Noche");

        jLabel14.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel14.setText("C/Personas");

        jLabel15.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel15.setText("Fecha de Salida");

        jLabel16.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel16.setText("Fecha de Ingreso");

        jLabel17.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel17.setText("Estado");

        jCheckEstado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckEstado1ActionPerformed(evt);
            }
        });

        jbGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salvar.png"))); // NOI18N
        jbGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardar1ActionPerformed(evt);
            }
        });

        jbModificar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ajustes.png"))); // NOI18N

        jbEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton-eliminar.png"))); // NOI18N

        jbSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salida.png"))); // NOI18N
        jbSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalir1ActionPerformed(evt);
            }
        });

        jdFechaSalida1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdFechaSalida1MouseClicked(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jtIDhuesped1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIDhuesped1ActionPerformed(evt);
            }
        });
        jtIDhuesped1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIDhuesped1KeyTyped(evt);
            }
        });

        jtCpersonas1.setEditable(false);
        jtCpersonas1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCpersonas1KeyTyped(evt);
            }
        });

        jcbHabitacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHabitacion1ActionPerformed(evt);
            }
        });

        jtPrecioNoche1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecioNoche1ActionPerformed(evt);
            }
        });
        jtPrecioNoche1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioNoche1KeyTyped(evt);
            }
        });

        jLabel18.setText("Precio Total");

        jtPrecioTotal1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioTotal1KeyTyped(evt);
            }
        });

        jbCalcular1.setText("CALCULAR");
        jbCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcular1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jbGuardar1)
                        .addGap(18, 18, 18)
                        .addComponent(jbModificar1)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar1)
                        .addGap(726, 726, 726)
                        .addComponent(jbSalir1)
                        .addContainerGap())
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(248, 248, 248)
                                .addComponent(jLabel10))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13))
                                .addGap(76, 76, 76)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtPrecioTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtCpersonas1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtPrecioNoche1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)))
                                .addGap(137, 137, 137)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17)))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbCalcular1)
                                .addGap(493, 493, 493)))
                        .addGap(28, 28, 28)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdFechaSalida1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdFechaIngreso1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jtIDhuesped1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtidHabitacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckEstado1)
                                    .addComponent(jcbHabitacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtIDhuesped1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtidHabitacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbHabitacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdFechaIngreso1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jLabel14)
                        .addComponent(jtCpersonas1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdFechaSalida1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jtPrecioNoche1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jtPrecioTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbCalcular1)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jCheckEstado1))))
                .addGap(49, 49, 49)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbGuardar1)
                    .addComponent(jbModificar1)
                    .addComponent(jbEliminar1)
                    .addComponent(jbSalir1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtCpersonas, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtPrecioNoche, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jbCalcular)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jtIDhuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addComponent(jtidHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jdFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                    .addComponent(jCheckEstado)
                                    .addComponent(jdFechaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbHabitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(848, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir)
                        .addGap(100, 100, 100))))
            .addGroup(layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 499, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 453, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtIDhuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtidHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtCpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jdFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jtPrecioNoche, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jCheckEstado))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 233, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 233, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckEstadoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        System.out.println("aaaaaaa");

        try {
            System.out.println("bbbbbbbb");
            int idHabitacion = Integer.parseInt(jtidHabitacion.getText());
            System.out.println("1");
            int idHuesped = Integer.parseInt(jtIDhuesped.getText());
            LocalDate fechaIngreso = jdFechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaSalida = jdFechaSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            double precioTotal = Double.parseDouble(jtPrecioTotal.getText());
            System.out.println("2");
            int cantidadPersonas = Integer.parseInt(jtCpersonas.getText());
            boolean estado = jCheckEstado.isSelected();

            if (reservaActual == null) {
                Reserva res = new Reserva(idHabitacion, idHuesped, fechaIngreso, fechaSalida, cantidadPersonas, precioTotal, estado);

//Reserva reserva = new Reserva("idHuesped","idHabitacion","fechaIngreso","fechaSalida","cantidadPersonas","precioTotal",estado");
                if (fechaSalida.isAfter(fechaIngreso)) {

                    reseData.guardarReserva(res);
                    habitacionSeleccionada.habitacionDisponible(idHabitacion);
                    huespedSeleciconado.HuespedenHotel(idHuesped);
                } else {
                    JOptionPane.showMessageDialog(null, "Fecha de salida incorrecta");

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros");

            jbGuardar.setEnabled(true);
        }
        LocalDate fecha1 = jdFechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fecha2 = jdFechaSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("fech1: " + fecha1);
        System.out.println("fech2: " + fecha2);

        int anioACT = fecha2.getYear();
        int mesACT = fecha2.getMonthValue();
        int diaACT = fecha2.getDayOfMonth();

        int resAnio = 0;

        int resDia = fecha2.getDayOfMonth() - fecha1.getDayOfMonth();
        int resMes = fecha2.getMonthValue() - fecha1.getMonthValue();

        if (fecha2.getYear() > fecha1.getYear()) {
            if (fecha2.getMonthValue() == fecha1.getMonthValue()) {

                if (fecha2.getDayOfMonth() == fecha1.getDayOfMonth()) {
                    resAnio = fecha2.getYear() - fecha1.getYear();
                }
            } else {
                resAnio = fecha2.getYear() - fecha1.getYear() - 1;
            }
        }

        System.out.println("dias: " + resDia);
        double Precio = Double.parseDouble(jtPrecioNoche.getText());

        double PrecioTotal = Precio * resDia;
        System.out.println(PrecioTotal);


    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        Huesped huespedSeleccionado = (Huesped) jComboBox1.getSelectedItem();
//              jComboBox1.getSelectedItem();
        jtIDhuesped.setText(huespedSeleccionado.getIdHuesped() + "");

//
//
//        
//        
//        

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jtIDhuespedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIDhuespedKeyTyped

    }//GEN-LAST:event_jtIDhuespedKeyTyped

    private void jcbHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHabitacionActionPerformed
        Habitacion habitacionseleccionado = (Habitacion) jcbHabitacion.getSelectedItem();
        HabitacionData hd = new HabitacionData();

        jtidHabitacion.setText(habitacionseleccionado.getIdHabitacion() + "");
        jtPrecioNoche.setText(habitacionseleccionado.getPrecioNoche() + "");
        jtCpersonas.setText(habitacionseleccionado.getCantidadpersonas() + "");


    }//GEN-LAST:event_jcbHabitacionActionPerformed

    private void jtPrecioNocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecioNocheActionPerformed
//       LocalDate fecha1=LocalDate.of(1990,8,18);
//    LocalDate fecha2=LocalDate.now();
//    System.out.println("fech1: "+fecha1);
//    System.out.println("fech2: "+fecha2);
//
//    int anioACT = fecha2.getYear();
//    int mesACT = fecha2.getMonthValue();
//    int diaACT = fecha2.getDayOfMonth();
//
//    int resAnio = 0;
//
//    int resDia = fecha2.getDayOfMonth() - fecha1.getDayOfMonth() + 1;
//    int resMes = fecha2.getMonthValue() - fecha1.getMonthValue() -1;
//
//    if(fecha2.getYear() > fecha1.getYear()) {
//       if(fecha2.getMonthValue() == fecha1.getMonthValue()) {
//
//
//                if(fecha2.getDayOfMonth() == fecha1.getDayOfMonth()) {
//                    resAnio = fecha2.getYear() - fecha1.getYear();
//                }
//            }else {
//                resAnio = fecha2.getYear() - fecha1.getYear() - 1;
//            }
//        }                                                   
//
//        System.out.println("dias: "+resDia);
//        System.out.println("meses: "+resMes);
//        System.out.println("anios: "+resAnio);
//    
//    

    }//GEN-LAST:event_jtPrecioNocheActionPerformed

    private void jtIDhuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIDhuespedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIDhuespedActionPerformed

    private void jdFechaSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdFechaSalidaMouseClicked

    }//GEN-LAST:event_jdFechaSalidaMouseClicked

    private void jbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularActionPerformed
        System.out.println("aaaaaaa");

        if (jtPrecioTotal != null) {

            jtPrecioTotal.setText("");
        }

        try {
            System.out.println("bbbbbbbb");
            int idHabitacion = Integer.parseInt(jtidHabitacion.getText());
            System.out.println("1");
            int idHuesped = Integer.parseInt(jtIDhuesped.getText());
            LocalDate fechaIngreso = jdFechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaSalida = jdFechaSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            double precioTotal = Double.parseDouble(jtPrecioNoche.getText());
            System.out.println("2");
            int cantidadPersonas = Integer.parseInt(jtCpersonas.getText());
            boolean estado = jCheckEstado.isSelected();

            if (reservaActual == null) {
                Reserva res = new Reserva(idHabitacion, idHuesped, fechaIngreso, fechaSalida, cantidadPersonas, precioTotal, estado);
                //Reserva reserva = new Reserva("idHuesped","idHabitacion","fechaIngreso","fechaSalida","cantidadPersonas","precioTotal",estado");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros");

        }
        long dateBeforeInMs = jdFechaIngreso.getDate().getTime();
        long dateAfterInMs = jdFechaSalida.getDate().getTime();
        long timeDiff = Math.abs(dateAfterInMs - dateBeforeInMs);
        long resDia = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);

        System.out.println("dias: " + resDia);
        double Precio = Double.parseDouble(jtPrecioNoche.getText());

        double PrecioTotal = Precio * resDia;
        System.out.println(PrecioTotal);

        jtPrecioTotal.setText((PrecioTotal) + "");
        // Realiza el cálculo de días y otros cálculos relacionados con la reserva
        // ...

//         PrecioTotal = jtPrecioCalculado.getText().toString(); 

    }//GEN-LAST:event_jbCalcularActionPerformed

    private void jtPrecioNocheKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioNocheKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.')) {
            evt.consume();
        }
//
        //Permite ingresar SOLO caracteres

        // TODO add your handling code here:
    }//GEN-LAST:event_jtPrecioNocheKeyTyped

    private void jtCpersonasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCpersonasKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.')) {
            evt.consume();
        }

    }//GEN-LAST:event_jtCpersonasKeyTyped

    private void jtPrecioTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioTotalKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_jtPrecioTotalKeyTyped

    private void jCheckEstado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckEstado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckEstado1ActionPerformed

    private void jbGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbGuardar1ActionPerformed

    private void jbSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSalir1ActionPerformed

    private void jdFechaSalida1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdFechaSalida1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jdFechaSalida1MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jtIDhuesped1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIDhuesped1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIDhuesped1ActionPerformed

    private void jtIDhuesped1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIDhuesped1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIDhuesped1KeyTyped

    private void jtCpersonas1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCpersonas1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCpersonas1KeyTyped

    private void jcbHabitacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHabitacion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbHabitacion1ActionPerformed

    private void jtPrecioNoche1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecioNoche1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPrecioNoche1ActionPerformed

    private void jtPrecioNoche1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioNoche1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPrecioNoche1KeyTyped

    private void jtPrecioTotal1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioTotal1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPrecioTotal1KeyTyped

    private void jbCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcular1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCalcular1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckEstado;
    private javax.swing.JCheckBox jCheckEstado1;
    private javax.swing.JComboBox<Huesped> jComboBox1;
    private javax.swing.JComboBox<Huesped> jComboBox2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbCalcular;
    private javax.swing.JButton jbCalcular1;
    private javax.swing.JButton jbEliminar1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbGuardar1;
    private javax.swing.JButton jbModificar1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbSalir1;
    private javax.swing.JComboBox<Habitacion> jcbHabitacion;
    private javax.swing.JComboBox<Habitacion> jcbHabitacion1;
    private com.toedter.calendar.JDateChooser jdFechaIngreso;
    private com.toedter.calendar.JDateChooser jdFechaIngreso1;
    private com.toedter.calendar.JDateChooser jdFechaSalida;
    private com.toedter.calendar.JDateChooser jdFechaSalida1;
    private javax.swing.JTextField jtCpersonas;
    private javax.swing.JTextField jtCpersonas1;
    private javax.swing.JTextField jtIDhuesped;
    private javax.swing.JTextField jtIDhuesped1;
    private javax.swing.JTextField jtPrecioNoche;
    private javax.swing.JTextField jtPrecioNoche1;
    private javax.swing.JTextField jtPrecioTotal;
    private javax.swing.JTextField jtPrecioTotal1;
    private javax.swing.JTextField jtidHabitacion;
    private javax.swing.JTextField jtidHabitacion1;
    // End of variables declaration//GEN-END:variables

    private void CargarComboBox() {
        HuespedData hues = new HuespedData();
        List<Huesped> h = hues.listarHuesped();
        for (Huesped huesped : h) {
            jComboBox1.addItem(huesped);
        }

    }

    private void ComboBox() {

        HabitacionData habiData = new HabitacionData();
        List<Habitacion> hab = habiData.listarHabitacionDispo();
        for (Habitacion habitacion : hab) {
            jcbHabitacion.addItem(habitacion);
        }

    }

}
