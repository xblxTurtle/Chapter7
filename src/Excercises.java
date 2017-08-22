
public class Excercises {

	public static void main(String[] args) {
		TestSearch();
	}
	public static void TestSearch()
	{
		int input;
		SortedCollection coll = new SortedCollection();
		System.out.println("Enter any number (or \"0\" to exit):");
		input = TextIO.getInt();
		while (input != 0)
		{
			coll.add(input);
			System.out.println(coll.toString());
			System.out.println("Enter any number (or \"0\" to exit):");
			input = TextIO.getInt();
		}
	}
}
