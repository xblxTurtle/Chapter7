
public class ClosableTest implements AutoCloseable {
public void close()
{
	System.out.println("Closable.close is called");
}
}
