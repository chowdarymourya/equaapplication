package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class monstar2 {
public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");	
	WebDriver m=new ChromeDriver();
m.get("https://www.foundit.in/");
m.manage().window().maximize();
m.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
m.findElement(By.xpath("//i[@class=\"mqfihd-upload\"]")).click();
m.findElement(By.xpath("//input[@id=\"file-upload\"] "));
JavascriptExecutor js=(JavascriptExecutor)m;
js.executeScript("arguments[0].click();",js);

Robot ms =new Robot();//keybord
ms.delay(3000);
StringSelection ss=new StringSelection("C:\\Users\\ADMIN\\Downloads");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);





	}

}
