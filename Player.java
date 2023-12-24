package week6finalcoding;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand = new ArrayList <Card> (); // List to store player's hand
    private int score; // Player's score
    private String name; // Player's name

    // Constructor
    public Player(String name) {
        this.name = name;
        hand = new ArrayList<>();
        score = 0;
    }

    // Describe player and their hand
    public void describe() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            card.describe();
        }
    }

    // Draw a card from the deck
    public void draw(Deck deck) {
        hand.add(deck.draw());
   
    }
    // Flip the top card from the hand
    public Card flip() {
        return hand.remove(0);
    }

    // Increment player's score
    public void incrementScore() {
        score++;
    }

    // Getters
    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
    
    

