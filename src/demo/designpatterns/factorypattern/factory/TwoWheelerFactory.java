package demo.designpatterns.factorypattern.factory;

import demo.designpatterns.factorypattern.concrete.Bike;
import demo.designpatterns.factorypattern.concrete.Scooty;
import demo.designpatterns.factorypattern.contract.TwoWheelerVehicle;
import demo.designpatterns.factorypattern.contract.VehicleSpecification;
import demo.designpatterns.factorypattern.enums.TwoWheelerType;

public class TwoWheelerFactory {
    private static final String BIKE = "BIKE";
    private static final String SCOOTY = "SCOOTY";

    /**
     * Create an instance of two-wheeler based on the two-wheeler type
     * along with it's brand name and specifications.
     *
     * @param twoWheelerType case sensitive value, whether it's bike, scooty, etc.
     * @param brandName the brand producing this vehicle.
     * @param vehicleSpecification specifications of this vehicle
     *
     * @return an instance of two-wheeler vehicle with the supplied properties.
     */
    public static TwoWheelerVehicle getInstance(TwoWheelerType twoWheelerType,
                                                String brandName,
                                                VehicleSpecification vehicleSpecification) {
        switch (twoWheelerType.getValue()) {
            case BIKE:
                return new Bike(brandName, vehicleSpecification);
            case SCOOTY:
                return new Scooty(brandName, vehicleSpecification);
            default:
                throw new TypeNotPresentException(twoWheelerType.getValue(), null);
        }
    }
}
