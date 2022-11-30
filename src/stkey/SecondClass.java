package stkey;

/**
 * This method is createn for minibus child from VehicleManager parents
 * @author stkey
 * @add payment,penalty, totalvehicle
 * @since 18.11.2022
 */
public class SecondClass extends VehicleManager {
    public SecondClass()
    {
        classes = "SECOND CLASS";
        type = "MINIBUS";
        payment = 30;
        penalty = 350;
        RandomVehicle rnd = new RandomVehicle();
        totalVehicle = rnd.randomVehicleBus();
    }


}
