package stkey;

/**
 * Create new object from IVehicleManager interface
 * This method created for countering vehicles numbers
 * and creating new array via vehicles numbers which have OGS
 * @author stkey
 * @since 29.11.2022
 */
public class Counter {
    IVehicleManager[] array;
    int ogs;
    public Counter()
    {
        array = new IVehicleManager[20];
        ogs = 0;
    }
    public void getPaid(IVehicleManager ogsIsHave)
    {
        array[ogs++] = ogsIsHave;
        ogsIsHave.payment();
    }
    public void totalPayCalculation(IVehicleManager ogsIsHave)
    {
        array[ogs++] = ogsIsHave;
        ogsIsHave.totalCharge();
    }
}
