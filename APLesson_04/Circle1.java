import java.util.Scanner;
public class Circle1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Circle1 calc = new Circle1(); 
		
		System.out.println("What is the radius?");
		double r1 = kb.nextDouble();
		
		double area1 = calc.calcArea(r1);
		calc.print(r1, area1);
	}
	public double calcArea(double r)
	{
		return 3.14*r*r;
	}
	public void print(double r, double area)
	{
		System.out.printf("The area of a circle with radius " + r + " is %-10.5f.", area);
	}
}