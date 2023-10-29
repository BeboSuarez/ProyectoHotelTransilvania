package Vistas;

import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.Reserva;
import Entidades.TipoDeHabitacion;
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
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
        jCheckEstado = new javax.swing.JCheckBox();
        jbGuardar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
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

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 36)); // NOI18N
        jLabel1.setText("Cargar Reserva");

        jLabel3.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel3.setText("Clientes");

        jLabel4.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel4.setText("ID Habitacion");

        jLabel5.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel5.setText("Precio x Noche");

        jLabel6.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel6.setText("C/Personas");

        jLabel7.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel7.setText("Fecha de Salida");

        jLabel9.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel9.setText("Fecha de Ingreso");

        jLabel8.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel8.setText("Estado");

        jCheckEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckEstadoActionPerformed(evt);
            }
        });

        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salvar.png"))); // NOI18N
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ajustes.png"))); // NOI18N

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton-eliminar.png"))); // NOI18N

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salida.png"))); // NOI18N
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

        jLabel2.setText("Precio Total");

        jtPrecioTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioTotalKeyTyped(evt);
            }
        });

        jbCalcular.setText("CALCULAR");
        jbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularActionPerformed(evt);
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
                        .addComponent(jbGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar)
                        .addGap(726, 726, 726)
                        .addComponent(jbSalir)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(248, 248, 248)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtCpersonas, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtPrecioNoche, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)))
                                .addGap(137, 137, 137)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbCalcular)
                                .addGap(493, 493, 493)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckEstado)
                            .addComponent(jdFechaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtIDhuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtidHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtIDhuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtidHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel6)
                        .addComponent(jtCpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtPrecioNoche, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbCalcular)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jCheckEstado))))
                .addGap(145, 145, 145)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbGuardar)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir))
                .addContainerGap())
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
                Reserva res = new Reserva(idHabitacion,idHuesped,fechaIngreso,fechaSalida,cantidadPersonas,precioTotal,estado);
                //Reserva reserva = new Reserva("idHuesped","idHabitacion","fechaIngreso","fechaSalida","cantidadPersonas","precioTotal",estado");
                reseData.guardarReserva(res);
                habitacionSeleccionada.habitacionDisponible(idHabitacion);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
            

        

        jbGuardar.setEnabled(false);
         }        
       LocalDate fecha1=jdFechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    LocalDate fecha2=jdFechaSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    System.out.println("fech1: "+fecha1);
    System.out.println("fech2: "+fecha2);

    int anioACT = fecha2.getYear();
    int mesACT = fecha2.getMonthValue();
    int diaACT = fecha2.getDayOfMonth();

    int resAnio = 0;

    int resDia = fecha2.getDayOfMonth() - fecha1.getDayOfMonth();
    int resMes = fecha2.getMonthValue() - fecha1.getMonthValue();

    if(fecha2.getYear() > fecha1.getYear()) {
       if(fecha2.getMonthValue() == fecha1.getMonthValue()) {


                if(fecha2.getDayOfMonth() == fecha1.getDayOfMonth()) {
                    resAnio = fecha2.getYear() - fecha1.getYear();
                }
            }else {
                resAnio = fecha2.getYear() - fecha1.getYear() - 1;
            }
        }                                                   
        
        System.out.println("dias: "+resDia);
      double Precio = Double.parseDouble(jtPrecioNoche.getText());
      
      double PrecioTotal = Precio * resDia;
        System.out.println(PrecioTotal);
        
       
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

            Huesped huespedSeleccionado = (Huesped) jComboBox1.getSelectedItem();
//              jComboBox1.getSelectedItem();
              jtIDhuesped.setText(huespedSeleccionado.getIdHuesped()+"");
         
//
//
//        
//        
//        
        
        
        
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jtIDhuespedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIDhuespedKeyTyped
        
    }//GEN-LAST:event_jtIDhuespedKeyTyped

    private void jcbHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHabitacionActionPerformed
     Habitacion habitacionseleccionado=(Habitacion) jcbHabitacion.getSelectedItem();
      

     jtidHabitacion.setText(habitacionseleccionado.getIdHabitacion()+"");
     jtPrecioNoche.setText(habitacionseleccionado.getPrecioNoche()+"");
         
     

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
        
        if(jtPrecioTotal != null){
        
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
                Reserva res = new Reserva(idHabitacion,idHuesped,fechaIngreso,fechaSalida,cantidadPersonas,precioTotal,estado);
                //Reserva reserva = new Reserva("idHuesped","idHabitacion","fechaIngreso","fechaSalida","cantidadPersonas","precioTotal",estado");
              
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
           
         }        
       LocalDate fecha1=jdFechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    LocalDate fecha2=jdFechaSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    System.out.println("fech1: "+fecha1);
    System.out.println("fech2: "+fecha2);

    int anioACT = fecha2.getYear();
    int mesACT = fecha2.getMonthValue();
    int diaACT = fecha2.getDayOfMonth();

    int resAnio = 0;

    int resDia = fecha2.getDayOfMonth() - fecha1.getDayOfMonth();
    int resMes = fecha2.getMonthValue() - fecha1.getMonthValue();

    if(fecha2.getYear() > fecha1.getYear()) {
       if(fecha2.getMonthValue() == fecha1.getMonthValue()) {


                if(fecha2.getDayOfMonth() == fecha1.getDayOfMonth()) {
                    resAnio = fecha2.getYear() - fecha1.getYear();
                }
            }else {
                resAnio = fecha2.getYear() - fecha1.getYear() - 1;
            }
        }                                                   
        
        System.out.println("dias: "+resDia);
      double Precio = Double.parseDouble(jtPrecioNoche.getText());
      
      double PrecioTotal = Precio * resDia;
        System.out.println(PrecioTotal);
        jtPrecioTotal.setText((PrecioTotal)+"");
        
        
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckEstado;
    private javax.swing.JComboBox<Huesped> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbCalcular;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Habitacion> jcbHabitacion;
    private com.toedter.calendar.JDateChooser jdFechaIngreso;
    private com.toedter.calendar.JDateChooser jdFechaSalida;
    private javax.swing.JTextField jtCpersonas;
    private javax.swing.JTextField jtIDhuesped;
    private javax.swing.JTextField jtPrecioNoche;
    private javax.swing.JTextField jtPrecioTotal;
    private javax.swing.JTextField jtidHabitacion;
    // End of variables declaration//GEN-END:variables

    private void CargarComboBox(){
        HuespedData hues = new HuespedData();
        List<Huesped> h = hues.listarHuesped();
        for(Huesped huesped : h){
            jComboBox1.addItem(huesped);
        }
       
    }
    private void ComboBox(){
    
         HabitacionData habiData = new HabitacionData();
        List<Habitacion> hab = habiData.listarHabitacion();
        for(Habitacion habitacion : hab )
        jcbHabitacion.addItem(habitacion);
       
    }




}
