package Vistas;

import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.Reserva;
import com.toedter.calendar.JTextFieldDateEditor;
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
    private Huesped buscadoPorDni = null;
    private HuespedData buscado;
    HabitacionData Habi = new HabitacionData();
    Habitacion Hab = new Habitacion();

    public InfoReservas() {
        initComponents();
        
        ((JTextFieldDateEditor)jdFechaIngreso.getDateEditor()).setEditable(false);
        ((JTextFieldDateEditor)jdFechaSalida.getDateEditor()).setEditable(false);
        ArmarCabecera();
        CargarComboHabitaciones();
        modelo = (DefaultTableModel) jtTablaReservas.getModel();
        reservaData = new ReservaData();
        buscado = new HuespedData ();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTablaReservas = new javax.swing.JTable();
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
        jLabel9 = new javax.swing.JLabel();
        jtIDhuesped = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Calcular = new javax.swing.JButton();
        jPrecioTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtBuscadorCliente = new javax.swing.JTextField();
        jbBuscarReserva = new javax.swing.JButton();
        jtNombreClienteReserva = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Información de las reservas  por dni:");

        jbModificar.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 13)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(51, 51, 51));
        jbModificar.setText("GUARDAR MODIFICACIÓN");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 13)); // NOI18N
        jbEliminar.setText("BAJA");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        jtTablaReservas.setModel(new javax.swing.table.DefaultTableModel(
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
        jtTablaReservas.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jtTablaReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaReservasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtTablaReservas);

        jdFechaIngreso.setForeground(new java.awt.Color(51, 51, 51));

        jdFechaSalida.setForeground(new java.awt.Color(51, 51, 51));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha Ingreso:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha Salida:");

        jcbHabitacion.setForeground(new java.awt.Color(51, 51, 51));
        jcbHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHabitacionActionPerformed(evt);
            }
        });

        jidReserva.setForeground(new java.awt.Color(0, 0, 51));
        jidReserva.setEnabled(false);

        jtCpersonas.setEditable(false);
        jtCpersonas.setForeground(new java.awt.Color(0, 0, 51));
        jtCpersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCpersonasActionPerformed(evt);
            }
        });

        jtPrecioNoche.setEditable(false);
        jtPrecioNoche.setForeground(new java.awt.Color(0, 0, 51));
        jtPrecioNoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecioNocheActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cant. Personas:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio x Noche:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estado:");

        jtidHabitacion.setForeground(new java.awt.Color(0, 0, 51));
        jtidHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtidHabitacionActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Habitación:");

        jCheckEstado.setForeground(new java.awt.Color(255, 255, 255));
        jCheckEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckEstadoActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID-Reserva");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Huésped:");

        jtIDhuesped.setForeground(new java.awt.Color(0, 0, 51));

        jButton1.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 13)); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Calcular.setText("CALCULAR");
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
        jLabel10.setText("Precio total:");

        jbBuscarReserva.setText("BUSCAR");
        jbBuscarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarReservaActionPerformed(evt);
            }
        });

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
                                    .addComponent(jtNombreClienteReserva)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jcbHabitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtidHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jdFechaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                            .addComponent(jdFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(91, 91, 91)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Calcular))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jidReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtBuscadorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(jbBuscarReserva)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtIDhuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 66, Short.MAX_VALUE))))
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
                    .addComponent(jtBuscadorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarReserva)
                    .addComponent(jtIDhuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jtPrecioNoche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(jtNombreClienteReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel7)
                                        .addGap(21, 21, 21))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jCheckEstado))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcbHabitacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jtidHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jtCpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jdFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(jdFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Calcular)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jtTablaReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaReservasMouseClicked
        ReservaData resDa = new ReservaData();
        Huesped huesped = new Huesped();
        Habitacion habitacion = new Habitacion();

        int filaSeleccionada = jtTablaReservas.getSelectedRow();
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


    }//GEN-LAST:event_jtTablaReservasMouseClicked

    private void jtidHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtidHabitacionActionPerformed

    }//GEN-LAST:event_jtidHabitacionActionPerformed

    private void jCheckEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckEstadoActionPerformed

    }//GEN-LAST:event_jCheckEstadoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        int filaSeleccionada = jtTablaReservas.getSelectedRow();
      
        if (filaSeleccionada != -1) {

            int idHuesped = (int) modelo.getValueAt(filaSeleccionada, 2);
            int idReserva = (int) modelo.getValueAt(filaSeleccionada, 0);
            int idHabitacion = (int) modelo.getValueAt(filaSeleccionada, 1);
            reservaData.BajaReserva(idHuesped, idReserva);
            Habi.habitacionNoDisponible(idHabitacion);
            
            borrarFilas();
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
   

        if (jtTablaReservas != null) {

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

    private void jbBuscarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarReservaActionPerformed
        // TODO add your handling code here:
//        Huesped busca = (Huesped) jtNombreClienteReserva.;
      try {
           
         int dni=Integer.parseInt(jtBuscadorCliente.getText());
         buscadoPorDni = buscado.buscarHuespedPorDni(dni);
         

            if (buscadoPorDni != null) {
               
                jtIDhuesped.setText(buscadoPorDni.getIdHuesped()+ toString());
                jtNombreClienteReserva.setText(buscadoPorDni.getNombre());
                
            }
          cargarTabla(buscadoPorDni.getIdHuesped());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No escribió un número  de documento válido.");
            jtBuscadorCliente.setText("");

        }
    }//GEN-LAST:event_jbBuscarReservaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jCheckEstado;
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
    private javax.swing.JButton jbBuscarReserva;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<Habitacion> jcbHabitacion;
    private com.toedter.calendar.JDateChooser jdFechaIngreso;
    private com.toedter.calendar.JDateChooser jdFechaSalida;
    private javax.swing.JTextField jidReserva;
    private javax.swing.JTextField jtBuscadorCliente;
    private javax.swing.JTextField jtCpersonas;
    private javax.swing.JTextField jtIDhuesped;
    private javax.swing.JTextField jtNombreClienteReserva;
    private javax.swing.JTextField jtPrecioNoche;
    private javax.swing.JTable jtTablaReservas;
    private javax.swing.JTextField jtidHabitacion;
    // End of variables declaration//GEN-END:variables

    private void borrarFilas() {
        int filas = jtTablaReservas.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
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
        jtTablaReservas.setModel(modelo);

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

//private void cargarTextField (int dni) {
//    
//HuespedData huesdat = new HuespedData();
//List<Huesped> hue = huesdat.;
//for (Huesped huesped: hue) {
//
//            modelo.addRow(new Object[]{
//                huesped.getNombre(),
//                huesped.getApellido(),
//         
//            });
//
//        }
//    }

}
