package qaulifierannotation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import qaulifierannotation.vehicle.Vehicle;

@Component
public class TravelService {

    @Autowired
    @Qualifier("car")
    private Vehicle vehicle;

    public void go()
    {
        vehicle.start();
    }
}
