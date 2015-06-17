package de.wwu.springerrors;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author Konrad Fögen
 */
@Configuration
public class SpringConfig {

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Person getPerson() {
        if(true) {
            return new Person();
        } else {
            return new Student();
        }
    }
}
