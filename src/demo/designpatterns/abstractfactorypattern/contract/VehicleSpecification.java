package demo.designpatterns.abstractfactorypattern.contract;

import demo.designpatterns.abstractfactorypattern.enums.VehicleType;

public interface VehicleSpecification {

    int getWheels();
    float getMileageInKmpl();
    VehicleType getVehicleType();

    /**
     * Display specifications of a vehicle.
     */
    void display();
}
