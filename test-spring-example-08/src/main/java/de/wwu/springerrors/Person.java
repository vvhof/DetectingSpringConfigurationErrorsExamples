package de.wwu.springerrors;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.Scheduled;

/**
 *
 * @author Konrad Fögen 
 */
@Configurable
public class Person {

    @Scheduled
    public void doSomething() {
        
    }
}
