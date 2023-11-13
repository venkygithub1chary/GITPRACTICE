package browser_commands;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RowCellCount {

	public static void main(String[] args) throws Throwable {
		// read path of excel file
		FileInputStream fi = new FileInputStream("H:/Sample.xlsx");
		Thread.sleep(5000);
		// get work book from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		// get sheet from wb
		XSSFSheet ws = wb.getSheet("Login");
		// get first row from sheet
		XSSFRow row = ws.getRow(0);
		// count no of rows in a sheet
		int rc = ws.getLastRowNum();
		// get no cells in first row
		int cc = row.getLastCellNum();
		System.out.println("no of rows in sheet::" + rc + "   " + "no of cells in first row::" + cc);
		// close file
		fi.close();
		wb.close();

	}

}
