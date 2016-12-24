import java.util.Scanner;
public class guessTarget
{
    static String[] targets;
    static Scanner kb = new Scanner(System.in);
    static int guess;
    static int target;
    static int numGuesses;
    static int maxGuesses;

    public static void main(String[]args)
    {
        selectDifficulty();
        fill();
    }
    public static void fill()
    {
		target = (int)(Math.random()*20);
		numGuesses = 0;
        targets = new String[20];
        for (int i = 0; i < 20; i++)
            targets[i] = "O";
		printTargets();
		guess();
    }
    public static void printTargets()
    {
        for (int i = 0; i < 20; i++)
            System.out.print(targets[i] + "  ");
        System.out.println();
        for (int j = 0; j < 20; j++)
		{
			if (j >=9)
            	System.out.print(j+1 + " ");
			else
				System.out.print(j+1 + "  ");
		}
		System.out.println();
    }
    public static void guess()
    {
        System.out.println("You have used " + numGuesses + " guesses out of " + maxGuesses + ". Guess which slot the target is located: ");
        guess = kb.nextInt() -  1;
        numGuesses +=1 ;
        compare();
    }
    public static void compare()
    {
        if (guess == target)
        {
			System.out.println();
            System.out.println("You win! Game Over.");
            targets[guess] = "T";
            printTargets();
            playAgain();
        }
        else
        {
			if (numGuesses == maxGuesses)
            	{
					System.out.println();
                	System.out.println("You missed. You ran out of guesses. Game Over.");
                	playAgain();
            	}
            else
			{
				if (guess > target && guess<=19)
				{
					System.out.println();
            		System.out.println("Your guess was too high, but good try.");
            		targets[guess] = "X";
        			printTargets();
					guess();
				}
				else if (guess < target && guess >= 0)
				{
					System.out.println();
            		System.out.println("Your guess was too low, but good try.");
            		targets[guess] = "X";
        			printTargets();
					guess();
				}
				else
				{
					System.out.println();
					System.out.println("Please select a number between 1 and 20.");
					numGuesses -= 1;
					printTargets();
					guess();
				}
			}
        }
    }
	public static void playAgain()
    {
        System.out.println("Would you like to play again? 'y' or 'n'");
        String yOrN = kb.next();
        if (yOrN.equals("y"))
        {
            System.out.println();
            System.out.println();
            selectDifficulty();
            System.out.println();
            fill();
        }
		else if (yOrN.equals("n"))
        {
            System.out.println("Thanks for playing!");
        }
        else
            playAgain();
	}
    public static void selectDifficulty()
    {
        System.out.println("Would you like to play beginner, intermediate, or expert? 'b', 'i', or 'e'.");
        String difficulty = kb.next();
        if (difficulty.equals("b"))
            maxGuesses = 5;
        else if (difficulty.equals("i"))
            maxGuesses = 4;
        else if (difficulty.equals("e"))
            maxGuesses = 3;
        else
            selectDifficulty();
    }
}
