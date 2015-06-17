package de.wwu.springerrors3;

/**
 *
 * @author Konrad Fögen
 */
public class Person {

    protected String name;

    @NameResource
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person's name is " + name;
    }
}
