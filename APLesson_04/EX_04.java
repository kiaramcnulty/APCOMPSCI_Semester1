import java.util.Scanner;

public class EX_04
{
	public static void main(String[]args)
	{
		// cubic feet = cubic in * 0.000578704
		Scanner kb = new Scanner(System.in);
		EX_04 box = new EX_04();
		
		System.out.println("What is the height in inches?");
		double h1 = kb.nextDouble();
		System.out.println("What is the width in inches?");
		double w1 = kb.nextDouble();
		System.out.println("What is the length in inches?");
		double l1 = kb.nextDouble();
		
		System.out.printf("The volume in cubic feet is %-10.2f", box.calcVol(h1, w1, l1));
	}
	
	public double calcVol(double h, double w, double l)
	{
		return h*w*l * 0.000578704;
	}
}