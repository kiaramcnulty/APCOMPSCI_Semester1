import java.util.Scanner;
public class Lesson_05c
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter n1: ");
		int one = kb.nextInt();
		System.out.println("Enter n2: ");
		int two = kb.nextInt();
		
		boolean even = (one+two)%2 == 0;
		
		if(even)
		{
			System.out.println("It is even!");
		}
		if(!even)
		{
			System.out.println("It is odd!");
		}
	}
}