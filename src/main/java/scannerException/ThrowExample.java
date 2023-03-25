package scannerException;

public class ThrowExample {

	public static void exampleThrow()
	{
		throw new NullPointerException("Exception Traced");
	}
	
	public static void main(String[] args) 
	{

		try 
		{
			exampleThrow();
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
