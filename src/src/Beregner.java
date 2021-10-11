package src;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 08/10/2021
 */

public class Beregner {

    int arraySum(int[] a) {
        int resultat = 0;
        for (int i = 0; i < a.length; i++) {
            resultat = resultat + a[i];
        }
        return resultat;
    }


    public static void main(String[] args) {
        Beregner b = new Beregner();
        int[] eksempelArray= {12, 5, 6, 8};
        int resultat = b.arraySum(eksempelArray);
        System.out.println(resultat);
    }
}










