import java.util.Scanner;

public class EX_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your height in inches?");
		int height = keyboard.nextInt();
		System.out.println("What is your weight in pounds?");
		int weight = keyboard.nextInt();
		
		float BMI = (weight*703)/(height*height);
		
		System.out.println("Your BMI is " + BMI);
	}
}