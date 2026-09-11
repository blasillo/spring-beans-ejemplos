package es.jcyl.eclap.spring;

import es.jcyl.eclap.spring.beans.beans.MiServicio;
import es.jcyl.eclap.spring.beans.beans.SesionUsuario;
import es.jcyl.eclap.spring.config.ProyectoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejemplo7 {
    static void main() {

        var context = new AnnotationConfigApplicationContext(ProyectoConfig.class);

        var srv1 = context.getBean(MiServicio.class);
        var srv2 = context.getBean(MiServicio.class);

        IO.println(" ====== SINGLETON ======");
        IO.println( srv1.hashCode());
        IO.println( srv2.hashCode());

        IO.println(" ====== PROTOTIPO  ======");
        var user1 = context.getBean(SesionUsuario.class);
        var user2 = context.getBean(SesionUsuario.class);
        IO.println( user1.hashCode());
        IO.println( user2.hashCode());
        IO.println( "Sesión usuario 1 :" + user1.getSesionId());
        IO.println( "Sesión usuario 2 :" + user2.getSesionId());

    }
}
