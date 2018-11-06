
package Modelo;

public class NuevosLugaresAgregados{
  
    protected String nombreNuevo, ubicacion,superficie,relieve,capital,fundacion,clima,fauna,flora,festividades;
    protected double precio;

    public NuevosLugaresAgregados(String nombreNuevo, String ubicacion, String superficie, String relieve, String capital, String fundacion, String clima, String fauna, String flora, String festividades, double precio, String nombre, String apellido, String dni, int destino) {
        this.nombreNuevo = nombreNuevo;
        this.ubicacion = ubicacion;
        this.superficie = superficie;
        this.relieve = relieve;
        this.capital = capital;
        this.fundacion = fundacion;
        this.clima = clima;
        this.fauna = fauna;
        this.flora = flora;
        this.festividades = festividades;
        this.precio = precio;
    }


    public String getNombreNuevo() {
        return nombreNuevo;
    }

    public void setNombreNuevo(String nombreNuevo) { 
        this.nombreNuevo = nombreNuevo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public String getRelieve() {
        return relieve;
    }

    public void setRelieve(String relieve) {
        this.relieve = relieve;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getFundacion() {
        return fundacion;
    }

    public void setFundacion(String fundacion) {
        this.fundacion = fundacion;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getFauna() {
        return fauna;
    }

    public void setFauna(String fauna) {
        this.fauna = fauna;
    }

    public String getFlora() {
        return flora;
    }

    public void setFlora(String flora) {
        this.flora = flora;
    }

    public String getFestividades() {
        return festividades;
    }

    public void setFestividades(String festividades) {
        this.festividades = festividades;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}

