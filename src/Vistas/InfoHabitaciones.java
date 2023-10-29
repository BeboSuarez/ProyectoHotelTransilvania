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
        habitacionData = new HabitacionData();
        tipohabitacion = new TipoDeHabitacion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jcbTipoHabitacion = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jrbHabitacionD = new javax.swing.JRadioButton();
        jrbHabitacionND = new javax.swing.JRadioButton();

        jLabel1.setText("Informacion de las Habitaciones");

        jcbTipoHabitacion.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbTipoHabitacionPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jcbTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoHabitacionActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1)
                        .addGap(75, 75, 75)
                        .addComponent(jcbTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jrbHabitacionD)
                        .addGap(183, 183, 183)
                        .addComponent(jrbHabitacionND)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbHabitacionD)
                    .addComponent(jrbHabitacionND))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked

         TipoDeHabitacion th = (TipoDeHabitacion) jcbTipoHabitacion.getSelectedItem();
        
        int filaSeleccionada = jTabla.getSelectedRow();
        jtIDhabitacion.setText(modelo.getValueAt(filaSeleccionada, 0).toString());
        jtThabitacion.setText(modelo.getValueAt(filaSeleccionada, 1).toString());
        jtPrecioNoche.setText(modelo.getValueAt(filaSeleccionada, 2).toString());
        jtDescripcion.setText(modelo.getValueAt(filaSeleccionada, 3).toString());
      
      
        
    }//GEN-LAST:event_jTablaMouseClicked

    private void jrbHabitacionDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbHabitacionDActionPerformed
        TipoDeHabitacion tipohabi = (TipoDeHabitacion) jcbTipoHabitacion.getSelectedItem();

        borrarFilas();
        if (tipohabi != null) {
            if (jrbHabitacionD.isSelected()) {
                cargarTablaHabitacionD(tipohabi.getIdTipodehabitacion());
            }
        }
    }//GEN-LAST:event_jrbHabitacionDActionPerformed

    private void jrbHabitacionNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbHabitacionNDActionPerformed
        TipoDeHabitacion tipohabi = (TipoDeHabitacion) jcbTipoHabitacion.getSelectedItem();
        borrarFilas();
        cargarTablaHabitacionND(tipohabi.getIdTipodehabitacion());
    }//GEN-LAST:event_jrbHabitacionNDActionPerformed

    private void jcbTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoHabitacionActionPerformed
        TipoDeHabitacion tipohabi = (TipoDeHabitacion) jcbTipoHabitacion.getSelectedItem();
        borrarFilas();
        jtThabitacion.setText(tipohabi.getIdTipodehabitacion() + "");

    }//GEN-LAST:event_jcbTipoHabitacionActionPerformed

    private void jcbTipoHabitacionPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbTipoHabitacionPopupMenuWillBecomeInvisible
//        cargarTablaHabitacionD(habitacion.getIdTipodehabitacion());        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoHabitacionPopupMenuWillBecomeInvisible


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabla;
    private javax.swing.JComboBox<TipoDeHabitacion> jcbTipoHabitacion;
    private javax.swing.JRadioButton jrbHabitacionD;
    private javax.swing.JRadioButton jrbHabitacionND;
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
            jcbTipoHabitacion.addItem(tipohabitacion);

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
        modelo.addColumn("Estado");

        jTabla.setModel(modelo);

    }

//////
    private void cargarTablaHabitacionD(int idTipoHabitacion) {
        HabitacionData hd = new HabitacionData();
        List<Habitacion> disponible = hd.listarHabitacionDisponibles(idTipoHabitacion);
        borrarFilas();
        for (Habitacion disponibles : disponible) {

            modelo.addRow(new Object[]{
               disponibles.getIdHabitacion(),
                disponibles.getIdTipodehabitacion(),
                disponibles.getPrecioNoche(),
                disponibles.getDescripcion(),
                disponibles.isEstado()
 });
        }
    }

    private void cargarTablaHabitacionND(int idTipoHabitacion) {
        HabitacionData hd = new HabitacionData();
        List<Habitacion> disponible = hd.listarHabitacionOcupadas(idTipoHabitacion);
        borrarFilas();
        for (Habitacion disponibles : disponible) {

              modelo.addRow(new Object[]{
               disponibles.getIdHabitacion(),
                disponibles.getIdTipodehabitacion(),
                disponibles.getPrecioNoche(),
                disponibles.getDescripcion(),
                disponibles.isEstado()

            });
        }
    }
}
