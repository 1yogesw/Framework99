package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelhandling1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\ADMIN\\Desktop\\jun15.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		// To take the control of sheet
		XSSFSheet sheet = workbook.getSheetAt(0);

		// This will take the control of row-
		for (int i = 1; i < 9; i++) {
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
		System.out.println(cell);
		}
	}
}
