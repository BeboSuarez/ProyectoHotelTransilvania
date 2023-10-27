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

    public InfoReservas() {
        initComponents();
        ArmarCabecera();
        CargarComboHabitaciones();
        CargarComboBox();
        CargarComboHuesped();
        modelo = (DefaultTableModel) jTabla.getModel();
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
        idHabitacion = new javax.swing.JLabel();
        jidReserva = new javax.swing.JTextField();
        jcPersonas = new javax.swing.JTextField();
        jpTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtHabitacion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jrEstado = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jComboHuesped = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jtHuesped = new javax.swing.JTextField();

        jLabel1.setText("Informacion de las reservas");

        jbModificar.setText("MODIFICAR RESERVA");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setText("BAJA");

        jcbCargarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCargarClienteActionPerformed(evt);
            }
        });

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

        jbConsultar.setText("consultar");
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha Ingreso");

        jLabel3.setText("Fecha Salida");

        jcbHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHabitacionActionPerformed(evt);
            }
        });

        idHabitacion.setText("Habitaciones disponibles");

        jcPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPersonasActionPerformed(evt);
            }
        });

        jpTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpTotalActionPerformed(evt);
            }
        });

        jLabel4.setText("Personas");

        jLabel5.setText("PrecioTotal");

        jLabel6.setText("Estado");

        jtHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtHabitacionActionPerformed(evt);
            }
        });

        jLabel7.setText("idHabitacion");

        jrEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEstadoActionPerformed(evt);
            }
        });

        jLabel8.setText("IdReserva");

        jLabel9.setText("Huesped");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel3))
                                        .addGap(7, 7, 7))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jtHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jfechaIngreso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jfechaSalida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jbModificar)))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(idHabitacion)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrEstado)
                                    .addComponent(jidReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1)
                        .addGap(75, 75, 75)
                        .addComponent(jcbCargarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jbConsultar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbCargarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultar))
                .addGap(64, 64, 64)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jidReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jfechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jfechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jcPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jpTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jrEstado))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbCargarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCargarClienteActionPerformed

    }//GEN-LAST:event_jcbCargarClienteActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        Huesped hue = (Huesped) jcbCargarCliente.getSelectedItem();

        if (hue != null) {

            cargarTabla(hue.getIdHuesped());
        }
    }//GEN-LAST:event_jbConsultarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        ReservaData modData = new ReservaData();
        try {
            int filaSeleccionada = jTabla.getSelectedRow();
            int idHabitacion = (Integer) jTabla.getValueAt(filaSeleccionada, 1);
            int idHuesped = (Integer) jTabla.getValueAt(filaSeleccionada, 2);
            LocalDate fechaIngreso = (LocalDate) jfechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaSalida = (LocalDate) jfechaSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int cantidadPersonas = (Integer) jTabla.getValueAt(filaSeleccionada, 5);
            double precioTotal = (double) jTabla.getValueAt(filaSeleccionada, 6);
            boolean estado = (boolean) jTabla.getValueAt(filaSeleccionada, 7);
            Reserva modificar = new Reserva(idHabitacion, idHuesped, fechaIngreso, fechaSalida, cantidadPersonas, precioTotal, estado);

            modData.modificarReserva(modificar);
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

        jtHabitacion.setText(habiseleccionada.getIdHabitacion() + "");

    }//GEN-LAST:event_jcbHabitacionActionPerformed

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked
        ReservaData resDa = new ReservaData();
        Huesped huesped = new Huesped();
//                     Huesped hue = (Huesped) jcbCargarCliente.getSelectedItem();
//Reserva rese=(Reserva) jTabla.se;

        int filaSeleccionada = jTabla.getSelectedRow();
        jidReserva.setText(modelo.getValueAt(filaSeleccionada, 0).toString());
        jtHuesped.setText(modelo.getValueAt(filaSeleccionada, 1).toString());
        jtHabitacion.setText(modelo.getValueAt(filaSeleccionada, 2).toString());
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
        System.out.println(modelo.getValueAt(filaSeleccionada, 1));

    }//GEN-LAST:event_jTablaMouseClicked

    private void jtHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtHabitacionActionPerformed

    private void jrEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrEstadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel idHabitacion;
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
    private javax.swing.JTextField jtHabitacion;
    private javax.swing.JTextField jtHuesped;
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
