package Controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import Modelo.NuevosLugaresAgregados;
import java.io.IOException;

public class ArchivoNuevosDestinos extends ListaLugaresTuristicos {

    protected String nombre;

    public ArchivoNuevosDestinos(String nombre) {
       
        this.nombre = nombre;
        leeNuevoLugar();
    }

     public void grabaNuevoLugar() {
        try {
            FileWriter fw = new FileWriter(nombre);
            PrintWriter pw = new PrintWriter(fw);
            for (NuevosLugaresAgregados a : agl) {
                pw.println(a.getNombreNuevo() + "/"
                       + a.getUbicacion() + "/"
                       + a.getSuperficie() + "/"
                       + a.getRelieve() + "/"
                       + a.getCapital() + "/"
                       + a.getFundacion() + "/"
                       + a.getClima() + "/"
                       + a.getFauna() + "/"
                       + a.getFlora() + "/"
                       + a.getFestividades() + "/"
                       + a.getPrecio() + "\n");
            }
            pw.close();
        } catch (Exception ex) {
        }
    }

    public void leeNuevoLugar() {
        try {
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                StringTokenizer st = new StringTokenizer(linea, "/");
                String nombreNuevo = st.nextToken();
                String ubicacion = st.nextToken();
                String superficie = st.nextToken();
                String relieve = st.nextToken();
                String capital = st.nextToken();
                String fundacion = st.nextToken();
                String clima = st.nextToken();
                String fauna = st.nextToken();
                String flora = st.nextToken();
                String festividades = st.nextToken();
                double precio = Double.parseDouble(st.nextToken());
                String nombre1 = st.nextToken();
                int destino = Integer.parseInt(st.nextToken());
                String apellido = st.nextToken();
                String dni = st.nextToken();
                
                agrega(nombreNuevo, ubicacion, superficie, relieve, capital, fundacion, clima, fauna, flora, festividades, precio, nombre1, apellido, dni, destino);
                linea = br.readLine();
            }
            br.close();
        } catch (Exception ex) {
        }
    }

}
