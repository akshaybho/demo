package jdbc;


import jdbc.connection.DbConnection;
import jdbc.connection.JdbcTemplateConnection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJdbcApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);

       /* DbConnection dbcon = context.getBean(DbConnection.class);
        dbcon.checkDbConnection();*/

        JdbcTemplateConnection template = context.getBean(JdbcTemplateConnection.class);
        template.checkConnection();
    }
}
