package Controlador;


import Modelo.PersonasTuristicas;
import Modelo.NuevosLugaresAgregados;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class ListaLugaresTuristicos  {

   protected LinkedList<PersonasTuristicas> lth;
    protected LinkedList<NuevosLugaresAgregados> agl;
    protected String nomb;

    public ListaLugaresTuristicos() {
        lth = new LinkedList<PersonasTuristicas>();
        agl=new LinkedList<>();
    }

    public LinkedList<PersonasTuristicas> getLth() {
        return lth;
    }

    public void setLth(LinkedList<PersonasTuristicas> lth) {
        this.lth = lth;
    }
   
    //Métodos de administracion
    public int tamaño() {
        return lth.size();
    }
    
    public void agrega(PersonasTuristicas t) {
        lth.addFirst(t);
    }
    public void agrega(NuevosLugaresAgregados l){
        agl.add(l);
        
    }

        
//    public void agrega(String nombre, String apellido, String dni,
//            String telefono, String email, int cantReservas, int destino, int edad, String DepNacimiento, double descuento, double costoT) {
//        lth.add(new PersonasTuristicas(nombre, apellido, dni,telefono, email,  cantReservas,destino,edad, DepNacimiento,  descuento, costoT) {
//            @Override
//            public double descuento() {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        }) ;
    
    public void agrega(String nombreNuevo, String ubicacion, String superficie, String relieve, String capital, String fundacion, String clima, String fauna, String flora, String festividades,double precio, String nombre, String apellido, String dni, int destino) {
        agl.add(new NuevosLugaresAgregados(nombreNuevo, ubicacion, superficie, relieve, capital,fundacion, clima, fauna,flora,festividades,precio, nombre, apellido, dni, destino));
    }

    public PersonasTuristicas obtiene(int i) {
        return lth.get(i);
    }

    public int busca(String dni) {
        for (int i = 0; i < tamaño(); i++) {
            if (obtiene(i).getDni().equals(dni)) {
                return i;
            }
        }
        return -1;
    }

    public void elimina(int i) {
        lth.remove(i);
    }

    public String getApellido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public int cantPersonas(){
        int cant = 0;
        for(PersonasTuristicas l : lth){
           if(tamaño() !=0 );
                    cant ++;
        }
        return cant;
    }
    public int cantReservas(){
        int cant = 0;
        for(PersonasTuristicas lh : lth){
           
           if(lh.getCantReservas() !=0);
                    cant += lh.getCantReservas();
        }
        return cant;
    } 
     
   public int cantPM(){
        int c = 0;
        for(PersonasTuristicas lh : lth){
            if(lh.getEdad()<18){
                c++;
        }
        }
        return c;
    }
    
   public int cantPMayores(){
        int c = 0;
        for(PersonasTuristicas lh : lth){
            if(lh.getEdad()>=18){
                c++;
        }
        }
        return c;
    }
}
