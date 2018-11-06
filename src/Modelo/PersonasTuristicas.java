package Modelo;

public abstract class PersonasTuristicas {

    protected String nombre, apellido, dni, email, telefono;
    protected int cantReservas, edad, destino;

    public PersonasTuristicas(String nombre, String apellido, String dni, String email, String telefono, int cantReservas, int edad, int destino) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.cantReservas = cantReservas;
        this.edad = edad;
        this.destino = destino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCantReservas() {
        return cantReservas;
    }

    public void setCantReservas(int cantReservas) {
        this.cantReservas = cantReservas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public String seleccioneLugar() {
        switch (getDestino()) {
            case 1:
                return "Amazonas";
            case 2:
                return "Trujillo";
            case 3:
                return "Lima";
            case 4:
                return "Ica";
            case 5:
                return "Puno";
            case 6:
                return "Cuzco";
            case 7:
                return "Arequipa";
            default:
                return "Ayacucho";
        }
    }

    public double costoTotal(int cant, String destino) {
        double precioFinal = 0.00;
        double precio;
        if (destino.equalsIgnoreCase("Amazonas")) {
            precio = 100.00;
            precioFinal = precio * cant;
            return precioFinal;
        }
        if (destino.equalsIgnoreCase("Trujillo")) {
            precio = 60.00;
            precioFinal = precio * cant;
            return precioFinal;
        }
        if (destino.equalsIgnoreCase("Lima")) {
            precio = 65.00;
            precioFinal = precio * cant;
            return precioFinal;
        }
        if (destino.equalsIgnoreCase("Ica")) {
            precio = 50.00;
            precioFinal = precio * cant;
            return precioFinal;
        }
        if (destino.equalsIgnoreCase("Puno")) {
            precio = 70.00;
            precioFinal = precio * cant;
            return precioFinal;
        }
        if (destino.equalsIgnoreCase("Cuzco")) {
            precio = 59.00;
            precioFinal = precio * cant;
            return precioFinal;
        }
        if (destino.equalsIgnoreCase("Arequipa")) {
            precio = 50.00;
            precioFinal = precio * cant;
            return precioFinal;
        }
        if (destino.equalsIgnoreCase("Ayacucho")) {
            precio = 100.00;
            precioFinal = precio * cant;
            return precioFinal;
        }
        if (destino.equalsIgnoreCase("")) {
            precio = Double.parseDouble("");
            precioFinal = precio * cant;
            return precioFinal;

        }
        return precioFinal;
    }

    public abstract String tipoV();
    public abstract double totalaPagar();

    public String info() {
        return "\tAGENCIA DE VIAJES" + "\n"
                + "\tRESERVED TOURS" + "\n"
                + "---------------------------------------------------------------------------" + "\n"
                + "\tBOLETA DE PAGO" + "\n"
                + "---------------------------------------------------------------------------\n"
                + "Nombre\t\t" + getNombre() + "\n"
                + "Apellido\t\t" + getApellido() + "\n"
                + "Edad\t\t" + getEdad() + "\n"
                + "DNI\t\t" + getDni() + "\n"
                + "Telefono\t\t" + getTelefono() + "\n"
                + "Email\t\t" + getEmail() + "\n"
                + "Cantidad de Reserva\t" + getCantReservas() + "\n"
                + "Destino\t\t" + seleccioneLugar() + "\n"
                + "Total a pagar\t\t:" + totalaPagar() + "\n";
        
    }
}
