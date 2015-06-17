package de.wwu.springerrors;

import javax.annotation.PostConstruct;
import org.springframework.scheduling.annotation.Async;

/**
 *
 * @author Konrad Fögen 
 */
public class Person {

    @Async
    @PostConstruct
    public void async() {
    }

    @Async
    public void async2() {
        
    }
    
    @PostConstruct 
    public void async3() {
        
    }
}
