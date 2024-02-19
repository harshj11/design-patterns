package demo.designpatterns.abstractfactorypattern.factory;

import demo.designpatterns.abstractfactorypattern.concrete.Bike;
import demo.designpatterns.abstractfactorypattern.concrete.Scooty;
import demo.designpatterns.abstractfactorypattern.contract.Vehicle;
import demo.designpatterns.abstractfactorypattern.contract.VehicleSpecification;
import demo.designpatterns.abstractfactorypattern.enums.NWheelerType;

public class TwoWheelerFactory implements VehicleFactory {
    private static final String BIKE = "BIKE";
    private static final String SCOOTY = "SCOOTY";

    @Override
    public Vehicle getInstance(NWheelerType type,
                               String brandName,
                               VehicleSpecification specification) {
        String typeValue = type.getValue();
        if(BIKE.equals(typeValue))
            return new Bike(brandName, specification);
        else if(SCOOTY.equals(typeValue))
            return new Scooty(brandName, specification);
        else
            throw new TypeNotPresentException(type.getValue(), null);
    }
}
