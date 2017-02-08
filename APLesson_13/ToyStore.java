import java.util.ArrayList;
public class ToyStore
{
	ArrayList<Toy> toyList; = new ArrayList<Toy>();
	
	public toyStore()
	{
		//loadtoys?
	}
	
	public toyStore(String list)
	{
		loadToys(list);
	}
	
	public static void loadToys(String ts)
	{
		ArrayList<String> toys = ts.split(", ");
		for (int i = 0; i < toys.size(); i++)
		{
			String name = toys[i];
			String type = toys[i + 1];
			Toy t = getThatToy(name);
			if (t.equals(null))
				////////////DO THIS
		}
	}
	
	public static Toy getThatToy(String nm)
	{
		for (Toy t : toyList)
		{
			if (t.getName().equals(nm))
				return toy;
			return null;
		}
	}
	
	public static String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for (Toy t : toyList)
		{
			if (t.getType().equals("Car"))
				cars += 1;
			if (t.getType().equals("Action Figure")
				figure +=1;
		}
		
		if (cars>figures)
		{
			return "Cars";
		}
		if (figures>cars)
		{
			return "Action Figures";
		}
		return "Equal amounts of action figures and cars!";
	}
	
	public String toString()
	{
		return toyList;
	}
}