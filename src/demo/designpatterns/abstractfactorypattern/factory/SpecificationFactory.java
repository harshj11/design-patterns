package demo.designpatterns.abstractfactorypattern.factory;

import demo.designpatterns.abstractfactorypattern.concrete.FourWheelerSepcification;
import demo.designpatterns.abstractfactorypattern.concrete.TwoWheelerSepcification;
import demo.designpatterns.abstractfactorypattern.contract.VehicleSpecification;
import demo.designpatterns.abstractfactorypattern.enums.VehicleType;

public class SpecificationFactory {
    private static final int TWO_WHEELER = 2;
    private static final int FOUR_WHEELER = 4;

    /**
     * Create vehicle specification.
     *
     * @param noOfWheels an integer to create specification for an appropriate
     *                   two/four/n-wheeler vehicle.
     * @param mileage
     * @param type
     * @return
     */
    public static VehicleSpecification getInstance(int noOfWheels,
                                                   float mileage,
                                                   VehicleType type) {
        if(noOfWheels == TWO_WHEELER)
            return new TwoWheelerSepcification(mileage, type);
        else if(noOfWheels == FOUR_WHEELER)
            return new FourWheelerSepcification(mileage, type);
        else
            throw new TypeNotPresentException(noOfWheels + " Wheeler", null);
    }
}
