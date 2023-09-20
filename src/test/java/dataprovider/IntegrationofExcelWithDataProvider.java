package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class IntegrationofExcelWithDataProvider {
	@DataProvider(name = "loginData")
	public String[][] getData() throws InvalidFormatException, IOException {
		File excelFile=new File("../TestNGPractice/dataFiles/LoginTests.xlsx");
//		System.out.println(excelFile.exists());
		FileInputStream inputStream=new FileInputStream(excelFile);
		XSSFWorkbook workbook=new XSSFWorkbook(excelFile);
		XSSFSheet sheet=workbook.getSheetAt(0);
		System.out.println(sheet.getPhysicalNumberOfRows());
		int rowCount=sheet.getLastRowNum();
		int colCount=sheet.getRow(0).getLastCellNum();
		System.out.println(rowCount);
		System.out.println(colCount);
		
		String[][] data=new String[rowCount][colCount];
		
		for(int i=0;i<rowCount;i++) {
//			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<colCount;j++) {
				DataFormatter dataFormat=new DataFormatter();
				data[i][j]=dataFormat.formatCellValue(sheet.getRow(i+1).getCell(j));
//				String cell=row.getCell(j).getStringCellValue();
//				System.out.println(cell);
//				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
//			System.out.println();
		}
		inputStream.close();
		workbook.close();
//		for(String[] dataArr:data) {
//			System.out.println(Arrays.toString(dataArr));
//		}
//		
		return data;
	}
	
}
