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
        jButton2 = new javax.swing.JButton();
        jEstado = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Información de habitaciones:");

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
        jTabla.setForeground(new java.awt.Color(51, 51, 51));
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
                {null, null, null, null, null},
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
        jTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTabla);

        jrbHabitacionD.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jrbHabitacionD);
        jrbHabitacionD.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jrbHabitacionD.setForeground(new java.awt.Color(255, 255, 255));
        jrbHabitacionD.setText("Habitación Disponible");
        jrbHabitacionD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbHabitacionDActionPerformed(evt);
            }
        });

        jrbHabitacionND.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jrbHabitacionND);
        jrbHabitacionND.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jrbHabitacionND.setForeground(new java.awt.Color(255, 255, 255));
        jrbHabitacionND.setText("Habitación No Disponible");
        jrbHabitacionND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbHabitacionNDActionPerformed(evt);
            }
        });

        jtThabitacion.setEditable(false);
        jtThabitacion.setBackground(new java.awt.Color(255, 255, 255));
        jtThabitacion.setForeground(new java.awt.Color(153, 153, 153));

        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jEstado.setText("jRadioButton1");
        jEstado.setEnabled(false);
        jEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jcbTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jtThabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(590, 590, 590)
                        .addComponent(jEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jrbHabitacionD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrbHabitacionND)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtThabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbHabitacionD)
                    .addComponent(jrbHabitacionND))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap())
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

    private void jEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEstadoActionPerformed

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked


    }//GEN-LAST:event_jTablaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton2;
    private javax.swing.JRadioButton jEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabla;
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
        modelo.addColumn("CantidadPersonas");
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

}
