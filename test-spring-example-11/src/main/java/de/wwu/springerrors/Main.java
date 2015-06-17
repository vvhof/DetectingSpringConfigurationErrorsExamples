package de.wwu.springerrors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Konrad Fögen
 */
public class Main {

    public static void main(final String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        final PrinterQueue queue = context.getBean(PrinterQueue.class);
        queue.put(null);        
    }
}
