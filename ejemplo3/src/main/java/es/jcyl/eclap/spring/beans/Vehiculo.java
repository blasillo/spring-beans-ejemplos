package es.jcyl.eclap.spring.beans;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehiculo {

    private String marca;
    private String modelo;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

/*
    @PostConstruct
    public void initializa() {
        this.marca = "Cupra";
        this.modelo = "Terramar";
        this.color = "AZUL";
    }

    @PreDestroy
    public void destruye() {
        IO.println("[*] Eliminando Bean");
    }
*/
}