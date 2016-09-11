package helpers;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;
import java.util.UUID;

/**
 * Created by user on 25.07.2016.
 */
public class HelperRandomClass {

    public static String getRandomString() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(20);
    }

    public static String getRandomEmail() {
        return getRandomString() + "@mail.ru";
    }

    public static String getPassword() {
        return "P" + getRandomString();
    }


    public static int randomNumber(int length){
        return new Random().nextInt(length);
    }

    public static String getRandomName(){

        return RandomStringUtils.randomAlphabetic(10);
    }

    public static String getRandomDay(){
        int day = new Random().nextInt(27) + 1;
        return Integer.toString(day);
    }



    public static String getRandomMonth(){
        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August",
                               "September", "October", "November", "December"};
        return months[new Random().nextInt(months.length)];
    }

    public static String getRandomState(){

        String[] states = new String[]{"Illinois","Alabama","California","Iowa","Nevada","Texas","New Jersey"};

        return states[new Random().nextInt(states.length)];
    }

    public static String getRandomYear(){
        int year = new Random().nextInt(30) + 1980;

        return Integer.toString(year);
    }

    public static String getRandomPostCode(){

        return RandomStringUtils.randomNumeric(5);
    }

    public static String getRandomPhoneNumber(){

        return  RandomStringUtils.randomNumeric(9);
    }
}
