package Week06WarGame;

import java.util.ArrayList;
import java.util.List;

public class Player {

	List<Card> hand = new ArrayList<Card>();
	int score = 0;
	String name;
	
	public Player() {}
	//Constructor
	public Player(String name) {
		this.name = name;
	
		
	}
	
		
	
	//Methods
	//Describe method prints out card information for the hand
	public void describe() {
		System.out.println("\nPlayer " + name + " " + score + " points!\n");
		for(Card card : hand) {
			card.describe();
		}
		
	}	
	//Flips a card and removes from the hand
	public Card flip() {
			return hand.remove(0);
			
	}
	//Deck is the argument and calls the draw method on the deck
	public void draw(Deck deck) {
		hand.add(deck.draw());
		
	}	
	//Incrementally add the score by one
	public int incrementScore() {
		return this.score +=1;
	
	}



	public void setName(String name) {
		
		
	}
}

