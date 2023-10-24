package Entidades;

public class TipoDeHabitacion {
    
 private int idTipodehabitacion;
    private String descripcion;
    private int cantidadCamas;
    private int cantidadPersonas;
    private String tipoCama;
    private double precioNoche;
    private boolean estado;
  
   
    
    public TipoDeHabitacion() {
    }

    public TipoDeHabitacion(int idTipodehabitacion, String descripcion, int cantidadCamas, int cantidadPersonas, String tipoCama, double precioNoche, boolean estado) {
        this.idTipodehabitacion = idTipodehabitacion;
        this.descripcion = descripcion;
        this.cantidadCamas = cantidadCamas;
        this.cantidadPersonas = cantidadPersonas;
        this.tipoCama = tipoCama;
        this.precioNoche = precioNoche;
        this.estado = estado;
    }

    public TipoDeHabitacion(String descripcion, int cantidadCamas, int cantidadPersonas, String tipoCama, double precioNoche, boolean estado) {
        this.descripcion = descripcion;
        this.cantidadCamas = cantidadCamas;
        this.cantidadPersonas = cantidadPersonas;
        this.tipoCama = tipoCama;
        this.precioNoche = precioNoche;
        this.estado = estado;
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
        return  + idTipodehabitacion + " " + descripcion + '}';
    }

   

     }