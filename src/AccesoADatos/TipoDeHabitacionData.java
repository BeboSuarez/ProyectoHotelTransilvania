package AccesoADatos;

import Entidades.TipoDeHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class TipoDeHabitacionData {

    private Connection con = null;

    private TipoDeHabitacion TipoDeHabitacionData;

    public TipoDeHabitacionData() {

        con = Conexion.getConexion();
    }

    public void guardarTipoDeHabitacion(TipoDeHabitacion th) {

        String sql = "INSERT INTO tipoDeHabitacion(idCategoria, tipoHabitacion, cantidadCamas, cantidadPersonas, tipoCamas,precioNoche,estado) VALUES (?,?,?,?,?,?,?) ";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, th.getIdCategoria());
            ps.setString(2, th.getTipoHabitacion());
            ps.setInt(3, th.getCantidadCamas());
            ps.setInt(4, th.getCantidadPersonas());
            ps.setString(5, th.getTipoCama());
            ps.setDouble(6, th.getPrecioNoche());
            ps.setBoolean(7, th.isEstado());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                th.setIdCategoria(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Reserva Registrada");

            }
            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a tipo de habitacion");
        }
    }

    public void modificarTipoDeHabitacion(TipoDeHabitacion th) {

        String sql = "UPDATE TipoDeHabitacion SET tipoHabitacion = ?, cantidadCamas = ?, cantidadPersonas = ?, tipoCamas = ?,precioNoche = ? ,estado = ? WHERE idCategoria = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, th.getTipoHabitacion());
            ps.setInt(2, th.getCantidadCamas());
            ps.setInt(3, th.getCantidadPersonas());
            ps.setString(4, th.getTipoCama());
            ps.setDouble(5, th.getPrecioNoche());
            ps.setBoolean(6, th.isEstado());
            ps.setInt(7, th.getIdCategoria());

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
}
