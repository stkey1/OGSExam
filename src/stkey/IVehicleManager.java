package stkey;

/**
 * This interface is createn for identifing all vehicle methods
 * @author stkey
 * @since 18.11.2022
 */

public interface IVehicleManager {
    String nameSurname();
    String dateTime();
    String[] plateMaking();
    int payment();
    int totalCharge();
    int penalty();
}
