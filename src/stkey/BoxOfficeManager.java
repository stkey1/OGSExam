package stkey;
/**
 * This function calculates all vehicle numbers, penalties, payments
 * @author stkey
 * @add counters for vehicle having not OGS and balance variables
 * @throws exceptionThrow
 * @since 18.11.2022
 */
import java.util.Arrays;
public class BoxOfficeManager {
    int counterHaveNotOGSCar = 0;
    int counterHaveNotBalanceCar = 0;
    int counterHaveNotOGSMinibus = 0;
    int counterHaveNotBalanceMinibus = 0;
    int counterHaveNotBus = 0;
    int counterHaveNotBalanceBus = 0;

    public void BoxOfficeManager(){

        // new objects created for all objects
        FirstClass car = new FirstClass();
        SecondClass minibus = new SecondClass();
        ThirdClass bus = new ThirdClass();

        //counters are created here
        Counter counter = new Counter();
        Admin admin = new Admin();
        counter.getPaid(car);
        counter.getPaid(minibus);
        counter.getPaid(bus);
        counter.totalPayCalculation(car);
        counter.totalPayCalculation(minibus);
        counter.totalPayCalculation(bus);

        //exception is created for any bug
        ExeceptionThrow execptionThrow = new ExeceptionThrow();

        //new array is created for otomobil objects
        String [] otomobilDizi = car.plateMaking();
        for(String wordOtomobil: otomobilDizi)
        {
            car.payment();
            if (car.balanceTemp == -1) {
                try
                {
                    execptionThrow.Execption();
                }
                catch (OGSHaveNot hata)
                {
                    System.out.print(" " + hata.getMessage());
                }
                System.out.println((Arrays.toString(new Object[]{car.nameSurname(), wordOtomobil, car.type, car.classes, "-", car.notOGS, car.penalty * 2 + " TL", car.dateTime()})));
                counterHaveNotOGSCar++;
            }
            else if (car.balance<0 ) {
                System.out.println(Arrays.toString(new Object[]{car.nameSurname(), wordOtomobil, car.type, car.classes, car.balance, car.inadequate, car.penalty + " TL", car.dateTime()}));
                counterHaveNotBalanceCar++;
            } else {
                System.out.println(Arrays.toString(new Object[]{car.nameSurname(), wordOtomobil, car.type , car.classes, car.balance + " TL", car.ok, car.dateTime()}));

            }
        }

        //new array is created for minibus objects
        String [] minibusDizi = minibus.plateMaking();
        for(String wordMinibus: minibusDizi)
        {
            minibus.payment();
            if(minibus.balanceTemp == -1)
            {
                try
                {
                    execptionThrow.Execption();
                }
                catch (OGSHaveNot hata)
                {
                    System.out.print(" " + hata.getMessage());
                }
                System.out.println(Arrays.toString(new Object[]{minibus.nameSurname(), wordMinibus, minibus.type, minibus.classes, "-", minibus.notOGS, minibus.penalty * 2 + " TL" ,minibus.dateTime()}));
                counterHaveNotOGSMinibus++;
            } else if (minibus.balance<0 ) {
                System.out.println(Arrays.toString(new Object[]{minibus.nameSurname(), wordMinibus, minibus.type, minibus.classes, minibus.balance, minibus.inadequate, minibus.penalty + " TL", minibus.dateTime()}));
                counterHaveNotBalanceMinibus++;
            }
            else {
                System.out.println(Arrays.toString(new Object[]{minibus.nameSurname(), wordMinibus, minibus.type, minibus.classes, minibus.balance + " TL", minibus.ok, minibus.dateTime()}));
            }
        }

        //new array is created for bus objects
        String [] otobusDizi = bus.plateMaking();
        for(String wordOtobus: otobusDizi)
        {
            bus.payment();
            if(bus.balanceTemp == -1)
            {
                try
                {
                    execptionThrow.Execption();
                }
                catch (OGSHaveNot hata)
                {
                    System.out.print(" " + hata.getMessage());
                }
                System.out.println(Arrays.toString(new Object[]{bus.nameSurname(), wordOtobus, bus.type, bus.classes, "-", bus.notOGS, bus.penalty * 2 + " TL", bus.dateTime()}));
                counterHaveNotBus++;
            } else if (bus.balance<0) {
                System.out.println(Arrays.toString(new Object[]{bus.nameSurname(), wordOtobus,bus.type, bus.classes, bus.balance, bus.inadequate, bus.penalty + " TL", bus.dateTime()}));
                counterHaveNotBalanceBus++;
            }
            else {
                System.out.println(Arrays.toString(new Object[]{bus.nameSurname(), wordOtobus, bus.type, bus.classes, bus.balance + " TL", bus.ok,bus.dateTime()}));
            }
        }



        System.out.println("\n" + Result.TOTALVEHICLE.s + (minibus.totalVehicle+ car.totalVehicle+ bus.totalVehicle) + " \n" + Result.REVENUE.s + admin.report(counter)+ " TL"+
                "\n" + Result.NOTOGS.s + (counterHaveNotOGSCar + counterHaveNotBus + counterHaveNotOGSMinibus) + " \n "+ Result.PENALTY.s + (counterHaveNotOGSCar * car.ceza()+ counterHaveNotOGSMinibus *minibus.ceza() + counterHaveNotBus * bus.ceza())*2 +
                "\n"+ Result.NOTBALANCE.s + (counterHaveNotBalanceCar + counterHaveNotBalanceMinibus + counterHaveNotBalanceBus) + " \n"+ Result.BALANCEPENALTY.s + (counterHaveNotBalanceCar * car.ceza()+ counterHaveNotBalanceMinibus * minibus.ceza()+ counterHaveNotBalanceBus * bus.ceza()));


        System.out.println("\n\n" + Result.ACAR.s  + car.payment + " TL" +
                "\n" + Result.AMINIBUS.s + minibus.payment + " TL" +
                "\n"+ Result.ABUS.s + bus.payment + " TL"
        );
    }

    }


