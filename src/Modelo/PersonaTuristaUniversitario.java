
package Modelo;


public class PersonaTuristaUniversitario extends PersonasTuristicas {
    protected String numCarnet;

    public PersonaTuristaUniversitario( String nombre, String apellido, String dni, String email, String telefono, int cantReservas, int edad, int destino,String numCarnet) {
        super(nombre, apellido, dni, email, telefono, cantReservas, edad, destino);
        this.numCarnet = numCarnet;
    }

    
    public String getNumCarnet() {
        return "Universitario";
    }

    public void setNumCarnet(String numCarnet) {
        this.numCarnet = numCarnet;
    }

    @Override
    public String tipoV(){
        return "Universitario";
    }
    
    public double totalPagar(){
        return totalPagar();
    }
    
    @Override
    public double totalaPagar(){
        return costoTotal(getCantReservas(), seleccioneLugar())*0.50;
    }
    
    
}
