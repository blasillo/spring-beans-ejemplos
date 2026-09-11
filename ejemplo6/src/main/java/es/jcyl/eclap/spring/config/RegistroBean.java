package es.jcyl.eclap.spring.config;


import es.jcyl.eclap.spring.beans.Bicicleta;
import es.jcyl.eclap.spring.beans.Coche;
import es.jcyl.eclap.spring.beans.Motor;
import org.springframework.beans.factory.BeanRegistrar;
import org.springframework.beans.factory.BeanRegistry;
import org.springframework.core.env.Environment;

import java.util.Random;

public class RegistroBean implements BeanRegistrar {

    @Override
    public void register(BeanRegistry registry, Environment env) {

        int num = new Random().nextInt(100);   // Generate random number
        IO.println("Numero generado = " + num);

        if (num % 2 == 0) { // si par
            IO.println("Registrando motor y coche");
            registry.registerBean("motor", Motor.class, spec -> spec.supplier(
                    context -> {
                        Motor motor = new Motor();
                        motor.setMotor("V8 Turbo");
                        return motor;
                    }
            ));
            registry.registerBean("coche", Coche.class, spec -> spec.supplier(
                    context -> {
                        Coche coche = new Coche(context.bean(Motor.class));
                        coche.setNombre("Deportivo");
                        return coche;
                    }
            ));
        }
        else {  // si numero impar
            IO.println("Registrando bicicleta");
            registry.registerBean("bicicleta", Bicicleta.class, spec -> spec.supplier(
                    context -> {
                        Bicicleta bici = new Bicicleta();
                        bici.setNombre("Bicicleta eléctrica");
                        return bici;
                    }
            ));
        }

    }
}
