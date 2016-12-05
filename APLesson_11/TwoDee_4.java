public class TwoDee_4
{
	public static void main(String[]args)
	{
		String[][] randLetters = new String [4][4];
		
		/*randLetters[0][0] = "a";
		randLetters[1][1] = "b";
		randLetters[2][2] = "c";
		randLetters[3][3] = "d"; */
		
		String letters = "adcdefghijklmnopqrstuvwxyz";
		
		int spot = 0;
		for (int i = 0; i<randLetters.length; i++)
		{
			for (int j = 0; j<randLetters[i].length; j++)
			{
				randLetters[i][j] = letters.substring(spot, spot+1);
				spot++;
			}
		}
		
		for (int i = 0; i<randLetters.length; i++)
		{
			for (int j=0; j<randLetters[i].length; j++)
			{
				System.out.print(randLetters[j][i] + "\t");
			}
			System.out.println();
		}
	}
}