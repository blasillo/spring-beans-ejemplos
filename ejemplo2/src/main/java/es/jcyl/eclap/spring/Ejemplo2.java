package es.jcyl.eclap.spring;

import es.jcyl.eclap.spring.beans.Vehiculo;
import es.jcyl.eclap.spring.config.ProyectoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejemplo2 {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProyectoConfig.class);

        //var veh = context.getBean(Vehiculo.class);
        var veh1 = context.getBean("vehiculo-tesla", Vehiculo.class);
        IO.println("Vehículo 1 (del contexto) marca: " + veh1.getMarca());

        var veh2 = (Vehiculo) context.getBean("vehiculo-favorito");
        IO.println("Vehículo 2 (del contexto) marca: " + veh2.getMarca());

        var veh3 = context.getBean(Vehiculo.class);
        IO.println("Vehículo 3 (del contexto) marca: " + veh3.getMarca());
    }
}
