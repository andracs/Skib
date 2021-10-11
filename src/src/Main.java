package src;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 07/10/2021
 */

public class Main {

    public static void main(String[] args) {
        Bil tesla = new Bil();
        tesla.motor.setTænding(true);
        System.out.println(tesla.toString());

        //System.out.println("Denne bil er en " + Bil.type);

        Jacob jacob = new Jacob(3);
        jacob.setAge(12);

    }
}
