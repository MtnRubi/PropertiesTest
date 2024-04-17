package net.unixplanet.randomcrap.propertiestest;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropTest {

    //@Value("${random.crap}") <-- this is not working, see note in application.properties
    //Also, if you have quotes around the value, you'll get quotes in the output
    @Value("${rand.crap}")
    private String crap;
    
    public PropTest() {
    }

    @PostConstruct
    public void init() {
        System.out.println("Random value: " + crap);
    }
}
