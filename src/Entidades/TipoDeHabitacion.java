package Entidades;

public class TipoDeHabitacion {
    
 private int idCama;
    private String tipoHabitacion;
    private int cantidadCamas;
    private int cantidadPersonas;
    private String tipoCama;
    private double precioNoche;
  
   
    
    public TipoDeHabitacion() {
    }

    public TipoDeHabitacion(int idCama, String tipoHabitacion, int cantidadCamas, int cantidadPersonas, String tipoCama, double precioNoche) {
        this.idCama = idCama;
        this.tipoHabitacion = tipoHabitacion;
        this.cantidadCamas = cantidadCamas;
        this.cantidadPersonas = cantidadPersonas;
        this.tipoCama = tipoCama;
        this.precioNoche = precioNoche;
      
    }

    public TipoDeHabitacion(String tipoHabitacion, int cantidadCamas, int cantidadPersonas, String tipoCama, double precioNoche) {
        this.tipoHabitacion = tipoHabitacion;
        this.cantidadCamas = cantidadCamas;
        this.cantidadPersonas = cantidadPersonas;
        this.tipoCama = tipoCama;
        this.precioNoche = precioNoche;
     
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

    @Override
    public String toString() {
        return  tipoHabitacion+" " + cantidadCamas + " " + cantidadPersonas + " " + tipoCama;}

 
    }

   