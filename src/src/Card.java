/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 11/10/2021
 */
package src;

public class Card {
    int farve;
    int værdi;

    public Card(int farve, int værdi) {
        this.farve = farve;
        this.værdi = værdi;
    }

    @Override
    public String toString() {
        return "Card{" +
                "farve=" + farve +
                ", værdi=" + værdi +
                '}';
    }
}
