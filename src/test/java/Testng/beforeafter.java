package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class beforeafter {
	@BeforeTest
	public void Beforetest() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");		
		WebDriver  driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("phone")).sendKeys("123");
		//driver.close();
	}
	@AfterTest
	public void Aftertest() {
		WebDriver  driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.close();
	}
	
	@Test
	public void test() {
		//System.setProperty("webdriver.chrome.driver", 
				//"C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");		
		WebDriver  driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("name")).sendKeys("mourya");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
	}

}
