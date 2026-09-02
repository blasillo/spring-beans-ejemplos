package es.jcyl.eclap.spring.config;

import es.jcyl.eclap.spring.beans.Vehiculo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProyectoConfig {

    @Bean
    Vehiculo vehiculo1() {
        var veh = new Vehiculo();
        veh.setMarca("Tesla");
        veh.setModelo("S3");
        veh.setColor("BLANCO");
        return veh;
    }

    @Bean
    Vehiculo vehiculo2() {
        var veh = new Vehiculo();
        veh.setMarca("Audi");
        veh.setModelo("Q3");
        veh.setColor("GRIS");
        return veh;
    }

    @Bean
    Vehiculo vehiculo3() {
        var veh = new Vehiculo();
        veh.setMarca("Ferrari");
        veh.setModelo("Testarossa");
        veh.setColor("ROJO");
        return veh;
    }

}
