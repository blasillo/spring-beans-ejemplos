package es.jcyl.eclap.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cafeteria {

    @Qualifier("espresso")
    @Autowired
    private Cafe cafe;

    //@Autowired
    public Cafeteria( /*@Qualifier("capuchino") Cafe cafe*/) {
        //this.cafe = cafe;
    }

    public Cafe getCafe() {
        return cafe;
    }

}
