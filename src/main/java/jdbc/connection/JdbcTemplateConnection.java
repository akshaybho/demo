package jdbc.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;

@Component
public class JdbcTemplateConnection {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void checkConnection() {
        try {
            DataSource dataSource = jdbcTemplate.getDataSource();

            Connection con = dataSource.getConnection();

            if (con != null) {
                System.out.println("CONNECTION CREATED SUCCESSFULLY");
            } else {
                System.out.println("CONNECTION FAIL");
            }
        } catch (Exception e) {

            System.out.println("CONNECTION FAIL");
            e.printStackTrace();

        }
    }
}
