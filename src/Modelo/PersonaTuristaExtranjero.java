
package Modelo;


public class PersonaTuristaExtranjero extends PersonasTuristicas {
    protected String carnetExtranjeria;

    public PersonaTuristaExtranjero( String nombre, String apellido, String dni, String email, String telefono, int edad, int destino,String carnetExtranjeria) {
        super(nombre, apellido, dni, email, telefono, edad, destino);
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
       return costoTotal(seleccioneLugar())*2.50;
   }
    
}
