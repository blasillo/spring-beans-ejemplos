package es.jcyl.eclap.spring.beans;

import org.springframework.stereotype.Component;

@Component("espresso")
public class Espresso implements Cafe {

    @Override
    public String hacerCafe() {
        return "Café solo espresso";
    }
}
