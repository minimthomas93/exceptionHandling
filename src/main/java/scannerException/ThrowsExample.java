package scannerException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {
	
	public static void exampleThrowsMethod()
	throws FileNotFoundException
	{
		FileInputStream f=new FileInputStream("S:\\file.java");
 	}

	public static void main(String[] args) {

		
		try {
			exampleThrowsMethod();
		}
		catch(NullPointerException e)
		{
			System.out.println("Null value");
		}
		
//		catch(FileNotFoundException e)
//		{
//			System.out.println("File not found");
//		}
		catch(Exception e1)
		{
			System.out.println("Generic exception " + e1);
		}
	}

}
