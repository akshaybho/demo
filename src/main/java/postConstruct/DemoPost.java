package postConstruct;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import postConstruct.beans.Student;

@SpringBootApplication
public class DemoPost {

    @Autowired
    private Student std;
    public static void main(String[] args) {

        SpringApplication.run(DemoPost.class, args);

    }

    @PostConstruct
    public void m1()
    {
        std.display();
    }

}
