package primaryannotation.motors;

import org.springframework.stereotype.Component;
import primaryannotation.vehicle.Vehicle;

@Component
public class Car implements Vehicle {

    @Override
    public void start() {

        System.out.println("Car started");
    }
}
