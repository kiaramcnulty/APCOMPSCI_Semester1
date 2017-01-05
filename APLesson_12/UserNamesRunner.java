public class UserNamesRunner 
{
	public static void main (String[]args)
	{
		userNames object = new userNames("kiaramcnulty", "Kiara", "McNulty");
		
		System.out.println("<<<<<<<<<< USER INFO >>>>>>>>>>");
		System.out.println("Name: " + object.getFirstName() + " " + object.getLastName());
		System.out.println("User Name: " + object.getUserName());
		
		userNames object1 = new userNames();
		
		System.out.println("<<<<<<<<<< USER INFO >>>>>>>>>>");
		System.out.println("Name: " + object1.getFirstName() + " " + object1.getLastName());
		System.out.println("User Name: " + object1.getUserName());
		
		object.setUserName("kmcnulty");
		
		System.out.println("<<<<<<<<<< USER INFO >>>>>>>>>>");
		System.out.println("Name: " + object.getFirstName() + " " + object.getLastName());
		System.out.println("User Name: " + object.getUserName());
	}
}