package src;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 08/10/2021
 */


public class Hest {

    final int[] rød = {1,3,5,7};
    final int[] sort  = {2,4,6};

    boolean erSort(Integer b){
        return false;
    }

    public static void main(String[] args) {
        Hest x = new Hest();
        System.out.println(x.erSort(1));
        System.out.println(x.erSort(2));
        System.out.println("Færdig");
    }

}
