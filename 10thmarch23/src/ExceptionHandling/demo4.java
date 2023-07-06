package ExceptionHandling;

public class demo4 {
	public static void main(String[] args) {

		try {
			int a[] = { 10, 20, 30 };
			System.out.println(a[6]);

		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("handled exception");

		}

		try {

			int b = 10;
			System.out.println(b / 10);
		} catch (ArithmeticException e) {
			System.out.println("handled arithemtic handled exception");

		}

		System.out.println("hello");

	}

}
