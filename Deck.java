package week6finalcoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

	public class Deck {
    private List<Card> cards = new ArrayList<Card>(); // List to store cards

    // Constructor
    	public Deck() {
       // cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", 
        				"Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        
        for (String suit : suits) {
            for (int i = 0; i < names.length; i++) {
                cards.add(new Card(i + 2, names[i] + " of " + suit));
            }
        }
    }

    // Shuffle the deck
    	public void shuffle() {
        Collections.shuffle(cards);
    }

    // Draw the top card
    	public Card draw() {
        return cards.remove(0);
	    }
}
