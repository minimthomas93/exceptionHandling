package scannerException;

public class ThrowExample2 {
	
	
	public static void eligibilityCheck(int age,int weight)
	{
		if(age<15 && weight<40)
		{
			throw new ArithmeticException("Not eligible for registration");
		}
		else
		{
			System.out.println("Eligible for registration");
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the registration process");
		
		try {
			eligibilityCheck(20,30);
		} catch (ArithmeticException e) 
		{
			System.out.println(e);
		}
		
		System.out.println("Thank you");
	}

}
