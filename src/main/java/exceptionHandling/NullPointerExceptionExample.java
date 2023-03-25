package exceptionHandling;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String s =null;
		//System.out.println(s.length());
		
		try {
			System.out.println(s.length());
			}
			catch (NullPointerException e)
			{
				System.out.println(e);
			}
			finally 
			{
			System.out.println("Mini");		// this one is not printed because exception occurs at int n=10/0;
			}
			
		System.out.println("Mini- outside the finally");	

	}

}
