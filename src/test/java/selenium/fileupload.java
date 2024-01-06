package selenium;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class fileupload {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");
	WebDriver a=new ChromeDriver();
a.get("http://empirehome.myprojectsonline.co.in/");	
a.manage().window().maximize();
a.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
a.findElement(By.xpath("//input[@title=\"Enter email / mobile number\"]")).sendKeys("sureshbabuemp@gmail.com");
a.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("ZPMHQHIA");
a.findElement(By.xpath("//button[.=\"Login\"]")).click();
Thread.sleep(5000);
a.findElement(By.xpath("//i[@class=\"fa fa-houzz\"]")).click();
a.findElement(By.xpath("//a[text()=\"All Inventory\"]")).click();
Thread.sleep(3000);
a.findElement(By.xpath("//a[@class=\"btn btn-add\"]")).click();
WebElement button=a.findElement(By.xpath("//input[@type=\"file\"][@name=\"DocumentsUploaded\"]"));
JavascriptExecutor js=(JavascriptExecutor)a;
	js.executeScript("arguments[0].click();",button);
//copy the path////ctrl+v//enter
Robot rb=new Robot();
rb.delay(3000);
StringSelection ss=new StringSelection("\"C:\\Users\\ADMIN\\Downloads\\eStatement (1).pdf\"");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

rb.keyPress(KeyEvent.VK_CONTROL);
rb.keyPress(KeyEvent.VK_V);

rb.keyRelease(KeyEvent.VK_CONTROL);
rb.keyRelease(KeyEvent.VK_V);

rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);

	
	
	
	}

}
