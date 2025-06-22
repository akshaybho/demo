package primaryannotation.motors;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import primaryannotation.vehicle.Vehicle;

@Component
@Primary
public class Bike implements Vehicle {

    @Override
    public void start() {

        System.out.println("Bike started");
    }
}
