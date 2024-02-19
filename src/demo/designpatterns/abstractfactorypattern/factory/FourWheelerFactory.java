package demo.designpatterns.abstractfactorypattern.factory;

import demo.designpatterns.abstractfactorypattern.concrete.Sedan;
import demo.designpatterns.abstractfactorypattern.concrete.Suv;
import demo.designpatterns.abstractfactorypattern.contract.Vehicle;
import demo.designpatterns.abstractfactorypattern.contract.VehicleSpecification;
import demo.designpatterns.abstractfactorypattern.enums.NWheelerType;

public class FourWheelerFactory implements VehicleFactory {
    private static final String SEDAN = "SEDAN";
    private static final String SUV = "SUV";

    @Override
    public Vehicle getInstance(NWheelerType type, String brandName, VehicleSpecification specification) {
        String typeValue = type.getValue();
        if(SEDAN.equals(typeValue))
            return new Sedan(brandName, specification);
        else if(SUV.equals(typeValue))
            return new Suv(brandName, specification);
        else
            throw new TypeNotPresentException(type.getValue(), null);
    }
}
