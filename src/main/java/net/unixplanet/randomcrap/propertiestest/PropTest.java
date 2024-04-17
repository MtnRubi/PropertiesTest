package net.unixplanet.randomcrap.propertiestest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropTest {

    @Value("${random.crap}")
    private String crap;

    public PropTest() {
        System.out.println("Random value: " + crap);
    }
}
