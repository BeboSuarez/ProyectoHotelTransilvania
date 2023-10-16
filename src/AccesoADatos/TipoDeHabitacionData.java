package AccesoADatos;

import Entidades.TipoDeHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TipoDeHabitacionData {

    private Connection con = null;

    private TipoDeHabitacion TipodeHabitacionData;

    public TipoDeHabitacionData() {

        con = Conexion.getConexion();
    }

    public void guardarTipoDeHabitacion(TipoDeHabitacion th) {

        String sql = "INSERT INTO tipoDeHabitacion(tipoHabitacion, cantidadCamas, cantidadPersonas, tipoCama,precioNoche) VALUES (?,?,?,?,?,?) ";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, th.getTipoHabitacion());
            ps.setInt(2, th.getCantidadCamas());
            System.out.println("1");
            ps.setInt(3, th.getCantidadPersonas());
            ps.setString(4, th.getTipoCama());
            System.out.println("2");
            ps.setDouble(5, th.getPrecioNoche());

            System.out.println("3");
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                System.out.println("4");
                th.setIdCama(rs.getInt(1));
                System.out.println("5");
                JOptionPane.showMessageDialog(null, "habitacion registrada");

            } else {
                System.out.println("la habitacion ya existe");
            }
            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a tipo de habitacion");
        }
    }

    public void modificarTipoDeHabitacion(TipoDeHabitacion th) {

        String sql = "UPDATE TipoDeHabitacion SET idCama=?, tipoHabitacion = ?, cantidadCamas = ?, cantidadPersonas = ?, tipoCama = ?,precioNoche = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, th.getIdCama());
            ps.setString(2, th.getTipoHabitacion());
            ps.setInt(3, th.getCantidadCamas());
            ps.setInt(4, th.getCantidadPersonas());
            ps.setString(5, th.getTipoCama());
            ps.setDouble(6, th.getPrecioNoche());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificacion Exitosa.");
            } else {
                JOptionPane.showMessageDialog(null, "La habitacion no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Tipo De Habitacion." + ex.getMessage());
        }

    }

    public List<TipoDeHabitacion> listarTipoDeHabitacion() {

        String sql = "SELECT * FROM tipodehabitacion";
        ArrayList<TipoDeHabitacion> th = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TipoDeHabitacion tipo = new TipoDeHabitacion();
                tipo.setIdCama(rs.getInt("idCama"));
                tipo.setTipoHabitacion(rs.getString("tipoHabitacion"));
                tipo.setCantidadCamas(rs.getInt("CantidadCamas"));
                tipo.setCantidadPersonas(rs.getInt("CantidadPersonas"));
                tipo.setTipoCama(rs.getString("tipoCama"));
                tipo.setPrecioNoche(rs.getDouble("precioNoche"));
        
                th.add(tipo);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Tipo de Habitacion" + ex.getMessage());
        }
        return th;

    }

    public TipoDeHabitacion obtenerTipoHabitacionPorId(int idCama) {
        TipoDeHabitacion habitacion = null;
        try (PreparedStatement ps = con.prepareStatement("SELECT idCama,tipoHabitacion, cantidadCamas , cantidadPersonas, tipoCama , precioNoche"
                + "  FROM tipodehabitacion WHERE idCama = ?", Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, idCama);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
//                habitacion = new Habitacion(rs.getInt("idHabitacion");
//                        , rs.getBoolean("refaccion"),rs.getBoolean("estado"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar obtener el tipo de habitacion : "
                    + idCama + ". Error: " + ex.getMessage());
        }
        return habitacion;
    }

}
