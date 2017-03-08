public class Toyota implements Location
{
	private double[] location;
	
	public Toyota()
	{
		location = new double[2];
	}
	public Toyota(String c)
	{
		String cSplit[] = c.split(",");
		double doubles = Double.parseDouble(cSplit);
		location[] = doubles; //fix this
	}
	
	public int getID()
	{
		return (int)(Math.random()* 900000)+100000;
	}
	
	public void move(double x2, double y2)
	{
		location[0] += x2;
		location[1] += y2;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}