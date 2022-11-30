package stkey;
/**
 * OGS software system is created for exam
 * @version 0.0.1
 * @author stkey
 * @since 30.11.2022
 */
public class Main {
    private static java.lang.Object Object;

    /**
     * @param args
     */
    public static void main(String[] args) {
        Object object;
        //Created BoxOfficeManager' object
        BoxOfficeManager boxOfficeManager = new BoxOfficeManager();
        boxOfficeManager.BoxOfficeManager();
        //For test, empty object is created from EmptyClass
        FirstClass car = new FirstClass();
        //Created BoxOfficeManager2's object
        BoxOfficeManager2 boxOfficeManager2 = new BoxOfficeManager2();
        boxOfficeManager2.BoxOfficeManager2(Object);
        boxOfficeManager2.BoxOfficeManager2(car);
    }
}
