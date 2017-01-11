import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Hair: ");
		String h = kb.next();
		System.out.println("Eyes: ");
		String e = kb.next();
		System.out.println("Skin: ");
		String s = kb.next();
		
		Human object = new Human(h, e, s);
		
		System.out.println("\nMy info...\nHair: " + object.getHair() + "\nEyes: " + object.getEyes() + "\nSkin: " + object.getSkin());
		
		object.setHES("black", "green", "dark");
		
		System.out.println("\nFriend's info...\nHair: " + object.getHair() + "\nEyes: " + object.getEyes() + "\nSkin: " + object.getSkin());
	}
}