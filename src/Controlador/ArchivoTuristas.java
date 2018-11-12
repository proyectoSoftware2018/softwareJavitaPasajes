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
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ArchivoTuristas extends ListaLugaresTuristicos {

    protected String nombre;
    private Conexion conn;
    private PreparedStatement ps;
    
    public ArchivoTuristas(String nombre) {
        super();
        this.nombre = nombre;
        conn = new Conexion();
        ps=null;
        if(conn.getConnection()==null){
        lee();    
        }else{
        select();
        }
        
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
                            + l.getBus()+ "/"
                            + l.getAsiento());
                } else if (l instanceof PersonaTuristaUniversitario) {
                    pw.println("2/" + l.getNombre() + "/"
                            + l.getApellido() + "/"
                            + l.getEdad() + "/"
                            + l.getDni() + "/"
                            + l.getTelefono() + "/"
                            + l.getEmail() + "/"
                            + l.seleccioneLugar() + "/"
                            + ((PersonaTuristaUniversitario) (l)).getNumCarnet()
                            + l.getBus()+ "/"
                            + l.getAsiento());
                } else if (l instanceof PersonaTuristaExtranjero ) {
                    pw.println("3/" + l.getNombre() + "/"
                            + l.getApellido() + "/"
                            + l.getEdad() + "/"
                            + l.getDni() + "/"
                            + l.getTelefono() + "/"
                            + l.getEmail() + "/"
                            + l.seleccioneLugar() + "/"
                            + ((PersonaTuristaExtranjero) (l)).getCarnetExtranjeria()
                            + l.getBus()+ "/"
                            + l.getAsiento());
                }              
            } pw.close();

        } catch (Exception ex) {
            System.out.println("error"+ex.toString());
        }

    }
    public boolean insert() {
        try {
           
            for (PersonasTuristicas l : lth) {
                if (l instanceof PersonaTuristaNacional) {
                ps = conn.getConnection().prepareCall("call insertarturista(?,?,?,?,?,?,?,?,?,?,?)");
                ps.setInt(1, 1);
                ps.setString(2, l.getNombre());
                ps.setString(3, l.getApellido());
                ps.setInt(4, l.getEdad());
                ps.setString(5, l.getDni());
                ps.setString(6, l.getTelefono());
                ps.setString(7, l.getEmail());
                ps.setString(8, l.seleccioneLugar());
                ps.setString(9, ((PersonaTuristaNacional) (l)).getDepNacimiento());
                ps.setString(10, l.getBus());
                ps.setString(11, l.getAsiento());
                ps.executeQuery();
                return true;
            
                } else if (l instanceof PersonaTuristaUniversitario) {
                ps = conn.getConnection().prepareCall("call insertarturista(?,?,?,?,?,?,?,?,?,?,?)");
                ps.setInt(1, 2);
                ps.setString(2, l.getNombre());
                ps.setString(3, l.getApellido());
                ps.setInt(4, l.getEdad());
                ps.setString(5, l.getDni());
                ps.setString(6, l.getTelefono());
                ps.setString(7, l.getEmail());
                ps.setString(8, l.seleccioneLugar());
                ps.setString(9, ((PersonaTuristaUniversitario) (l)).getNumCarnet());
                ps.setString(10, l.getBus());
                ps.setString(11, l.getAsiento());
                ps.executeQuery();
                return true;
                } else if (l instanceof PersonaTuristaExtranjero ) {
                ps = conn.getConnection().prepareCall("call insertarturista(?,?,?,?,?,?,?,?,?,?,?)");
                ps.setInt(1, 3);
                ps.setString(2, l.getNombre());
                ps.setString(3, l.getApellido());
                ps.setInt(4, l.getEdad());
                ps.setString(5, l.getDni());
                ps.setString(6, l.getTelefono());
                ps.setString(7, l.getEmail());
                ps.setString(8, l.seleccioneLugar());
                ps.setString(9, ((PersonaTuristaExtranjero) (l)).getCarnetExtranjeria());
                ps.setString(10, l.getBus());
                ps.setString(11, l.getAsiento());
                ps.executeQuery();
                return true;
                }              
            }

        } catch (Exception ex) {
            System.out.println("error"+ex.toString());
            return false;
        }
       return false;
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
                    String destin = st.nextToken();
                    String DepNacimiento = st.nextToken();
                    String bus = st.nextToken();
                    String asiento = st.nextToken();
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
                   
                   PersonasTuristicas a = new PersonaTuristaNacional(nombr, apellido, dni, email, telefono, edad, destino, DepNacimiento,bus,asiento);
                    
                   agrega(a);
                } else if (tipo == 2) {
                    int destino=0;
                    String nombr = st.nextToken();
                    String apellido = st.nextToken();
                    int edad = Integer.parseInt(st.nextToken());
                    String dni = st.nextToken();
                    String telefono = st.nextToken();
                    String email = st.nextToken();
                    String destin = st.nextToken();
                    String numCarnet = st.nextToken();
                    String bus = st.nextToken();
                    String asiento = st.nextToken();
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
                    PersonasTuristicas b = new PersonaTuristaUniversitario(nombr, apellido, dni, email, telefono, edad, destino, numCarnet,bus,asiento);
                    agrega(b);
                } else if (tipo == 3) {
                    int destino=0;
                    String nombr = st.nextToken();
                    String apellido = st.nextToken();
                    int edad = Integer.parseInt(st.nextToken());
                    String dni = st.nextToken();
                    String telefono = st.nextToken();
                    String email = st.nextToken();
                    String destin = st.nextToken();
                    String carnetExtranjero = st.nextToken();
                    String bus = st.nextToken();
                    String asiento = st.nextToken();
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
                    PersonasTuristicas c = new PersonaTuristaExtranjero(nombr, apellido, dni, email, telefono, edad, destino, carnetExtranjero,bus,asiento);
                    agrega(c);
                }
               linea = br.readLine();
            } 
            br.close();
        } catch (Exception ex) {
            System.out.println("error"+ex.toString());
        }
    }

    public void select() {
        try {
          ps = conn.getConnection().prepareCall("call listaturistas()");
          ResultSet rs = ps.executeQuery();
          while(rs.next()){
          int tipo = rs.getInt(1);
                 
                if (tipo == 1) {
                    int destino=0;
                    String nombr = rs.getString(2);
                    String apellido = rs.getString(3);
                    int edad = rs.getInt(4);
                    String dni = rs.getString(5);
                    String telefono = rs.getString(6);
                    String email =rs.getString(7);
                    String destin = rs.getString(8);
                    String DepNacimiento = rs.getString(9);
                    String bus = rs.getString(10);
                    String asiento = rs.getString(11);
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
                   
                   PersonasTuristicas a = new PersonaTuristaNacional(nombr, apellido, dni, email, telefono, edad, destino, DepNacimiento,bus,asiento);
                    
                   agrega(a);
                } else if (tipo == 2) {
                    int destino=0;
                    String nombr = rs.getString(2);
                    String apellido = rs.getString(3);
                    int edad = rs.getInt(4);
                    String dni = rs.getString(5);
                    String telefono = rs.getString(6);
                    String email =rs.getString(7);
                    String destin = rs.getString(8);
                    String numCarnet = rs.getString(9);
                    String bus = rs.getString(10);
                    String asiento = rs.getString(11);
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
                    PersonasTuristicas b = new PersonaTuristaUniversitario(nombr, apellido, dni, email, telefono, edad, destino, numCarnet,bus,asiento);
                    agrega(b);
                } else if (tipo == 3) {
                    int destino=0;
                    String nombr = rs.getString(2);
                    String apellido = rs.getString(3);
                    int edad = rs.getInt(4);
                    String dni = rs.getString(5);
                    String telefono = rs.getString(6);
                    String email =rs.getString(7);
                    String destin = rs.getString(8);
                    String carnetExtranjero = rs.getString(9);
                    String bus = rs.getString(10);
                    String asiento = rs.getString(11);
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
                    PersonasTuristicas c = new PersonaTuristaExtranjero(nombr, apellido, dni, email, telefono, edad, destino, carnetExtranjero,bus,asiento);
                    agrega(c);
                }    
          }
        } catch (Exception ex) {
            System.out.println("error"+ex.toString());
        }
    }

}
