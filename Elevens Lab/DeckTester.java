/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"jack","queen","king"};
		String[] suits = {"hearts", "spades", "diamonds"};
		int[] pointValues = {10, 10, 10};
		Deck d = new Deck(ranks, suits, pointValues);
	}
}
