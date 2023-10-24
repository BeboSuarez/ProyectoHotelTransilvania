package Entidades;

public class Habitacion {
    
    
    private int idHabitacion;
    private int idTipodehabitacion;
    private String descripcion;
    private boolean refaccion;
    private boolean estado;

    public Habitacion() {
    }

    public Habitacion(int idHabitacion, int idTipodehabitacion, String descripcion, boolean refaccion, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.idTipodehabitacion = idTipodehabitacion;
        this.descripcion = descripcion;
        this.refaccion = refaccion;
        this.estado = estado;
    }

    public Habitacion(int idTipodehabitacion, String descripcion, boolean refaccion, boolean estado) {
        this.idTipodehabitacion = idTipodehabitacion;
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
        return  descripcion ;
    }

 
    
    
}