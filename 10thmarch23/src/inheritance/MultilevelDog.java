package inheritance;

public class MultilevelDog extends MultilevelAnimal {

	public void method2() {
		System.out.println("i am from dog");
	}

	public static void main(String[] args) {

		MultilevelDog obj = new MultilevelDog();
		obj.method1();
		obj.method2();

	}

}
