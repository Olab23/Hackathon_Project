package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import pageObject.Health_Insurance;
import pageObject.Travel_Insurance;

public class ExcelUtility {
	
	public static void excelTI() throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\excelFile\\output.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("sheet1");
		XSSFRow row=sheet.createRow(0);
		XSSFCell cell=row.createCell(0);
		cell.setCellValue("Companay Provider Name");
		row.createCell(1).setCellValue("Package Name");
		row.createCell(2).setCellValue("Price");
		for(int i=1; i<=Travel_Insurance.company.size();i++ ) {
			XSSFRow r=sheet.createRow(i);
			r.createCell(0).setCellValue(Travel_Insurance.company.get(i-1));
			r.createCell(1).setCellValue(Travel_Insurance.name.get(i-1));
			r.createCell(2).setCellValue(Travel_Insurance.prices.get(i-1));
 
		
		}
//		XSSFSheet sheet1=workbook.createSheet("sheet2");
//		XSSFRow nrow=sheet1.createRow(0);
//		XSSFCell ncell=nrow.createCell(0);
//		ncell.setCellValue("Health Insurance List");
//		for(int i=1; i<=Health_Insurance.allHealthList.size();i++ ) {
//			XSSFRow ro=sheet1.createRow(i);
//			ro.createCell(0).setCellValue(Health_Insurance.allHealthList.get(i-1));
//		}
		workbook.write(file);
		workbook.close();
		file.close();

 
	}
	
	public static void excelHI() throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\excelFile\\output2.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
//		XSSFSheet sheet=workbook.createSheet("sheet1");
//		XSSFRow row=sheet.createRow(0);
//		XSSFCell cell=row.createCell(0);
//		cell.setCellValue("Companay Provider Name");
//		row.createCell(1).setCellValue("Package Name");
//		row.createCell(2).setCellValue("Price");
//		for(int i=1; i<=Travel_Insurance.company.size();i++ ) {
//			XSSFRow r=sheet.createRow(i);
//			r.createCell(0).setCellValue(Travel_Insurance.company.get(i-1));
//			r.createCell(1).setCellValue(Travel_Insurance.name.get(i-1));
//			r.createCell(2).setCellValue(Travel_Insurance.prices.get(i-1));
// 
//		
//		}
		XSSFSheet sheet1=workbook.createSheet("sheet1");
		XSSFRow nrow=sheet1.createRow(0);
		XSSFCell ncell=nrow.createCell(0);
		ncell.setCellValue("Health Insurance List");
		for(int i=1; i<=Health_Insurance.allHealthList.size();i++ ) {
			XSSFRow ro=sheet1.createRow(i);
			ro.createCell(0).setCellValue(Health_Insurance.allHealthList.get(i-1));
		}
		workbook.write(file);
		workbook.close();
		file.close();

 
	}
	
	
	//Read Data
//	public static String readExcel(int row) throws Exception {
//		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\excelfile\\inputexcel.xlsx");
//		XSSFWorkbook workbook=new XSSFWorkbook(file);
//		XSSFSheet sheet=workbook.getSheet("Sheet1");
//		String ab=sheet.getRow(row).getCell(0).toString();
//		return ab;
//	}

}
