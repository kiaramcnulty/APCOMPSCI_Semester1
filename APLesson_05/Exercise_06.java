import java.util.Scanner;
public class Exercise_06
{
	static Scanner kb;
	static String username;
	static String password;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		username = "kiaramcnulty";
		password = "kiara";
		passCheck();
	}
	public static void passCheck()
	{
		System.out.println("Enter username: ");
		String usernameInput = kb.next();
		System.out.println("Enter password: ");
		String passwordInput = kb.next();
		if (usernameInput.equals(username)&&passwordInput.equals(password))
		{
			System.out.println("You are granted access!");
		}
		else
		{
			if (usernameInput.equals(username))
			{
				System.out.println("Password is incorrect!");
				passCheck();
			}
			if (passwordInput.equals(password))
			{
				System.out.println("Username is incorrect!");
				passCheck();
			}
			else
			{
				System.out.println("Username and password are incorrect!");
				passCheck();
			}
		}
	}
}