package de.viadee.kfoegen.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Konrad Fögen
 */
@Configuration
@EnableTransactionManagement
public class SpringConfig {

    @Bean
    public PrinterService printerService() {
        return new PrinterService();
    }
    
    public PlatformTransactionManager transactionManager() {
        return null;
    }
}
