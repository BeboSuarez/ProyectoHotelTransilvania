package Vistas;

import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import AccesoADatos.TipoDeHabitacionData;
import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.TipoDeHabitacion;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InfoHabitaciones extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private Habitacion habitacion = null;
    private HabitacionData habitacionData;
    private TipoDeHabitacion tipohabitacion;
    private TipoDeHabitacionData th;
    private HabitacionData habidata;
    private HuespedData hd;
    private Huesped huespedActual;
    private Habitacion habi;

    public InfoHabitaciones() {
        initComponents();
        ArmarCabecera();
        CargarComboHabitaciones();

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
        jtThabitacion = new javax.swing.JTextField();
        jbSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Información de las Habitaciones: ");

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

        jTabla.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 12)); // NOI18N
        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(jTabla);

        buttonGroup1.add(jrbHabitacionD);
        jrbHabitacionD.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 13)); // NOI18N
        jrbHabitacionD.setText("HABITACION DISPONIBLE");
        jrbHabitacionD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbHabitacionDActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbHabitacionND);
        jrbHabitacionND.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 13)); // NOI18N
        jrbHabitacionND.setText("HABITACIONN NO DISPONIBLE");
        jrbHabitacionND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbHabitacionNDActionPerformed(evt);
            }
        });

        jtThabitacion.setEditable(false);
        jtThabitacion.setBackground(new java.awt.Color(255, 255, 255));
        jtThabitacion.setForeground(new java.awt.Color(153, 153, 153));

        jbSalir.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 13)); // NOI18N
        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbSalir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(jrbHabitacionD)
                            .addGap(92, 92, 92)
                            .addComponent(jrbHabitacionND))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jcbTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(jtThabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtThabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbHabitacionD)
                    .addComponent(jrbHabitacionND))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbSalir))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    }//GEN-LAST:event_jcbTipoHabitacionPopupMenuWillBecomeInvisible

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabla;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<TipoDeHabitacion> jcbTipoHabitacion;
    private javax.swing.JRadioButton jrbHabitacionD;
    private javax.swing.JRadioButton jrbHabitacionND;
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

    private void ArmarCabecera() {

        modelo.addColumn("ID Habitacion");
        modelo.addColumn("ID TipoHabitacion");
        modelo.addColumn("PrecioNoche");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Estado");

        jTabla.setModel(modelo);

    }

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
