package scannerException;

public class NestedTryExample {

	public static void main(String[] args) {

		// main try
		try {
			// second try
			try {

				// third try
				try {

					int arr[] = { 1, 2, 3, 4 };
					System.out.println(arr[5]);
				} catch (ArithmeticException e) {
					System.out.println("Arithmetic exception third try");
				}

			} catch (ArithmeticException e) {
				System.out.println("Arithmetic exception second try");
			}
		}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index Out Of Bounds exception first try");
			} catch (NullPointerException e) {
				System.out.println("Null Pointer Exception");
			}

			catch (Exception e) {
				System.out.println("Generic Exception");
			}
		

		finally {
			System.out.println("Final exception message");
		}

	}

}
