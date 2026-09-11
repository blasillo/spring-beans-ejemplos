package es.jcyl.eclap.spring.beans;

public class Bicicleta {
    private String nombre;
    public Bicicleta() {
        IO.println("Bicicleta creada");
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre;}

    @Override
    public String toString() {
        return "Bicicleta{" +
                "tipo='" + nombre + '\'' +
                '}';
    }
}

