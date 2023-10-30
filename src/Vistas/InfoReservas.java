package Vistas;

import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.Reserva;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InfoReservas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private Reserva reservaNueva = null;
    private ReservaData reservaData;
    private Reserva reservaActual = null;
    HabitacionData Habi = new HabitacionData();
    Habitacion Hab = new Habitacion();

    public InfoReservas() {
        initComponents();
        ArmarCabecera();
        CargarComboHabitaciones();
        CargarComboBox();
        CargarComboHuesped();
        modelo = (DefaultTableModel) jtPrecioTotal.getModel();
        reservaData = new ReservaData();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jcbCargarCliente = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtPrecioTotal = new javax.swing.JTable();
        jbConsultar = new javax.swing.JButton();
        jdFechaIngreso = new com.toedter.calendar.JDateChooser();
        jdFechaSalida = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcbHabitacion = new javax.swing.JComboBox<>();
        jidReserva = new javax.swing.JTextField();
        jtCpersonas = new javax.swing.JTextField();
        jtPrecioNoche = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtidHabitacion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCheckEstado = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jComboHuesped = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jtIDhuesped = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Calcular = new javax.swing.JButton();
        jPrecioTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(141, 80, 42));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Informacion de las reservas  por Nombre");

        jbModificar.setBackground(new java.awt.Color(102, 102, 102));
        jbModificar.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 13)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(51, 51, 51));
        jbModificar.setText("MODIFICAR RESERVA");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(51, 51, 51));
        jbEliminar.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 13)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbEliminar.setText("BAJA");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jcbCargarCliente.setForeground(new java.awt.Color(51, 51, 51));
        jcbCargarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCargarClienteActionPerformed(evt);
            }
        });

        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        jtPrecioTotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtPrecioTotal.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jtPrecioTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPrecioTotalMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtPrecioTotal);

        jbConsultar.setBackground(new java.awt.Color(0, 0, 0));
        jbConsultar.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 13)); // NOI18N
        jbConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jbConsultar.setText("consultar");
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });

        jdFechaIngreso.setForeground(new java.awt.Color(51, 51, 51));

        jdFechaSalida.setForeground(new java.awt.Color(51, 51, 51));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha Ingreso");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha Salida");

        jcbHabitacion.setForeground(new java.awt.Color(51, 51, 51));
        jcbHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHabitacionActionPerformed(evt);
            }
        });

        jidReserva.setForeground(new java.awt.Color(0, 0, 51));
        jidReserva.setEnabled(false);

        jtCpersonas.setForeground(new java.awt.Color(0, 0, 51));
        jtCpersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCpersonasActionPerformed(evt);
            }
        });

        jtPrecioNoche.setForeground(new java.awt.Color(0, 0, 51));
        jtPrecioNoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecioNocheActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Personas");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PrecioNoche");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estado");

        jtidHabitacion.setForeground(new java.awt.Color(0, 0, 51));
        jtidHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtidHabitacionActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Habitacion");

        jCheckEstado.setForeground(new java.awt.Color(255, 255, 255));
        jCheckEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckEstadoActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID-Reserva");

        jComboHuesped.setForeground(new java.awt.Color(51, 51, 51));
        jComboHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboHuespedActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Huesped");

        jtIDhuesped.setForeground(new java.awt.Color(0, 0, 51));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        jPrecioTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrecioTotalActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Precio total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtIDhuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtidHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jcbHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jdFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(139, 139, 139)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtPrecioNoche, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(jtCpersonas, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckEstado)
                                    .addComponent(jPrecioTotal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Calcular))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbModificar)
                                .addGap(54, 54, 54)
                                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jidReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jcbCargarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbConsultar))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 16, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbCargarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultar))
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jidReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel7)
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtIDhuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jCheckEstado)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtidHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtCpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jdFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdFechaSalida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtPrecioNoche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Calcular))))
                .addGap(368, 368, 368)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbCargarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCargarClienteActionPerformed
        
        borrarFilas();
    }//GEN-LAST:event_jcbCargarClienteActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        
        Huesped hue = (Huesped) jcbCargarCliente.getSelectedItem();

        if (hue != null) {

            cargarTabla(hue.getIdHuesped());
        }
    }//GEN-LAST:event_jbConsultarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        try {

            int idReserva = Integer.parseInt(jidReserva.getText() + "");
            int idHabitacion = Integer.parseInt(jtidHabitacion.getText() + "");
            int idHuesped = Integer.parseInt(jtIDhuesped.getText() + "");
            LocalDate fechaIngreso = jdFechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaSalida = jdFechaSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int cantidadPersonas = Integer.parseInt(jtCpersonas.getText() + "");
            double precioTotal = Double.parseDouble(jtPrecioNoche.getText() + "");
            boolean estado = jCheckEstado.isSelected();
            Reserva r = new Reserva(idReserva, idHabitacion, idHuesped, fechaIngreso, fechaSalida, cantidadPersonas, precioTotal, estado);
            reservaData.modificarReserva(r);
            if (r != null) {

                JOptionPane.showMessageDialog(null, "RESERVA MODIFICADA");

            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "NO SE PUEDE MODIFICAR LA RESERVA");
        }

    }//GEN-LAST:event_jbModificarActionPerformed

    private void jtCpersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCpersonasActionPerformed

    }//GEN-LAST:event_jtCpersonasActionPerformed

    private void jtPrecioNocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecioNocheActionPerformed

    }//GEN-LAST:event_jtPrecioNocheActionPerformed

    private void jcbHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHabitacionActionPerformed
        Habitacion habiseleccionada = (Habitacion) jcbHabitacion.getSelectedItem();

        jtidHabitacion.setText(habiseleccionada.getIdHabitacion() + "");

        jtPrecioNoche.setText(habiseleccionada.getPrecioNoche() + "");

    }//GEN-LAST:event_jcbHabitacionActionPerformed

    private void jtPrecioTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPrecioTotalMouseClicked
        ReservaData resDa = new ReservaData();
        Huesped huesped = new Huesped();
        Habitacion habitacion = new Habitacion();

        int filaSeleccionada = jtPrecioTotal.getSelectedRow();
        jidReserva.setText(modelo.getValueAt(filaSeleccionada, 0).toString());
        jtidHabitacion.setText(modelo.getValueAt(filaSeleccionada, 1).toString());
        jtIDhuesped.setText(modelo.getValueAt(filaSeleccionada, 2).toString());
        LocalDate fechaIngreso = (LocalDate) modelo.getValueAt(filaSeleccionada, 3);
        jdFechaIngreso.setDate(java.sql.Date.valueOf(fechaIngreso));
        LocalDate fechaSalida = (LocalDate) modelo.getValueAt(filaSeleccionada, 4);
        jdFechaSalida.setDate(java.sql.Date.valueOf(fechaSalida));
        jtCpersonas.setText(modelo.getValueAt(filaSeleccionada, 5).toString());
        jPrecioTotal.setText(modelo.getValueAt(filaSeleccionada, 6).toString());
        jCheckEstado.setSelected(true);
        jtPrecioNoche.setText(title);


    }//GEN-LAST:event_jtPrecioTotalMouseClicked

    private void jtidHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtidHabitacionActionPerformed

    }//GEN-LAST:event_jtidHabitacionActionPerformed

    private void jCheckEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckEstadoActionPerformed

    }//GEN-LAST:event_jCheckEstadoActionPerformed

    private void jComboHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboHuespedActionPerformed
        Huesped huespedseleccionado = (Huesped) jComboHuesped.getSelectedItem();

        jtIDhuesped.setText(huespedseleccionado.getIdHuesped() + "");
    }//GEN-LAST:event_jComboHuespedActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        int filaSeleccionada = jtPrecioTotal.getSelectedRow();
        if (filaSeleccionada != -1) {

            int idHuesped = (int) modelo.getValueAt(filaSeleccionada, 2);
            int idReserva = (int) modelo.getValueAt(filaSeleccionada, 0);
            reservaData.BajaReserva(idHuesped, idReserva);
            borrarFilas();

        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
   

        if (jtPrecioTotal != null) {

            jPrecioTotal.setText("");
        }

        try {
          
            int idHabitacion = Integer.parseInt(jtidHabitacion.getText());
           
            int idHuesped = Integer.parseInt(jtIDhuesped.getText());
            LocalDate fechaIngreso = jdFechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaSalida = jdFechaSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            double precioTotal = Double.parseDouble(jtPrecioNoche.getText());
          
            int cantidadPersonas = Integer.parseInt(jtCpersonas.getText());
            boolean estado = jCheckEstado.isSelected();

            if (reservaActual == null) {
                Reserva res = new Reserva(idHabitacion, idHuesped, fechaIngreso, fechaSalida, cantidadPersonas, precioTotal, estado);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros");

        }
        LocalDate fecha1 = jdFechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fecha2 = jdFechaSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("fech1: " + fecha1);
        System.out.println("fech2: " + fecha2);

        int anioACT = fecha2.getYear();
        int mesACT = fecha2.getMonthValue();
        int diaACT = fecha2.getDayOfMonth();

        int resAnio = 0;

        int resDia = fecha2.getDayOfMonth() - fecha1.getDayOfMonth();
        int resMes = fecha2.getMonthValue() - fecha1.getMonthValue();

        if (fecha2.getYear() > fecha1.getYear()) {
            if (fecha2.getMonthValue() == fecha1.getMonthValue()) {

                if (fecha2.getDayOfMonth() == fecha1.getDayOfMonth()) {
                    resAnio = fecha2.getYear() - fecha1.getYear();
                }
            } else {
                resAnio = fecha2.getYear() - fecha1.getYear() - 1;
            }
        }

        System.out.println("dias: " + resDia);
        double Precio = Double.parseDouble(jtPrecioNoche.getText());

        double PrecioTotal = Precio * resDia;
        System.out.println(PrecioTotal);
        jPrecioTotal.setText((PrecioTotal) + "");


    }//GEN-LAST:event_CalcularActionPerformed

    private void jPrecioTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrecioTotalActionPerformed

    }//GEN-LAST:event_jPrecioTotalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jCheckEstado;
    private javax.swing.JComboBox<Huesped> jComboHuesped;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jPrecioTotal;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<Huesped> jcbCargarCliente;
    private javax.swing.JComboBox<Habitacion> jcbHabitacion;
    private com.toedter.calendar.JDateChooser jdFechaIngreso;
    private com.toedter.calendar.JDateChooser jdFechaSalida;
    private javax.swing.JTextField jidReserva;
    private javax.swing.JTextField jtCpersonas;
    private javax.swing.JTextField jtIDhuesped;
    private javax.swing.JTextField jtPrecioNoche;
    private javax.swing.JTable jtPrecioTotal;
    private javax.swing.JTextField jtidHabitacion;
    // End of variables declaration//GEN-END:variables

    private void borrarFilas() {
        int filas = jtPrecioTotal.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void CargarComboBox() {
        HuespedData hues = new HuespedData();
        List<Huesped> h = hues.listarHuesped();
        for (Huesped huesped : h) {
            jcbCargarCliente.addItem(huesped);

        }
    }

    private void CargarComboHuesped() {
        HuespedData hues = new HuespedData();
        List<Huesped> h = hues.listarHuesped();
        for (Huesped huesped : h) {
            jComboHuesped.addItem(huesped);
        }
    }

    private void CargarComboHabitaciones() {

        List<Habitacion> ha = Habi.listarHabitacionDispo();
        for (Habitacion habitacion : ha) {
            jcbHabitacion.addItem(habitacion);

        }
    }

    private void ArmarCabecera() {
        modelo.addColumn("ID Reserva");
        modelo.addColumn("ID Habitacion");
        modelo.addColumn("ID Huesped");
        modelo.addColumn("Fecha Ingreso");
        modelo.addColumn("Fecha Salida");
        modelo.addColumn("cantidadPersonas");
        modelo.addColumn("Precio Total");
        modelo.addColumn("Estado");
        jtPrecioTotal.setModel(modelo);

    }

    private void cargarTabla(int idHuesped) {

        ReservaData resDa = new ReservaData();

        List<Reserva> res = resDa.obtenerReservaPorHuesped(idHuesped);
        for (Reserva reserva : res) {

            modelo.addRow(new Object[]{
                reserva.getIdReserva(),
                reserva.getIdHabitacion(),
                reserva.getIdHuesped(),
                reserva.getFechaIngreso(),
                reserva.getFechaSalida(),
                reserva.getCantidadPersonas(),
                reserva.getPrecioTotal(),
                reserva.isEstado()
            });

        }
    }

}
