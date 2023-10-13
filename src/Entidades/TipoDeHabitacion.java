package Entidades;

public class TipoDeHabitacion {
    
 private int idCama;
    private String tipoHabitacion;
    private int cantidadCamas;
    private int cantidadPersonas;
    private String tipoCama;
    private double precioNoche;
    private boolean estado;
   
    
    public TipoDeHabitacion() {
    }

    public TipoDeHabitacion(int idCama, String tipoHabitacion, int cantidadCamas, int cantidadPersonas, String tipoCama, double precioNoche, boolean estado) {
        this.idCama = idCama;
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

    public int getIdCama() {
        return idCama;
    }

    public void setIdCama(int idCama) {
        this.idCama = idCama;
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
        return  tipoHabitacion+" " + cantidadCamas + " " + cantidadPersonas + " " + tipoCama;}

 
    }

   