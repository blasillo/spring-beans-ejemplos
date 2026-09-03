package es.jcyl.eclap.spring;

import es.jcyl.eclap.spring.beans.Cafe;
import es.jcyl.eclap.spring.beans.Cafeteria;
import es.jcyl.eclap.spring.config.ProyectoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ejemplo5 {

    static void main() {

        var context = new AnnotationConfigApplicationContext(ProyectoConfig.class);

        var cafeteria = context.getBean("cafeteria", Cafeteria.class);

        Cafe cafe = cafeteria.getCafe();

        IO.println( "[*] Preparando: " + cafe.hacerCafe());

    }


}
