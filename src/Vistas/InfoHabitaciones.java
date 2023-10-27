package Vistas;

import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import AccesoADatos.TipoDeHabitacionData;
import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.Reserva;
import Entidades.TipoDeHabitacion;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InfoHabitaciones extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private Habitacion habitacion = null;
    private HabitacionData habitacionData;
    private TipoDeHabitacion tipohabitacion;
    
    
    
    public InfoHabitaciones() {
        initComponents();
        ArmarCabecera();
        CargarComboHabitaciones();
//        CargarComboboxHabitaciones();
    
//       cargarTablaHabitacionD(tipohabitacion.isEstado(),tipohabitacion.getIdTipodehabitacion());
//      cargarTablaHabitacionND(tipohabitacion.isEstado(),tipohabitacion.getIdTipodehabitacion());
//      
        modelo = (DefaultTableModel) jTabla.getModel();
        habitacionData=new HabitacionData();
        tipohabitacion = new TipoDeHabitacion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jcbComboHabitaciones = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
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
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jrbHabitacionD = new javax.swing.JRadioButton();
        jrbHabitacionND = new javax.swing.JRadioButton();
        idTipoHabi = new javax.swing.JTextField();

        jLabel1.setText("Informacion de las Habitaciones");

        jbModificar.setText("MODIFICAR HABITACION");

        jbEliminar.setText("BAJA");

        jcbComboHabitaciones.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbComboHabitacionesPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jcbComboHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbComboHabitacionesActionPerformed(evt);
            }
        });

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTabla);

        jcbHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHabitacionActionPerformed(evt);
            }
        });

        idHabitacion.setText("Tipo de Habitacion");

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

        jLabel4.setText("Descripcion");

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

        jLabel8.setText("IdTipoHabitacion");

        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Refaccion");

        buttonGroup1.add(jrbHabitacionD);
        jrbHabitacionD.setText("HABITACION DISPONIBLE");
        jrbHabitacionD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbHabitacionDActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbHabitacionND);
        jrbHabitacionND.setText("HABITACION N/D ");
        jrbHabitacionND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbHabitacionNDActionPerformed(evt);
            }
        });

        idTipoHabi.setText("jTextField1");

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
                                    .addComponent(idHabitacion)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jcbHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrEstado)
                                            .addComponent(jtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButton1)))))
                            .addComponent(jbModificar))
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(1, 1, 1)))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jpTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jcbComboHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(idTipoHabi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jrbHabitacionD)
                        .addGap(183, 183, 183)
                        .addComponent(jrbHabitacionND)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbComboHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTipoHabi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbHabitacionD)
                    .addComponent(jrbHabitacionND))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jidReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jpTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(139, 139, 139))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jrEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton1)
                                .addGap(40, 40, 40))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbModificar)
                            .addComponent(jbEliminar))
                        .addGap(21, 21, 21))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcPersonasActionPerformed

    private void jpTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpTotalActionPerformed

    private void jcbHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHabitacionActionPerformed
//        Habitacion habiseleccionada = (Habitacion) jcbHabitacion.getSelectedItem();
//
//        jtHabitacion.setText(habiseleccionada.getIdHabitacion() + "");

    }//GEN-LAST:event_jcbHabitacionActionPerformed

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked
//        ReservaData resDa = new ReservaData();
//        Huesped huesped = new Huesped();
////                     Huesped hue = (Huesped) jcbCargarCliente.getSelectedItem();
////Reserva rese=(Reserva) jTabla.se;
//
//        int filaSeleccionada = jTabla.getSelectedRow();
//        jidReserva.setText(modelo.getValueAt(filaSeleccionada, 0).toString());
//               jtHabitacion.setText(modelo.getValueAt(filaSeleccionada, 1).toString());
//        jtHuesped.setText(modelo.getValueAt(filaSeleccionada, 2).toString());
//LocalDate fechaIngreso = (LocalDate) modelo.getValueAt(filaSeleccionada, 3);
//        jfechaIngreso.setDate(java.sql.Date.valueOf(fechaIngreso));
//        LocalDate fechaSalida = (LocalDate) modelo.getValueAt(filaSeleccionada, 4);
//        jfechaSalida.setDate(java.sql.Date.valueOf(fechaSalida));
//        jcPersonas.setText(modelo.getValueAt(filaSeleccionada, 5).toString());
//        jpTotal.setText(modelo.getValueAt(filaSeleccionada, 6).toString());
//        jrEstado.setSelected(true);
//
////     LocalDate fechaIngreso =(LocalDate) modelo.getValueAt(filaSeleccionada, 3);
////       jfechaIngreso.setDate(java.sql.Date.valueOf(fechaIngreso));
////        LocalDate fechaSalida =(LocalDate) modelo.getValueAt(filaSeleccionada, 4);
////        jfechaSalida.setDate(java.sql.Date.valueOf(fechaSalida));
////      Habitacion h = (Habitacion) jTabla.getValueAt(filaSeleccionada, 1);
////        System.out.println(h);
////   jcbHabitacion.getSelectedIndex(idHabitacion));
//        
//
    }//GEN-LAST:event_jTablaMouseClicked

    private void jtHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtHabitacionActionPerformed

    private void jrEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrEstadoActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jrbHabitacionDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbHabitacionDActionPerformed
//         TipoDeHabitacion tipohabi = (TipoDeHabitacion)jcbComboHabitaciones.getSelectedItem();
//       
//         borrarFilas();
//         if (tipohabi != null) {
//            if (jrbHabitacionD.isSelected()) {
//                cargarTablaHabitacionD(tipohabi.getIdTipodehabitacion());
//            }
//        }
    }//GEN-LAST:event_jrbHabitacionDActionPerformed

    private void jrbHabitacionNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbHabitacionNDActionPerformed
// TipoDeHabitacion tipohabi = (TipoDeHabitacion)jcbComboHabitaciones.getSelectedItem();
// borrarFilas();
//   cargarTablaHabitacionND(tipohabi.getIdTipodehabitacion());
    }//GEN-LAST:event_jrbHabitacionNDActionPerformed

    private void jcbComboHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbComboHabitacionesActionPerformed
//    TipoDeHabitacion tipohabi = (TipoDeHabitacion)jcbComboHabitaciones.getSelectedItem();
//    borrarFilas();
//     idTipoHabi.getText() tipohabi.getIdTipodehabitacion()+"":
    }//GEN-LAST:event_jcbComboHabitacionesActionPerformed

    private void jcbComboHabitacionesPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbComboHabitacionesPopupMenuWillBecomeInvisible
        cargarTablaHabitacionD(habitacion.getIdTipodehabitacion());        // TODO add your handling code here:
    }//GEN-LAST:event_jcbComboHabitacionesPopupMenuWillBecomeInvisible


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel idHabitacion;
    private javax.swing.JTextField idTipoHabi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabla;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JTextField jcPersonas;
    private javax.swing.JComboBox<TipoDeHabitacion> jcbComboHabitaciones;
    private javax.swing.JComboBox<Habitacion> jcbHabitacion;
    private javax.swing.JTextField jidReserva;
    private javax.swing.JTextField jpTotal;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JRadioButton jrbHabitacionD;
    private javax.swing.JRadioButton jrbHabitacionND;
    private javax.swing.JTextField jtHabitacion;
    // End of variables declaration//GEN-END:variables

    private void borrarFilas() {
        int filas = jTabla.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

//    private void CargarComboBox() {
//        HuespedData hues = new HuespedData();
//        List<Huesped> h = hues.listarHuesped();
//        for (Huesped huesped : h) {
//            jcbComboHabitaciones.addItem(huesped);
//
//        }
//    }

    private void CargarComboHabitaciones() {
        TipoDeHabitacionData Habi = new TipoDeHabitacionData();

        List<TipoDeHabitacion> ha = Habi.listarTipoDeHabitacion();
        for (TipoDeHabitacion tipohabitacion : ha) {
            jcbComboHabitaciones.addItem(tipohabitacion);

        }
    }

//    private void CargarComboboxHabitaciones() {
//        HabitacionData Habi = new HabitacionData();
//
//        List<Habitacion> ha = Habi.listarHabitacion();
//        for (Habitacion habitacion : ha) {
//            jcbHabitacion.addItem(habitacion);
//
//        }
//    }

    private void ArmarCabecera() {

        modelo.addColumn("ID Habitacion");
        modelo.addColumn("ID TipoHabitacion");
        modelo.addColumn("PrecioNoche");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Refaccion");
        modelo.addColumn("Estado");
   
        jTabla.setModel(modelo);

    }

//////
private void cargarTablaHabitacionD(int idTipoHabitacion) {
       HabitacionData hd = new HabitacionData();
       List<Habitacion> disponible = hd.listarHabitacionDisponibles(true, idTipoHabitacion);
       borrarFilas();
       for(Habitacion disponibles : disponible){
       
           modelo.addRow(new Object[]{
       
                    disponibles.getIdTipodehabitacion()
                   ,disponibles.getDescripcion()
                   ,disponibles.getIdHabitacion()
                   ,disponibles.getPrecioNoche()
       
       });
       }
//////        }
//////private void cargarTablaHabitacionND(boolean estado, int idTipoHabitacion) {
//////       HabitacionData hd = new HabitacionData();
//////       List<Habitacion> disponible = hd.listarHabitacionOcupadas(false, idTipoHabitacion);
//////       borrarFilas();
//////       for(Habitacion disponibles : disponible){
//////       
//////           modelo.addRow(new Object[]{
//////       
//////                    disponibles.getIdTipodehabitacion()
//////                   ,disponibles.getDescripcion()
//////                   ,disponibles.getIdHabitacion()
//////                   ,disponibles.getPrecioNoche()
//////       
//////       });
//////       }
//////        }
