public class GMC extends Car
{
	private double[]location;
	
	public GMC()
	{
		location = new double[2];
	}
	public GMC(double x1, double y1)
	{
		location = new double[2];
		location[0] = x1;
		location[1] = y1;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}