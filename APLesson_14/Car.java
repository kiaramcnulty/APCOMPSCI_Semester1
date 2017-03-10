public abstract class Car implements Location
{
	private int id;
	public Car()
	{
		id = (int)(Math.random()* 900000)+100000;
	}

	public int getID()
	{
		return id;
	}
	
	public void move(double x2, double y2)
	{
		location[0] += x2;
		location[1] += y2;
	}
}