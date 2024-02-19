package demo.designpatterns.abstractfactorypattern.concrete;

import demo.designpatterns.abstractfactorypattern.contract.Vehicle;
import demo.designpatterns.abstractfactorypattern.contract.VehicleSpecification;

public class Scooty implements Vehicle {
    private String brandName;
    private VehicleSpecification vehicleSpecification;

    public Scooty(String brandName, VehicleSpecification vehicleSpecification) {
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
