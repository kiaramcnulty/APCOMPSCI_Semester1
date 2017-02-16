public class ticket
{
	int serialNo;
	
	public ticket()
	{
		serialNo = (int)(Math.random()* 9000000)+1000000;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return "Serial #: " + serialNo + "\nPrice: " + getPrice();
	}
}