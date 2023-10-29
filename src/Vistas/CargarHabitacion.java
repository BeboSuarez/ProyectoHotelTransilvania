package Vistas;

import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import AccesoADatos.TipoDeHabitacionData;
import Entidades.TipoDeHabitacion;
import Entidades.Habitacion;
import Entidades.Huesped;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CargarHabitacion extends javax.swing.JInternalFrame {

    private TipoDeHabitacionData th;
    private HabitacionData habidata;
    private HuespedData hd;
    private Huesped huespedActual;
    private Habitacion habi;

    public CargarHabitacion() {
        initComponents();

        th = new TipoDeHabitacionData();
        hd = new HuespedData();
        huespedActual = new Huesped();
        habi = new Habitacion();
        habidata = new HabitacionData();

        CargarComboBoxTipoDeHabitacion();

//        borrarFilas ();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbTipoHab = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtPrecioNoche = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtTipo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtIdCama = new javax.swing.JTextField();
        jEstado = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jtCantidadpersonas = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel1.setText("Tipo de Habitacion");

        jcbTipoHab.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jcbTipoHab.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jcbTipoHabPopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbTipoHabPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jcbTipoHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoHabActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 36)); // NOI18N
        jLabel4.setText("Cargar habitación");

        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salvar.png"))); // NOI18N
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ajustes.png"))); // NOI18N
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton-eliminar.png"))); // NOI18N
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/limpiar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salida.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel3.setText("ID TH");

        jtPrecioNoche.setEditable(false);
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

        jLabel11.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel11.setText("Descripcion");

        jtTipo.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel9.setText("Precio Noche");

        jtIdCama.setEditable(false);
        jtIdCama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdCamaActionPerformed(evt);
            }
        });

        jEstado.setEnabled(false);
        jEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEstadoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel10.setText("CantidadPersonas");

        jtCantidadpersonas.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbGuardar)
                        .addGap(28, 28, 28)
                        .addComponent(jbModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 315, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(264, 264, 264)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(21, 21, 21)
                                            .addComponent(jcbTipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel11)
                                                .addComponent(jLabel3))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jtIdCama, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(49, 49, 49)
                                    .addComponent(jLabel9))
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtPrecioNoche, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jtCantidadpersonas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel2)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jcbTipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtPrecioNoche, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jtCantidadpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jtIdCama, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbGuardar)
                            .addComponent(jbModificar)
                            .addComponent(jbEliminar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addContainerGap()))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbTipoHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoHabActionPerformed

        TipoDeHabitacion tipoSeleccionado = (TipoDeHabitacion) jcbTipoHab.getSelectedItem();
        jtIdCama.setText(tipoSeleccionado.getIdTipodehabitacion() + "");
        jtTipo.setText(tipoSeleccionado.getTipoCama());
        jtPrecioNoche.setText(tipoSeleccionado.getPrecioNoche() + "");
        jtCantidadpersonas.setText(tipoSeleccionado.getCantidadPersonas()+"");

//        // TODO add your handling code here:
//        
//       try {
//            TipoDeHabitacion tipohab=(TipoDeHabitacion)jcbTipoHab.getSelectedItem();
//
//          cargarTablaTipoHabitacion(tipohab.getIdCama());
//
//        } catch (IllegalArgumentException e) {
//            System.out.println(" ");
//        }

    }//GEN-LAST:event_jcbTipoHabActionPerformed

    private void jcbTipoHabPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbTipoHabPopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoHabPopupMenuWillBecomeVisible

    private void jcbTipoHabPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbTipoHabPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoHabPopupMenuWillBecomeInvisible

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        try {

            int idTipodehabitacion = Integer.parseInt(jtIdCama.getText());

            double precioNoche = Double.parseDouble(jtPrecioNoche.getText());
            int cantidadPersonas= Integer.parseInt(jtCantidadpersonas.getText());

            String descripcion = jtTipo.getText();

            boolean estado = jEstado.isSelected();

            if (habi != null) {

                Habitacion habitacion = new Habitacion(idTipodehabitacion, precioNoche,cantidadPersonas, descripcion, estado);

                habidata.guardarHabitacion(habitacion);
            } else {
                JOptionPane.showMessageDialog(null, "operación imposible");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "no puede haber campos vacios");

        }


    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtPrecioNocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecioNocheActionPerformed
        
    }//GEN-LAST:event_jtPrecioNocheActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        
        try {

            boolean estado = jEstado.isSelected();

            System.out.println("antes del  if");
            if (habi != null) {

                habi.setEstado(false);

                JOptionPane.showMessageDialog(null, "eliminado");
                habidata.eliminarHabitacion(estado);

            } else {
                JOptionPane.showMessageDialog(null, "no se puede eliminar");
            }
        } catch (NumberFormatException e) {
            
            
            Limpiar();
        }
        
        
        
        
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtIdCamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdCamaActionPerformed
        
    }//GEN-LAST:event_jtIdCamaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

    }//GEN-LAST:event_jbModificarActionPerformed

    private void jEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEstadoActionPerformed

    private void jtPrecioNocheKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioNocheKeyTyped
char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.')) {
            evt.consume();
        }            
       
    }//GEN-LAST:event_jtPrecioNocheKeyTyped

    private void CargarComboBoxTipoDeHabitacion() {

//    th.listarTipoDeHabitacion().forEach(TipoDeHabitacion->jcbTipoHab.addItem(TipoDeHabitacion));
        List<TipoDeHabitacion> t = th.listarTipoDeHabitacion();
        for (TipoDeHabitacion tipoDeHabitacion : t) {

            jcbTipoHab.addItem(tipoDeHabitacion);

        }
    }

    private void Limpiar() {
        jtPrecioNoche.setText("");
        jtTipo.setText("");
        jtPrecioNoche.setText(""); 
        jtCantidadpersonas.setText("");
        jEstado.setSelected(false);
        jbGuardar.setEnabled(true);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JRadioButton jEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<TipoDeHabitacion> jcbTipoHab;
    private javax.swing.JTextField jtCantidadpersonas;
    private javax.swing.JTextField jtIdCama;
    private javax.swing.JTextField jtPrecioNoche;
    private javax.swing.JTextField jtTipo;
    // End of variables declaration//GEN-END:variables
}
