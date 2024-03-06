package Utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static String[][] getExcelData(String fileName)  {
		
//		String fileLocation ="./Test_Data/Login_TestData.xlsx";
		
		XSSFWorkbook wbook = null;
		try {
			wbook = new XSSFWorkbook("./Test_Data/"+fileName+".xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet =wbook.getSheetAt(0);
		int lastrowNum = sheet.getLastRowNum();
		int rowCount = sheet.getPhysicalNumberOfRows();
		
		short latsCellValue = sheet.getRow(0).getLastCellNum();
		/*
		System.out.println("Total Row Count : "+rowCount);
		
		System.out.println("Total Last Count : "+lastrowNum);
		
		System.out.println("Total Col Count : "+latsCellValue);

*/
		String[][] data = new String[lastrowNum][latsCellValue];

		for (int i = 1; i <=lastrowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j <latsCellValue; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dft = new DataFormatter();
				String value = dft.formatCellValue(cell);
				
//				String value = cell.getStringCellValue();
//				System.out.println(value);
				
				data[i-1][j]=value;
				
				
			} 
		}
		try {
			wbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
		
		
		
	}

}
