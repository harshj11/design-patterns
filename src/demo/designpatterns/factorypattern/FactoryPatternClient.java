package demo.designpatterns.factorypattern;

import demo.designpatterns.factorypattern.contract.TwoWheelerVehicle;
import demo.designpatterns.factorypattern.contract.VehicleSpecification;
import demo.designpatterns.factorypattern.enums.TwoWheelerType;
import demo.designpatterns.factorypattern.enums.VehicleType;
import demo.designpatterns.factorypattern.factory.SpecificationFactory;
import demo.designpatterns.factorypattern.factory.TwoWheelerFactory;

public class FactoryPatternClient {
    public static void main(String[] args) {
        VehicleSpecification royalEnfieldSpecification = SpecificationFactory
                .getInstance(2, 30, VehicleType.PETROL);
        TwoWheelerVehicle royalEnfield = TwoWheelerFactory
                .getInstance(TwoWheelerType.BIKE, "Royal Enfield", royalEnfieldSpecification);
        royalEnfieldSpecification.display();


    }
}
