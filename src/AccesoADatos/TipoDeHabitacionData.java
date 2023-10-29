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

    public TipoDeHabitacionData() {

        con = Conexion.getConexion();

    }

    public void guardarTipoDeHabitacion(TipoDeHabitacion th) {

        String sql = "INSERT INTO tipodehabitacion (descripcion, cantidadCamas, cantidadPersonas, tipoCama,precioNoche,estado) VALUES (?,?,?,?,?,?) ";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, th.getDescripcion());
            ps.setInt(2, th.getCantidadCamas());
            System.out.println("1");
            ps.setInt(3, th.getCantidadPersonas());
            ps.setString(4, th.getTipoCama());
            System.out.println("2");
            ps.setDouble(5, th.getPrecioNoche());
            ps.setBoolean(6, th.isEstado());
            System.out.println("3");
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                System.out.println("4");
                th.setIdTipodehabitacion(rs.getInt(1));
                System.out.println("5");

                JOptionPane.showMessageDialog(null, "habitacion registrada");

            } else {
                System.out.println("la habitacion ya existe");
            }
            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Ya existe ese formato de habitacion");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No se puede" + ex);
        }
    }

    public void modificarTipoDeHabitacion(TipoDeHabitacion th) {

        String sql = "UPDATE tipodehabitacion SET descripcion = ?,"
                + " cantidadCamas = ?, cantidadPersonas = ?,"
                + " tipoCama = ?,precioNoche = ?, estado=? "
                + "where idTipodehabitacion=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, th.getDescripcion());
            ps.setInt(2, th.getCantidadCamas());
            ps.setInt(3, th.getCantidadPersonas());
            ps.setString(4, th.getTipoCama());
            ps.setDouble(5, th.getPrecioNoche());
            ps.setBoolean(6, th.isEstado());
            ps.setInt(7, th.getIdTipodehabitacion());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificacion Exitosa.");
            } else {
                JOptionPane.showMessageDialog(null, "La habitacion no existe.");
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Es necesario que ingresen un Tipo de Habitacion.");

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
                tipo.setIdTipodehabitacion(rs.getInt("idTipodehabitacion"));
                tipo.setDescripcion(rs.getString("descripcion"));
                tipo.setCantidadCamas(rs.getInt("cantidadCamas"));
                tipo.setCantidadPersonas(rs.getInt("cantidadPersonas"));
                tipo.setTipoCama(rs.getString("tipoCama"));
                tipo.setPrecioNoche(rs.getDouble("precioNoche"));
                tipo.setEstado(rs.getBoolean("estado"));

                th.add(tipo);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Tipo de Habitacion" + ex.getMessage());
        }
        return th;

    }

    public TipoDeHabitacion obtenerTipoHabitacionPorId(int idTipodehabitacion) {
        TipoDeHabitacion habitacion = null;
        try (PreparedStatement ps = con.prepareStatement("SELECT idTipodehabitacion,descripcion, cantidadCamas , cantidadPersonas, tipoCama , precioNoche,estado"
                + "  FROM tipodehabitacion WHERE idTipodehabitacion = ?", Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, idTipodehabitacion);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
//                habitacion = new Habitacion(rs.getInt("idHabitacion");
//                        , rs.getBoolean("refaccion"),rs.getBoolean("estado"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar obtener el tipo de habitacion : "
                    + idTipodehabitacion + ". Error: " + ex.getMessage());
        }
        return habitacion;
    }

    public void eliminarTipoDeHabitacion(int idTipodehabitacion) {

        try {
            String sql = " DELETE FROM tipodehabitacion WHERE idTipodehabitacion=? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idTipodehabitacion);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "eliminada");

            } else {
                JOptionPane.showMessageDialog(null, "La habitacion no existe.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Tipo De Habitacion." + ex.getMessage());
        }

    }

}
