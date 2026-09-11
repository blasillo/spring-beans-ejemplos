package es.jcyl.eclap.spring.beans.beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class SesionUsuario {

    private String sesionId;

    public SesionUsuario() {
        this.sesionId = UUID.randomUUID().toString();
    }

    public String getSesionId() { return this.sesionId; }
}
