import java.util.Scanner;
public class Rectangle1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Rectangle1 calc = new Rectangle1(); 
		
		System.out.println("What is the length?");
		double l1 = kb.nextDouble();
		System.out.println("What is the width?");
		double w1 = kb.nextDouble();
		
		double perim1 = calc.calcPerim(l1, w1);
		calc.print(perim1);
	}
	public double calcPerim(double l, double w)
	{
		return 2*l + 2*w;
	}
	public void print(double perim)
	{
		System.out.printf("Your rectangle is %10.5f ft around.", perim);
	}
}