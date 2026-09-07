package es.jcyl.eclap.spring;

import es.jcyl.eclap.spring.beans.Bicicleta;
import es.jcyl.eclap.spring.beans.Coche;
import es.jcyl.eclap.spring.beans.Motor;
import es.jcyl.eclap.spring.config.ProyectoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejemplo6 {
    static void main() {

        var context = new AnnotationConfigApplicationContext(ProyectoConfig.class);

        if (context.containsBean("motor")) {
            Motor motor = context.getBean(Motor.class);
            IO.println("Motor: " + motor.getMotor() );
        }
        if (context.containsBean("coche")) {
            Coche v = context.getBean(Coche.class);
            IO.println("Coche tipo = " + v.getNombre());
            IO.println("      motor = " + v .getMotor().getMotor());
        }
        if (context.containsBean("bicicleta")) {
            Bicicleta b = context.getBean(Bicicleta.class);
            IO.println("Bicicleta tipo  = " + b.getNombre());

        }



    }
}
