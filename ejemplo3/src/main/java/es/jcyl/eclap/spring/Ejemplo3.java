package es.jcyl.eclap.spring;

import es.jcyl.eclap.spring.beans.Vehiculo;
import es.jcyl.eclap.spring.config.ProyectoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejemplo3 {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProyectoConfig.class);
        var veh = context.getBean(Vehiculo.class);

        IO.println("Vehículo en el contexto Spring: " + veh.getMarca() + " " + veh.getModelo());

        context.close();

    }
}
