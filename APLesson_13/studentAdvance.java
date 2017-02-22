public class studentAdvance extends advance
{
	private int daysLeft;
	
	public studentAdvance(int dl)
	{
		super(dl);
	}
	
	public double getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return super.toString() + "\nSTUDENT ID REQUIRED";
	}
}