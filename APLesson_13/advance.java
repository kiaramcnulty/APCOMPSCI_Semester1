public class advance extends ticket
{
	private int daysLeft;
	
	public advance(int dl)
	{
		super();
		daysLeft = dl;
	}
	
	public double getPrice()
	{
		if (dayLeft >= 10)
			return 30;
		else
			return 40;
	}
}