import java.util.Scanner;

public class EX_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		EX_02 id = new EX_02();
		
		System.out.println("Please enter your first name: ");
		String firstName = kb.nextLine();
		System.out.println("Please enter your last name: ");
		String lastName = kb.nextLine();
		System.out.println("Please enter your title: ");
		String title = kb.nextLine();
		System.out.println("Please enter the school site: ");
		String school = kb.nextLine();
		System.out.println("Please enter the school year: ");
		String schoolYear = kb.nextLine();
		System.out.println("Please enter your subject: ");
		String subject = kb.nextLine();
		
		
		System.out.println("***************************************");
		
		id.format(school, schoolYear);
		id.format(firstName, lastName);
		id.format(title, subject);
		
		System.out.println("***************************************");
	}
	
	public void format(String info1, String info2)
	{
		System.out.printf("* %15s%20s *\n", info1, info2);
	} 
} 