import java.util.Scanner;
public class Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the side length?");
		side = kb.nextDouble();
		
		calcSurf();
		print();
	}
	public static double calcSurf()
	{
		return sa = 6*side*side;
	}
	public static void print()
	{
		System.out.printf("The surface area of a cube whose sides are " + side + " in length is %-10.5f", sa);
	}
}