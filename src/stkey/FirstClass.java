package stkey;

/**
 * This method is createn for otomobil child from VehicleManager parents
 * @author stkey
 * @add payment,penalty, totalvehicle
 * @since 18.11.2022
 */
public class FirstClass extends VehicleManager {


    public FirstClass()
    {
        classes = "FIRST CLASS";
        type = "OTOMOBİL";
        payment = 25;
        penalty = 250;
        RandomVehicle rnd = new RandomVehicle();
        totalVehicle = rnd.randomVehicleCar();
    }
}
