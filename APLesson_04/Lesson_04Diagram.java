import java.util.Scanner;
public class Lesson_04Diagram
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int num1 = kb.nextInt();
		System.out.println("Please enter another integer: ");
		int num2 = kb.nextInt();
		System.out.println("The sum of your integers is " + add(num1, num2));
	}
	
	public static int add(int one, int two)
	{
		return one+two;
	}
}





