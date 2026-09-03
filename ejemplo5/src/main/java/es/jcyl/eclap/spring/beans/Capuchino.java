package es.jcyl.eclap.spring.beans;

import org.springframework.stereotype.Component;

@Component("capuchino")
public class Capuchino implements Cafe{

    @Override
    public String hacerCafe() {
        return "Café Capuchino";
    }
}
