package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");

		WebElement frameTop = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(frameTop); // top frame

		WebElement frameLeft = driver.findElement(By.xpath("//frame[@name='frame-left']"));

		driver.switchTo().frame(frameLeft); // left frame

		String leftFrameText = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
		System.out.println(leftFrameText);

		driver.switchTo().parentFrame(); // top frame

		WebElement frameMiddle = driver.findElement(By.xpath("//frame[@name='frame-middle']"));

		driver.switchTo().frame(frameMiddle); // middle frame

		String middleFrameText = driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]")).getText();
		System.out.println(middleFrameText);
		driver.switchTo().parentFrame(); 
		WebElement frameRIGHT = driver.findElement(By.xpath("//frame[@name='frame-right']"));
		driver.switchTo().frame(frameRIGHT);
		String RightFrameText = driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText();
		System.out.println(RightFrameText);
		
		driver.switchTo().defaultContent();

		WebElement frameBottom = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		driver.switchTo().frame(frameBottom); // top frame

		String bottomText = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();

		System.out.println(bottomText);

	}
}
