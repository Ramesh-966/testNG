package testNG;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDT {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String  filepath = ".\\DataFiles\\employee_data.xlsx\\";
FileInputStream file = new FileInputStream(filepath);
XSSFWorkbook wb = new XSSFWorkbook(file);
XSSFSheet sheet = wb.getSheet("sheet1");
int rows = sheet.getLastRowNum();
int cols = sheet.getRow(0).getLastCellNum();

/**for(int r=0 ; r<rows ; r++) {
	XSSFRow row = sheet.getRow(r);
	for(int c=0 ; c<cols ; c++) {
		XSSFCell cell = row.getCell(c);
		switch(cell.getCellType()){
		case STRING: System.out.print(cell.getStringCellValue()); break;
		case NUMERIC: System.out.print(cell.getNumericCellValue());break;
		case FORMULA: System.out.print(cell.getCellFormula());break;
		case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
	
		}
		System.out.print("  |  ");
		}
	System.out.println();
	}**/

Iterator<?> iterator = sheet.iterator();
while(iterator.hasNext()) {
	XSSFRow row=(XSSFRow) iterator.next();
	Iterator cellIterator= row.cellIterator();
	while(cellIterator.hasNext()) {
		XSSFCell cell=(XSSFCell) cellIterator.next();
		switch(cell.getCellType()){
		case STRING: System.out.print(cell.getStringCellValue()); break;
		case NUMERIC: System.out.print(cell.getNumericCellValue());break;
		case FORMULA: System.out.print(cell.getCellFormula());break;
		case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
	
		}
		System.out.print("  |  ");
	}
	System.out.println();
}
}


	}


