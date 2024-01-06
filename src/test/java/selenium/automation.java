package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class automation {

public static void main(String[] args) throws InterruptedException  {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");	
WebDriver m=new ChromeDriver();
m.get("https://opensource-demo.orangehrmlive.com/");
m.manage().window().maximize();
Thread.sleep(3000);
m.findElement(By.xpath(" //input[@placeholder=\"Username\"]")).sendKeys("Admin");
m.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
m.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//System.out.println(m.getTitle());
//System.out.println(m.getPageSource());
Thread.sleep(3000);
//m.navigate().back();
System.out.println(m.getWindowHandles());




}
}







	








