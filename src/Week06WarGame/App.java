package Week06WarGame;

public class App {

	public static void main(String[] args) {
		//instantiate deck and call the shuffle method
		Deck deck = new Deck();
		deck.shuffle();
		//Create two instances of players as an object
		Player player1 = new Player("Player1");
		Player player2 = new Player("Player2");
		//System.out.println(player1.name);
		
		//Traditional for loop to iterate 52 times and call the draw method on the other player for each iteration used the Deck you instantiated
		for (int i = 0; i < 52; i++) {
		
		if (i % 2 == 0) {
			player1.draw(deck);
		} else {
			player2.draw(deck);
		}
		}
		player1.describe();
		player2.describe();
	//Use a traditional for loop to iterate 26 times and call the flip method for each player
	
	for (int j = 0; j < 26; j++) {
		Card player1Card = player1.flip();
		Card player2Card = player2.flip();
		System.out.println("Player1 flip \n");
		player1Card.describe();
		System.out.println("Player2 flip \n");
		player2Card.describe();
		
		System.out.println(player1.score);
		System.out.println("-------------");
		System.out.println(player2.score);
		//Use the if statement to get the value of a card for each player and incrementally add to the winner
		if (player1Card.getValue() > player2Card.getValue()) {
			player1.incrementScore();
		} else if (player2Card.getValue() > player1Card.getValue()) {
			player2.incrementScore();
			
		} else {
			System.out.println("draw");
		}
		
	}
	//Use if statement to recognize the score for each player and print out the winner or identify a tie. 
	if (player1.score > player2.score) {
		System.out.println("Player1 wins with a " + player1.score + " to " + player2.score + " final score.");
	} else if (player2.score > player1.score) {
		System.out.println("Player2 wins with a " + player2.score + " to " + player1.score + " final score.");
		
	} else {
		System.out.println("It is a tie!");
	}
	
}

	}

	
		
	

