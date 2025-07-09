package PracticePackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDrivenexcel {

	public static void main(String[] args) throws IOException {

		exceldriven();
	}

	public static String[] exceldriven() throws IOException {

		String excelFilePath = "C:\\Users\\TTIPL\\Downloads\\Testpractice.xlsx";

		FileInputStream fis = new FileInputStream(excelFilePath);// This opens a connection to read the Excel file,If
																	// the file does not exist, this will throw
																	// FileNotFoundException
		try (XSSFWorkbook workbook = new XSSFWorkbook(fis)) {// XSSFWorkbook is used to read .xlsx files
			XSSFSheet sheet = workbook.getSheetAt(0);// gets the first sheet from the workbook (index starts at 0).
			Row row = sheet.getRow(1);// Gets the second row (again, indexing starts from 0).

			DataFormatter formatter = new DataFormatter();// Used to convert a cell's content to a String, It formats
															// numbers, dates, and other types into readable strings.
			String[] userDetails = new String[row.getPhysicalNumberOfCells()];// Creates an array sized to the number of
																				// actual (non-empty) cells in the row.
			for (int i = 0; i < userDetails.length; i++) {
				Cell cell = row.getCell(i);
				userDetails[i] = formatter.formatCellValue(cell);
				System.out.println(userDetails[i]);
			}
			return userDetails;

		}
		// Loops through each cell in the row.
//
//Converts the cell's value to a string using the formatter.
//Stores it in the userDetails array.
//Prints it to the console and return the same.

	}

}
