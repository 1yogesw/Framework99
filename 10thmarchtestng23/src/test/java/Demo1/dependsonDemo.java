package Demo1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class dependsonDemo {
	@Test(dependsOnMethods = { "method2" })
	public void method1() {

		System.out.println("hello1");
	}

	@Test
	public void method2() {

		System.out.println("hello2");

	}
}