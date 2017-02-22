public class ticketDriver
{
	public static void main(String[]args)
	{
		ticket walkup1 = new walkup();
		ticket advance1 = new advance(15);
		ticket advance2 = new advance(5);
		ticket studentAdvance1 = new studentAdvance(15);
		ticket studentAdvance2 = new studentAdvance(5);
		
		System.out.println("RECEIPT\n" + walkup1 + "\n" + advance1 + "\n" + advance2 + "\n" + studentAdvance1 + "\n" + studentAdvance2);
	}
}