import java.util.Scanner;
public class stats
{
    public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter stats:")
        boolean go = true;
        while (go = true)
        {
            System.out.println("stat:")
            String stat = kb.nextLine();
            if (stat == "done")
            {
                go = false;
            }
            else
            {
                //do stuff with stats
            }
        }
    }
}