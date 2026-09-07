package es.jcyl.eclap.spring.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;


public class Motor {
    private String motor;

    public Motor() {
        IO.println("Iniciando Motor bean");
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

}
