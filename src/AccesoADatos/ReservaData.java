package AccesoADatos;
//
//import Entidades.Reserva;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;
//
//
//public class ReservaData {
//
//    private Connection con = null;
//    private ReservaData rd = new ReservaData();
//    private HuespedData hd = new HuespedData();
//    
//    public ReservaData() {
//
//        con = Conexion.getConexion();
//    }
//
//    public void guardarReserva(Reserva re) {
//        String sql = "INSERT INTO reserva(idHabitacion, idReserva,idHuesped,fechaIngreso,fechaSalida,cantidadDePersonas"
//                + "precioTotal,estado) VALUES (?,?,?,?,?,?,?,?)";
//
//        try {
//
//            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setInt(1, re.getIdHabitacion().getIdHabitacion());
//            ps.setInt(2, re.getIdReserva());
//            ps.setInt(3, re.getIdHuesped());
//
//            ps.executeUpdate();
//            ResultSet rs = ps.getGeneratedKeys();
//            if (rs.next()) {
//                re.setIdReserva(rs.getInt(1));
//                JOptionPane.showMessageDialog(null, "Reserva realizada con exito");
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de reserva");
//        }
//
//    }
