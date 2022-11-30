package stkey;

/**
 * This method is createn for managing vehicles and is setted from IVehicleManager Interface's methods
 * @author stkey
 * @components balance, balanceTemp, totalVehicle, totalpayment,payment
 * @return datetime1, plateArray, totalpayment, penalty
 * @since 29.11.2022
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class VehicleManager implements IVehicleManager {
    int balance;
    int balanceTemp;
    int payment;
    int totalVehicle;
    int totalpayment;
    int penalty;
    String plateString;
    String dateTime1, type, classes;
    String ok = "ADEQUATE BALANCE";
    String inadequate = "INADEQUATE BALANCE";
    String notOGS = "There is Not OGS";


    /**
     * @return random a Name
     */
    @Override
    public String nameSurname() {
        Random random = new Random();
        List<String> list=new ArrayList<>();
        list.add("MAHMUT	");
        list.add("EMEL	");
        list.add("ÖZNUR	");
        list.add("SONGÜL	");
        list.add("RESA	");
        list.add("GAMZE	");
        list.add("ÜMİT	");
        list.add("DENİZ	");
        list.add("MUAMMER MÜSLİM	");
        list.add("ÖMER FARUK	");
        list.add("TUĞÇE	");
        list.add("VELİ ENES	");
        list.add("ZAHİDE	");
        list.add("NURETTİN İREM	");
        list.add("SEDAT	");
        list.add("REMZİYE	");
        list.add("SİBEL	");
        list.add("İLKNUR	");
        list.add("YASEMİN	");
        list.add("AYLİN	");
        list.add("CEM	");
        return list.get(random.nextInt(20));
    }

    /**
     * @return dateTime1
     */

    @Override
    public String dateTime() {
        Date date = new Date();
        dateTime1 = date.toString();
        return dateTime1;
    }

    /**
     * @return plateArray
     */
    @Override
    public String[] plateMaking() {
        Random random = new Random();
        String alphabet = "ABCDEFGHIJKLMNOPRSTUVYZ";
        String [] plateArray = new String[totalVehicle];
        for (int i = 0; i < totalVehicle; i++) {
            plateString =random.nextInt(99) + " "
                    + alphabet.charAt(random.nextInt(alphabet.length())) + alphabet.charAt(random.nextInt(alphabet.length()))
                    + " " + random.nextInt(999);
            plateArray[i] = plateString;
        }
        return plateArray;
    }

    /**
     * @return balance
     */
    @Override
    public int payment() {
        Random r = new Random();
        int low = -1;
        int high = 100;
        balanceTemp = r.nextInt(high-low) + low;
        balance = balanceTemp - payment;
        return balance;
    }

    /**
     * @return totalpayment
     */

    @Override
    public int totalCharge() {
        totalpayment = totalVehicle*payment;
        return totalpayment;
    }

    /**
     * @return penalty
     */
    @Override
    public int ceza() {
        return penalty;
    }
}
