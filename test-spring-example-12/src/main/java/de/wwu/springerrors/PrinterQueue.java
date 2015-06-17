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
        String sql = "SELECT * FROM queue WHERE a like ?";

        if (true) {
            sql = "SELECT * FROM queue WHERE a like ? AND b like ?";
        }

        int a = jdbcTemplate.update(sql);
    }
}
