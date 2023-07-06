package ExceptionHandling;

public class demo2 {
	public static void main(String[] args) {

		try {
			int a = 10;
			System.out.println(a / 0);

		} catch (ArithmeticException e) { // to handle the exception
			System.out.println("arithmetic exception handling");
		}

		catch (Exception e) { // to handle the exception
			System.out.println("exception handling");
		}
		System.out.println("hello");

	}
	
}
