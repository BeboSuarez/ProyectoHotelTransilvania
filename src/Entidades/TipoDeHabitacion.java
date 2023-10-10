package Entidades;

public class TipoDeHabitacion {
    
 private int idCamas;
    private String tipoHabitacion;
    private int cantidadCamas;
    private int cantidadPersonas;
    private String tipoCama;
    private double precioNoche;
    private boolean estado;

    public TipoDeHabitacion() {
    }

    public TipoDeHabitacion(int idCamas, String tipoHabitacion, int cantidadCamas, int cantidadPersonas, String tipoCama, double precioNoche, boolean estado) {
        this.idCamas = idCamas;
        this.tipoHabitacion = tipoHabitacion;
        this.cantidadCamas = cantidadCamas;
        this.cantidadPersonas = cantidadPersonas;
        this.tipoCama = tipoCama;
        this.precioNoche = precioNoche;
        this.estado = estado;
    }

    public TipoDeHabitacion(String tipoHabitacion, int cantidadCamas, int cantidadPersonas, String tipoCama, double precioNoche, boolean estado) {
        this.tipoHabitacion = tipoHabitacion;
        this.cantidadCamas = cantidadCamas;
        this.cantidadPersonas = cantidadPersonas;
        this.tipoCama = tipoCama;
        this.precioNoche = precioNoche;
        this.estado = estado;
    }

    public int getIdCamas() {
        return idCamas;
    }

    public void setIdCamas(int idCamas) {
        this.idCamas = idCamas;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
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

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
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
        return "TipoDeHabitacion{" + "idCamas=" + idCamas + ", tipoHabitacion=" + tipoHabitacion + ", cantidadCamas=" + cantidadCamas + ", cantidadPersonas=" + cantidadPersonas + ", tipoCama=" + tipoCama + ", precioNoche=" + precioNoche + ", estado=" + estado + '}';
    }

 
    }

   