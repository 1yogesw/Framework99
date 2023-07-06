package ExceptionHandling;

public class finallyBlock {
	public static void main(String[] args) {

		try {
			int a[] = { 10, 20, 30 };
			System.out.println(a[6]);

		}

		finally {

			System.out.println("i will excute always");
			System.out.println("hello");

		}

	}

}
