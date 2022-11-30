package stkey;

/**
 * This method is createn for bus child from VehicleManager parents
 * @author stkey
 * @add payment,penalty, totalvehicle
 * @since 18.11.2022
 */
public class ThirdClass extends VehicleManager {

    public ThirdClass()
    {
        classes = "THIRD CLASS";
        type = "BUS";
        payment = 35;
        penalty = 400;
        RandomVehicle rnd = new RandomVehicle();
        totalVehicle = rnd.randomVehicleMinubus();
    }
}
