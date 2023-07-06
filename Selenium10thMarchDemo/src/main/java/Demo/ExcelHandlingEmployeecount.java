package Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandlingEmployeecount {
	public static void main(String[] args) throws IOException {

		// write into excel

		String path = "C:\\Users\\ADMIN\\Desktop\\jun15.xlsx";
		FileInputStream fs1 = new FileInputStream(path);

		Workbook wb = new XSSFWorkbook(fs1);
		// sheet
		Sheet sheet2write = wb.getSheetAt(1);

		int lastRow = sheet2write.getLastRowNum();
		System.out.println(lastRow);

		Row row;
		Cell cell;
		for (int i = 1; i <= lastRow; i++) {

			try {
				row = sheet2write.getRow(i);

				if (row.getCell(0) != null) {
					cell = row.createCell(1);
					cell.setCellValue("20");
				} /*
					 * else { cell = row.createCell(1); cell.setCellValue("0"); }
					 */

			} catch (Exception e) {

				row = sheet2write.createRow(i); // crate the row
				row = sheet2write.getRow(i); // will take the contriol of row
				cell = row.createCell(1); // cell create
				cell.setCellValue("0"); // will put value 0 in crated cell

			}

		}
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		fos.close();

	}

}
