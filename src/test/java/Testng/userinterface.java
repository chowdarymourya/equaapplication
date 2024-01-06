package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class userinterface {
	@Test(dataProvider ="namepassword",dataProviderClass=dataretrive.class) 
	public void hrm(String name,String pasword) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");		
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://empirehome.myprojectsonline.co.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("emailid")).sendKeys(name);
		driver.findElement(By.name("pword")).sendKeys(pasword);
		driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
		String actuallurl=driver.getCurrentUrl();
		String expecturl="http://empirehome.myprojectsonline.co.in/EmpireHome/Dashboard";
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(actuallurl, expecturl);
		driver.close();
		
	}

}
