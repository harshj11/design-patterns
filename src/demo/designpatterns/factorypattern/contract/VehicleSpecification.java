package demo.designpatterns.factorypattern.contract;

import demo.designpatterns.factorypattern.enums.VehicleType;

public interface VehicleSpecification {

    int getWheels();
    float getMileageInKmpl();
    VehicleType getVehicleType();

    /**
     * Display specifications of a vehicle.
     */
    void display();
}
