package es.jcyl.eclap.spring.beans;

public class Persona {



    private String nombre;
    private Vehiculo vehiculo;


    public Persona() {
        IO.println("Persona bean creado");
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

}
