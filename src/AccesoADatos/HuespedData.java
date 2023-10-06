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

    public void cargarHuesped(Huesped huesped){ 

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
        if (rs.next()){
            System.out.println("Hola");
            huesped.setIdHuesped(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Huesped registrado exitosamente");
                System.out.println("chau");
        }
        ps.close();
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar el huesped");
        }
        
}
    public void modificarHuesped(Huesped huesped){ //(M)odificar
    
    String sql = "UPTDATE huesped SET nombre = ?, apellido = ?, dni = ? ,fechaNacimiento = ?"
            + ",correo = ?, telefono = ?, domicilio = ?, WHERE idHuesped = ? ";

    PreparedStatement ps = null;
    
        try {
            ps = con.prepareStatement(sql);
            
            ps.setString(1, huesped.getNombre());
            ps.setString(2, huesped.getApellido());
            ps.setInt(3, huesped.getDni());
            ps.setDate(4,Date.valueOf(huesped.getFechaNacimiento()));
            ps.setString(5, huesped.getCorreo());
            ps.setInt(6, huesped.getTelefono());
            ps.setString(7, huesped.getDomicilio());
            
            int exito = ps.executeUpdate();
            
            if (exito == 1){
                JOptionPane.showMessageDialog(null, "Modificacion Exitosa");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo modificar el huesped");
            
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped" + ex.getMessage());
            
        }
    }
    public void bajaHuesped(int dni){
    
        String sql = "UPDATE set estado = 0 WHERE dni = ? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int exito = ps.executeUpdate();
            
            if (exito == 1){
                JOptionPane.showMessageDialog(null, "Baja confirmada");
            
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped");
        }
        
    }
    
    public Huesped buscarHuesped(int id) {//
        Huesped huesped = null;
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM huesped WHERE idHuesped = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                huesped = new Huesped();
                huesped.setIdHuesped(id);
                huesped.setDni(rs.getInt("dni"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                huesped.setEstado(true);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped " + ex.getMessage());

        }

        return huesped;
    }
    
    
    public List<Huesped> listarHuesped(){
    
    String sql ="SELECT * FROM huesped WHERE estado = 1 ";
    ArrayList<Huesped> huespedes = new ArrayList<>();
    try{
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
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
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped"+ex.getMessage());
    }
    return huespedes;

    }
}
