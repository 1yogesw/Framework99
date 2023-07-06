package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// Implicit wait ---Globally declare--
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

		driver.findElement(By.xpath("//a[@value='BOM']")).click();

		// Explict Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[@value='DEL'])[2]")));

		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();

	}

}
