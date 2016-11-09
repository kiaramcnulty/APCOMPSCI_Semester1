import java.util.Scanner;
public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word1 = kb.next();
		int stop1 = word1.length();
		int start1 = 0;
		
		tree(word1, start1, stop1);
	}
	public static void tree(String word, int start, int stop)
	{
		if(start<=stop)
		{
			System.out.printf("%20s\n", word.substring(0, start));
			start += 1;
			tree(word, start, stop);
		}
	}
}