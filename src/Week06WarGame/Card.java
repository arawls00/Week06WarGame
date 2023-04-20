package Week06WarGame;

public class Card {
	String name;
	String suit;
	int value;
	
	Card(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
		
	}
//Getters and Setters
	public String getName() {
		return name;
	}
	//name of card
	public void setName(String name) {
		this.name = name;
	}
	//capture the suit information
	public String getSuit() {
		return suit;
	}
	//apply the suit
	public void setSuit(String suit) {
		this.suit = suit;
	}
	//return the value of the integer
	public int getValue() {
		return value;
	}
	//label the value of an integer
	public void setValue(int value) {
		this.value = value;
	
	}
	//give values to the face cards and return results
	@Override
	public String toString() {
		String strValue = "";
		switch(value) {
		case 11:
			strValue = "Jack";
			break;
		case 12:
			strValue = "Queen";
			break;
		case 13:
			strValue = "King";
			break;
		case 14:
			strValue = "Ace";
			break; 
		default:
			strValue = String.valueOf(value);
			break;
		}
		return strValue + " of " + suit;
		}
		
		//method to describe the card
		public void describe() {
			System.out.println(this.name + " of " + this.suit + " -- " + this.value);
	}

}
