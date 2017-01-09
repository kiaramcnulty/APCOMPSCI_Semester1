import java.lang.Math.*;
public class distance
{
	private int xOne, yOne, xTwo, yTwo;
	private double finalDistance;
	
	public distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		finalDistance = 0;
	}
	
	public distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		finalDistance = 0;
	}
	
	public void setValues(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		finalDistance = 0;
	}
	
	public double getDistance()
	{
		finalDistance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return finalDistance;
	}
}