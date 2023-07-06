package Demo;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.grid.config.Role;

public class excelhandling2 {
	public static void main(String[] args) throws IOException {

		FileInputStream fs = new FileInputStream("C:\\Users\\ADMIN\\Desktop\\jun15.xlsx");

		// To take the control of workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);

		// To take the control of sheet
		XSSFSheet sheet = workbook.getSheetAt(0);

		// This will take the control of row-

		System.out.println(sheet.getLastRowNum());

		for (int i = 1; i <=sheet.getLastRowNum() ; i++) {
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			System.out.println(cell);
		}

	}
}
