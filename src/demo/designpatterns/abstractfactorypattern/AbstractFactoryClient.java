package demo.designpatterns.abstractfactorypattern;

import demo.designpatterns.abstractfactorypattern.contract.Vehicle;
import demo.designpatterns.abstractfactorypattern.contract.VehicleSpecification;
import demo.designpatterns.abstractfactorypattern.enums.NWheelerType;
import demo.designpatterns.abstractfactorypattern.enums.VehicleType;
import demo.designpatterns.abstractfactorypattern.factory.FourWheelerFactory;
import demo.designpatterns.abstractfactorypattern.factory.SpecificationFactory;
import demo.designpatterns.abstractfactorypattern.factory.TwoWheelerFactory;
import demo.designpatterns.abstractfactorypattern.factory.VehicleFactory;

public class AbstractFactoryClient {
    public static void main(String[] args) {

        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        VehicleSpecification royalEnfieldSpecification = SpecificationFactory
                .getInstance(2, 30, VehicleType.PETROL);
        Vehicle bullet = twoWheelerFactory
                .getInstance(NWheelerType.BIKE, "Royal Enfield", royalEnfieldSpecification);
        royalEnfieldSpecification.display();

        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        VehicleSpecification carensSpecification = SpecificationFactory
                .getInstance(4, 17, VehicleType.PETROL);
        Vehicle carens = fourWheelerFactory
                .getInstance(NWheelerType.SUV, "Kia", carensSpecification);
        carensSpecification.display();
    }
}
