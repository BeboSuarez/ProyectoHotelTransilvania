package Entidades;

import java.sql.Date;

public class Reserva {
    
    private int idHabitacion;
    private int idReserva;
    private int idHuesped;
    private Date fechaIngreso;
    private Date fechaSalida;
    private int cantidadPersonas;
    private double precioTotal;
    private boolean estado;

    public Reserva() {
    }

    public Reserva(int idHabitacion, int idReserva, int idHuesped, Date fechaIngreso, Date fechaSalida, int cantidadPersonas, double precioTotal, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.idReserva = idReserva;
        this.idHuesped = idHuesped;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.cantidadPersonas = cantidadPersonas;
        this.precioTotal = precioTotal;
        this.estado = estado;
    }

    public Reserva(Date fechaIngreso, Date fechaSalida, int cantidadPersonas, double precioTotal, boolean estado) {
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

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
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
        return "Reserva{" + "fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", cantidadPersonas=" + cantidadPersonas + ", precioTotal=" + precioTotal + ", estado=" + estado + '}';
    }    
}