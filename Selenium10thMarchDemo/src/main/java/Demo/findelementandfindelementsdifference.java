package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementandfindelementsdifference {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//	WebElement a = driver.findElement(By.xpath(" //input[@id='checkBoxjkOption1']"));
		//a.click();
		List<WebElement> b = driver.findElements(By.xpath(" //input[@type='checkBoxfg']"));
	System.out.println(b.size());
		for (WebElement k : b) {
			k.click();
		}
	}
}