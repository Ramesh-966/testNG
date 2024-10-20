package ddtexcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\employee_data.xlsx");
		
		XSSFWorkbook wb= new XSSFWorkbook(file);
		
		XSSFSheet sheet=wb.getSheet("Sheet1");
		//XSSFSheet sheet=wb.getSheetAt(0);
		
		int rownum=sheet.getLastRowNum();
		System.out.println(rownum);
		
		int cellnum=sheet.getRow(0).getLastCellNum();
		System.out.println(cellnum);
		
		for(int i=0;i<=rownum;i++) 
		{
			XSSFRow row=sheet.getRow(i);
			
			for(int j=0;j<cellnum;j++) 
			{
				String cells=row.getCell(j).toString();
				System.out.print(cells+"\t");
			}
			System.out.println();
		}
		wb.close();
		file.close();
	}

}
