public class Toyota extends Car
{
	private double[] location;
	
	public Toyota()
	{
		location = new double[2];
	}
	public Toyota(String c)
	{
		location = new double[2];
		String cSplit[] = c.split(", ");
		location[0] = Double.parseDouble(cSplit[0]);
		location[1] = Double.parseDouble(cSplit[1]);
	}
	
	public double[] getLoc()
	{
		return location;
	}
}