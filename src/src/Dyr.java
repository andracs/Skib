package src;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 08/10/2021
 */

public class Dyr {

    int antalBen = 8;
    double kropsTemperatur = 3.4;
    boolean levende = false;
    String navn = "Hector";

    // TODO lav flest mulige contructors (der er over 50 muligheder)

    Dyr() {}

    Dyr(int antalBen) {
        this.antalBen = antalBen;
    }

    Dyr(double kropsTemperatur) {
        this.kropsTemperatur = kropsTemperatur;
    }

    //psvm
    public static void main(String[] args) {
        // TODO opret et objekt med hver constructor
        Dyr x1 = new Dyr(5);
        Dyr x2 = new Dyr(5.9);


    }


}
