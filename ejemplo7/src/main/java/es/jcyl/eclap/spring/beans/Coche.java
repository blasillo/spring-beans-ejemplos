package es.jcyl.eclap.spring.beans;

public class Coche {

    private String nombre;
    private Motor motor;

    public Coche(Motor motor) {
        this.motor = motor;
        IO.println("Iniciando Coche bean");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

}
