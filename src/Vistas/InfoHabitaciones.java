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
        CargarComboBoxTipoDeHabitacion();

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
        jbEliminar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jtCantidadpersonas = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtPrecioNoche = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtTipo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtIdCama = new javax.swing.JTextField();
        jbModificar = new javax.swing.JButton();
        jEstado = new javax.swing.JRadioButton();
        jcbTipoHabi = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jtidh = new javax.swing.JTextField();

        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
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

        jbEliminar.setText("ELIMINAR");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CantidadPersonas");

        jButton1.setText("LIMPIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtCantidadpersonas.setEditable(false);

        jButton2.setText("ELIMINAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID TH");

        jLabel2.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo de Habitacion");

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

        jLabel11.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Descripcion");

        jtTipo.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cargar habitación");

        jLabel9.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Precio Noche");

        jtIdCama.setEditable(false);
        jtIdCama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdCamaActionPerformed(evt);
            }
        });

        jbModificar.setText("MODICAR");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jEstado.setText("jRadioButton1");
        jEstado.setEnabled(false);
        jEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEstadoActionPerformed(evt);
            }
        });

        jcbTipoHabi.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbTipoHabiPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jcbTipoHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoHabiActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("IDHabitacion");

        jtidh.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel3))
                                        .addGap(71, 71, 71)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtIdCama, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jcbTipoHabi, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7))
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jLabel4)
                                .addGap(25, 25, 25)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtPrecioNoche, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtCantidadpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtidh, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jbModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jbSalir))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(590, 590, 590)
                .addComponent(jEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
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
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(jcbTipoHabi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPrecioNoche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCantidadpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtIdCama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jtidh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbModificar)
                        .addComponent(jbEliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)))
                .addGap(11, 11, 11)
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
        Limpiar();
        TipoDeHabitacion tipohabi = (TipoDeHabitacion) jcbTipoHabitacion.getSelectedItem();
        borrarFilas();
        jtThabitacion.setText(tipohabi.getIdTipodehabitacion() + "");

    }//GEN-LAST:event_jcbTipoHabitacionActionPerformed

    private void jcbTipoHabitacionPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbTipoHabitacionPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_jcbTipoHabitacionPopupMenuWillBecomeInvisible

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtPrecioNocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecioNocheActionPerformed

    }//GEN-LAST:event_jtPrecioNocheActionPerformed

    private void jtPrecioNocheKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioNocheKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_jtPrecioNocheKeyTyped

    private void jtIdCamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdCamaActionPerformed

    }//GEN-LAST:event_jtIdCamaActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        try {
            int idHabitacion = Integer.parseInt(jtidh.getText());
            System.out.println(idHabitacion);
            int idTipodehabitacion = Integer.parseInt(jtIdCama.getText());
            System.out.println(idTipodehabitacion);
            double precioNoche = Double.parseDouble(jtPrecioNoche.getText());
            System.out.println(precioNoche);
            int cantidadPersonas = Integer.parseInt(jtCantidadpersonas.getText());
            System.out.println(cantidadPersonas);
            String descripcion = jtTipo.getText();
            System.out.println(descripcion);
            boolean estado = jEstado.isSelected();
            System.out.println(estado);

            Habitacion habitacion = new Habitacion(idHabitacion, idTipodehabitacion, precioNoche, cantidadPersonas, descripcion, estado);
            habidata.modificarHabitacion(habitacion);
            if (habitacion != null) {

                JOptionPane.showMessageDialog(null, "habitacion MODIFICADA");

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "campos vacios" + e.getMessage());

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "no puede haber campos "+e.getMessage());

        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEstadoActionPerformed

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked
        Habitacion habitacion = new Habitacion();
        int filaSeleccionada = jTabla.getSelectedRow();
        jtidh.setText(modelo.getValueAt(filaSeleccionada, 0).toString());
        jtIdCama.setText(modelo.getValueAt(filaSeleccionada, 1).toString());
        jtPrecioNoche.setText(modelo.getValueAt(filaSeleccionada, 2).toString());
        jtCantidadpersonas.setText(modelo.getValueAt(filaSeleccionada, 3).toString());
        jtTipo.setText(modelo.getValueAt(filaSeleccionada, 4).toString());

        jEstado.setSelected(false);


    }//GEN-LAST:event_jTablaMouseClicked

    private void jcbTipoHabiPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbTipoHabiPopupMenuWillBecomeInvisible
    }//GEN-LAST:event_jcbTipoHabiPopupMenuWillBecomeInvisible

    private void jcbTipoHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoHabiActionPerformed
        Limpiar();
        TipoDeHabitacion tipohabi = (TipoDeHabitacion) jcbTipoHabi.getSelectedItem();

        jtIdCama.setText(tipohabi.getIdTipodehabitacion() + "");
        jtCantidadpersonas.setText(tipohabi.getCantidadPersonas() + "");
        jtPrecioNoche.setText(tipohabi.getPrecioNoche() + "");
        jtTipo.setText(tipohabi.getDescripcion());

    }//GEN-LAST:event_jcbTipoHabiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JRadioButton jEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabla;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<TipoDeHabitacion> jcbTipoHabi;
    private javax.swing.JComboBox<TipoDeHabitacion> jcbTipoHabitacion;
    private javax.swing.JRadioButton jrbHabitacionD;
    private javax.swing.JRadioButton jrbHabitacionND;
    private javax.swing.JTextField jtCantidadpersonas;
    private javax.swing.JTextField jtIdCama;
    private javax.swing.JTextField jtPrecioNoche;
    private javax.swing.JTextField jtThabitacion;
    private javax.swing.JTextField jtTipo;
    private javax.swing.JTextField jtidh;
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

    private void Limpiar() {
        jtTipo.setText("");
        jtIdCama.setText("");
        jtPrecioNoche.setText("");
        jtTipo.setText("");
        jtPrecioNoche.setText("");
        jtCantidadpersonas.setText("");
        jEstado.setSelected(false);

    }

    private void CargarComboBoxTipoDeHabitacion() {
        TipoDeHabitacionData Habi = new TipoDeHabitacionData();

        List<TipoDeHabitacion> ha = Habi.listarTipoDeHabitacion();
        for (TipoDeHabitacion tipohabitacion : ha) {
            jcbTipoHabi.addItem(tipohabitacion);

//    th.listarTipoDeHabitacion().forEach(TipoDeHabitacion->jcbTipoHab.addItem(TipoDeHabitacion));
//        List<TipoDeHabitacion> t = th.listarTipoDeHabitacion();
//        for (TipoDeHabitacion tipoDeHabitacion : t) {
//
//            jcbTipoHab.addItem(tipoDeHabitacion);
        }
    }
}
