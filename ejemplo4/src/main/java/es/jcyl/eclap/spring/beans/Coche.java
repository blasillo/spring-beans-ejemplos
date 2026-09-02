package es.jcyl.eclap.spring.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Coche {

    private String nombre;
    //@Autowired
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

    @PostConstruct
    public void initialize() {
        this.nombre = "Kia";
    }

    @Override
    public String toString() {
        return "Coche{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

}
