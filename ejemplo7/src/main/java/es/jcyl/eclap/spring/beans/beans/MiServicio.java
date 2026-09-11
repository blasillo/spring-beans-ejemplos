package es.jcyl.eclap.spring.beans.beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
@Lazy
public class MiServicio {

    public MiServicio() {
        IO.println("Creado MiServicio");
    }
}


