package ExceptionHandling;

public class demo3 {
	public static void main(String[] args) {

		try {
			int a = 10;
			System.out.println(a / 0);

		} catch (Exception e) { // to handle the exception
			System.out.println(" exception handling");
		} // This will compile time errro-- catch block is aleredy handled
		//catch (ArithmeticException e) { // to handle the exception
			//System.out.println("Arithmetic exception handling");
		//}
		System.out.println("hello");
		System.out.println("hello");

	}

}
