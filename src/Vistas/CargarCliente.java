/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.HuespedData;
import Entidades.Huesped;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author viper
 */
public class CargarCliente extends javax.swing.JInternalFrame {

    private HuespedData huespedDate = new HuespedData();
    private Huesped huesped = null;

    /**
     * Creates new form CargarCliente
     */
    public CargarCliente() {
        initComponents();
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
        jLabel8 = new javax.swing.JLabel();
        jrEstado = new javax.swing.JRadioButton();
        jtDomicilio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jbnuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jcbCargarCliente = new javax.swing.JComboBox<>();
        jtId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jbLimpiar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(847, 647));
        setPreferredSize(new java.awt.Dimension(1500, 5000));

        jLabel2.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel4.setText("ID");

        jLabel5.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel5.setText("Telefono");

        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
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

        jtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtApellidoActionPerformed(evt);
            }
        });
        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel7.setText("Fecha de Nacimiento");

        jLabel1.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel1.setText("Correo");

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

        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salvar.png"))); // NOI18N
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel6.setText("Cargar cliente");

        jLabel8.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel8.setText("Estado");

        jrEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEstadoActionPerformed(evt);
            }
        });

        jtDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDomicilioKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel9.setText("Domicilio");

        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ajustes.png"))); // NOI18N
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/agregar-archivo.png"))); // NOI18N
        jbnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnuevoActionPerformed(evt);
            }
        });

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton-eliminar.png"))); // NOI18N
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

        jtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIdKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtIdKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 18)); // NOI18N
        jLabel10.setText("Documento");

        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/limpiar.png"))); // NOI18N
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jLabel11.setText("Cargar Huesped");

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salida.png"))); // NOI18N
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jcbCargarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel2))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrEstado))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtCorreo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtDomicilio, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtFechaN, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(394, 394, 394)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(298, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbCargarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(jtFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jrEstado))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(359, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        try {

            String nombre = jtNombre.getText();
            System.out.println("1");
            String apellido = jtApellido.getText();

            System.out.println("2");
            int dni = Integer.parseInt(jtDni.getText());
            if (nombre.isEmpty() || apellido.isEmpty()) {
                JOptionPane.showMessageDialog(this, "no puede haber campos vacios");
                return;
            }

            System.out.println("3");
            LocalDate fecha = jtFechaN.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            System.out.println("4");
            String correo = jtCorreo.getText();

            System.out.println("5");
            int telefono = Integer.parseInt(jtTelefono.getText());

            System.out.println("6");
            String domicilio = jtDomicilio.getText();

            System.out.println("7");
            boolean estado = jrEstado.isSelected();

            System.out.println("8");

            if (huesped == null) {
                Huesped cliente = new Huesped(nombre, apellido, dni, fecha, correo, telefono, domicilio, estado);
                huespedDate.cargarHuesped(cliente);
            } else {
                JOptionPane.showMessageDialog(null, "DNI DUPLICADO");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "no escribio un dni valido");
            jtDni.setText("");

        }

        jbGuardar.setEnabled(false);
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtApellidoActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        jcbCargarCliente.setEnabled(true);
        Huesped huespedActual = new Huesped();
        try {

            String nombre = jtNombre.getText();
            System.out.println("1");
            String apellido = jtApellido.getText();

            System.out.println("2");
            int dni = Integer.parseInt(jtDni.getText());

            System.out.println("3");
            LocalDate fecha = jtFechaN.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            System.out.println("4");
            String correo = jtCorreo.getText();

            System.out.println("5");
            int telefono = Integer.parseInt(jtTelefono.getText());

            System.out.println("6");
            String domicilio = jtDomicilio.getText();

            System.out.println("7");
            boolean estado = jrEstado.isSelected();

            System.out.println("8");
            int idHuesped = Integer.parseInt(jtId.getText());
            System.out.println("9");
            System.out.println("antes del  if");
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
            JOptionPane.showMessageDialog(null, "no escribio un dni valido");
            jtDni.setText("");
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

    private void jbnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnuevoActionPerformed

        jcbCargarCliente.setEnabled(true);
        jbGuardar.setEnabled(true);
        jbModificar.setEnabled(false);

    }//GEN-LAST:event_jbnuevoActionPerformed

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
        if (!Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdKeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        if (!Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCorreoActionPerformed

    private void jtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCorreoKeyTyped


    }//GEN-LAST:event_jtCorreoKeyTyped

    private void jtDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDomicilioKeyTyped
        if (!Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jtDomicilioKeyTyped

    private void jtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelefonoKeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jtTelefonoKeyTyped

    private void jrEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrEstadoActionPerformed

    private void jtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jtDniKeyTyped

    private void jtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDniActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        LimpiarCombo();        // TODO add your handling code here:
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed
    private void CargarComboBox() {
        HuespedData hues = new HuespedData();
        List<Huesped> h = hues.listarHuesped();
        for (Huesped huesped : h) {
            jcbCargarCliente.addItem(huesped);

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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbnuevo;
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
