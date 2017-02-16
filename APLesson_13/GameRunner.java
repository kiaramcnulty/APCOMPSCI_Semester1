public class GameRunner
{
	public static void main(String[]args)
	{
		XBox xbox1 = new XBox("XBox One");
		GameSystem xbox2 = new XBox("XBox 360");
		Console xbox3 = new XBox("XBox (Original)");
		
		System.out.println(xbox1);
		System.out.println();
		System.out.println(xbox2);
		System.out.println();
		System.out.println(xbox3);
		System.out.println();
		
		PlayStation ps1 = new PlayStation("ps2");
		GameSystem ps2 = new PlayStation("ps3");
		Console ps3 = new PlayStation("ps4");
		
		System.out.println(ps1);
		System.out.println();
		System.out.println(ps2);
		System.out.println();
		System.out.println(ps3);
		System.out.println();
		
		PC pc1 = new PC("MSI");
		GameSystem pc2 = new PC("Alienware");
		
		System.out.println(pc1);
		System.out.println();
		System.out.println(pc2);
	}
}