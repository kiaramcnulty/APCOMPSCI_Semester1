import java.lang.Math.*;
public class Distance
{
	private int x1, y1, x2, y2;
	private double distance;
	
	public distance()
	{
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
	}
	
	public MPH(int xOne, int yOne, int xTwo, int yTwo)
	{
		x1 = xOne;
		y1 = yOne;
		x2 = xTwo;
		y2 = yTwo;
	}
	
	// all below needs to be replaced
	public void setParams(int d, int h, int m)
	{
		distance = d;
		hours = h;
		minutes = m;
	}
	
	public int getDistance()
	{
		return distance;
	}
	public int getHours()
	{
		return hours;
	}
	public int getMinutes()
	{
		return minutes;
	}
	public double getMPHR()
	{
		mphr = distance /(double)(hours + minutes/60.00);
		return mphr;
	}
}