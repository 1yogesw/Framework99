package Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialscreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		WebElement b = driver.findElement(By.xpath("//input[@id='username']"));

		File src1 = b.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("C:\\Users\\ADMIN\\Documents\\screenshot2.png"));

	}
}