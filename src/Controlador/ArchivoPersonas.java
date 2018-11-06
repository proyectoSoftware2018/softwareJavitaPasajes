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

public class ArchivoPersonas extends ListaLugaresTuristicos {

    protected String nombre;

    public ArchivoPersonas(String nombre) {
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
                            + ((PersonaTuristaNacional) (l)).getDepNacimiento() + "/"
                            + ((PersonaTuristaNacional) (l)).totalaPagar());
                } else if (l instanceof PersonaTuristaUniversitario) {
                    pw.println("2/" + l.getNombre() + "/"
                            + l.getApellido() + "/"
                            + l.getEdad() + "/"
                            + l.getDni() + "/"
                            + l.getTelefono() + "/"
                            + l.getEmail() + "/"
                            + l.seleccioneLugar() + "/"
                            + ((PersonaTuristaUniversitario) (l)).getNumCarnet() + "/"
                            + ((PersonaTuristaUniversitario) (l)).totalaPagar());
                } else {
                    pw.println("3/" + l.getNombre() + "/"
                            + l.getApellido() + "/"
                            + l.getEdad() + "/"
                            + l.getDni() + "/"
                            + l.getTelefono() + "/"
                            + l.getEmail() + "/"
                            + l.seleccioneLugar() + "/"
                            + ((PersonaTuristaExtranjero) (l)).getCarnetExtranjeria() + "/"
                            + ((PersonaTuristaExtranjero) (l)).totalaPagar());
                }
                pw.close();
            }

        } catch (Exception ex) {
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
              
                switch (tipo) {
                    case 1: {
                        String nombr = st.nextToken();
                        String apellido = st.nextToken();
                        int edad = Integer.parseInt(st.nextToken());
                        String dni = st.nextToken();
                        String telefono = st.nextToken();
                        String email = st.nextToken();
                        int cantReservas = Integer.parseInt(st.nextToken());
                        int destino = Integer.parseInt(st.nextToken());
                        String DepNacimiento = st.nextToken();
                       
                        PersonasTuristicas a = new PersonaTuristaNacional(nombr, apellido, dni, email, telefono, edad, destino, DepNacimiento);
                        agrega(a);
                        break;
                    }
                    case 2: {
                        String nombr = st.nextToken();
                        String apellido = st.nextToken();
                        int edad = Integer.parseInt(st.nextToken());
                        String dni = st.nextToken();
                        String telefono = st.nextToken();
                        String email = st.nextToken();
                        int cantReservas = Integer.parseInt(st.nextToken());
                        int destino = Integer.parseInt(st.nextToken());
                        String numCarnet = st.nextToken();
                        PersonasTuristicas b = new PersonaTuristaUniversitario(nombr, apellido, dni, email, telefono, edad, destino, numCarnet);
                        agrega(b);
                        break;
                    }
                    default: {
                        String nombr = st.nextToken();
                        String apellido = st.nextToken();
                        int edad = Integer.parseInt(st.nextToken());
                        String dni = st.nextToken();
                        String telefono = st.nextToken();
                        String email = st.nextToken();
                        int cantReservas = Integer.parseInt(st.nextToken());
                        int destino = Integer.parseInt(st.nextToken());
                        String DepNacimiento = st.nextToken();
                        PersonasTuristicas c = new PersonaTuristaExtranjero(nombr, apellido, dni, email, telefono, edad, destino, DepNacimiento);
                        agrega(c);
                        break;
                    }
                }
                linea = br.readLine();

            }
            br.close();
        } catch (Exception ex) {
        }
    }

}
