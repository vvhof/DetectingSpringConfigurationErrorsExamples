package de.wwu.springerrors;

import javax.annotation.PostConstruct;
import org.springframework.scheduling.annotation.Async;

/**
 *
 * @author Konrad Fögen
 */
@Async
public class Lecture {
    @PostConstruct
    public void async() {
    }

    public void async2() {
        
    }    
}
