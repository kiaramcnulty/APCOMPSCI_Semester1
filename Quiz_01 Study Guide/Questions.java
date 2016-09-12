import java.util.Scanner;

public class Questions
{
	public static void main(String[]args)
	{
		//Question_02
		String pres = "Abraham Lincoln";
		String quote = "Whatever you are, be a good one.";
		System.out.println(pres + " once said, \"" + quote + "\"");
		
		//Question_03
		int h = 45;
		int w = 64;
		int a = 45*64;
		System.out.println("The area of your rectangle is..." + a);
		
		//Question_05
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your name? ");
		String answer = kb.next();
		System.out.println("Is there a Mr. or Mrs. " + answer + "?"); 
		
		//Question_06
		System.out.println("How many siblings do you have? ");
		int answer1 = kb.nextInt();
	
		System.out.println("What are their names? ");
		String answer2 = kb.nextLine();
		
		System.out.println("OK, which one is your favorite?");
		String answer3 = kb.nextLine();
		System.out.println("Awe! " + answer3 + " is your favorite.");
		
		//Question_07
		System.out.println("This one goes on top \nThis one goes on bottom");
		
		//Question_08 
		System.out.println("a	b	c\nd	e	f\ng	h	i");
		
		//Question_10
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your Math grade: ");
		float math = kb.nextFloat();
		System.out.println("Please enter your Science grade: ");
		float science = kb.nextFloat();
		System.out.println("Please enter your English grade: ");
		float english = kb.nextFloat();
		System.out.println("Please enter your History grade: ");
		float history = kb.nextFloat();
		System.out.println("Please enter your COMPSCI grade: ");
		float compsci = kb.nextFloat();

		float gpa = (math + science + english + history + compsci)/5;
		System.out.println(gpa);
		
	}
}