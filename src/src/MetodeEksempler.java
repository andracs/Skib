package src;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 08/10/2021
 */

public class MetodeEksempler {
    public static void main(String[] args) {
        printX("Hej");
        String x = returnX();
        System.out.println(x);
    }

    private static String returnX() {
        return "Hej2";
    }

    private static void printX(String x) {
        System.out.println(x);
    }
}
