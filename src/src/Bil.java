package src;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 07/10/2021
 */

public class Bil {

    private String bilType;
    private String farve;
    public Motor motor = new Motor();
    public String type = "Køretøj";
    // ..

    public void kør() {
        System.out.println("Bilen kører fremad.");
    }


    @Override
    public String toString() {
        return "Bilen er " +
                " Type ='" + bilType + '\'' +
                ", farve='" + farve + '\'' +
                ", motor=" + motor +
                '}';
    }

    public String getFarve() {
        return farve;
    }

    public void setFarve(String farve) {
        this.farve = farve;
    }


}
