package testNG;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDTWrite {
	//Workbook=>sheet=>rows=>cells
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wb= new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Empdata");
		Object empdata[][] = {{"Empid","Salary","EmpName"},{213,15000,"kumar"},
				{215,17000,"Ramesh"},{219,18000,"satish"}

		};
		int rows=empdata.length;
		int cols=empdata [0].length;
		for(int r=0;r<rows;r++){
			XSSFRow row = sheet.createRow(r);
			for(int c=0;c<cols;c++){
				XSSFCell cell = row.createCell(c);
				Object value = empdata[r][c]; 
				if(value instanceof String) {
					cell.setCellValue((String)value);
					if(value instanceof Integer) {
						cell.setCellValue((Integer)value);
						if(value instanceof Boolean) {
							cell.setCellValue((Boolean)value);
						}
					}
				}

			}
			String Filepath = ".\\DataFiles\\employee1.xlsx";
			FileOutputStream file =new FileOutputStream(Filepath);
			wb.write(file);
		}

	}
}
