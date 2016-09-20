import java.util.Scanner;

public class EX_01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		EX_01 receipt = new EX_01();
		
		System.out.println("Please enter item1: ");
		String item1 = kb.nextLine();
		System.out.println("Please enter price: ");
		double price1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item2: ");
		String item2 = kb.nextLine();
		System.out.println("Please enter price: ");
		double price2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item3: ");
		String item3 = kb.nextLine();
		System.out.println("Please enter price: ");
		double price3 = kb.nextDouble();
		
		System.out.println("<<<<<<receipt>>>>>>");
		
		receipt.format(item1, price1);
		receipt.format(item2, price2);
		receipt.format(item3, price3);
		
		double subtotal = price1 + price2 + price3;
		double tax = subtotal * .08;
		double total = subtotal + tax;
		
		receipt.format("Subtotal: ", subtotal);
		receipt.format("Tax: ", tax);
		receipt.format("Total: ", total);
	}
	
	public void format(String item, double price)
	{
		//formatting here
	}
}
