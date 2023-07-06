package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framehandling {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		WebElement a = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(a);
		// index
		// frame name or id
		// frame webelement
		Actions b = new Actions(driver);

		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		b.dragAndDrop(source, target).build().perform();
		// switch the control outside the frame
		driver.switchTo().defaultContent();
		  
	}

}