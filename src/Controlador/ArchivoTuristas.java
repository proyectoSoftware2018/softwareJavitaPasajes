package Controlador;

import Modelo.PersonaTuristaExtranjero;
import Modelo.PersonaTuristaNacional;
import Modelo.PersonaTuristaUniversitario;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import Modelo.PersonasTuristicas;
import javax.swing.JOptionPane;

public class ArchivoTuristas extends ListaLugaresTuristicos {

    protected String nombre;

    public ArchivoTuristas(String nombre) {
        super();
        this.nombre = nombre;
        lee();
    }

    public void graba() {
        try {
            FileWriter fw = new FileWriter(nombre);
            PrintWriter pw = new PrintWriter(fw);
            for (PersonasTuristicas l : lth) {
                if (l instanceof PersonaTuristaNacional) {
                    pw.println("1/" + l.getNombre() + "/"
                            + l.getApellido() + "/"
                            + l.getEdad() + "/"
                            + l.getDni() + "/"
                            + l.getTelefono() + "/"
                            + l.getEmail() + "/"
                            + l.seleccioneLugar() + "/"
                            + ((PersonaTuristaNacional) (l)).getDepNacimiento() );
                } else if (l instanceof PersonaTuristaUniversitario) {
                    pw.println("2/" + l.getNombre() + "/"
                            + l.getApellido() + "/"
                            + l.getEdad() + "/"
                            + l.getDni() + "/"
                            + l.getTelefono() + "/"
                            + l.getEmail() + "/"
                            + l.seleccioneLugar() + "/"
                            + ((PersonaTuristaUniversitario) (l)).getNumCarnet());
                } else if (l instanceof PersonaTuristaExtranjero ) {
                    pw.println("3/" + l.getNombre() + "/"
                            + l.getApellido() + "/"
                            + l.getEdad() + "/"
                            + l.getDni() + "/"
                            + l.getTelefono() + "/"
                            + l.getEmail() + "/"
                            + l.seleccioneLugar() + "/"
                            + ((PersonaTuristaExtranjero) (l)).getCarnetExtranjeria());
                }              
            } pw.close();

        } catch (Exception ex) {
            System.out.println("error"+ex.toString());
        }

    }

    public void lee() {
        try {
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                StringTokenizer st = new StringTokenizer(linea, "/");
                int tipo = Integer.parseInt(st.nextToken());
                 
                if (tipo == 1) {
                    int destino=0;
                    String nombr = st.nextToken();
                    String apellido = st.nextToken();
                    int edad = Integer.parseInt(st.nextToken());
                    String dni = st.nextToken();
                    String telefono = st.nextToken();
                    String email = st.nextToken();
                    int cantReservas = Integer.parseInt(st.nextToken());
                    String destin = st.nextToken();
                    String DepNacimiento = st.nextToken();
                     switch (destin) {
                         
                     case "Amazonas":
                            destino=1;
                            break;
                    case "Trujillo":
                            destino=2;
                            break;
                    case "Lima":
                            destino=3;
                            break;
                    case "Ica":
                            destino=4;
                            break;
                    case "Puno":
                            destino=5;
                            break;
                    case "Cuzco":
                            destino=6;
                            break;
                    case "Arequipa":
                            destino=7;
                            break;
                    case "Ayacucho":        
                            destino=8;
                            break;
                   }
                   PersonasTuristicas a = new PersonaTuristaNacional(nombr, apellido, dni, email, telefono, edad, destino, DepNacimiento);
                    
                   agrega(a);
                } else if (tipo == 2) {
                    int destino=0;
                    String nombr = st.nextToken();
                    String apellido = st.nextToken();
                    int edad = Integer.parseInt(st.nextToken());
                    String dni = st.nextToken();
                    String telefono = st.nextToken();
                    String email = st.nextToken();
                    int cantReservas = Integer.parseInt(st.nextToken());
                    String destin = st.nextToken();
                    String numCarnet = st.nextToken();
                      switch (destin) {
                         
                     case "Amazonas":
                            destino=1;
                            break;
                    case "Trujillo":
                            destino=2;
                            break;
                    case "Lima":
                            destino=3;
                            break;
                    case "Ica":
                            destino=4;
                            break;
                    case "Puno":
                            destino=5;
                            break;
                    case "Cuzco":
                            destino=6;
                            break;
                    case "Arequipa":
                            destino=7;
                            break;
                    case "Ayacucho":        
                            destino=8;
                            break;
                   }
                    PersonasTuristicas b = new PersonaTuristaUniversitario(nombr, apellido, dni, email, telefono, edad, destino, numCarnet);
                    agrega(b);
                } else if (tipo == 3) {
                    int destino=0;
                    String nombr = st.nextToken();
                    String apellido = st.nextToken();
                    int edad = Integer.parseInt(st.nextToken());
                    String dni = st.nextToken();
                    String telefono = st.nextToken();
                    String email = st.nextToken();
                    int cantReservas = Integer.parseInt(st.nextToken());
                    String destin = st.nextToken();
                    String carnetExtranjero = st.nextToken();
                     switch (destin) {
                         
                     case "Amazonas":
                            destino=1;
                            break;
                    case "Trujillo":
                            destino=2;
                            break;
                    case "Lima":
                            destino=3;
                            break;
                    case "Ica":
                            destino=4;
                            break;
                    case "Puno":
                            destino=5;
                            break;
                    case "Cuzco":
                            destino=6;
                            break;
                    case "Arequipa":
                            destino=7;
                            break;
                    case "Ayacucho":        
                            destino=8;
                            break;
                   }
                    PersonasTuristicas c = new PersonaTuristaExtranjero(nombr, apellido, dni, email, telefono, edad, destino, carnetExtranjero);
                    agrega(c);
                }
               linea = br.readLine();
            } 
            br.close();
        } catch (Exception ex) {
            System.out.println("error"+ex.toString());
        }
    }

}
