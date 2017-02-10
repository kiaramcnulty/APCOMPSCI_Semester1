public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		//create toyStore object 
		ToyStore store = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		//print the output from toString() on the toyStore object
		System.out.println(store);
		System.out.println(store.getMostFrequentToy());
		System.out.println(store.getMostFrequentType());
		
	}
}