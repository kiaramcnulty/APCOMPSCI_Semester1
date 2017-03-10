public class Honda extends Car
{
	private double[]location;
	
	public Honda()
	{
		location = new double[2];
	}
	public Honda(double[] loc)
	{
		location = loc;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}