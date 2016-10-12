import java.util.Random;
public class Exercise_01
{
	static int p1;
	static int cp1;
	static String winner;
	
	public static void main(String[]args)
	{
		Random rand = new Random();
		p1 = rand.nextInt(6) + 1;
		cp1 = rand.nextInt(6) + 1;
		
		rollDice();
		
		System.out.println("You rolled a " + p1);
		System.out.println("The computer rolled a " + cp1);
		System.out.println("The winner is " + winner);
		
		
	}
	public static void rollDice()
	{
		if(p1>cp1)
		{
			winner = "you";
		}
		if (p1<cp1)
		{
			winner = "the computer";
		}
		else
		{
			winner = "you. Tie goes to the human!";
		}
	}
}