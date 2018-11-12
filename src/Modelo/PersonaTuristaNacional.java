
package Modelo;


public class PersonaTuristaNacional extends PersonasTuristicas {
    protected String depNacimiento;

    public PersonaTuristaNacional( String nombre, String apellido, String dni, String email, String telefono, int edad, int destino,String depNacimiento,String bus, String asiento) {
        super(nombre, apellido, dni, email, telefono, edad, destino, bus, asiento);
        this.depNacimiento = depNacimiento;
    }

    public String getDepNacimiento() {
        return depNacimiento;
    }


    public void setDepNacimiento(String depNacimiento) {
        this.depNacimiento = depNacimiento;
    }

    @Override
    public String tipoV(){
        return "Nacional";
    }
    
     public double totalPagar(){
        return totalPagar();
    }

   @Override
   public double totalaPagar(){
       return costoTotal(seleccioneLugar())*0.85;
   }    
    
}
