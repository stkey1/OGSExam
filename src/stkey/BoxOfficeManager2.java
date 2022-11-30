package stkey;
/**
 * This second function calculates all vehicle numbers, penalties, payments
 * In addition to this, method supplying object diffinction
 * @author stkey
 * @add counters for vehicle having not OGS and balance variables
 * @throws exceptionThrow
 * @since 18.11.2022
 */
import java.util.Arrays;
public class BoxOfficeManager2 {
    int counterHaveNotOGSCar = 0;
    int counterHaveNotBalanceCar = 0;
    int counterHaveNotOGSMinibus = 0;
    int counterHaveNotBalanceMinibus = 0;
    int counterHaveNotBus = 0;
    int counterHaveNotBalanceBus = 0;

    public void BoxOfficeManager2(Object object){

        // new objects created for all objects
        FirstClass car = new FirstClass();
        SecondClass minibus = new SecondClass();
        ThirdClass bus = new ThirdClass();

        Counter counter = new Counter();
        Admin admin = new Admin();
        ExeceptionThrow execptionThrow = new ExeceptionThrow();

        if(object instanceof FirstClass){
            counter.getPaid(car);
            counter.totalPayCalculation(car);

            String [] otomobilDizi = car.plateMaking();
            for(String wordOtomobil: otomobilDizi)
            {
                car.payment();
                if (car.balanceTemp == -1) {
                    System.out.println(Arrays.toString(new Object[]{car.nameSurname(), wordOtomobil, car.type, car.classes, "-", car.notOGS, minibus.penalty * 2 + " TL" ,minibus.dateTime()}));

                }
                else if (car.balance<0) {
                    System.out.println(Arrays.toString(new Object[]{car.nameSurname(), wordOtomobil, car.type, car.classes, car.balance, car.inadequate, car.penalty + " TL", car.dateTime()}));
                    counterHaveNotBalanceCar++;
                } else {
                    System.out.println(Arrays.toString(new Object[]{car.nameSurname(), wordOtomobil, car.type, car.classes, car.balance + " TL", car.ok, car.dateTime()}));

                }
            }
        } else if(object instanceof SecondClass){

            counter.getPaid(minibus);
            counter.totalPayCalculation(minibus);

            String [] minibusDizi = minibus.plateMaking();
            for(String wordMinibus: minibusDizi)
            {
                minibus.payment();
                if(minibus.balanceTemp == -1)
                {
                    System.out.println(Arrays.toString(new Object[]{minibus.nameSurname(), wordMinibus, minibus.type, minibus.classes, "-", minibus.notOGS, minibus.penalty * 2 + " TL" ,minibus.dateTime()}));
                    counterHaveNotOGSMinibus++;
                } else if (minibus.balance<0) {
                    System.out.println(Arrays.toString(new Object[]{minibus.nameSurname(), wordMinibus, minibus.type, minibus.classes, minibus.balance, minibus.inadequate, minibus.penalty + " TL", minibus.dateTime()}));
                    counterHaveNotBalanceMinibus++;
                }
                else {
                    System.out.println(Arrays.toString(new Object[]{minibus.nameSurname(), wordMinibus, minibus.type, minibus.classes, minibus.balance + " TL", minibus.ok, minibus.dateTime()}));
                }
            }
        } else if(object instanceof ThirdClass){
            counter.getPaid(bus);
            counter.totalPayCalculation(bus);

            String [] otobusDizi = bus.plateMaking();
            for(String wordOtobus: otobusDizi)
            {
                bus.payment();
                if(bus.balanceTemp == -1)
                {
                    System.out.println(Arrays.toString(new Object[]{bus.nameSurname(), wordOtobus, bus.type, bus.classes, "-", bus.notOGS, bus.penalty * 2 + " TL", bus.dateTime()}));
                    counterHaveNotBus++;
                } else if (bus.balance<0) {
                    System.out.println(Arrays.toString(new Object[]{bus.nameSurname(), wordOtobus, bus.type, bus.classes, bus.balance,bus.inadequate, bus.penalty + " TL", bus.dateTime()}));
                    counterHaveNotBalanceBus++;
                }
                else {
                    System.out.println(Arrays.toString(new Object[]{bus.nameSurname(), wordOtobus, bus.type, bus.classes, bus.balance + " TL", bus.ok ,bus.dateTime()}));
                }
            }
        } else{
            try
            {
                execptionThrow.Execption();
            }
            catch (OGSHaveNot hata)
            {
                System.out.print(" " + hata.getMessage());
            }

            System.out.println("-----------------------------------------");
        }

        System.out.println("\n" + Result.TOTALVEHICLE.s + (minibus.totalVehicle+ car.totalVehicle+ bus.totalVehicle) + " \n" + Result.REVENUE.s + admin.report(counter)+ " TL"+
                "\n" + Result.NOTOGS.s + (counterHaveNotOGSCar + counterHaveNotBus + counterHaveNotOGSMinibus) + " \n "+ Result.PENALTY.s + (counterHaveNotOGSCar * car.penalty()+ counterHaveNotOGSMinibus *minibus.penalty() + counterHaveNotBus * bus.penalty())*2 +
                "\n"+ Result.NOTBALANCE.s + (counterHaveNotBalanceCar + counterHaveNotBalanceMinibus + counterHaveNotBalanceBus) + " \n"+ Result.BALANCEPENALTY.s + (counterHaveNotBalanceCar * car.penalty()+ counterHaveNotBalanceMinibus * minibus.penalty()+ counterHaveNotBalanceBus * bus.penalty()));


        System.out.println("\n\n" + Result.ACAR.s  + car.payment + " TL" +
                "\n" + Result.AMINIBUS.s + minibus.payment + " TL" +
                "\n"+ Result.ABUS.s + bus.payment + " TL"
        );
    }

}


