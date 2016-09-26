import java.util.Scanner;

public class EX_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		EX_03 loan = new EX_03();
		
		System.out.println("What is the interest rate?");
		double rate = kb.nextDouble();
		System.out.println("What is the principal amount?");
		double principal = kb.nextDouble();
		System.out.println("What is the number of times the loan is compounded per year?");
		double number = kb.nextDouble();
		System.out.println("What is life of the loan in years?");
		double time = kb.nextDouble();
		
		System.out.printf("Your total monthly payment is $%-10.2f\n", loan.monthlyPayment(rate, principal, number, time));
	}
	
	public double monthlyPayment(double r, double p, double n, double t)
	{
		return (p*Math.pow(1+r/n, n*t))/(12*t);
	}
}