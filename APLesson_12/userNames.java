public class userNames
{
	// instance variable
	private String userName, firstName, lastName;
	
	// default constructor
	public userNames()
	{
		// default values for instance vars
		userName = "";
		firstName = "";
		lastName = "";
	}
	
	// constructor with params
	public userNames(String uName, String fName, String lName)
	{
		userName = uName;
		firstName = fName;
		lastName = lName;
	}
	
	// modifiers
	public void setUserName(String uName)
	{
		userName = uName;
	}
	
	// accessors
	public String getUserName()
	{
		return userName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
}
