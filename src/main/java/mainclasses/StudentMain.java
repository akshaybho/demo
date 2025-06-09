package mainclasses;

import classesonly.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:resources/studentapplication.xml")
public class StudentMain {

    public static void main(String[] args) {

        System.out.println("======================================================");
        ApplicationContext context = SpringApplication.run(StudentMain.class, args);

        Student std2 = (Student)context.getBean("createObj2");
        std2.display();

        System.out.println("=======================================================");

        Student std3 = (Student)context.getBean("firstObj");
        std3.display();

        System.out.println("========================================================");

        Student std4 = (Student)context.getBean("secondObj");
        std4.display();
    }
}
