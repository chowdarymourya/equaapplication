package Testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataretrive {
	@DataProvider (name="namepassword")
	public Object xl() throws Throwable {
File f=new File("./testdata/data retive.xlsx");
FileInputStream s=new FileInputStream(f);
XSSFWorkbook w=new XSSFWorkbook(s);
XSSFSheet sheet=w.getSheetAt(3);
int r=sheet.getPhysicalNumberOfRows();//4rows
int cells=sheet.getRow(0).getLastCellNum();
Object [][]data= new Object[r-1][cells];
for(int i=0;i<r-1;i++) {
	for(int j=0;j<cells;j++) {
		//System.out.println(sheet.getRow(i).getCell(j));
		DataFormatter df=new DataFormatter();
		data [i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
	}
	
}
   return data;

		
		
	}

}
