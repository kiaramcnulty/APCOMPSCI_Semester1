import java.util.Scanner;

public class ReverseAlgo200
{
    public static void main(String[]args)
    {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the message that you would like to encode: ");
		String message = kb.next();
		System.out.println("Enter the total length of the encoded output: ");
		int outputLength = kb.nextInt();
		
		int startMessage = (int)(Math.random()*(outputLength-message.length()));
		String output = "";
		int i = 0;
		
		while (i < outputLength)
		{
			if (i == startMessage)
			{
				for (int j = 0; j < message.length(); j++)
				{
					output += (int)(message.charAt(j))-96 + ", ";
					i++;
				}
			}
			else
			{
				output+= (int)(Math.random()*28)+1 + ", ";
				i++;
			}
		}
		System.out.println(output);
	}
}