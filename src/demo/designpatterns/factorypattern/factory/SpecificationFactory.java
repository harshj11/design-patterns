package demo.designpatterns.factorypattern.factory;

import demo.designpatterns.factorypattern.concrete.TwoWheelerSepcification;
import demo.designpatterns.factorypattern.contract.VehicleSpecification;
import demo.designpatterns.factorypattern.enums.VehicleType;

public class SpecificationFactory {
    private static final int TWO_WHEELER = 2;

    /**
     * Create vehicle specification.
     *
     * @param noOfWheels an integer to create specification for an appropriate
     *                   two/four/n-wheeler vehicle
     * @param mileage
     * @param type
     * @return
     */
    public static VehicleSpecification getInstance(int noOfWheels,
                                                   float mileage,
                                                   VehicleType type) {
        switch(noOfWheels) {
            case TWO_WHEELER:
                return new TwoWheelerSepcification(mileage, type);
            default:
                throw new TypeNotPresentException(noOfWheels +
                    " Wheeler", null);
        }
    }
}
