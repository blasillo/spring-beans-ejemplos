package es.jcyl.eclap.spring;

import es.jcyl.eclap.spring.beans.Coche;
import es.jcyl.eclap.spring.beans.Motor;
import es.jcyl.eclap.spring.beans.Persona;
import es.jcyl.eclap.spring.beans.Vehiculo;
import es.jcyl.eclap.spring.config.ProyectoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejemplo4 {
    static void main() {

        var context = new AnnotationConfigApplicationContext(ProyectoConfig.class);
        var persona = context.getBean(Persona.class);
        var vehiculo = context.getBean(Vehiculo.class);

        IO.println("El persona es: " + persona.getNombre());
        IO.println("El vehículo es: " + vehiculo.getMarca());
        IO.println("El vehículo que pertenece a la persona es: " + persona.getVehiculo().getMarca() + " " + persona.getVehiculo().getModelo());


        /*
        var coche = context.getBean(Coche.class);
        var motor = context.getBean(Motor.class);
        IO.println("Coche del contexto Spring: " + coche.getNombre() );
        IO.println("Motor del contexto Spring: " + motor.getMotor() );
        IO.println("Motor instalado en el coche: " + coche.getMotor() );
        */

    }
}
