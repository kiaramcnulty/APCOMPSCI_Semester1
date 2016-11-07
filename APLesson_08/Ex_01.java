import java.util.Scanner;
public class Ex_01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String sentence = kb.nextLine();
		System.out.println(replace(sentence));
	}
	public static String replace(String sent)
	{
		if(sent.indexOf(" ")<0)
			return sent;
		return replace(sent.substring(0, sent.indexOf(" ")) + "_" + sent.substring(sent.indexOf(" ")+1));
	}
}