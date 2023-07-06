package Demo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {
	// what are the diffrent selenium locators techniques?

	// id
	// classname
	// name
	// xpath
	// css selector
	// linktext
	// partiallinktext
	// tagname

	// pink --- tagname
	// orange--attribute
	// blue-- value

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("test@gmail.com");

		driver.findElement(By.name("pw")).sendKeys("secure123");
		driver.findElement(By.id("Login")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgot Your Password?")).click();
		driver.findElement(By.name("cancel")).click();
		driver.findElement(By.partialLinkText("Use Custom")).click();
	}

}
