package qaulifierannotation.motor;

import org.springframework.stereotype.Component;
import qaulifierannotation.vehicle.Vehicle;

@Component("bike")
public class Bike implements Vehicle {

    @Override
    public void start() {

        System.out.println("Bike started");
    }
}
