package de.viadee.kfoegen.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author Konrad Fögen
 */
public class Student extends Person {

    @Autowired
    @Qualifier("konrad")
    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
