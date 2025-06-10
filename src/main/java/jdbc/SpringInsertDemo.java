package jdbc;

import jdbc.dao.InsertDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringInsertDemo {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringInsertDemo.class, args);

        InsertDemo id = context.getBean(InsertDemo.class);
        id.insertValues();
    }
}
