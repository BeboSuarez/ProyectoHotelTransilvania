package Entidades;

public class Habitacion {
    
    
    private int idHabitacion;
    private int idTipodehabitacion;
    private double precioNoche;
    private String descripcion;
    private boolean refaccion;
    private boolean estado;

    public Habitacion() {
    }

    public Habitacion(int idTipodehabitacion, double precioNoche, String descripcion, boolean refaccion, boolean estado) {
        this.idTipodehabitacion = idTipodehabitacion;
        this.precioNoche = precioNoche;
        this.descripcion = descripcion;
        this.refaccion = refaccion;
        this.estado = estado;
    }

    public Habitacion(int idHabitacion, int idTipodehabitacion, double precioNoche, String descripcion, boolean refaccion, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.idTipodehabitacion = idTipodehabitacion;
        this.precioNoche = precioNoche;
        this.descripcion = descripcion;
        this.refaccion = refaccion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isRefaccion() {
        return refaccion;
    }

    public void setRefaccion(boolean refaccion) {
        this.refaccion = refaccion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "idHabitacion=" + idHabitacion + ", idTipodehabitacion=" + idTipodehabitacion + ", precioNoche=" + precioNoche + ", descripcion=" + descripcion + ", refaccion=" + refaccion + ", estado=" + estado + '}';
    }


 
 
    
    
}