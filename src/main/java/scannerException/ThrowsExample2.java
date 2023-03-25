package scannerException;

import java.io.IOException;

public class ThrowsExample2 {
	
	public static void myMethod(int num) throws IOException, ClassNotFoundException
	
	{
		if(num==1)
		{
			throw new IOException("Input Output Exception");
		}
		else
		{
			throw new ClassNotFoundException("Class Not found exception");
		}
	
		
	}

	public static void main(String[] args) 
	{
		
try {
	myMethod(1);
} catch (Exception e) {
	System.out.println(e);
} 
}

	}


