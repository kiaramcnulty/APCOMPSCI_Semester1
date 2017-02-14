public class XBox extends Console
{
	public XBox()
	{
		super();
	}
	
	public String getController()
	{
		return "XBox Wireless Controller";
	}
	
	public String getPlatform()
	{
		return "XBox"; //?
	}
	
	public String toString()
	{
		return "Platform: " + super.getPlatform() + "\nSerial #: " + super.getSerialNo() + "\nController: " + super.getController();
	}
}