package demo.designpatterns.factorypattern.concrete;

import demo.designpatterns.factorypattern.contract.TwoWheelerVehicle;
import demo.designpatterns.factorypattern.contract.VehicleSpecification;

public class Bike implements TwoWheelerVehicle {
    private String brandName;
    private VehicleSpecification vehicleSpecification;

    public Bike(String brandName, VehicleSpecification vehicleSpecification) {
        this.brandName = brandName;
        this.vehicleSpecification = vehicleSpecification;
    }

    @Override
    public String getBrandName() {
        return this.brandName;
    }

    @Override
    public VehicleSpecification getVehicleSpecification() {
        return this.vehicleSpecification;
    }
}
