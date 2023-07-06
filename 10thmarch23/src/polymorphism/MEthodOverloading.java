package polymorphism;

public class MEthodOverloading {
	
	// same method name with different parameters
	// rules for giving parameters-
	// detatype should be different
	// count should be different
	// sequence should be different


	public void addition(int a, int b) {

		System.out.println(a + b);

	}

	public void addition(double b, double a) {

		System.out.println(a + b);

	}

	public static void main(String[] args) {

		MEthodOverloading obj = new MEthodOverloading();
		obj.addition(12, 13);
		obj.addition(12.5, 13.5);

	}

}
