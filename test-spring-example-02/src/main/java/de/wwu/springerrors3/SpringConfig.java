package de.wwu.springerrors3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Konrad Fögen
 */
@Configuration
public class SpringConfig {

    @Bean
    public Person getPerson() {
        return new Person();
    }

    @Bean
    public String defaultName() {
        return "unknown";
    }

    @Bean
    public String konrad() {
        return "konrad";
    }
}
