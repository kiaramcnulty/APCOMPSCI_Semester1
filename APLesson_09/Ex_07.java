import java.util.Scanner;
public class Ex_07
{
	static String[] words;
	public static void main(String[]args)
	{
		words = new String[5];
		fillArray();
		printArray();
		hasZs();
	}
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		
		for (int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
	}
	public static void printArray()
	{
		System.out.print("For the words... ");
		for (String word : words)
		{
			System.out.print(word + " ");
		}
		System.out.println();
	}
	public static void hasZs()
	{
		String zs = "";
		for (String word : words)
		{
			if (word.indexOf("z") >= 0)
				zs += word + " ";
		}
		System.out.println("Only " + zs + "contain(s) the letter z.");
	}
}