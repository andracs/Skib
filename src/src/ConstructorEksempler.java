package src;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 08/10/2021
 */

public class ConstructorEksempler {

    int nummer = 8;
    int nummer2 = 10;
    String navn = "Hest!!!!";

    ConstructorEksempler(){
        System.out.println("Et objekt er lavet: " + this);
    }

    ConstructorEksempler(int nummer) {
        this.nummer = nummer;
    }


    ConstructorEksempler(String navn) {
        this.navn = navn;
    }

    public static void main(String[] args) {
        ConstructorEksempler x = new ConstructorEksempler();
        ConstructorEksempler x2 = new ConstructorEksempler(15);
        ConstructorEksempler x3 = new ConstructorEksempler();


    }
}
