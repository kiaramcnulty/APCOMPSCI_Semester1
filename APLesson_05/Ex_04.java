import java.util.Scanner;
public class Ex_04
{
	static double height;
	static double weight;
	static double BMI;
	static String condition;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your height in inches?");
		height = kb.nextDouble();
		System.out.println("What is your weight in pounds?");
		weight = kb.nextDouble();
		
		calcBMI();
		
		System.out.printf("Your BMI is: %.2f\n", BMI);
		System.out.printf("You are " + condition);
	}
	public static void calcBMI()
	{
		BMI = (weight*703)/(height*height);
		
		if (BMI<=18.5)
			condition = "Underweight";
		else if (BMI<=24.9)
			condition = "Normal";
		else if (BMI<=29.9)
			condition = "Overweight";
		else if (BMI<=34.9)
			condition = "Obese";
		else if (BMI<=39.9)
			condition = "Very Obese";
		else
			condition = "Morbidly Obese";
	}
}