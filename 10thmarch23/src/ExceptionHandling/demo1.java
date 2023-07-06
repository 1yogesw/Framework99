package ExceptionHandling;

public class demo1 {
	// ArrayIndexOutOfBoundsException

	// ArithmeticException

	public static void main(String[] args) {
		try {

			int a = 10;
			System.out.println(a / 0);

		} catch (ArithmeticException e) { // to handle the exception
			
			System.out.println("Please try to aceess value within the range");

		}
		System.out.println("hello");

	}

}
