package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelHandling {

	public static void main(String[] args) throws IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\ADMIN\\Desktop\\jun15.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		// To take the control of sheet
		XSSFSheet sheet = workbook.getSheetAt(0);

		// This will take the control of row-
		Row row = sheet.getRow(1);

		Cell cell = row.getCell(0);
		String username = cell.toString();

		Cell cell1 = row.getCell(1);
		String password = cell.toString();

		System.out.println(cell);
		System.out.println(cell1);
		// use this fields in selenium code

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/");

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

	}
}
