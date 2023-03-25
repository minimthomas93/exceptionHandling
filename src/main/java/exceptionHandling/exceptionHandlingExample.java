package exceptionHandling;

public class exceptionHandlingExample {

	public static void main(String[] args) 
	{
		int n=0;
		try {
		n=10/0;
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		finally 
		{
		System.out.println("Mini");		// this one is not printed because exception occurs at int n=10/0;
		}
		
		System.out.println(n);
		
		
	}

}
