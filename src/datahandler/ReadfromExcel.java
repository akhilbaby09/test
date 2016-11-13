package datahandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadfromExcel {

	// read data from excel sheet
	public  double getNumericCellValue(String sheetName, int rowIndex, int columnIndex ) throws IOException {
		File file = new File("D:\\workspace\\Machintes\\Book1.xlsx");
		FileInputStream fs = new FileInputStream(file);
		XSSFWorkbook WorkBook = new XSSFWorkbook(fs);
		int index = WorkBook.getSheetIndex(sheetName);
		XSSFSheet mySheet = (XSSFSheet) WorkBook.getSheetAt(index);
     double	data = mySheet.getRow(rowIndex).getCell(columnIndex).getNumericCellValue();
				return data;
	}
	
	public  String getStringCellValue(String sheetName, int rowIndex, int columnIndex ) throws IOException {
		File file = new File("D:\\workspace\\Machintes\\Book1.xlsx");
		FileInputStream fs = new FileInputStream(file);
		XSSFWorkbook WorkBook = new XSSFWorkbook(fs);
		int index = WorkBook.getSheetIndex(sheetName);
		XSSFSheet mySheet = (XSSFSheet) WorkBook.getSheetAt(index);
		String	data = mySheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
				return data;
	}
	
	
	public int getrowno (String sheetName) throws IOException
	{
		File file = new File("D:\\workspace\\Machintes\\Book1.xlsx");
		FileInputStream fs = new FileInputStream(file);
		XSSFWorkbook WorkBook = new XSSFWorkbook(fs);
		int index = WorkBook.getSheetIndex(sheetName);
		XSSFSheet mySheet = (XSSFSheet) WorkBook.getSheetAt(index);
	    int	no = mySheet.getLastRowNum();
				return no;
	}
	
	public  void Setvalue (String sheetName, int rowIndex, int columnIndex) throws IOException {
		File file = new File("D:\\workspace\\Machintes\\Book1.xlsx");
		FileInputStream fs = new FileInputStream(file);
		XSSFWorkbook WorkBook = new XSSFWorkbook(fs);
		int index = WorkBook.getSheetIndex(sheetName);
		XSSFSheet mySheet = (XSSFSheet) WorkBook.getSheetAt(index);
	Cell celln= mySheet.getRow(rowIndex).getCell(columnIndex);
		 celln.setCellValue("Pass");
				
	}
}
