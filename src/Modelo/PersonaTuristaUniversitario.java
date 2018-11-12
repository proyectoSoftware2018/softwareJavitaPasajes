
package Modelo;


public class PersonaTuristaUniversitario extends PersonasTuristicas {
    protected String numCarnet;

    public PersonaTuristaUniversitario( String nombre, String apellido, String dni, String email, String telefono,int edad, int destino,String numCarnet,String bus, String asiento) {
        super(nombre, apellido, dni, email, telefono, edad, destino, bus, asiento);
        this.numCarnet = numCarnet;
    }

    
    public String getNumCarnet() {
        return numCarnet;
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
        return costoTotal(seleccioneLugar())*0.50;
    }
    
    
}
