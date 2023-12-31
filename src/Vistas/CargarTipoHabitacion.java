/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.HuespedData;
import AccesoADatos.TipoDeHabitacionData;
import Entidades.Huesped;
import Entidades.TipoDeHabitacion;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.metal.MetalBorders;

/**
 *
 * @author viper
 */
public class CargarTipoHabitacion extends javax.swing.JInternalFrame {

    private TipoDeHabitacion thabi;
    private TipoDeHabitacionData th;
    private TipoDeHabitacionData tipohabitacion;

    public CargarTipoHabitacion() {
        initComponents();
        
        jtTipoHabitacion.setTransferHandler(null);
        jtTipoCama.setTransferHandler(null);
        jtPrecio.setTransferHandler(null);
        jtId.setTransferHandler(null);

        th = new TipoDeHabitacionData();
        thabi = new TipoDeHabitacion();

        tipohabitacion = new TipoDeHabitacionData();

        CargarComboBoxTipoDeHabitacion();
        limpiar();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtTipoHabitacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        jcbCantPersonas = new javax.swing.JComboBox<>();
        jcbCantCamas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jtTipoCama = new javax.swing.JTextField();
        jbModificar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jcbTipoHab = new javax.swing.JComboBox<>();
        jcEstado = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Descripción: ");

        jLabel3.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad de Personas: ");

        jLabel4.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad de Camas: ");

        jLabel6.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo de Cama: ");

        jLabel7.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio por Noche: ");

        jtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecioActionPerformed(evt);
            }
        });
        jtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioKeyTyped(evt);
            }
        });

        jcbCantPersonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        jcbCantCamas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));

        jLabel2.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CARGAR TIPO HABITACIÓN");

        jbModificar.setText("MODIFICAR");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbNuevo.setText("NUEVO");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Seleccionar: ");

        jLabel8.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID: ");

        jtId.setEditable(false);

        jcbTipoHab.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jcbTipoHab.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbTipoHabPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jcbTipoHabPopupMenuWillBecomeVisible(evt);
            }
        });
        jcbTipoHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoHabActionPerformed(evt);
            }
        });

        jcEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbGuardar)
                                .addGap(41, 41, 41)
                                .addComponent(jbModificar)
                                .addGap(43, 43, 43)
                                .addComponent(jbNuevo)))
                        .addGap(53, 53, 53))
                    .addComponent(jLabel1))
                .addGap(249, 249, 249)
                .addComponent(jButton2)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jcbTipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtTipoHabitacion, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jcbCantPersonas, javax.swing.GroupLayout.Alignment.TRAILING, 0, 195, Short.MAX_VALUE)
                                .addComponent(jcbCantCamas, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcEstado)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(jtTipoCama)
                    .addComponent(jtId))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtTipoCama, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbCantCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jcbTipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(183, 183, 183)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbModificar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbNuevo)
                        .addComponent(jButton2)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPrecioActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        try {

            String descripcion = jtTipoHabitacion.getText();
            int cantidadCamas = Integer.parseInt(jcbCantCamas.getSelectedItem().toString());
            int cantidadPersonas = Integer.parseInt(jcbCantPersonas.getSelectedItem().toString());
            String tipoCama = jtTipoCama.getText();
            double precioNoche = Double.parseDouble(jtPrecio.getText());

            if (descripcion.isEmpty() || tipoCama.isEmpty()) {
                JOptionPane.showMessageDialog(this, "no puede haber campos vacios");

                return;
            }
            if (thabi != null) {
                TipoDeHabitacion tHabitacion = new TipoDeHabitacion(descripcion, cantidadCamas, cantidadPersonas, tipoCama, precioNoche, isIcon);
                tipohabitacion.guardarTipoDeHabitacion(tHabitacion);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "no se puede guardar");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacíos ");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Es necesario que ingresen un Tipo de Habitacion.");
        }
//        jbGuardar.setEnabled(false);
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jcbTipoHabPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbTipoHabPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoHabPopupMenuWillBecomeInvisible

    private void jcbTipoHabPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbTipoHabPopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoHabPopupMenuWillBecomeVisible

    private void jcbTipoHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoHabActionPerformed

        TipoDeHabitacion tipoSeleccionado = (TipoDeHabitacion) jcbTipoHab.getSelectedItem();
        jtId.setText(tipoSeleccionado.getIdTipodehabitacion() + "");
        jtTipoHabitacion.setText(tipoSeleccionado.getDescripcion());
        jcbCantCamas.setSelectedItem(tipoSeleccionado.getCantidadCamas() + "");
        jcbCantPersonas.setSelectedItem(tipoSeleccionado.getCantidadPersonas() + "");
        jtTipoCama.setText(tipoSeleccionado.getTipoCama());
        jtPrecio.setText(tipoSeleccionado.getPrecioNoche() + "");
        jcEstado.setSelected(tipoSeleccionado.isEstado());
        jbGuardar.setEnabled(false);
        jbModificar.setEnabled(true);

    }//GEN-LAST:event_jcbTipoHabActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        jcbTipoHab.setEnabled(true);

        TipoDeHabitacion tipo = new TipoDeHabitacion();
        try {
            int idTipodehabitacion = Integer.parseInt(jtId.getText());
            String descripcion = jtTipoHabitacion.getText();
            int cantidadCamas = Integer.parseInt(jcbCantCamas.getSelectedItem().toString());
            int cantidadPersonas = Integer.parseInt(jcbCantPersonas.getSelectedItem().toString());
            String tipoCama = jtTipoCama.getText();
            double precioNoche = Double.parseDouble(jtPrecio.getText());
            boolean estado = jcEstado.isSelected();

            if (descripcion.isEmpty() || tipoCama.isEmpty()) {
                JOptionPane.showMessageDialog(this, "no puede haber campos vacios");
                return;
            }
            if (tipo != null) {
                tipo.setIdTipodehabitacion(idTipodehabitacion);
                tipo.setDescripcion(descripcion);
                tipo.setCantidadCamas(cantidadCamas);
                tipo.setCantidadPersonas(cantidadPersonas);
                tipo.setTipoCama(tipoCama);
                tipo.setPrecioNoche(precioNoche);
                tipo.setEstado(estado);
                tipohabitacion.modificarTipoDeHabitacion(tipo);
            } else {
                JOptionPane.showMessageDialog(null, "no se puede guardar");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No puede haber campos vacíos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Es necesario que ingresen un Tipo de Habitacion.");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jcEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcEstadoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.')) {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPrecioKeyTyped

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed

        limpiar();
        jcbCantPersonas.setEnabled(true);
        jbGuardar.setEnabled(true);
        jbModificar.setEnabled(false);

    }//GEN-LAST:event_jbNuevoActionPerformed
    private void limpiar() {

        jtId.setText("");
        jtTipoHabitacion.setText("");
        jcbCantCamas.setSelectedItem("");
        jcbCantPersonas.setSelectedItem("");
        jtTipoCama.setText("");
        jtPrecio.setText("");
        jcbTipoHab.setSelectedItem("");
        jcEstado.setSelected(false);
        jbGuardar.setEnabled(true);

    }

    private void CargarComboBoxTipoDeHabitacion() {

        List<TipoDeHabitacion> t = th.listarTipoDeHabitacion();
        System.out.println("1");
        for (TipoDeHabitacion tipoDeHabitacion : t) {

            jcbTipoHab.addItem(tipoDeHabitacion);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JCheckBox jcEstado;
    private javax.swing.JComboBox<String> jcbCantCamas;
    private javax.swing.JComboBox<String> jcbCantPersonas;
    private javax.swing.JComboBox<TipoDeHabitacion> jcbTipoHab;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtTipoCama;
    private javax.swing.JTextField jtTipoHabitacion;
    // End of variables declaration//GEN-END:variables
}
