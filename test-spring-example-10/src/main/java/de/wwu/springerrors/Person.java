package de.wwu.springerrors;

import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Konrad Fögen
 */
public class Person {

    @Async
    @Transactional
    public void soSomething() {
        
    }
}
