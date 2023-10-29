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
    private TipoDeHabitacionData tdh;

    public InfoHabitaciones() {
        initComponents();
        ArmarCabecera();
        CargarComboHabitaciones();
         CargarComboBoxTipoDeHabitacion();
//        CargarComboboxHabitaciones();

//       cargarTablaHabitacionD(tipohabitacion.isEstado(),tipohabitacion.getIdTipodehabitacion());
//      cargarTablaHabitacionND(tipohabitacion.isEstado(),tipohabitacion.getIdTipodehabitacion());
//      
        modelo = (DefaultTableModel) jTabla.getModel();
        habitacionData = new HabitacionData();
        tipohabitacion = new TipoDeHabitacion();
        tdh=new TipoDeHabitacionData();
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
        jcbTipoHabitacion = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jcbTipoHab = new javax.swing.JComboBox<>();
        idHabitacion = new javax.swing.JLabel();
        jtIDhabitacion = new javax.swing.JTextField();
        jtDescripcion = new javax.swing.JTextField();
        jtPrecioNoche = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jrbHabitacionD = new javax.swing.JRadioButton();
        jrbHabitacionND = new javax.swing.JRadioButton();
        jtThabitacion = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jtCantidadPersonas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("Informacion de las Habitaciones");

        jbModificar.setText("MODIFICAR HABITACION");

        jbEliminar.setText("BAJA");

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

        jcbTipoHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoHabActionPerformed(evt);
            }
        });

        idHabitacion.setText("Tipo de Habitacion");

        jtIDhabitacion.setEditable(false);

        jtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDescripcionActionPerformed(evt);
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

        jLabel4.setText("Descripcion");

        jLabel5.setText("PrecioTotal");

        jLabel7.setText("idHabitacion");

        jLabel8.setText("IdTipoHabitacion");

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

        jtThabitacion.setEditable(false);

        jRadioButton1.setText("Estado");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("CantidadPersonas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idHabitacion)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton1)
                                            .addComponent(jtThabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(147, 147, 147))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtCantidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jcbTipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(104, 104, 104)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(1, 1, 1)))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtPrecioNoche, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtIDhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jtThabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jtIDhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtCantidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(82, 82, 82)
                        .addComponent(jbModificar)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtPrecioNoche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(jbEliminar)
                        .addGap(37, 37, 37))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDescripcionActionPerformed

    private void jtPrecioNocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecioNocheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPrecioNocheActionPerformed

    private void jcbTipoHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoHabActionPerformed
//        Habitacion habiseleccionada = (Habitacion) jcbHabitacion.getSelectedItem();
//
//        jtHabitacion.setText(habiseleccionada.getIdHabitacion() + "");

    }//GEN-LAST:event_jcbTipoHabActionPerformed

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked

         TipoDeHabitacion th = (TipoDeHabitacion) jcbTipoHabitacion.getSelectedItem();
        
        int filaSeleccionada = jTabla.getSelectedRow();
        jtIDhabitacion.setText(modelo.getValueAt(filaSeleccionada, 0).toString());
        jtThabitacion.setText(modelo.getValueAt(filaSeleccionada, 1).toString());
        jtPrecioNoche.setText(modelo.getValueAt(filaSeleccionada, 2).toString());
        jtCantidadPersonas.setText(modelo.getValueAt(filaSeleccionada, 3).toString());
        jtDescripcion.setText(modelo.getValueAt(filaSeleccionada, 4).toString());
      
      
        
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

    private void jtPrecioNocheKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioNocheKeyTyped
char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.')) {
            evt.consume();
        }            
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPrecioNocheKeyTyped

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel idHabitacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabla;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<TipoDeHabitacion> jcbTipoHab;
    private javax.swing.JComboBox<TipoDeHabitacion> jcbTipoHabitacion;
    private javax.swing.JRadioButton jrbHabitacionD;
    private javax.swing.JRadioButton jrbHabitacionND;
    private javax.swing.JTextField jtCantidadPersonas;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtIDhabitacion;
    private javax.swing.JTextField jtPrecioNoche;
    private javax.swing.JTextField jtThabitacion;
    // End of variables declaration//GEN-END:variables

    private void borrarFilas() {
        int filas = jTabla.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }


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
        modelo.addColumn("CantidadPersonas");
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
                disponibles.getCantidadpersonas(),
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
                disponibles.getCantidadpersonas(),
                disponibles.getDescripcion(),
                disponibles.isEstado()

            });
        }
    }
    
     private void CargarComboBoxTipoDeHabitacion() {

//    th.listarTipoDeHabitacion().forEach(TipoDeHabitacion->jcbTipoHab.addItem(TipoDeHabitacion));
        List<TipoDeHabitacion> t = tdh.listarTipoDeHabitacion();
        for (TipoDeHabitacion tipoDeHabitacion : t) {

            jcbTipoHab.addItem(tipoDeHabitacion);

        }
    }
}
