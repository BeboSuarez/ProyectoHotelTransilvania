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

    private TipoDeHabitacion TipodeHabitacionData;

    public TipoDeHabitacionData() {

        con = Conexion.getConexion();
    }

    public void guardarTipoDeHabitacion(TipoDeHabitacion th) {

        String sql = "INSERT INTO tipoDeHabitacion(tipoHabitacion, cantidadCamas, cantidadPersonas, tipoCama,precioNoche,estado) VALUES (?,?,?,?,?,?) ";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
          
            ps.setString(1, th.getTipoHabitacion());
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
                th.setIdCamas(rs.getInt(1));
                System.out.println("5");
                JOptionPane.showMessageDialog(null, "habitacion registrada");

            }else{
                System.out.println("la habitacion ya existe");
            }
            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a tipo de habitacion");
        }
    }

    public void modificarTipoDeHabitacion(TipoDeHabitacion th) {

        String sql = "UPDATE TipoDeHabitacion SET tipoHabitacion = ?, cantidadCamas = ?, cantidadPersonas = ?, tipoCama = ?,precioNoche = ?  WHERE estado=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, th.getTipoHabitacion());
            ps.setInt(2, th.getCantidadCamas());
            ps.setInt(3, th.getCantidadPersonas());
            ps.setString(4, th.getTipoCama());
            ps.setDouble(5, th.getPrecioNoche());
            ps.setBoolean(6, th.isEstado());
         

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
