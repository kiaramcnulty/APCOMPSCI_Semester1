import java.util.Scanner;
public class CarDriver
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Paint: ");
		String p = kb.next();
		System.out.println("Interior: ");
		String i = kb.next();
		System.out.println("Engine: ");
		String e = kb.next();
		System.out.println("Tires: ");
		String t = kb.next();
		
		Car car1 = new Car(p, i, e, t);
		
		System.out.println("\nYour vehicle is ready......\nPaint: " + car1.getPaint() + "\nInterior: " + car1.getInterior() + "\nEngine: " + car1.getEngine() + "\nTires: " + car1.getTires());
	}
}