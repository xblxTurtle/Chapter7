import java.util.*;
public class SetsCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadInputAndCalculate();
	}
	private static TreeSet<Integer> ParseStringSet(String[] stringsSet)
	{
		TreeSet<Integer> set = new TreeSet<Integer>();  
		for(String element:stringsSet)
		{
			int i = Integer.parseInt(element);
			if (i < 0) throw new IllegalArgumentException("Only positive integers are allowed");
			set.add(i);
			
		}
		return set;
	}
	public static void ReadInputAndCalculate()
	{
		TreeSet<Integer> set1, set2;
		while (true)
		{
			System.out.println("Please enter two sets and an operation:");
			String input = TextIO.getlnString();
			input = input.replaceAll("\\s", "");
			String[] strings = input.split("\\[|\\]");
			if (strings.length != 4)
			{
				System.out.println("Error: Only two sets are allowed");
				continue;
			}
			try
			{
				set1 = ParseStringSet(strings[1].split(","));
				set2 = ParseStringSet(strings[3].split(","));
				switch (strings[2])
				{
				case "+":
					set1.addAll(set2);
					System.out.println(set1.toString());
					break;
				case "*":
					set1.retainAll(set2);
					System.out.println(set1.toString());
					break;
				case "-":
					set1.removeAll(set2);
					System.out.println(set1.toString());
					break;
				default:
					throw new IllegalArgumentException("Unknown operation");
				}
			}
			catch (NumberFormatException ex)
			{
				System.out.println("Error: Only Integers are allowed");
				continue;
			}
			catch (IllegalArgumentException ex)
			{
				System.out.println("Error:"+ex.getMessage());
				continue;
			}
		}
	}

}
