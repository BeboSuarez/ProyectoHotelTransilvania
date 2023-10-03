package Entidades;

public class TipoDeHabitacion {
    
    private int idCategoria;
    private int tipoHabitacion;
    private int cantidadCamas;
    private int cantidadPersonas;
    private int tipoCama;
    private double precioNoche;
    private boolean estado;

    public TipoDeHabitacion() {
    }

    public TipoDeHabitacion(int idCategoria, int tipoHabitacion, int cantidadCamas, int cantidadPersonas, int tipoCama, double precioNoche, boolean estado) {
        this.idCategoria = idCategoria;
        this.tipoHabitacion = tipoHabitacion;
        this.cantidadCamas = cantidadCamas;
        this.cantidadPersonas = cantidadPersonas;
        this.tipoCama = tipoCama;
        this.precioNoche = precioNoche;
        this.estado = estado;
    }

    public TipoDeHabitacion(int tipoHabitacion, int cantidadCamas, int cantidadPersonas, int tipoCama, double precioNoche, boolean estado) {
        this.tipoHabitacion = tipoHabitacion;
        this.cantidadCamas = cantidadCamas;
        this.cantidadPersonas = cantidadPersonas;
        this.tipoCama = tipoCama;
        this.precioNoche = precioNoche;
        this.estado = estado;
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

    public int getCantidadCamas() {
        return cantidadCamas;
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public int getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(int tipoCama) {
        this.tipoCama = tipoCama;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "TipoDeHabitacion{" + "tipoHabitacion=" + tipoHabitacion + ", cantidadCamas=" + cantidadCamas + ", cantidadPersonas=" + cantidadPersonas + ", tipoCama=" + tipoCama + ", precioNoche=" + precioNoche + ", estado=" + estado + '}';
    }
}