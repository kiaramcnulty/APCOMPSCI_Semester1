import java.util.Scanner;
public class randomPick
{
	static String[] names;
	static Scanner kb = new Scanner(System.in);
	public static void main(String[]args)
	{
		fillArray();
		choose();
	}
	public static void fillArray()
	{
		System.out.println("How many people are there?");
		int size = kb.nextInt();
		names = new String[size];
		System.out.println("Please enter the " + size + " names: ");
		for (int i = 0; i < names.length; i++)
		{
			names[i] = kb.next();
		}
	}
	public static void choose()
	{
		int chosen = (int)(Math.random()*names.length);
		System.out.println("... " + names[chosen] + " was chosen!");
		playAgain();
	}
	public static void playAgain()
	{
		System.out.println("Would you like to try again? 'yes' or 'no'");
		String play = kb.next();
		if (play.equals("yes"))
			choose();
		else if (play.equals("no"))
			System.out.println("Thanks for playing!");
		else
			playAgain();
	}
}
