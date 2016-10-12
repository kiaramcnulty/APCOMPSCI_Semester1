import java.util.Scanner;
public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Grade 1: ");
		String grade1 = kb.next();
		System.out.println("Grade 2: ");
		String grade2 = kb.next();
		System.out.println("Grade 3: ");
		String grade3 = kb.next();
		System.out.println("Grade 4: ");
		String grade4 = kb.next();
		System.out.println("Grade 5: ");
		String grade5 = kb.next();
		System.out.println("Grade 6: ");
		String grade6 = kb.next();
		System.out.println("Grade 7: ");
		String grade7 = kb.next();
		
		double GPA = (calcPoints(grade1)+calcPoints(grade2)+calcPoints(grade3)+calcPoints(grade4)+calcPoints(grade5)+calcPoints(grade6)+calcPoints(grade7))/3;
		
		System.out.printf("Your GPA is %.2f.", GPA);
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		else
			return 0.0;
	}
}