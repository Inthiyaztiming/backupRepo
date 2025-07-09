package Tests;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataDrivenTestingExcel {
	@Test
	public void datadriventesting() throws IOException {

		String filepath = "C:\\\\Users\\\\TTIPL\\\\Documents\\\\upprpb_filed_limit\\\\xslx";

		FileInputStream file = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		int sheets = workbook.getNumberOfSheets();// It will extract all the sheets present in the workbook

		// After getting all the sheets number, we will iterate and find the sheet from
		// which we need to get the data
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {

				XSSFSheet sheet = workbook.getSheetAt(i);

				// Identify testcases column by scanning the entire first row
				sheet.iterator();

				// comment for github
			}

		}
	}
}
