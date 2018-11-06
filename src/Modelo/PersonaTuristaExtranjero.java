
package Modelo;


public class PersonaTuristaExtranjero extends PersonasTuristicas {
    protected String carnetExtranjeria;

    public PersonaTuristaExtranjero( String nombre, String apellido, String dni, String email, String telefono, int cantReservas, int edad, int destino,String carnetExtranjeria) {
        super(nombre, apellido, dni, email, telefono, cantReservas, edad, destino);
        this.carnetExtranjeria = carnetExtranjeria;
    }

    public String getCarnetExtranjeria() {
        return "Extranjero";
    }

    public void setCarnetExtranjeria(String carnetExtranjeria) {
        this.carnetExtranjeria = carnetExtranjeria;
    }
    
    @Override
    public String tipoV(){
        return "Extranjero";
    }
    
     public double totalPagar(){
        return totalPagar();
    }

    @Override
   public double totalaPagar(){
       return costoTotal(getCantReservas(), seleccioneLugar())*2.50;
   }
    
}
