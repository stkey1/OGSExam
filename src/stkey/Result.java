package stkey;

/**
 * This method is enum for shorten sout
 * @author stkey
 * @since 30.11.2022
 */
public enum Result {
    TOTALVEHICLE("Total numbers of vehicles: "),
    REVENUE("Revenues for vehicles: "),
    NOTOGS("Vehicle Having Not OGS: "),
    PENALTY("Penalty Fee because of Having Not OGS: "),
    NOTBALANCE("Vehicle which has not Balance: "),
    BALANCEPENALTY("Penalty Fee because of Having Not inadequate Balance: "),
    ACAR("Payment for a car: "),
    AMINIBUS("Payment for a minibus: "),
    ABUS("Payment for a bus: ");
    String s;
    Result(String s) {
        this.s = s;
    }
}
