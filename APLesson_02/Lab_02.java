public class Lab_02
{
	public static void main(String[]args)
	{
		int a = 5;
		int b = 7;
		int mult = a * b;
		System.out.println(a + " multiplied by " + b + " is " + mult);
		
		String name = "Kiara McNulty";
		String address = "1035 Klish Way";
		String city = "Del Mar, CA";
		int zip = 92014;
		System.out.println(name);
		System.out.println(address);
		System.out.println(city + ", " + zip);
		
		int l = 5;
		int w = 11;
		int h = 7;
		int SA = 2*l*w + 2*l*h + 2*w*h;
		System.out.println("The surface area of your rectangular prism is " + SA);
	}
}