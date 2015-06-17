package de.wwu.springerrors;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

/**
 *
 * @author Konrad Fögen
 */
public class Person {

    @Cacheable(value = "")
    @CachePut(value = "")
    public void soSomething() {
        
    }
}
