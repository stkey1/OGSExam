package stkey;

/**
 * This method throw bug for vehicles which have not OGS
 * @author stkey
 * @throws OGSHaveNot
 * @since 29.11.2022
 */
public class ExeceptionThrow {

    public void Execption() throws OGSHaveNot {
        throw new OGSHaveNot();
    }
}
