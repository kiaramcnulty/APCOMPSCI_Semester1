/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("Jack","Spades",10);
		Card card2 = new Card("Jack","Spades",10);
		Card card3 = new Card("Nine","Hearts",9);
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
		card1.matches(card2);
		card1.matches(card3);
	}
}
