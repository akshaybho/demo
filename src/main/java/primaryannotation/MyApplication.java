package primaryannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import primaryannotation.services.TravelService;

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(MyApplication.class, args);

        TravelService travel = context.getBean(TravelService.class);

        travel.go();
    }


}
