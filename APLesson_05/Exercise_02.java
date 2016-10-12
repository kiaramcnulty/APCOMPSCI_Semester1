import java.util.Scanner;

public class Exercise_02
{
	static double subtotal;
	static double discount;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Exercise_02 form = new Exercise_02();
		
		System.out.println("What is item 1?");
		String i1 = kb.nextLine();
		System.out.println("What is the cost of item 1?");
		double c1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("What is item 2?");
		String i2 = kb.nextLine();
		System.out.println("What is the cost of item 2?");
		double c2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("What is item 3?");
		String i3 = kb.nextLine();
		System.out.println("What is the cost of item 3?");
		double c3 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("What is item 4?");
		String i4 = kb.nextLine();
		System.out.println("What is the cost of item 4?");
		double c4 = kb.nextDouble();
		
		subtotal = c1 + c2 + c3 + c4;
		discount();
		double tax = .07*(subtotal-discount);
		double total = subtotal - discount + tax;
		
		System.out.println("<<<<<<<<<< Receipt >>>>>>>>>>");
		form.format(i1, c1);
		form.format(i2, c2);
		form.format(i3, c3);
		form.format(i4, c4);
		form.format("Subtotal", subtotal);
		form.format("Discount", discount);
		form.format("Tax", tax);
		form.format("Total", total);
		System.out.println("_____________________________");
		System.out.println("Thank you!");
	}
	
	public static double discount()
	{
		if (subtotal>=2000)
		{
			discount = .15*subtotal;
		}
		else
		{
			discount = 0;
		}
		return discount;
	}
	
	public void format(String i, double c)
	{
		System.out.printf("%10s .......... $%.2f\n", i, c);
	}
}