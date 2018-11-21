package Controlador;


import Modelo.PersonasTuristicas;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class ListaLugaresTuristicos  {

   protected LinkedList<PersonasTuristicas> lth;
    protected String nomb;

    public ListaLugaresTuristicos() {
        lth = new LinkedList<PersonasTuristicas>();
   
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


   
    public int cantPersonas(){
        int cant = 0;
        for(PersonasTuristicas l : lth){
           if(tamaño() !=0 );
                    cant ++;
        }
        return cant;
    }
    public int cantReservas(){
        
        return tamaño();
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
   
   public boolean buscar(String Asiento, String dni, String bus){
       boolean exite = false;
       for(int i =0 ; i<lth.size(); i++){
           if(lth.get(i).getAsiento().equalsIgnoreCase(Asiento) && lth.get(i).getDni().equalsIgnoreCase(dni)
               && lth.get(i).getBus().equalsIgnoreCase(bus)){
               exite = true;
           }else{
               exite=false;
           }
       }
       return exite;
   }
}
