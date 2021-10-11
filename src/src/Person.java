package src;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 07/10/2021
 */

public class Person {

    public String navn = "";
    public static String skole = "Zealand";

    public  void y() {
        System.out.println("Hej " + navn + " " + Person.skole);
    }

    public static void main(String[] args) {
        Person martin = new Person();
        martin.navn = "Martin";
        Person tim = new Person();
        tim.navn = "Tim";
        martin.y();
        tim.y();
    }
}
