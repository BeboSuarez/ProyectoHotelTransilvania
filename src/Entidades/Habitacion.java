package Entidades;

public class Habitacion {
    
    private int idHabitacion;
    private int idCategoria;
    private int tipoHabitacion;
    private boolean refaccion;
    private boolean estado;
    
    
    public Habitacion() {
    }

    public Habitacion(int idHabitacion, int idCategoria, int tipoHabitacion, boolean refaccion, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.idCategoria = idCategoria;
        this.tipoHabitacion = tipoHabitacion;
        this.refaccion = refaccion;
        this.estado = estado;
    }

    public Habitacion(int idCategoria, int tipoHabitacion, boolean refaccion, boolean estado) {
        this.idCategoria = idCategoria;
        this.tipoHabitacion = tipoHabitacion;
        this.refaccion = refaccion;
        this.estado = estado;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(int tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
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
        return "Habitacion{" + "tipoHabitacion=" + tipoHabitacion + ", refaccion=" + refaccion + ", estado=" + estado + '}';
    }  
}