import java.util.Scanner;

public class EX_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = keyboard.next();
		System.out.println(name + " sucks!");
		
		System.out.println("How old are you?");
		int age = keyboard.nextInt();
		System.out.println(age + " is a stupid age!");
		
		System.out.println("What do you do for fun?");
		String fun = keyboard.next();
		System.out.println(fun + " isn't fun!");
		
		System.out.println("What kind of music do you like?");
		String music = keyboard.next();
		System.out.println(music + " is terrible!");
		
		System.out.println("How many siblings do you have?");
		int siblings = keyboard.nextInt();
		System.out.println("I would hate to have " + siblings + " siblings!");
		
		System.out.println("What do you want to be when you grown up?");
		String job = keyboard.next();
		System.out.println(job + " is a horrible job!");
	}
}