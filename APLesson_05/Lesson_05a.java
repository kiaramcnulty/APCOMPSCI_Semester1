public class Lesson_05a
{
	public static void main(String[]args)
	{
		if (tOrF())
		{
			System.out.println("It is true!");
		}
		
		if (!tOrF())
		{
			System.out.println("It is not true!");
		}
	}
	
	public static boolean tOrF()
	{
		return 8 >= 5;
	}
}