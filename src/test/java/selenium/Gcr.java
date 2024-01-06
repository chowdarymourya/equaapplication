package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Gcr {
	static WebDriver gcr;
	static void click(String xpath) {
	gcr.findElement(By.xpath(xpath)).click();
	}
	static void  sendkeys(String xpath) {
		gcr.findElement(By.xpath(xpath)).sendKeys("mourya");
	}
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");
   gcr=new ChromeDriver();
  gcr.get("https://testautomationpractice.blogspot.com/");
  gcr.manage().window().maximize();
  gcr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  click("//input[@id=\"FSsubmit\"]");
  sendkeys ("//input[@id=\"name\"]");
  
  

		
		
	}

}
