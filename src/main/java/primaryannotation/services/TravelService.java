package primaryannotation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import primaryannotation.vehicle.Vehicle;

@Component
public class TravelService {

    @Autowired
    private Vehicle vehicle;

    public void go()
    {
        vehicle.start();
    }
}
