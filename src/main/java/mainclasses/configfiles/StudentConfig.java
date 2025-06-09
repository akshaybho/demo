package mainclasses.configfiles;

import classesonly.Address;
import classesonly.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    Address createAddress()
    {
        Address adr = new Address();

        adr.setCity("Solapur");
        adr.setHouseNo(810);

        return adr;
    }

    @Bean
     Student createObj2()
    {
        Student std = new Student();

        std.setName("Ashish");
        std.setRollNo(102);
        std.setAddress(createAddress());

        return std;
    }
}
