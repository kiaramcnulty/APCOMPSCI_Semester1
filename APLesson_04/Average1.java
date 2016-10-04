import java.util.Scanner;
public class Average1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Average1 calc = new Average1(); 
		
		System.out.println("What is the n1?");
		double n1 = kb.nextDouble();
		System.out.println("What is the n2?");
		double n2 = kb.nextDouble();
		System.out.println("What is the n3?");
		double n3 = kb.nextDouble();
		
		double avg1 = calc.average(n1, n2, n3);
		calc.print(n1, n2, n3, avg1);
	}
	public double average(double num1, double num2, double num3)
	{
		return (num1+num2+num3)/3;
	}
	public void print(double num1, double num2, double num3, double avg)
	{
		System.out.printf("The average of " + num1 + ", " + num2 + ", and " + num3 + " is %-10.5f.", avg);
	}
}