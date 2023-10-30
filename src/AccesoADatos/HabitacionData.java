package AccesoADatos;

import Entidades.Habitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class HabitacionData {

    private Connection con = null;

    public HabitacionData() {

        con = Conexion.getConexion();

    }

    //SE GUARDA LA HABITACION EN LA BASE DE DATOS//
    public void guardarHabitacion(Habitacion habitacion) {

        String sql = "INSERT INTO habitacion (idTipodehabitacion,precioNoche,cantidadPersonas,descripcion,estado)"
                + " VALUES ( ?,?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, habitacion.getIdTipodehabitacion());
            ps.setDouble(2, habitacion.getPrecioNoche());
            ps.setInt(3, habitacion.getCantidadpersonas());
            ps.setString(4, habitacion.getDescripcion());
            ps.setBoolean(5, habitacion.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                habitacion.setIdHabitacion(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Habitacion añadida con exito");

            }
            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de habitacion" + ex.getMessage());

        }
    }

    //SE OBTIENNE LA HABITACION GUARDADA POR ID DE HABITACION//
    public Habitacion obtenerHabitacionPorId(int idHabitacion) {

        Habitacion habitacion = null;

        try (PreparedStatement ps = con.prepareStatement("SELECT idTipodeabitacion,precioNoche,cantidadPersonas,descripcion,estado"
                + "  FROM habitacion WHERE idHabitacion = ?", Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, idHabitacion);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar obtener la habitacion id: "
                    + idHabitacion + ". Error: " + ex.getMessage());
        }
        return habitacion;
    }

    //SE MODIFICA LA HABITACION//
    public void modificarHabitacion(Habitacion habitacion) {

        String sql = "UPDATE habitacion SET idTipodeabitacion=?,precioNoche=?,cantidadPersonas=?,descripcion = ?,estado = ?";
        PreparedStatement ps = null;

        try {

            ps = con.prepareStatement(sql);

            ps.setInt(1, habitacion.getIdTipodehabitacion());
            ps.setDouble(2, habitacion.getPrecioNoche());
            ps.setInt(3, habitacion.getCantidadpersonas());
            ps.setString(4, habitacion.getDescripcion());

            ps.setBoolean(5, habitacion.isEstado());

            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");

            } else {

                JOptionPane.showMessageDialog(null, "la habitacion no existe");
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Habitacion" + ex.getMessage());
        }

    }

    //SE OBTIENE LA HABITACION POR ID//
    public void habitacionDisponible(int id) {

        String sql = "UPDATE habitacion SET estado = 1 WHERE idHabitacion = ? ";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, " Se actualizo el estado de la habitacion");

            }
            ps.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla habitacion");
        }
    }

    //SE OBTIENE UNA LISTA DE LAS HABITACIONES DE LA BASE DE DATOS//
    public List<Habitacion> listarHabitacion() {

        String sql = "SELECT * FROM habitacion ";

        ArrayList<Habitacion> habitaciones = new ArrayList<>();

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Habitacion habitacion = new Habitacion();

                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setIdTipodehabitacion(rs.getInt("idTipodehabitacion"));
                habitacion.setPrecioNoche(rs.getDouble("precioNoche"));
                habitacion.setCantidadpersonas(rs.getInt("cantidadPersonas"));
                habitacion.setDescripcion(rs.getString("descripcion"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitaciones.add(habitacion);

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla habitacion " + ex.getMessage());

        }
        return habitaciones;
    }

    //SE ELIMINA LA HABITACION POR ESTADO//(VUELVE A ESTADO 0)
    public void eliminarHabitacion(boolean estado) {

        String sql = "DELETE FROM `habitacion` WHERE estado = 0";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setBoolean(1, estado);

            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, " Se elimino la habitacionn");

            }

            ps.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla habitacion");
        }
    }

    //SE OBTIENE UNA LISTA DE LAS HABITACIONNES OCUPADAS//
    public List<Habitacion> listarHabitacionOcupadas(int idTipodehabitacion) {

        String sql = "SELECT * FROM habitacion WHERE estado = 1 AND idTipodehabitacion = ? ";

        ArrayList<Habitacion> habitaciones = new ArrayList<>();

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idTipodehabitacion);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Habitacion habitacion = new Habitacion();

                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setIdTipodehabitacion(rs.getInt("idTipodehabitacion"));
                habitacion.setPrecioNoche(rs.getDouble("precioNoche"));
                habitacion.setCantidadpersonas(rs.getInt("cantidadPersonas"));
                habitacion.setDescripcion(rs.getString("descripcion"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitaciones.add(habitacion);
            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return habitaciones;
    }

    //SE OBTIENE UNA LISTA DE LAS HABITACIONES DISPONIBLES//
    public List<Habitacion> listarHabitacionDisponibles(int idTipodehabitacion) {

        String sql = "SELECT * FROM habitacion WHERE estado = 0 AND idTipodehabitacion = ? ";

        ArrayList<Habitacion> habitaciones = new ArrayList<>();

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idTipodehabitacion);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Habitacion habitacion = new Habitacion();

                  habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setIdTipodehabitacion(rs.getInt("idTipodehabitacion"));
                habitacion.setPrecioNoche(rs.getDouble("precioNoche"));
                habitacion.setCantidadpersonas(rs.getInt("cantidadPersonas"));
                habitacion.setDescripcion(rs.getString("descripcion"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitaciones.add(habitacion);
            }
            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Habitacion " + ex.getMessage());
        }
        return habitaciones;

    }

    public List<Habitacion> listarHabitacionDispo() {

        String sql = "SELECT * FROM habitacion WHERE estado = 0";

        ArrayList<Habitacion> habitaciones = new ArrayList<>();

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Habitacion habitacion = new Habitacion();

                 habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setIdTipodehabitacion(rs.getInt("idTipodehabitacion"));
                habitacion.setPrecioNoche(rs.getDouble("precioNoche"));
                habitacion.setCantidadpersonas(rs.getInt("cantidadPersonas"));
                habitacion.setDescripcion(rs.getString("descripcion"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitaciones.add(habitacion);

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno ");
        }
        return habitaciones;
    }
}
