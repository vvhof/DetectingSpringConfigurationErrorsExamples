package de.viadee.kfoegen.example2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Konrad Fögen
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Person person = context.getBean(Person.class);

        System.out.println(person);
        context.close();
    }
}
