public class GMC implements Location
{
	double[]location;
	
	public GMC()
	{
		location = new double[2];
	}
	public GMC(double x1, double y1)
	{
		double location[] = new double[2];
		location[0] = x1;
		location[1] = y1;
	}
	
	public int getID()
	{
		return (int)(Math.random()* 900000)+100000;
	}
	
	public move(double x2, double y2)
	{
		location[0] += x2;
		location[1] += y2;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}