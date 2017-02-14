public class PlayStation extends Console
{
	public PlayStation()
	{
		super();
	}
	
	public String getController()
	{
		return "PS Dual Shock 3";
	}
	
	// fix ALL below...
	public String getPlatform()
	{
		return "XBox"; //?
	}
	
	public String toString()
	{
		return "Platform: " + super.getPlatform() + "\nSerial #: " + super.getSerialNo() + "\nController: " + super.getController();
	}
}