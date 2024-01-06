package selenium;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class excel {
public static void main(String[] args)throws Throwable{
	File f=new File("\"C:\\Users\\ADMIN\\Desktop\\practice.xlsx\"");
	FileInputStream stream=new FileInputStream(f);
	XSSFWorkbook wrokbook=new XSSFWorkbook(stream);
	XSSFSheet sheet=wrokbook.getSheetAt(0);
	int rows=sheet.getPhysicalNumberOfRows();//4 rows
	int celles=sheet.getRow(1).getLastCellNum();// 2 cells
	for(int i=1;i<rows;i++) {//rows
		for(int j=0;j<celles;j++) {
	System.out.println(sheet.getRow(i).getCell(j));
		
		}
	}
		stream.close();
		wrokbook.close();
	}

}
