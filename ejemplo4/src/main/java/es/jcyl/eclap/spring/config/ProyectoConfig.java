package es.jcyl.eclap.spring.config;

import es.jcyl.eclap.spring.beans.Persona;
import es.jcyl.eclap.spring.beans.Vehiculo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"es.jcyl.eclap.spring.beans"})
public class ProyectoConfig {

    @Bean
    Vehiculo vehiculo() {
        Vehiculo veh = new Vehiculo();
        veh.setMarca("Toyota");
        veh.setModelo("Yaris");
        veh.setColor("NEGRO");
        return veh;
    }


    @Bean
    Persona persona(Vehiculo veh) {
        Persona persona = new Persona();
        persona.setNombre("Lucía");
        persona.setVehiculo(veh);
        return persona;
    }


    /*
    @Bean
    Persona persona() {
        Persona persona = new Persona();
        persona.setNombre("Antonio");
        persona.setVehiculo(vehiculo);
        return persona;
    }
     */
}
