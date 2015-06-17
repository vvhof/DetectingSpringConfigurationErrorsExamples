package de.viadee.kfoegen.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Konrad Fögen
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        PrinterService service = context.getBean(PrinterService.class);

        System.out.println(service);
    }
}
