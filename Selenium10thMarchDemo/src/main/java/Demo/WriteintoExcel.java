package Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteintoExcel {
	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\ADMIN\\Desktop\\jun15.xlsx";
		FileInputStream fs = new FileInputStream(path);
		Workbook wb = new XSSFWorkbook(fs);
		Sheet Sheet1 = wb.getSheetAt(0);
		int lastRow = Sheet1.getLastRowNum();
		for (int i = 4; i < lastRow; i++) {
			Row row = Sheet1.getRow(i);
			Cell cell = row.createCell(2);
			cell.setCellValue("test1");
		}

		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		fos.close();
	}

}
