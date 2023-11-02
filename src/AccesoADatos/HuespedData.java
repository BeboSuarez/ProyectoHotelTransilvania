package AccesoADatos;

import Entidades.Huesped;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class HuespedData {

    private Connection con = null;

    public HuespedData() {

        con = Conexion.getConexion();

    }

    public void cargarHuesped(Huesped huesped) {

        String sql = "INSERT INTO huesped (nombre, apellido, dni, fechaNacimiento, correo, telefono, domicilio, estado)"
                + " VALUES(?,?,?,?,?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, huesped.getNombre());
            ps.setString(2, huesped.getApellido());
            ps.setInt(3, huesped.getDni());
            ps.setDate(4, Date.valueOf(huesped.getFechaNacimiento()));
            ps.setString(5, huesped.getCorreo());
            ps.setInt(6, huesped.getTelefono());
            ps.setString(7, huesped.getDomicilio());
            ps.setBoolean(8, huesped.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                huesped.setIdHuesped(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "HUESPED REGISTRADO");

            } else {

                JOptionPane.showMessageDialog(null, "DNI DUPLICADO");
            }

            ps.close();

        } catch (SQLException e) {

            if (e.getErrorCode() == 1062 && e.getSQLState().equals("23000")) {
                // Manejo de la excepción específica de duplicación de entrada en la clave 'dni'

                JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR EL HUESPED");
            }

        }
    }

    public void modificarHuesped(Huesped huesped) {

        String sql = "UPDATE huesped SET nombre = ?, apellido = ?, "
                + "dni = ? ,fechaNacimiento = ?,correo = ?, telefono = ?"
                + ", domicilio = ?,estado=? WHERE idHuesped=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, huesped.getNombre());
            ps.setString(2, huesped.getApellido());
            ps.setInt(3, huesped.getDni());
            ps.setDate(4, Date.valueOf(huesped.getFechaNacimiento()));
            ps.setString(5, huesped.getCorreo());
            ps.setInt(6, huesped.getTelefono());
            ps.setString(7, huesped.getDomicilio());
            ps.setBoolean(8, huesped.isEstado());
            ps.setInt(9, huesped.getIdHuesped());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                ;

                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");

            } else {
                JOptionPane.showMessageDialog(null, "no se puede modificar");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped" + ex.getMessage());

        }
    }

    public void bajaHuesped(int dni) {

        String sql = "UPDATE Huesped set estado = 0 WHERE dni = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, dni);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Baja confirmada");

            }
            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped");
        }

    }

    public Huesped buscarHuespedPorDni(int dni) {

        Huesped huesped = new Huesped();

        String sql = "SELECT* FROM huesped WHERE dni= ?";

        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                huesped = new Huesped();

                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                huesped.setEstado(true);
            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped ");

        }

        return huesped;
    }

    public void bajaHuespedPorId(int idHuesped) {

        String sql = "UPDATE Huesped set estado = 0 WHERE idHuesped = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idHuesped);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Baja confirmada");

            }
            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped");
        }

    }

    public void HuespedenHotel(int idHuesped) {

        String sql = "UPDATE Huesped set estado = 1 WHERE idHuesped = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idHuesped);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alta confirmada");

            }
            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped");
        }

    }

    public List<Huesped> listarHuesped() {

        String sql = "SELECT * FROM huesped ";

        ArrayList<Huesped> huespedes = new ArrayList<>();

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Huesped huesped = new Huesped();

                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                huesped.setCorreo(rs.getString("correo"));
                huesped.setTelefono(rs.getInt("telefono"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setEstado(rs.getBoolean("estado"));
                huespedes.add(huesped);

            }
            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped" + ex.getMessage());
        }
        return huespedes;

    }
    public List<Huesped> listarClientes() {
        String sql = "SELECT * FROM huesped WHERE estado=0";
        ArrayList<Huesped> huespedes = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Huesped huesped = new Huesped();
                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                huesped.setCorreo(rs.getString("correo"));
                huesped.setTelefono(rs.getInt("telefono"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setEstado(rs.getBoolean("estado"));
                huespedes.add(huesped);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped" + ex.getMessage());
        }
        return huespedes;
    }
public List<Huesped> listarAlojados() {
        String sql = "SELECT * FROM huesped WHERE estado=1";
        ArrayList<Huesped> huespedes = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Huesped huesped = new Huesped();
                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                huesped.setCorreo(rs.getString("correo"));
                huesped.setTelefono(rs.getInt("telefono"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setEstado(rs.getBoolean("estado"));
                huespedes.add(huesped);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped" + ex.getMessage());
        }
        return huespedes;
    }

}
