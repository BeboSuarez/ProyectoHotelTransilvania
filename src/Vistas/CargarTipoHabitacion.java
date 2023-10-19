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
        jbEliminar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jcbTipoHab = new javax.swing.JComboBox<>();
        jcEstado = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setText("Tipo de habitacion");

        jLabel3.setText("Cantidad de personas");

        jLabel4.setText("Cantidad de camas");

        jLabel6.setText("Tipo de camas");

        jLabel7.setText("PrecioPorNoche");

        jtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecioActionPerformed(evt);
            }
        });

        jcbCantPersonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        jcbCantCamas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        jLabel2.setText("Cargar tipo Habitacion");

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Seleccionar");

        jLabel8.setText("Id");

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

        jLabel9.setText("Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(jbGuardar))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(jcbCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jcbCantCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(145, 145, 145))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(139, 139, 139)
                                                    .addComponent(jbModificar)
                                                    .addGap(36, 36, 36))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jtTipoHabitacion)
                                                        .addComponent(jcbTipoHab, 0, 122, Short.MAX_VALUE))
                                                    .addGap(24, 24, 24)))
                                            .addComponent(jbNuevo)
                                            .addGap(35, 35, 35)
                                            .addComponent(jButton2)
                                            .addGap(39, 39, 39)
                                            .addComponent(jbEliminar))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGap(212, 212, 212)
                                                            .addComponent(jLabel8))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGap(166, 166, 166)
                                                            .addComponent(jLabel6)))
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGap(11, 11, 11)
                                                            .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(jtTipoCama, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(166, 166, 166)
                                                    .addComponent(jLabel7)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jcEstado)
                                                        .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGap(9, 9, 9)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbTipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbCantCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jtTipoCama, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcEstado)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar)
                    .addComponent(jbNuevo)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPrecioActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        jcbTipoHab.setEnabled(false);
        try {

            String tipoDeHabitacion = jtTipoHabitacion.getText();
            int cantidadCamas = Integer.parseInt(jcbCantCamas.getSelectedItem().toString());
            int cantidadPersonas = Integer.parseInt(jcbCantPersonas.getSelectedItem().toString());
            String tipoCama = jtTipoCama.getText();
            double precioNoche = Double.parseDouble(jtPrecio.getText());

            if (thabi != null) {
                TipoDeHabitacion tHabitacion = new TipoDeHabitacion(tipoDeHabitacion, cantidadCamas, cantidadPersonas, tipoCama, precioNoche, isIcon);
                tipohabitacion.guardarTipoDeHabitacion(tHabitacion);
            } else {
                JOptionPane.showMessageDialog(null, "no se puede guardar");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showConfirmDialog(null, " " + e);
 } 
    
         
jbGuardar.setEnabled(false);
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jcbTipoHabPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbTipoHabPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoHabPopupMenuWillBecomeInvisible

    private void jcbTipoHabPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbTipoHabPopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoHabPopupMenuWillBecomeVisible

    private void jcbTipoHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoHabActionPerformed
        limpiar();
        TipoDeHabitacion tipoSeleccionado = (TipoDeHabitacion) jcbTipoHab.getSelectedItem();
        jtId.setText(tipoSeleccionado.getIdCama() + "");
        jtTipoHabitacion.setText(tipoSeleccionado.getTipoHabitacion());
        jcbCantCamas.setSelectedItem(tipoSeleccionado.getCantidadCamas());
        jcbCantPersonas.setSelectedItem(tipoSeleccionado.getCantidadPersonas());
        jtTipoCama.setText(tipoSeleccionado.getTipoCama());
        jtPrecio.setText(tipoSeleccionado.getPrecioNoche() + "");
        jcEstado.setSelected(tipoSeleccionado.isEstado());
        jbGuardar.setEnabled(false);
        jbModificar.setEnabled(true);

    }//GEN-LAST:event_jcbTipoHabActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed

        limpiar();
 jcbCantPersonas.setEnabled(true);
jbGuardar.setEnabled(true);
jbModificar.setEnabled(false);



    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
     jcbTipoHab.setEnabled(true);
 
    TipoDeHabitacion tipo= new TipoDeHabitacion();
     try {
int idCama=Integer.parseInt(jtId.getText());
            String tipoDeHabitacion = jtTipoHabitacion.getText();
            int cantidadCamas = Integer.parseInt(jcbCantCamas.getSelectedItem().toString());
            int cantidadPersonas = Integer.parseInt(jcbCantPersonas.getSelectedItem().toString());
            String tipoCama = jtTipoCama.getText();
            double precioNoche = Double.parseDouble(jtPrecio.getText());
            boolean estado=jcEstado.isSelected();

            if (tipo != null) {
              tipo.setIdCama(idCama);
              tipo.setTipoHabitacion(tipoDeHabitacion);
              tipo.setCantidadCamas(cantidadCamas);
              tipo.setCantidadPersonas(cantidadPersonas);
              tipo.setTipoCama(tipoCama);
              tipo.setPrecioNoche(precioNoche);
              tipo.setEstado(estado);
                tipohabitacion.modificarTipoDeHabitacion(tipo);
            } else {
                JOptionPane.showMessageDialog(null, "no se puede guardar");
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, " " + e);

        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
  
        TipoDeHabitacionData tipoHabiData =new TipoDeHabitacionData();

       
      
    tipoHabiData.eliminarTipoDeHabitacion(Integer.parseInt(jtId.getText()));
     if(thabi!=null){
      
        jtTipoHabitacion.setText(thabi.getTipoHabitacion());
        jcbCantCamas.setSelectedItem(thabi.getCantidadCamas());
        jcbCantPersonas.setSelectedItem(thabi.getCantidadPersonas());
        jtTipoCama.setText(thabi.getTipoCama());
        jtPrecio.setText(thabi.getPrecioNoche() + "");
        jcEstado.setSelected(isIcon);
           
       
     }  
   
        jbGuardar.setEnabled(false);
        jbModificar.setEnabled(true);
        
  
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jcEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcEstadoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void limpiar() {
       
        jtId.setText("");
        jtTipoHabitacion.setText("");
        jcbCantCamas.setSelectedItem("");
        jcbCantPersonas.setSelectedItem("");
        jtTipoCama.setText("");
        jtPrecio.setText("");
      
        jcEstado.setSelected(false);
        jbGuardar.setEnabled(true);
       
    }

    private void CargarComboBoxTipoDeHabitacion() {

//    th.listarTipoDeHabitacion().forEach(TipoDeHabitacion->jcbTipoHab.addItem(TipoDeHabitacion));
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbEliminar;
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
