package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdown {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");

		Thread.sleep(2000);

		List<WebElement> a = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));

		System.out.println(a.size());

		for (WebElement k : a) {

			if (k.getText().equalsIgnoreCase("India")) {
				k.click();
				break;
			}
		}
		// using for loop
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getText().equalsIgnoreCase("India")) {
				a.get(i).click();
				break;
			}

		}
	}
}