package de.viadee.kfoegen.example2;

import javax.annotation.Resource;

/**
 *
 * @author Konrad Fögen
 */
public class Person {

    protected String name;

    @Resource(name = "defaultName")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person's name is " + name;
    }
}
