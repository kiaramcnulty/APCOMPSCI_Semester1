import java.util.Scanner;
public class Ex_05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the interval: ");
		int interval = kb.nextInt();
		System.out.println("Please enter the highest number: ");
		int max = kb.nextInt();
		int number = interval;
		
		for (int i=number; number<=max; i++)
		{
			System.out.print(number + "\t");
			number += interval;
		}
	}
}