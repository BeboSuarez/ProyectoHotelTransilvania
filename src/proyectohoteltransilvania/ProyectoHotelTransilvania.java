package proyectohoteltransilvania;

import AccesoADatos.Conexion;
import AccesoADatos.HuespedData;
import Entidades.Huesped;
import java.sql.Connection;
import java.time.LocalDate;



public class ProyectoHotelTransilvania {

    public static void main(String[] args) {
        Connection con=Conexion.getConexion();
        
        Huesped Luis=new Huesped (17,"Luis","Demartin",34531,LocalDate.of(1992, 2, 27),"agus@gmail.com", 435,"San luis",true);
        HuespedData hue=new HuespedData();
        hue.cargarHuesped(Luis);
//        Huesped huespedEncontrado =hue.buscarHuesped(1);
//        if(huespedEncontrado != null){
//        
//            System.out.println("ID: "+huespedEncontrado.getIdHuesped());
//            System.out.println("Nombre: "+ huespedEncontrado.getNombre());
//            System.out.println("Apellido: "+ huespedEncontrado.getApellido());
//            System.out.println("Dni: "+ huespedEncontrado.getDni());
//            System.out.println("Fecha de nacimiennto: " + huespedEncontrado.getFechaNacimiento());
//            System.out.println("Correo electronico: "+ huespedEncontrado.getCorreo());
//            System.out.println("Telefono: "+ huespedEncontrado.getTelefono());
//            System.out.println("Domicilio "+ huespedEncontrado.getDomicilio());
//            System.out.println("Estado: "+huespedEncontrado.isEstado());
//
//            
//            for (Huesped alumno : hue.listarHuesped()) {
//                
//           System.out.println(hue.listarHuesped());
//          
//          
//        }
//        }

       // Huesped huespedModificado = hue.modificarHuesped(1);
        
    }
   
}