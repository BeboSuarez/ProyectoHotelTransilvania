
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author viper
 */
public class HabitacionData {
    
    
    private Connection con = null;
    

    public HabitacionData() {

        con = Conexion.getConexion();

    }

    public void guardarHabitacion(Habitacion habitacion) {

        String sql = "INSERT INTO habitacion (idHuesped,idCama,tipodehabitacion,refaccion,estado) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            System.out.println("1");
            
            ps.setInt(1, habitacion.getIdHuesped());
            ps.setInt(3, habitacion.getIdCama());
            ps.setString (4, habitacion.getTipodehabitacion());
            ps.setBoolean(5, habitacion.isRefaccion());
            ps.setBoolean(6, habitacion.isEstado());
        
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
    
    public Habitacion obtenerHabitacionPorId(int idHabitacion) {
        Habitacion habitacion = null;
        try (PreparedStatement ps = con.prepareStatement("SELECT idHabitacion,idCategoria,tipodehabitacion,refaccion,estado"
                + "  FROM habitacion WHERE idHabitacion = ?", Statement.RETURN_GENERATED_KEYS)){
            ps.setInt(1, idHabitacion);
            
            ResultSet rs = ps.executeQuery();
                    
            while (rs.next()) {
//                habitacion = new Habitacion(rs.getInt("idHabitacion");
//                        , rs.getBoolean("refaccion"),rs.getBoolean("estado"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar obtener la habitacion id: "
                    + idHabitacion + ". Error: " + ex.getMessage());
        }
        return habitacion;
    }

    public void modificarHabitacion(Habitacion habitacion) {

        String sql = "UPDATE habitacion SET idHabitacion = ? ,tipoDeHabitacion = ?,refaccion = ?,estado = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
      
            ps.setInt(1, habitacion.getIdHabitacion());
            ps.setString(2, habitacion.getTipoHabitacion());
            ps.setBoolean(3, habitacion.isEstado());
            ps.setBoolean(4, habitacion.isEstado());
            
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
  public void disponibilidadHabitacion(int id) {
        String sql = "UPDATE habitacion SET estado = 0 WHERE idHabitacion = ? ";
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
  
    public List<Habitacion> listarHabitacion() {
        String sql = "SELECT * FROM habitacionn WHERE estado = 1 ";
        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion habitacion = new Habitacion();

            
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setTipoHabitacion(rs.getString("tipoDeHabitacion"));
                habitacion.setRefaccion(rs.getBoolean("refaccionn"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitaciones.add(habitacion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla habitacion " + ex.getMessage());
        }
        return habitaciones;
    }
}
