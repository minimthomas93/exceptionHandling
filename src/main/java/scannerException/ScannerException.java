package scannerException;

import java.util.Scanner;

public class ScannerException {

	public static void main(String[] args) {
		int num1,num2;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		num1=s.nextInt();
		
		System.out.println("Enter number 2: ");
		num2=s.nextInt();
		
		try {
		int divide=num1/num2;
		System.out.println("Division result: " + divide);
		
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Division by 0 is impossible");
			System.out.println("Error message " + e);
		}
		catch(Exception e)
		{
			System.out.println("Generic exception");
		}

		
		System.out.println("Message outside try catch block");
	}

}
