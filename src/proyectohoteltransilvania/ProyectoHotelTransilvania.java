package proyectohoteltransilvania;

import AccesoADatos.Conexion;
import java.sql.Connection;


public class ProyectoHotelTransilvania {

    public static void main(String[] args) {
        Connection con=Conexion.getConexion();
    }
    
}