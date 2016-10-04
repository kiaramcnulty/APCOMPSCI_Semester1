import java.util.Scanner;
public class Cube1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Cube1 calc = new Cube1(); 
		
		System.out.println("What is the side?");
		double side1 = kb.nextDouble();
		
		double sa1 = calc.calcSurf(side1);
		calc.print(side1, sa1);
	}
	public double calcSurf(double side)
	{
		return 6*side*side;
	}
	public void print(double side, double sa)
	{
		System.out.printf("The surface area of a cube whose sides are " + side + " in length is %-10.5f.", sa);
	}
}