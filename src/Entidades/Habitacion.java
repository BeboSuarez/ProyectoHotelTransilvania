package Entidades;

public class Habitacion {
    
    private int idHuesped;
    private int idHabitacion;
    private int idCama;
    private String tipodehabitacion;
    private boolean refaccion;
    private boolean estado;
    
    
    public Habitacion() {
    }

    public Habitacion(int idHuesped, int idHabitacion, int idCama, String tipodehabitacion, boolean refaccion, boolean estado) {
        this.idHuesped = idHuesped;
        this.idHabitacion = idHabitacion;
        this.idCama = idCama;
        this.tipodehabitacion = tipodehabitacion;
        this.refaccion = refaccion;
        this.estado = estado;
    }

    public Habitacion(int idHuesped, int idCama, String tipodehabitacion, boolean refaccion, boolean estado) {
        this.idHuesped = idHuesped;
        this.idCama = idCama;
        this.tipodehabitacion = tipodehabitacion;
        this.refaccion = refaccion;
        this.estado = estado;
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
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
        return "Habitacion{" + "idHuesped=" + idHuesped + ", idHabitacion=" + idHabitacion + ", idCama=" + idCama + ", tipodehabitacion=" + tipodehabitacion + ", refaccion=" + refaccion + ", estado=" + estado + '}';
    }
}

 

 