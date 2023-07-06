package abstraction;

public class demo2 extends demo {

	public void method2() {
		System.out.println("hello2");

	}

	public void method3() {
		System.out.println("hello3");

	}

//object create
	// method body
	public static void main(String[] args) {
		demo2 obj = new demo2();
		obj.method1();
		obj.method2();
	}
}