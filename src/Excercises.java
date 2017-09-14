import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;

public class Excercises {
	public enum NewEnum {A,B,C}

	
	public static void main(String[] args){
		//TestSearch();
		//TestExceptionsCatch();
		ExceptionTest();
		EnumSet<NewEnum> e = EnumSet.of(NewEnum.A);
		e.add(NewEnum.B);
		
		
		 
	}

	public static void ExceptionTest()
	{
		System.out.println("Enter N:");
		int input = TextIO.getInt();
		try
		{
		ShowSequence(input);
		}
		catch(AssertionError ex)
		{
			System.out.println("Program terminated with an error: \n"+ ex.toString());
		}
	}
	public static void ShowSequence(int n)
	{
		//if (n <=0)
		//	throw new IllegalArgumentException();
		assert (n > 0) : "Negative input";
		while ((3*n+1)>0)
		{
			System.out.println(String.valueOf(3*n+1));
			n = 3*n+1;
		}
		//throw new ArithmeticException();
		assert false : "Overflow";
	}
	public static void TestExceptionsCatch()
	{
		
		int[] x = new int[10];
		SortedCollection c = new SortedCollection();
		try (ClosableTest test = new ClosableTest()) 
		{
		//c = null;
		//c.getSize();
		x[11] = 1;
		
		}
		catch(IndexOutOfBoundsException ex)
		{
			System.out.println("Catched Exception: " + "\n" + ex.toString());
		}
		finally
		{
			System.out.println("Finally block");
		}
		
		try
		{
			ThrowTest();
		}
		catch (ThrowableTest e)
		{
			
		}
		
	}
	public static void ThrowTest() throws ThrowableTest
	{
		throw new ThrowableTest();
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
