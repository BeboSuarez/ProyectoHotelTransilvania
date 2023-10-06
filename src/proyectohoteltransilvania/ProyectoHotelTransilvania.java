package proyectohoteltransilvania;

import AccesoADatos.Conexion;
import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import AccesoADatos.TipoDeHabitacionData;
import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.Reserva;
import Entidades.TipoDeHabitacion;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
//
//
//
public class ProyectoHotelTransilvania {
//
    public static void main(String[] args) {
        Connection con=Conexion.getConexion();
//        
//      Huesped Carlos=new Huesped ("Carlos","Sosa",354445539,LocalDate.of(1992, 2, 27),"carlos@gmail.com", 44535,"San luis",true);
////Huesped Luca=new Huesped("Brenda", "Siwonia",36233661,LocalDate.of(1992, 03, 26), "siwonia@gmail.com",56566,"Planta567",true);
//        HuespedData hue=new HuespedData();
//        hue.cargarHuesped(Carlos);
//hue.cargarHuesped(Luca);
////        Huesped huespedEncontrado =hue.buscarHuesped(1);
////        if(huespedEncontrado != null){
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
////          
////          
////        }
//        }
//
//        Huesped huespedModificado = hue.modificarHuesped(1);
//      
////        TipoDeHabitacion habi1= new TipoDeHabitacion("discapacitados", 4, 4, "matri y simple",10.000,true);
//  TipoDeHabitacion habi1= new TipoDeHabitacion(3,"capacidades diferentes", 4, 4, "matri y simple",10.000,true);
//       TipoDeHabitacionData hd=new TipoDeHabitacionData();
////       hd.guardarTipoDeHabitacion(habi1);
//     hd.modificarTipoDeHabitacion(habi1);
       Habitacion habi=new Habitacion(7,"cuadruple", false, true);
        HabitacionData hd=new HabitacionData();
       hd.guardarHabitacion(habi);
//
//Reserva re=new Reserva(3,2,LocalDate.of(2023, 10, 13),LocalDate.of(2023, 10, 15), 2, 26545, true);
//ReservaData redata=new ReservaData();
//redata.guardarReserva(re);
 }
}
