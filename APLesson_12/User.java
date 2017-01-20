import java.util.Scanner;
public class User
{
	private String firstName, lastName, avatar;
	private int userID;
	public User(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random()*1000000) + 1;
	}
	public User(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random()*1000000) + 1;
	}
	public String toString()
	{
		return "User Info\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nAvatar: " + avatar + "\nUser ID#: " + userID;
	}
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("First Name: ");
		String fN = kb.next();
		System.out.println("Last Name: ");
		String lN = kb.next();
		
		User user1;
		
		System.out.println("Would you like a public avatar?");
		String pubAv = kb.next();
		
		if (pubAv.equals("n"))
		{
			user1 = new User(fN, lN);
		}
		else
		{
			System.out.println("Avatar: ");
			String av = kb.next();
			user1 = new User(fN, lN, av);
		}
		System.out.println(user1);
	}
}
