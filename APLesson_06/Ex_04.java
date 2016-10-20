import java.util.Scanner;
public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int integer = kb.nextInt();
		System.out.println("Please enter the size of the table: ");
		int size = kb.nextInt();
		
		for (int i=1; i<size; i++)
		{
			System.out.println(i + ": " + i*integer);
		}
	}
}