package es.jcyl.eclap.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({RegistroBean.class})
public class ProyectoConfig {
}


