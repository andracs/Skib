package src;

import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 07/10/2021
 */

public class Problemn {

    public static void main(String[] args) {
        System.out.println("hej");
        Scanner s = new Scanner(System.in);
        while (!s.hasNextInt()){
            s.next();
            System.out.println("Forkert, skriv en int");
        }
    }
}
