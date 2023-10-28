package Vistas;

import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.Reserva;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InfoReservas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private Reserva reservaNueva = null;
    private ReservaData reservaData;

    public InfoReservas() {
        initComponents();
        ArmarCabecera();
        CargarComboHabitaciones();
        CargarComboBox();
        CargarComboHuesped();
        modelo = (DefaultTableModel) jTabla.getModel();
        reservaData=new ReservaData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jcbCargarCliente = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jbConsultar = new javax.swing.JButton();
        jfechaIngreso = new com.toedter.calendar.JDateChooser();
        jfechaSalida = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcbHabitacion = new javax.swing.JComboBox<>();
        jidReserva = new javax.swing.JTextField();
        jcPersonas = new javax.swing.JTextField();
        jpTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtidHabitacion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jrEstado = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jComboHuesped = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jtHuesped = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 102));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Informacion de las reservas");

        jbModificar.setBackground(new java.awt.Color(0, 0, 153));
        jbModificar.setForeground(new java.awt.Color(255, 255, 255));
        jbModificar.setText("MODIFICAR RESERVA");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(0, 0, 153));
        jbEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbEliminar.setText("BAJA");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jcbCargarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jcbCargarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCargarClienteActionPerformed(evt);
            }
        });

        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTabla);

        jbConsultar.setBackground(new java.awt.Color(0, 0, 153));
        jbConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jbConsultar.setText("consultar");
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });

        jfechaIngreso.setForeground(new java.awt.Color(0, 0, 51));

        jfechaSalida.setForeground(new java.awt.Color(0, 0, 51));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha Ingreso");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha Salida");

        jcbHabitacion.setForeground(new java.awt.Color(0, 0, 51));
        jcbHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHabitacionActionPerformed(evt);
            }
        });

        jidReserva.setForeground(new java.awt.Color(0, 0, 51));
        jidReserva.setEnabled(false);

        jcPersonas.setForeground(new java.awt.Color(0, 0, 51));
        jcPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPersonasActionPerformed(evt);
            }
        });

        jpTotal.setForeground(new java.awt.Color(0, 0, 51));
        jpTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpTotalActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Personas");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PrecioTotal");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estado");

        jtidHabitacion.setForeground(new java.awt.Color(0, 0, 51));
        jtidHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtidHabitacionActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Habitacion");

        jrEstado.setForeground(new java.awt.Color(255, 255, 255));
        jrEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEstadoActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID-Reserva");

        jComboHuesped.setForeground(new java.awt.Color(0, 0, 51));
        jComboHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboHuespedActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Huesped");

        jtHuesped.setForeground(new java.awt.Color(0, 0, 51));

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jtHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jfechaSalida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jtidHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jcbHabitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jfechaIngreso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(139, 139, 139)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrEstado)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jpTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                        .addComponent(jcPersonas, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbModificar)
                                .addGap(54, 54, 54)
                                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(273, 273, 273)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jcbCargarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jbConsultar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jidReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbCargarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jidReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jrEstado))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jcPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jpTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel7)
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jfechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jfechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtidHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar)
                    .addComponent(jButton1))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbCargarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCargarClienteActionPerformed
borrarFilas();
    }//GEN-LAST:event_jcbCargarClienteActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        Huesped hue = (Huesped) jcbCargarCliente.getSelectedItem();

        if (hue != null) {

            cargarTabla(hue.getIdHuesped());
        }
    }//GEN-LAST:event_jbConsultarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
     
        try {
//            int filaSeleccionada = jTabla.getSelectedRow();
//           int idReserva =(Integer)jTabla.getValueAt(filaSeleccionada, 0);
//            int idHabitacion = (Integer) jTabla.getValueAt(filaSeleccionada, 1);
//            int idHuesped = (Integer) jTabla.getValueAt(filaSeleccionada, 2);
//            LocalDate fechaIngreso = (LocalDate) jfechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//            LocalDate fechaSalida = (LocalDate) jfechaSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//            int cantidadPersonas = (Integer) jTabla.getValueAt(filaSeleccionada, 5);
//            double precioTotal = (double) jTabla.getValueAt(filaSeleccionada, 6);
//            boolean estado = (boolean) jTabla.getValueAt(filaSeleccionada, 7);
//            Reserva modificar = new Reserva(idReserva,idHabitacion, idHuesped, fechaIngreso, fechaSalida, cantidadPersonas, precioTotal, estado);
int idReserva= Integer.parseInt(jidReserva.getText()+"");
int idHabitacion= Integer.parseInt(jtidHabitacion.getText()+"");
int idHuesped= Integer.parseInt(jtHuesped.getText()+"");
LocalDate fechaIngreso= jfechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
LocalDate fechaSalida=jfechaSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
int cantidadPersonas= Integer.parseInt(jcPersonas.getText()+"");
double precioTotal= Double.parseDouble(jpTotal.getText()+"");
boolean estado= jrEstado.isSelected();
Reserva r=new Reserva(idReserva, idHabitacion, idHuesped, fechaIngreso, fechaSalida, cantidadPersonas, precioTotal, estado);
            reservaData.modificarReserva(r);
           
            
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "HOLA :)");
        }

    }//GEN-LAST:event_jbModificarActionPerformed

    private void jcPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcPersonasActionPerformed

    private void jpTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpTotalActionPerformed

    private void jcbHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHabitacionActionPerformed
        Habitacion habiseleccionada = (Habitacion) jcbHabitacion.getSelectedItem();

        jtidHabitacion.setText(habiseleccionada.getIdHabitacion() + "");

    }//GEN-LAST:event_jcbHabitacionActionPerformed

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked
        ReservaData resDa = new ReservaData();
        Huesped huesped = new Huesped();
//                     Huesped hue = (Huesped) jcbCargarCliente.getSelectedItem();
//Reserva rese=(Reserva) jTabla.se;

        int filaSeleccionada = jTabla.getSelectedRow();
        jidReserva.setText(modelo.getValueAt(filaSeleccionada, 0).toString());
               jtidHabitacion.setText(modelo.getValueAt(filaSeleccionada, 1).toString());
        jtHuesped.setText(modelo.getValueAt(filaSeleccionada, 2).toString());
LocalDate fechaIngreso = (LocalDate) modelo.getValueAt(filaSeleccionada, 3);
        jfechaIngreso.setDate(java.sql.Date.valueOf(fechaIngreso));
        LocalDate fechaSalida = (LocalDate) modelo.getValueAt(filaSeleccionada, 4);
        jfechaSalida.setDate(java.sql.Date.valueOf(fechaSalida));
        jcPersonas.setText(modelo.getValueAt(filaSeleccionada, 5).toString());
        jpTotal.setText(modelo.getValueAt(filaSeleccionada, 6).toString());
        jrEstado.setSelected(true);

//     LocalDate fechaIngreso =(LocalDate) modelo.getValueAt(filaSeleccionada, 3);
//       jfechaIngreso.setDate(java.sql.Date.valueOf(fechaIngreso));
//        LocalDate fechaSalida =(LocalDate) modelo.getValueAt(filaSeleccionada, 4);
//        jfechaSalida.setDate(java.sql.Date.valueOf(fechaSalida));
//      Habitacion h = (Habitacion) jTabla.getValueAt(filaSeleccionada, 1);
//        System.out.println(h);
//   jcbHabitacion.getSelectedIndex(idHabitacion));
        

    }//GEN-LAST:event_jTablaMouseClicked

    private void jtidHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtidHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtidHabitacionActionPerformed

    private void jrEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrEstadoActionPerformed

    private void jComboHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboHuespedActionPerformed
        Huesped huespedseleccionado = (Huesped) jComboHuesped.getSelectedItem();

        jtHuesped.setText(huespedseleccionado.getIdHuesped() + "");
    }//GEN-LAST:event_jComboHuespedActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        int filaSeleccionada = jTabla.getSelectedRow();
            if(filaSeleccionada != -1){
            
            int idHuesped = (int) modelo.getValueAt(filaSeleccionada, 2);
            int idReserva = (int) modelo.getValueAt(filaSeleccionada, 0);
           reservaData.BajaReserva(idHuesped,idReserva);
            borrarFilas();
            
            
            }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();       
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Huesped> jComboHuesped;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabla;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JTextField jcPersonas;
    private javax.swing.JComboBox<Huesped> jcbCargarCliente;
    private javax.swing.JComboBox<Habitacion> jcbHabitacion;
    private com.toedter.calendar.JDateChooser jfechaIngreso;
    private com.toedter.calendar.JDateChooser jfechaSalida;
    private javax.swing.JTextField jidReserva;
    private javax.swing.JTextField jpTotal;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtHuesped;
    private javax.swing.JTextField jtidHabitacion;
    // End of variables declaration//GEN-END:variables

    private void borrarFilas() {
        int filas = jTabla.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void CargarComboBox() {
        HuespedData hues = new HuespedData();
        List<Huesped> h = hues.listarHuesped();
        for (Huesped huesped : h) {
            jcbCargarCliente.addItem(huesped);

        }
    }

    private void CargarComboHuesped() {
        HuespedData hues = new HuespedData();
        List<Huesped> h = hues.listarHuesped();
        for (Huesped huesped : h) {
            jComboHuesped.addItem(huesped);
        }
    }

    private void CargarComboHabitaciones() {
        HabitacionData Habi = new HabitacionData();

        List<Habitacion> ha = Habi.listarHabitacion();
        for (Habitacion habitacion : ha) {
            jcbHabitacion.addItem(habitacion);

        }
    }

    private void ArmarCabecera() {
        modelo.addColumn("ID Reserva");
        modelo.addColumn("ID Habitacion");
        modelo.addColumn("ID Huesped");
        modelo.addColumn("Fecha Ingreso");
        modelo.addColumn("Fecha Salida");
        modelo.addColumn("cantidadPersonas");
        modelo.addColumn("Precio Total");
        modelo.addColumn("Estado");
        jTabla.setModel(modelo);

    }

    private void cargarTabla(int idHuesped) {

        ReservaData resDa = new ReservaData();
        //  Huesped r = (Huesped) jcbCargarCliente.getSelectedItem();
        List<Reserva> res = resDa.obtenerReservaPorHuesped(idHuesped);
        for (Reserva reserva : res) {

            modelo.addRow(new Object[]{
                reserva.getIdReserva(),
                reserva.getIdHabitacion(),
                reserva.getIdHuesped(),
                reserva.getFechaIngreso(),
                reserva.getFechaSalida(),
                reserva.getCantidadPersonas(),
                reserva.getPrecioTotal(),
                reserva.isEstado()
            });

        }
    }

}
