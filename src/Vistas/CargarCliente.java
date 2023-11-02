package Vistas;

import AccesoADatos.HuespedData;
import Entidades.Huesped;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class CargarCliente extends javax.swing.JInternalFrame {

    private HuespedData huespedDate = new HuespedData();
    private Huesped huesped = null;

    public CargarCliente() {
        initComponents();
        jtNombre.setTransferHandler(null);
        jtApellido.setTransferHandler(null);
        jtDni.setTransferHandler(null);
        jtCorreo.setTransferHandler(null);
        jtDomicilio.setTransferHandler(null);
        jtFechaN.setTransferHandler(null);
        jtTelefono.setTransferHandler(null);
        
        CargarComboBox();
        LimpiarCombo();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtDni = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtFechaN = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jtCorreo = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jrEstado = new javax.swing.JRadioButton();
        jtDomicilio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jcbCargarCliente = new javax.swing.JComboBox<>();
        jtId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jbLimpiar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();

        setResizable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(900, 650));
        setRequestFocusEnabled(false);

        jLabel2.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre: ");

        jLabel3.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teléfono: ");

        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNombreKeyPressed(evt);
            }
        });

        jtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDniActionPerformed(evt);
            }
        });
        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniKeyTyped(evt);
            }
        });

        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha de Nacimiento: ");

        jLabel1.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Correo:");

        jtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCorreoActionPerformed(evt);
            }
        });
        jtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCorreoKeyTyped(evt);
            }
        });

        jtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTelefonoKeyTyped(evt);
            }
        });

        jTextField7.setText("jTextField1");

        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Seleccione para modificar: ");

        jrEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEstadoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Domicilio:");

        jbModificar.setText("MODIFICAR");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setText("ELIMINAR");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jcbCargarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCargarClienteActionPerformed(evt);
            }
        });

        jtId.setEditable(false);
        jtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIdKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtIdKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Documento: ");

        jbLimpiar.setText("NUEVO");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CARGAR HUÉSPED");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtDomicilio)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel3))
                                    .addComponent(jtCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jrEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(56, 56, 56)
                                .addComponent(jcbCargarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jbModificar)
                                .addGap(70, 70, 70)
                                .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jbEliminar)
                                .addGap(48, 48, 48)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addGap(70, 70, 70)
                .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel4))
                            .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jtCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addComponent(jtFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jrEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCargarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEliminar)
                    .addComponent(jbLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSalir))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        try {

            String nombre = jtNombre.getText();

            String apellido = jtApellido.getText();

            String correo = jtCorreo.getText();
            String domicilio = jtDomicilio.getText();

            int dni = Integer.parseInt(jtDni.getText());

            if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || domicilio.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
                return;
            }

            LocalDate fecha = jtFechaN.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            int telefono = Integer.parseInt(jtTelefono.getText());

            boolean estado = jrEstado.isSelected();

            if (huesped == null) {
                Huesped cliente = new Huesped(nombre, apellido, dni, fecha, correo, telefono, domicilio, estado);
                huespedDate.cargarHuesped(cliente);
                jbGuardar.setEnabled(false);
                LimpiarCombo();

            } else {

                JOptionPane.showMessageDialog(null, "DNI DUPLICADO");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Hay un dato numérico erróneo, debe tener 9 dígitos");
            jtDni.setText("");

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No pueden quedar campos vacios");
        }


    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        jcbCargarCliente.setEnabled(true);
        Huesped huespedActual = new Huesped();
        try {

            String nombre = jtNombre.getText();

            String apellido = jtApellido.getText();

            int dni = Integer.parseInt(jtDni.getText());

            LocalDate fecha = jtFechaN.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            String correo = jtCorreo.getText();

            int telefono = Integer.parseInt(jtTelefono.getText());

            String domicilio = jtDomicilio.getText();

            boolean estado = jrEstado.isSelected();

            int idHuesped = Integer.parseInt(jtId.getText());

            if (huespedActual != null) {
                huespedActual.setIdHuesped(idHuesped);
                huespedActual.setNombre(nombre);
                huespedActual.setApellido(apellido);
                huespedActual.setDni(dni);
                huespedActual.setFechaNacimiento(fecha);
                huespedActual.setCorreo(correo);
                huespedActual.setTelefono(telefono);
                huespedActual.setDomicilio(domicilio);
                huespedActual.setEstado(estado);

                System.out.println(huespedActual);

                huespedDate.modificarHuesped(huespedActual);

                JOptionPane.showMessageDialog(null, "modificado");
            } else {
                JOptionPane.showMessageDialog(null, "no se puede modificar");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Hay un dato numérico erróneo, debe tener 9 dígitos");

        }


    }//GEN-LAST:event_jbModificarActionPerformed

    private void jcbCargarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCargarClienteActionPerformed

        Huesped huespedSeleccionado = (Huesped) jcbCargarCliente.getSelectedItem();

        jtId.setText(huespedSeleccionado.getIdHuesped() + "");
        jtNombre.setText(huespedSeleccionado.getNombre());
        jtApellido.setText(huespedSeleccionado.getApellido());
        jtDni.setText(huespedSeleccionado.getDni() + "");
        jtFechaN.setDate(Date.from(huespedSeleccionado.getFechaNacimiento().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        jtCorreo.setText(huespedSeleccionado.getCorreo() + "");
        jtTelefono.setText(huespedSeleccionado.getTelefono() + "");
        jtDomicilio.setText(huespedSeleccionado.getDomicilio() + "");
        jrEstado.setSelected(huespedSeleccionado.isEstado());

        jbGuardar.setEnabled(false);
        jbModificar.setEnabled(true);

    }//GEN-LAST:event_jcbCargarClienteActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        Huesped huespedActual = new Huesped();
        try {

            boolean estado = jrEstado.isSelected();

            System.out.println("antes del  if");
            if (huespedActual != null) {

                huespedActual.setEstado(false);

                JOptionPane.showMessageDialog(null, "eliminado");
                huespedDate.bajaHuesped(Integer.parseInt(jtDni.getText()));

            } else {
                JOptionPane.showMessageDialog(null, "no se puedeeliminar");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "no escribio un dni valido");
            jtDni.setText("");
            LimpiarCombo();
        }
        LimpiarCombo();


    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyPressed

    }//GEN-LAST:event_jtNombreKeyPressed

    private void jtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdKeyPressed

    }//GEN-LAST:event_jtIdKeyPressed

    private void jtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyTyped
        if (!Character.isLetter(evt.getKeyChar()) && evt.getKeyChar() != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdKeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jtIdKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        if (!Character.isLetter(evt.getKeyChar()) && evt.getKeyChar() != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCorreoActionPerformed

    }//GEN-LAST:event_jtCorreoActionPerformed

    private void jtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCorreoKeyTyped


    }//GEN-LAST:event_jtCorreoKeyTyped

    private void jtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelefonoKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_jtTelefonoKeyTyped

    private void jrEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEstadoActionPerformed

    }//GEN-LAST:event_jrEstadoActionPerformed

    private void jtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_jtDniKeyTyped

    private void jtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDniActionPerformed

    }//GEN-LAST:event_jtDniActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        LimpiarCombo();
        jcbCargarCliente.setEnabled(true);
        jbGuardar.setEnabled(true);
        jbModificar.setEnabled(false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed
    private void CargarComboBox() {
        HuespedData hues = new HuespedData();
        List<Huesped> h = hues.listarHuesped();
        for (Huesped huesped : h) {
            jcbCargarCliente.addItem(huesped);
            jbGuardar.setEnabled(true);
        }

    }

    private void LimpiarCombo() {
        jtId.setText("");
        jtNombre.setText("");
        jtApellido.setText("");
        jtDni.setText("");
        jtFechaN.setDate(null);
        jtCorreo.setText("");
        jtTelefono.setText("");
        jtDomicilio.setText("");
        jrEstado.setSelected(false);
        jbGuardar.setSelected(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Huesped> jcbCargarCliente;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCorreo;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtDomicilio;
    private com.toedter.calendar.JDateChooser jtFechaN;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables

}
