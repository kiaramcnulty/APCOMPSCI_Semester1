import java.util.Scanner;
public class Average
{
	static double n1;
	static double n2;
	static double n3;
	static double avg;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is n1?");
		n1 = kb.nextDouble();
		System.out.println("What is n2?");
		n2 = kb.nextDouble();
		System.out.println("What is n3?");
		n3 = kb.nextDouble();
		
		average();
		print();
	}
	public static double average()
	{
		return avg = (n1+n2+n3)/3;
	}
	public static void print()
	{
		System.out.printf("The average of " + n1 + ", " + n2 +", and " + n3 + " is %-10.5f", avg);
	}
}