package org.stepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.compress.compressors.lz4.XXHash32;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScript extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {
	FileInputStream fis = new FileInputStream(new File("C:\\Users\\CIBI\\Desktop\\Snagg CheckList.xlsx"));
	fis.close();
	Workbook w = new XSSFWorkbook(fis);
	
	Sheet s = w.getSheet("CR5");
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row row = s.getRow(i);
		for(int j = 0; j<row.getPhysicalNumberOfCells();j++) {
			Cell cell = row.getCell(j);
			System.out.println(cell.toString());
			
		}
		
		
	}
		
		
	
	
	}

}
