package demo.designpatterns.abstractfactorypattern.factory;

import demo.designpatterns.abstractfactorypattern.contract.Vehicle;
import demo.designpatterns.abstractfactorypattern.enums.NWheelerType;
import demo.designpatterns.abstractfactorypattern.contract.VehicleSpecification;

public interface VehicleFactory {
    /**
     * Create an instance of two/four/n-wheeler based on the n-wheeler type
     * along with its brand name and specifications.
     *
     * @param type a case-sensitive value, whether it's a two-wheeler such as
     *             bike or a four-wheeler such as sedan or an n-wheeler.
     * @param brandName the brand producing this vehicle.
     * @param specification specifications of this vehicle.
     *
     * @return an instance of two-wheeler vehicle with the supplied properties.
     */
    Vehicle getInstance(NWheelerType type, String brandName, VehicleSpecification specification);
}
