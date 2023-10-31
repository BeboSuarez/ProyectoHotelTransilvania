package AccesoADatos;

import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.Reserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ReservaData {

    private Connection con = null;
    

    private HuespedData hd = new HuespedData();
    private HabitacionData habDa = new HabitacionData();

    public ReservaData() {

        try {
            con = Conexion.getConexion();
            con.setAutoCommit(true);
        } catch (SQLException ex) {
            Logger.getLogger(ReservaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guardarReserva(Reserva re) {
        System.out.println("hola");
        String sql = "INSERT INTO reserva(idHabitacion,idHuesped,fechaIngreso,fechaSalida,cantidadPersonas,"
                + "precioTotal,estado) VALUES (?,?,?,?,?,?,?)";
        System.out.println("0");
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            System.out.println("1");
            ps.setInt(1, re.getIdHabitacion());
            ps.setInt(2, re.getIdHuesped());
            ps.setDate(3, Date.valueOf(re.getFechaIngreso()));
            ps.setDate(4, Date.valueOf(re.getFechaSalida()));
            ps.setInt(5, re.getCantidadPersonas());
            ps.setDouble(6, re.getPrecioTotal());
            ps.setBoolean(7, re.isEstado());

            System.out.println("2");
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                re.setIdReserva(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Reserva realizada con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "habitacion ocupada");
        }
    }
    
    

    public void modificarReserva(Reserva reserva) {
        //UPDATE `reserva` SET `idReserva`='[value-1]',`idHabitacion`='[value-2]',`idHuesped`='[value-3]',
       // `fechaIngreso`='[value-4]',`fechaSalida`='[value-5]',`cantidadPersonas`='[value-6]',`precioTotal`='[value-7]'
       // ,`estado`='[value-8]' WHERE 1
       String sql = "UPDATE reserva SET idHabitacion = ?"
               + ", idHuesped = ?, fechaIngreso = ?,fechaSalida = ?"
               + ",cantidadPersonas = ?,precioTotal = ?,estado = ? WHERE idReserva=?";
   
       PreparedStatement ps = null;
       try {
           
           ps=con.prepareStatement(sql);
            
            ps.setInt(1, reserva.getIdHabitacion());
            ps.setInt(2, reserva.getIdHuesped());
            ps.setDate(3, Date.valueOf(reserva.getFechaIngreso()));
            ps.setDate(4, Date.valueOf(reserva.getFechaSalida()));
            ps.setInt(5, reserva.getCantidadPersonas());
            ps.setDouble(6, reserva.getPrecioTotal());
            ps.setBoolean(7, reserva.isEstado());
             ps.setInt(8, reserva.getIdReserva());
            System.out.println("1");
               int exito = ps.executeUpdate();
               System.out.println(exito);
             if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "la reserva no existe");
            }
           con.commit();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Reserva");
        }

    }

    public void BajaReserva(int idHuesped, int idReserva) {
        try {
            String sql = "DELETE FROM reserva WHERE idHuesped = ? AND idReserva = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ps.setInt(2, idReserva);
            System.out.println("no entre");
            int filas = ps.executeUpdate();
            if (filas > 0) {
                
                JOptionPane.showMessageDialog(null, "Reserva borrada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Reserva");

        }
    }
    

//    public List<Reserva> obtenerReserva() {
//        ArrayList<Reserva> reservadas = new ArrayList<>();
//        String sql = "SELECT * FROM Reserva ";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Reserva res = new Reserva();
////                res.setIdReserva(rs.getInt("idReserva"));
////                 Habitacion hab = habDa.obtenerHabitacionPorId(rs.getInt("idHabitacion"));
////                Huesped hue = hd.buscarHuesped(rs.getInt("idHuesped"));
////               
////                res.setIdReserva(res);
////                res.setIdHabitacion(hab);
////                res.setIdHuesped(hue);
////                reservadas.add(res);
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a las reservas");
//        }
//        return reservadas;
//    }
    public ArrayList<Reserva> obtenerReservaPorHuesped(int idHuesped) {

        ArrayList<Reserva> reservas = new ArrayList<>();

        String sql = "SELECT* FROM reserva WHERE idHuesped = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Reserva res = new Reserva();
                res.setIdReserva(rs.getInt("idReserva"));
                res.setIdHabitacion(rs.getInt("idHabitacion"));
                res.setIdHuesped(rs.getInt("idHuesped"));
                res.setFechaIngreso(rs.getDate("fechaIngreso").toLocalDate());
                res.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
                res.setCantidadPersonas(rs.getInt("cantidadPersonas"));
                res.setPrecioTotal(rs.getDouble("precioTotal"));
                res.setEstado(rs.getBoolean("estado"));

                reservas.add(res);

            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la reserva por idHuesped");
        }
        return reservas;
    }

    public List<Reserva> obtenerReserva() {
        String sql = "SELECT * FROM reserva WHERE estado = 1";
        ArrayList<Reserva> reservadas = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reserva reserva = new Reserva();

                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setIdHabitacion(rs.getInt("idHabitacion"));
                reserva.setIdHuesped(rs.getInt("idHuesped"));
                reserva.setFechaIngreso(rs.getDate("fechaIngreso").toLocalDate());
                reserva.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
                reserva.setCantidadPersonas(rs.getInt("cantidadPersonas"));
                reserva.setPrecioTotal(rs.getDouble("precioTotal"));
                reserva.setEstado(rs.getBoolean("estado"));

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Reserva " + ex.getMessage());
        }
        return reservadas;
    }

}
