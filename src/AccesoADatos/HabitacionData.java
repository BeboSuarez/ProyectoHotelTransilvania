
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


public class HabitacionData {
    
    
    private Connection con = null;
    

    public HabitacionData() {

        con = Conexion.getConexion();

    }

        public void guardarHabitacion(Habitacion habitacion) {

        String sql = "INSERT INTO habitacion (idTipodehabitacion,precioNoche,descripcion,refaccion,estado) VALUES ( ?,?, ?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            System.out.println("1");
            

            ps.setInt(1, habitacion.getIdTipodehabitacion());
            ps.setDouble(2, habitacion.getPrecioNoche());
            ps.setString (3, habitacion.getDescripcion());
   
            ps.setBoolean(4, habitacion.isRefaccion());
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
    
    public Habitacion obtenerHabitacionPorId(int idHabitacion) {
        Habitacion habitacion = null;
        try (PreparedStatement ps = con.prepareStatement("SELECT idHabitacion,precioNoche,descripcion,refaccion,estado"
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
        
        String sql = "UPDATE habitacion SET idHabitacion = ? ,precioNoche=?,descripcion = ?,refaccion = ?,estado = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
      
            ps.setInt(1, habitacion.getIdHabitacion());
                 ps.setDouble(2, habitacion.getPrecioNoche());
            ps.setString(3, habitacion.getDescripcion());
         
            ps.setBoolean(4, habitacion.isRefaccion());
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
  
    public List<Habitacion> listarHabitacion() {
        String sql = "SELECT * FROM habitacion ";
        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion habitacion = new Habitacion();

                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setPrecioNoche(rs.getDouble("precioNoche"));
                habitacion.setDescripcion(rs.getString("descripcion"));
                habitacion.setRefaccion(rs.getBoolean("refaccion"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitaciones.add(habitacion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla habitacion " + ex.getMessage());
        }
        return habitaciones;
    }
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
    public List<Habitacion> listarHabitacionOcupadas(boolean estado, int idTipodehabitacion) {
        String sql = "SELECT * FROM habitacion WHERE estado = 1 AND idTipodehabitacion = ? ";
        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idTipodehabitacion);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion habitacion = new Habitacion();

                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setDescripcion(rs.getString("Descripcion"));
               habitacion.setIdTipodehabitacion(rs.getInt("idTipodehabitacion"));
                habitacion.setPrecioNoche(rs.getDouble("PrecioNoche"));
                habitacion.setRefaccion(rs.getBoolean("Refaccion"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitaciones.add(habitacion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return habitaciones;
    }
    public List<Habitacion> listarHabitacionDisponibles(boolean estado, int idTipodehabitacion) {
        String sql = "SELECT * FROM habitacion WHERE estado = 0 AND idTipodehabitacion = ? ";
        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        try {

            PreparedStatement ps = con.prepareStatement(sql);
           ps.setInt(1,idTipodehabitacion);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion habitacion = new Habitacion();

                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setDescripcion(rs.getString("Descripcion"));
               habitacion.setIdTipodehabitacion(rs.getInt("Tipodehabitacion"));
                habitacion.setPrecioNoche(rs.getDouble("PrecioNoche"));
                habitacion.setRefaccion(rs.getBoolean("Refaccion"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitaciones.add(habitacion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Habitacion " + ex.getMessage());
        }
        return habitaciones;
    }
    public List<Habitacion> listarHabitacionNoDisponible() {
        String sql = "SELECT * FROM habitacion WHERE estado = 1 AND idTipodehabitacion = ? ";
        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion habitacion = new Habitacion();

                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setDescripcion(rs.getString("Descripcion"));
               habitacion.setIdTipodehabitacion(rs.getInt("idTipodehabitacion"));
                habitacion.setPrecioNoche(rs.getDouble("PrecioNoche"));
                habitacion.setRefaccion(rs.getBoolean("Refaccion"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitaciones.add(habitacion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return habitaciones;
    }
}
