import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Distance: ");
		int distance = kb.nextInt();
		System.out.println("Hours: ");
		int hours = kb.nextInt();
		System.out.println("Minutes: ");
		int minutes = kb.nextInt();
		
		MPH object = new MPH(distance, hours, minutes);
		
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours and " + object.getMinutes() + " minutes = " + object.getMPHR() + " mph");
		
		object.setParams(100, 2, 30);
		
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours and " + object.getMinutes() + " minutes = " + object.getMPHR() + " mph");
	}
}