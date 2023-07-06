package javabasics;

public class LocalandGlobalvariable {

	int a = 10; // global variable
	int b = 10;

	public void method1() {

		int b = 10; // local-- scope is inside the method or block only
		System.out.println(b);

	}

	public void method2() {

		System.out.println(a);
		System.out.println(b);

	}

	// Local

	// Global --instance variable
	public static void main(String[] args) {
		LocalandGlobalvariable obj	=new LocalandGlobalvariable();
		obj.method1();
		obj.method2();
	
	}

}
