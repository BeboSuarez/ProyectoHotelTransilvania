package Entidades;

import java.sql.Date;
import java.time.LocalDate;

public class Reserva {
    
    private int idHabitacion;
    private int idReserva;
    private int idHuesped;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private int cantidadPersonas;
    private double precioTotal;
    private boolean estado;

    public Reserva() {
    }

    public Reserva(int idHabitacion, int idReserva, int idHuesped, LocalDate fechaIngreso, LocalDate fechaSalida, int cantidadPersonas, double precioTotal, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.idReserva = idReserva;
        this.idHuesped = idHuesped;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.cantidadPersonas = cantidadPersonas;
        this.precioTotal = precioTotal;
        this.estado = estado;
    }

    public Reserva(int idHabitacion, int idHuesped, LocalDate fechaIngreso, LocalDate fechaSalida, int cantidadPersonas, double precioTotal, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.idHuesped = idHuesped;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.cantidadPersonas = cantidadPersonas;
        this.precioTotal = precioTotal;
        this.estado = estado;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idHabitacion=" + idHabitacion + ", idReserva=" + idReserva + ", idHuesped=" + idHuesped + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", cantidadPersonas=" + cantidadPersonas + ", precioTotal=" + precioTotal + ", estado=" + estado + '}';
    }

    
    
    
    }