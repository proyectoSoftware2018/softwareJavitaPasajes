
package Modelo;


public class PersonaTuristaNacional extends PersonasTuristicas {
    protected String depNacimiento;

    public PersonaTuristaNacional( String nombre, String apellido, String dni, String email, String telefono, int cantReservas, int edad, int destino,String depNacimiento) {
        super(nombre, apellido, dni, email, telefono, cantReservas, edad, destino);
        this.depNacimiento = depNacimiento;
    }

    public String getDepNacimiento() {
        return "Nacional";
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
       return costoTotal(getCantReservas(), seleccioneLugar())*0.85;
   }    
    
}
