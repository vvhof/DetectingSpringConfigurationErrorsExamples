package de.wwu.springerrors1;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author Konrad Fögen
 */
public class Person {

    @Autowired
    @Qualifier("konrad")
    @Resource(name = "defaultName")
    private String name;

    @Override
    public String toString() {
        return "Person's name is " + name;
    }
}
