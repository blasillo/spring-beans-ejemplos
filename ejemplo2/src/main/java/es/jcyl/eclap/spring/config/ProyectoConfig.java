package es.jcyl.eclap.spring.config;

import es.jcyl.eclap.spring.beans.Vehiculo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProyectoConfig {

    @Bean(name = "vehiculo-tesla")
    Vehiculo vehiculo1() {
        var veh = new Vehiculo();
        veh.setMarca("Tesla");
        veh.setModelo("S3");
        veh.setColor("BLANCO");
        return veh;
    }

    @Primary
    @Bean(name = "vehiculo-audi")
    Vehiculo vehiculo2() {
        var veh = new Vehiculo();
        veh.setMarca("Audi");
        veh.setModelo("Q3");
        veh.setColor("GRIS");
        return veh;
    }

    @Bean({"vehiculo-ferrari","vehiculo-favorito"})
    @Description("Este es un bean de la clase Vehículo")
    Vehiculo vehiculo3() {
        var veh = new Vehiculo();
        veh.setMarca("Ferrari");
        veh.setModelo("Testarossa");
        veh.setColor("ROJO");
        return veh;
    }

}
