package demo.designpatterns.abstractfactorypattern.concrete;

import demo.designpatterns.abstractfactorypattern.contract.Vehicle;
import demo.designpatterns.abstractfactorypattern.contract.VehicleSpecification;

public class Suv implements Vehicle {
    private String brandName;
    private VehicleSpecification vehicleSpecification;

    public Suv(String brandName, VehicleSpecification vehicleSpecification) {
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
