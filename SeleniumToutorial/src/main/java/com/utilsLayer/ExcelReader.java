package com.utilsLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.BaseLayer.BaseClass;

public class ExcelReader {
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;

	public ExcelReader(String excelpath) {

		File f = new File(excelpath);

		try {
			FileInputStream fis = new FileInputStream(f);
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public String getData(int sheetindex, int rows, int cells) {
		sheet = workbook.getSheetAt(sheetindex);

		return sheet.getRow(rows).getCell(cells).getStringCellValue();
	}

	public int rowCound(int sheetindex) {

		return workbook.getSheetAt(sheetindex).getLastRowNum();
	}

	public int cellCound(int sheetindex) {
		return workbook.getSheetAt(sheetindex).getRow(0).getLastCellNum();
	}

}
