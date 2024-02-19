package demo.designpatterns.factorypattern.concrete;

import demo.designpatterns.factorypattern.contract.VehicleSpecification;
import demo.designpatterns.factorypattern.enums.VehicleType;

public class TwoWheelerSepcification implements VehicleSpecification {
    private static final int NO_OF_WHEELS = 2;
    private float mileage;
    private VehicleType type;

    public TwoWheelerSepcification(float mileage, VehicleType type) {
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
