package Demo1;

import org.testng.annotations.Test;

public class groupsDemo {

	@Test(groups = { "Smoke", "Regression" })
	public void method1() {

		System.out.println("hello");

	}

	@Test(groups = "Sanity")
	public void method2() {

		System.out.println("hello1");

	}

	@Test(groups = "Regression")
	public void method3() {

		System.out.println("helllo2");

	}

}
