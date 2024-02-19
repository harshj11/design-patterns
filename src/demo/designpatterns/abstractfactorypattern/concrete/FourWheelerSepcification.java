package demo.designpatterns.abstractfactorypattern.concrete;

import demo.designpatterns.abstractfactorypattern.contract.VehicleSpecification;
import demo.designpatterns.abstractfactorypattern.enums.VehicleType;

public class FourWheelerSepcification implements VehicleSpecification {
    private static final int NO_OF_WHEELS = 4;
    private float mileage;
    private VehicleType type;

    public FourWheelerSepcification(float mileage, VehicleType type) {
        this.mileage = mileage;
        this.type = type;
    }

    @Override
    public int getWheels() {
        return NO_OF_WHEELS;
    }

    @Override
    public float getMileageInKmpl() {
        return this.mileage;
    }

    @Override
    public VehicleType getVehicleType() {
        return this.type;
    }

    @Override
    public void display() {
        System.out.println(
                "VehicleBuilder Specifications:\n" +
                        "No Of Wheels: " + NO_OF_WHEELS + "\n" +
                        "Mileage in KMPL: " + this.mileage + "\n" +
                        "VehicleBuilder type: " + this.type
        );

    }
}