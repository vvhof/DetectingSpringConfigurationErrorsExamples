package de.wwu.springerrors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author Konrad Fögen
 */
@Component
public class PrinterQueue {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void put(final Document document) {
        String sql = "SELECT * FROM queue;";

        int a = jdbcTemplate.update(sql);
    }
}
