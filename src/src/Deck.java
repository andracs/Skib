/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 11/10/2021
 */
package src;

import java.util.ArrayList;

public class Deck {
    ArrayList<Card> bunken = new ArrayList<Card>();

    public Deck() {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                bunken.add(new Card(i, j));
            }
        }
        System.out.println(bunken);
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck);
        Card kortSomFjernes = null;
        for (Card kort : deck.bunken) {
            if (kort.farve == 0 && kort.værdi == 5) kortSomFjernes = kort;
        }
        System.out.println("Kort som fjernes: " + kortSomFjernes );
        deck.bunken.remove(kortSomFjernes);

        deck.bunken.remove(0);
        System.out.println(deck);
        deck.bunken.add(new Card(0, 1));

    }

    @Override
    public String toString() {
        return "Deck{" +
                "bunken=" + bunken +
                '}';
    }
}
