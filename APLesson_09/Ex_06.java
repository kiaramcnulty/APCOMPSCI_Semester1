public class Ex_06
{
	static int[] numbers;
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray();
		printArray();
		getBiggest();
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
	public static void getBiggest()
	{
		int max = 0;
		for (int num : numbers)
		{
			if (num>max)
				max = num;
		}
		System.out.println("The biggest number is " + max);
	}
}