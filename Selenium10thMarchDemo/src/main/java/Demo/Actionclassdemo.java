package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclassdemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		Actions a = new Actions(driver);

		// WebElement b = driver.findElement(By.xpath("//button[@id='openwindow']"));
		// a.contextClick(b).build().perform(); // To right click-
		// double click-

		// a.doubleClick(b).build().perform();
		WebElement c = driver.findElement(By.xpath("//button[@id='mousehover']"));
		Thread.sleep(3000);
		a.moveToElement(c).build().perform();
		
		driver.findElement(By.xpath("//a[@href='#top']")).click();

	}
}