package src;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 08/10/2021
 */

public class Hello {
    public static void main(String[] args) {

       Hello.staticX();

       Hello objekt = new Hello();
       objekt.x();
    }

    static void staticX() {
        System.out.println("Jeg er static");
    }

    void x() {
        System.out.println("Jeg er ikke static");
    }

}
