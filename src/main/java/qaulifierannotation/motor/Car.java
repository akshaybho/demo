package qaulifierannotation.motor;

import org.springframework.stereotype.Component;
import qaulifierannotation.vehicle.Vehicle;

@Component("car")
public class Car implements Vehicle {

    @Override
    public void start() {

        System.out.println("Car started");
    }
}
