package ddtexcel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\mydata.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook();
		
		XSSFSheet sheet=wb.createSheet("tournament");
		
		
		//create file by using static wa
		
		/*XSSFRow row0=sheet.createRow(0);
		row0.createCell(0).setCellValue("Name");
		row0.createCell(1).setCellValue("Score");
		row0.createCell(2).setCellValue("Country");
		
		XSSFRow row1=sheet.createRow(1);
		row1.createCell(0).setCellValue("Dhoni");
		row1.createCell(1).setCellValue(50);
		row1.createCell(2).setCellValue("India");
		
		XSSFRow row2=sheet.createRow(2);
		row2.createCell(0).setCellValue("Raina");
		row2.createCell(1).setCellValue(40);
		row2.createCell(2).setCellValue("India");
		
		XSSFRow row3=sheet.createRow(3);
		row3.createCell(0).setCellValue("kohli"); 
		row3.createCell(1).setCellValue(30);
		row3.createCell(2).setCellValue("India");*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		
		int noofrows=(sc.nextInt());
		System.out.println("Enter no of cells : ");
		
		int cellcount=(sc.nextInt());
		for(int i=0;i<noofrows;i++ ) 
		{
			XSSFRow row=sheet.createRow(i);
			for(int j=0;j<cellcount;j++) 
			{
				XSSFCell cell=row.createCell(j);
				cell.setCellValue(sc.next());
			}
		}
		
		wb.write(file);
		wb.close();
		file.close();
		System.out.println("File created successfully");
	}

}
