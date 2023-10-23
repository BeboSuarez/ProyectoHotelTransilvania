package Entidades;

public class Habitacion {
    
    
    private int idHabitacion;
    private int idCama;
    private String tipodehabitacion;
    private boolean refaccion;
    private boolean estado;

    public Habitacion() {
    }

    public Habitacion(int idHabitacion, int idCama, String tipodehabitacion, boolean refaccion, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.idCama = idCama;
        this.tipodehabitacion = tipodehabitacion;
        this.refaccion = refaccion;
        this.estado = estado;
    }

    public Habitacion(int idCama, String tipodehabitacion, boolean refaccion, boolean estado) {
        this.idCama = idCama;
        this.tipodehabitacion = tipodehabitacion;
        this.refaccion = refaccion;
        this.estado = estado;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getIdCama() {
        return idCama;
    }

    public void setIdCama(int idCama) {
        this.idCama = idCama;
    }

    public String getTipodehabitacion() {
        return tipodehabitacion;
    }

    public void setTipodehabitacion(String tipodehabitacion) {
        this.tipodehabitacion = tipodehabitacion;
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
        return "Habitacion{" + "tipodehabitacion=" + tipodehabitacion + '}';
    }
    
    
    
}