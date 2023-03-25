package UserDefinedException;

public class Example1Child {
	
	public void checkException(int weight) throws UserDefinedExceptionExample1
	{
		if(weight<100)
		{
			throw new UserDefinedExceptionExample1("Valid weight");
		}
	}

	public static void main(String[] args) {
		Example1Child u= new Example1Child();
		
		try {
			u.checkException(70);
		} catch (UserDefinedExceptionExample1 e) 
		{
			System.out.println("Exception message");
			System.out.println(e.getMessage());
		}

	}

}
