import java.util.Scanner;

public class EX_03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many miles are you traveling?");
		float miles = keyboard.nextInt();
		System.out.println("How many miles per hour will you be traveling at?");
		float mph = keyboard.nextInt();
		
		float time = miles/mph;
		
		System.out.println("Your journey will take " + time + " hours!");
	}
}