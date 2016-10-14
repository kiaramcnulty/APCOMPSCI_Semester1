import java.util.Scanner;
public class Exercise_05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to go in the forest or to the river?");
		String riverOrForest = kb.next();
		
		if (riverOrForest.equals("river"))
		{
			System.out.println("Ok! You need to cross the river. Would you like to swim or take a raft?");
			String swimOrRaft = kb.next();
			if (swimOrRaft.equals("raft"))
			{
				System.out.println("Ok! You see someone in the water. Do you want to help them onto the raft?");
				String helpOrNot = kb.next();
				if (helpOrNot.equals("no"))
					System.out.println("The person drowned, but you made it to safety. Congrats.");
				else
					System.out.println("Your generosity killed you. The person pushed you off the raft, and you drowned.");
			}
			else
			{
				System.out.println("Ok! As you're swimming, you see an alligator. Do you fight it?");
				String fightOrNot = kb.next();
				if (fightOrNot.equals("no"))
					System.out.println("It didn't see you. You swam to safety. Congrats");
				else
					System.out.println("Bad decision. It is much stronger, and it kills you.");
			}
		}
		else
		{
			System.out.println("Ok! As you're walking, notice a rustling in the leaves. Would you like to investigate?");
			String investigateOrNot = kb.next();
			if (investigateOrNot.equals("yes"))
			{
				System.out.println("Uh-Oh. It's a bear! Do you fight or run?");
				String fightOrRun = kb.next();
				if (fightOrRun.equals("fight"))
					System.out.println("The bear gets scared and runs. You made it to safety. Congrats.");
				else
					System.out.println("The bear outruns you, and kills you.");
			}
			else
			{
				System.out.println("Ok. You continue on, and see a house. Do you go in?");
				String houseOrNot = kb.next();
				if (houseOrNot.equals("yes"))
					System.out.println("The house is abandoned. You are safe. Congrats");
				else
					System.out.println("You never find food or water, and die.");
			}
		}
			
	}
}