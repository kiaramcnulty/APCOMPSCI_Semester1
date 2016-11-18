public class Ex_05
{
	static int[] numbers;
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray();
		printArray();
		getOdds();
	}
	
	public static void fillArray()
	{
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100)+1;
		}
	}
	public static void printArray()
	{
		System.out.print("For the following numbers... ");
		for (int num : numbers)
		{
			System.out.print(num + " ");
		}
		System.out.println();
	}
	public static void getOdds()
	{
		String odds = "";
		for (int num : numbers)
		{
			if (num%2 == 1)
				odds += num + " ";
		}
		System.out.println("The numbers " + odds + "are odd numbers.");
	}
}