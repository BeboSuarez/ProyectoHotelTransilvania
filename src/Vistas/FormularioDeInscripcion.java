package Vistas;

import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import Entidades.Huesped;
import Entidades.Reserva;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FormularioDeInscripcion extends javax.swing.JInternalFrame {

    private ReservaData reda = new ReservaData();

    private Reserva re = new Reserva();

    private DefaultTableModel modelo;

    public FormularioDeInscripcion() {
        
        initComponents();
        modelo = new DefaultTableModel();
        CargarComboBox();
        ArmarCabecera();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        buttonGroup1 = new javax.swing.ButtonGroup();
        JFormularioDeInscripcion = new javax.swing.JLabel();
        jLSeleccionAlumno = new javax.swing.JLabel();
        jListadoDeMaterias = new javax.swing.JLabel();
        jrHreservada = new javax.swing.JRadioButton();
        jrHdisponible = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jBinscribir = new javax.swing.JButton();
        jBanularInscripcion = new javax.swing.JButton();
        JBsalir = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        JFormularioDeInscripcion.setText("Reservas");

        jLSeleccionAlumno.setText("Seleccione un Huesped");

        jListadoDeMaterias.setText("Listado de Habitaciones");

        buttonGroup1.add(jrHreservada);
        jrHreservada.setText("Habitaciones reservadas");
        jrHreservada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrHreservadaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrHdisponible);
        jrHdisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrHdisponibleActionPerformed(evt);
            }
        });

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Huesped", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTabla);

        jBinscribir.setText("Inscribir");
        jBinscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinscribirActionPerformed(evt);
            }
        });

        jBanularInscripcion.setText("Anular Inscripcion");
        jBanularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBanularInscripcionActionPerformed(evt);
            }
        });

        JBsalir.setText("Salir");
        JBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Habitaciones disponibles");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBinscribir)
                                .addGap(88, 88, 88)
                                .addComponent(jBanularInscripcion)
                                .addGap(69, 69, 69)
                                .addComponent(JBsalir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLSeleccionAlumno)
                                .addGap(54, 54, 54)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrHreservada)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(283, 283, 283)
                                        .addComponent(jrHdisponible)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(JFormularioDeInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jListadoDeMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JFormularioDeInscripcion)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSeleccionAlumno)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jListadoDeMaterias)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrHreservada)
                            .addComponent(jrHdisponible))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBinscribir)
                            .addComponent(jBanularInscripcion)
                            .addComponent(JBsalir)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrHreservadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrHreservadaActionPerformed
        Alumno alu = (Alumno) jComboBox1.getSelectedItem();
        borrarFilas();
        jBinscribir.setEnabled(false);
        jBanularInscripcion.setEnabled(true);

        if (alu != null) {
            if (jrHreservada.isSelected()) {
                cargarTablaInscripta(alu.getIdAlumno());
            } else if (jrHdisponible.isSelected()) {
                cargarTablaNoInscripta(alu.getIdAlumno());
            }
        }
    }//GEN-LAST:event_jrHreservadaActionPerformed

    private void jrHdisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrHdisponibleActionPerformed
        Alumno alu = (Alumno) jComboBox1.getSelectedItem();
        borrarFilas();
        cargarTablaNoInscripta(alu.getIdAlumno());

        jBinscribir.setEnabled(true);
        jBanularInscripcion.setEnabled(false);
    }//GEN-LAST:event_jrHdisponibleActionPerformed

    private void jBinscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinscribirActionPerformed
        // TODO add your handling code here:

       int filaSeleccionada = jTabla.getSelectedRow();
       if (filaSeleccionada != -1) {

         Alumno a = (Alumno) jComboBox1.getSelectedItem();
         int idMateria = (int) modelo.getValueAt(filaSeleccionada, 0);
         //String materia = (String) modelo.getValueAt(filaSeleccionada, 1);
         String nombre =  (String) modelo.getValueAt(filaSeleccionada, 1);
         int anioMateria = (int) modelo.getValueAt(filaSeleccionada, 2);
         Materia m = new Materia(idMateria, nombre, anioMateria, true);
         
         Inscripcion i = new Inscripcion(a,m,0);
         
         inscrip.guardarInscripcion(i);
         borrarFilas ();
      }

    }//GEN-LAST:event_jBinscribirActionPerformed

    private void jBanularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBanularInscripcionActionPerformed

            int filaSeleccionada = jTabla.getSelectedRow();
            if(filaSeleccionada != -1){
            
            Alumno a = (Alumno) jComboBox1.getSelectedItem();
            int idMateria = (int) modelo.getValueAt(filaSeleccionada, 0);
            inscrip.borrarInscripcionMateriaAlumno(a.getIdAlumno(), idMateria);
            borrarFilas();
            
            
            }



        // TODO add your handling code here:
    }//GEN-LAST:event_jBanularInscripcionActionPerformed

    private void JBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsalirActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_JBsalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBsalir;
    private javax.swing.JLabel JFormularioDeInscripcion;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBanularInscripcion;
    private javax.swing.JButton jBinscribir;
    private javax.swing.JComboBox<Huesped> jComboBox1;
    private javax.swing.JLabel jLSeleccionAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jListadoDeMaterias;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JRadioButton jrHdisponible;
    private javax.swing.JRadioButton jrHreservada;
    private java.awt.List list1;
    // End of variables declaration//GEN-END:variables
  private void CargarComboBox(){
        HuespedData hues = new HuespedData();
        List<Huesped> h = hues.listarHuesped();
        for(Huesped huesped : h){
            jComboBox1.addItem(huesped);
        }
       
    }

    private void ArmarCabecera() {

        modelo.addColumn("ID");
        modelo.addColumn("-NOMBRE");
        modelo.addColumn("AÑO");
        jTabla.setModel(modelo);

    }

    private void cargarTablaInscripta(int idAlumno) {
        InscripcionData Insc = new InscripcionData();
        List<Materia> cursadas = Insc.obtenerMateriaCursadas(idAlumno);
        borrarFilas();
        for (Materia cursada : cursadas) {
            modelo.addRow(new Object[]{
                cursada.getIdMateria(), cursada.getNombre(), cursada.getAnioMateria()

            });

        }

    }

    private void cargarTablaNoInscripta(int idAlumno) {
        InscripcionData Insc = new InscripcionData();
        List<Materia> nocursadas = Insc.obtenerMateriaNoCursada(idAlumno);
        borrarFilas();
        for (Materia nocursada : nocursadas) {
            modelo.addRow(new Object[]{
                nocursada.getIdMateria(), nocursada.getNombre(), nocursada.getAnioMateria()

            });

        }

    }

    private void borrarFilas() {

        int filas = jTabla.getRowCount() - 1;

        for (int i = filas; i >= 0; i--) {

            modelo.removeRow(i);
        }
    }

}
