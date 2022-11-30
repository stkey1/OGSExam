package stkey;

import java.util.Random;

/**
 * This method is crate new random object for car,bus and minibus
 * version 0.0.1
 * @author stkey
 * @return rnd_int1,rnd_int2,rnd_int3
 * @since 29.11.2022
 */
public class RandomVehicle {
    /**
     *creating for car random object
     * @return rnd_int1
     */
    public int randomVehicleCar()
    {
        Random rnd = new Random();
        int rnd_int1 = rnd.nextInt(40);
        return rnd_int1;
    }

    /**
     *creating for minibus random object
     * @return rnd_int1
     */
    public int randomVehicleMinubus()
    {
        Random rnd = new Random();
        int rnd_int2 = rnd.nextInt(15);
        return rnd_int2;
    }

    /**
     * creating for bus random object
     * @return rnd_int1
     */
    public int randomVehicleBus()
    {
        Random rnd = new Random();
        int rnd_int3 = rnd.nextInt(7);
        return rnd_int3;
    }
}