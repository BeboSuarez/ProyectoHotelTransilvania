package Entidades;

public class Habitacion {
    
    
    private int idHabitacion;
    private int idTipodehabitacion;
    private double precioNoche;
    private int cantidadpersonas;
    private String descripcion;

    private boolean estado;

    public Habitacion() {
    }

    public Habitacion(int idHabitacion, int idTipodehabitacion, double precioNoche, int cantidadpersonas, String descripcion, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.idTipodehabitacion = idTipodehabitacion;
        this.precioNoche = precioNoche;
        this.cantidadpersonas = cantidadpersonas;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Habitacion(int idTipodehabitacion, double precioNoche, int cantidadpersonas, String descripcion, boolean estado) {
        this.idTipodehabitacion = idTipodehabitacion;
        this.precioNoche = precioNoche;
        this.cantidadpersonas = cantidadpersonas;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getIdTipodehabitacion() {
        return idTipodehabitacion;
    }

    public void setIdTipodehabitacion(int idTipodehabitacion) {
        this.idTipodehabitacion = idTipodehabitacion;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public int getCantidadpersonas() {
        return cantidadpersonas;
    }

    public void setCantidadpersonas(int cantidadpersonas) {
        this.cantidadpersonas = cantidadpersonas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }



    @Override
    public String toString() {
        return  idHabitacion + " " + descripcion;
    }


 
 
    
    
}