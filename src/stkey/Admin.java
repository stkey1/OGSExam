package stkey;

/**
 * This method is for calculating and reporting total payment
 * @author stkey
 * @since 29.11.2022
 */
public class Admin {
    public int report(Counter g)
    {
        int total = 0 ;
        for ( int i = 0 ;i<g.ogs;i++){
            total += (((VehicleManager)g.array[i]).totalpayment);
        }
        return total;
    }
}
