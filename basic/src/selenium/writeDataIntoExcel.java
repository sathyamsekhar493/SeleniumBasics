package selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeDataIntoExcel {

	public static void main(String[] args) throws IOException {
	
		 
		 FileInputStream fis = new FileInputStream("E://TestDataSheet.xlsx");
		 
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 
		 Sheet sheet = workbook.getSheetAt(0);
		 
		 Row row = sheet.getRow(0);
		 
		 Cell cell = row.createCell(2);
		 
		 cell.setCellValue("Written Status");
		 
		 FileOutputStream fos = new FileOutputStream("E://TestDataSheet.xlsx");
		 
		 workbook.write(fos);
		 
		 fos.close();
		 
		 }
}
