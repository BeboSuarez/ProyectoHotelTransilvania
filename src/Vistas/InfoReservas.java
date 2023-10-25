package Vistas;

import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import Entidades.Huesped;
import Entidades.Reserva;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class InfoReservas extends javax.swing.JInternalFrame {

    
    
    private DefaultTableModel modelo = new DefaultTableModel();

    public InfoReservas() {
        initComponents();
        ArmarCabecera();
        cargarDatos();
        LlenarTabla();
        CargarComboBox();
        modelo = (DefaultTableModel) jtInfoReserva.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jcbCargarCliente = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtInfoReserva = new javax.swing.JTable();

        jLabel1.setText("Informacion de las reservas");

        jbModificar.setText("MODIFICAR");

        jbEliminar.setText("BAJA");

        jcbCargarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCargarClienteActionPerformed(evt);
            }
        });

        jtInfoReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtInfoReserva);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jbModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addComponent(jcbCargarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbCargarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbModificar)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbEliminar)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbCargarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCargarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCargarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<Huesped> jcbCargarCliente;
    private javax.swing.JTable jtInfoReserva;
    // End of variables declaration//GEN-END:variables
     
    private void LlenarTabla() {
    // Elimina filas existentes en la tabla
    borrarFilas();

    // Obtén el huésped seleccionado del ComboBox
    Huesped huespedSeleccionado = (Huesped) jcbCargarCliente.getSelectedItem();

    // Verifica que el huésped seleccionado no sea nulo
    if (huespedSeleccionado != null) {
        // Obtén las reservas relacionadas al huésped seleccionado
        ReservaData resDa = new ReservaData();
        List<Reserva> reservas = resDa.obtenerReservaPorHuesped(huespedSeleccionado.getIdHuesped());

        // Llena la tabla con los datos de reserva
        for (Reserva reserva : reservas) {
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
    
    private void borrarFilas() {
        int filas = jtInfoReserva.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    private void CargarComboBox(){
    HuespedData hues = new HuespedData();
        List<Huesped> h = hues.listarHuesped();
        for (Huesped huesped : h) {
            jcbCargarCliente.addItem(huesped);
        }
}
    private void ArmarCabecera(){
    
        modelo.addColumn("ID Reserva");
        modelo.addColumn("ID Habitacion");
        modelo.addColumn("ID Huesped");
        modelo.addColumn("Fecha Ingreso");
        modelo.addColumn("Fecha Salida");
        modelo.addColumn("C/Persoas");
        modelo.addColumn("Precio Total");
        modelo.addColumn("Estado");
        jtInfoReserva.setModel(modelo);
        
    
    }
    
//    private void cargarDatos(){
//    
//    ReservaData resDa = new ReservaData();
//         Reserva r = (Reserva) jcbCargarCliente.getSelectedItem();
//           List<Reserva> res = resDa.obtenerReservaPorHuesped(r.getIdHuesped());
//    for(Reserva reserva : res){
//    
//     modelo.addRow(new Object[]{
//            reserva.getIdReserva(),
//            reserva.getIdHabitacion(),
//            reserva.getIdHuesped(),
//            reserva.getFechaIngreso(),
//            reserva.getFechaSalida(),
//            reserva.getCantidadPersonas(),
//            reserva.getPrecioTotal(),
//            reserva.isEstado()
//        });
//    
//    }
//    }
    private void cargarDatos(){
        ReservaData resDa = new ReservaData();
    // Obtén el huésped seleccionado del JComboBox usando HuespedData
    Huesped huespedSeleccionado = (Huesped) jcbCargarCliente.getSelectedItem();

    // Limpia la tabla antes de cargar nuevos datos
    while (modelo.getRowCount() > 0) {
        modelo.removeRow(0);
    }
        int idHuesped;
    // Obtén las reservas relacionadas al huésped seleccionado
    List<Reserva> reservas = resDa.obtenerReservaPorHuesped(idHuesped);

    // Llena la tabla con los datos de reserva
    for (Reserva reserva : reservas) {
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

