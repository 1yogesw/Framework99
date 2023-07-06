package Demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.getCurrentUrl()); // https://rahulshettyacademy.com/AutomationPractice/

		driver.findElement(By.xpath("//button[@id='openwindow']")).click();

		Set<String> obj = driver.getWindowHandles();
		// windows id- parent and child

		// Apply the iterator over the collection
		Iterator<String> it = obj.iterator();

		String parentWindow = it.next(); // parent window
		String childWindow = it.next(); // child window

		driver.switchTo().window(childWindow);
		System.out.println(driver.getCurrentUrl());

		driver.switchTo().window(parentWindow);

	}

}
