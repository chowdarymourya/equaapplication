package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ab {
	WebDriver driver;
@BeforeMethod
public void url() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
driver.findElement(By.xpath("//span[text()=\"Admin\"]")).click();
driver.findElement(By.xpath("//span[text()=\"Time\"]")).click();
}
@Test

public void main() {
	driver.findElement(By.xpath("//span[text()=\"Admin\"]")).click();
	driver.findElement(By.xpath("//span[text()=\"Time\"]")).click();
}
@Test
public void userdetails() {
	driver.findElement(By.xpath("//span[text()=\"Leave\"]")).click();
	
	

}
@AfterMethod
public void close() {
driver.close();


}
}