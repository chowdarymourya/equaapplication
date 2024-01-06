package Testng;
//hard assertion means where we can write assertion can immeadtily through the 

//exception ,and next line of the code treated as un reachable code
//hard assertion can be write get url,gettitle,user nametextbox,errormessage is useget text 
//soft assertion use
//Softassertion sa=new Softassertion();through the object use assert methods,
//softassert should be expection throughs the end of script coud not terminate
//programme

import static org.testng.Assert.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class ng {
	@Test 

public void google() throws Throwable {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");
	WebDriver  driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.findElement(By.name("email")).sendKeys("watsapp",Keys.ENTER);
	String expect="Log in to Facebook";
	String actuall=driver.getTitle();
	assertEquals(expect, actuall,"Title is matched");
	//System.out.println(driver.getTitle());
	SoftAssert sa=new SoftAssert();
	String actuallurl=driver.getCurrentUrl();
	String expecturl="www.facebook.com/login/web/?email=Watsapp&is_from";
	sa.assertEquals(expecturl,actuallurl);
	
	//System.out.println(driver.getCurrentUrl());
	String acttext=driver.findElement(By.name("email")).getAttribute("value");
	String expecttext="#45";
	sa.assertEquals(expecttext,acttext,"user name is miss matched");
	driver.close();
	sa.assertAll();//use of this one end of the code through expction
}

@Test
public void automation() {
	WebDriver  driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.findElement(By.id("name")).sendKeys("mourya");
	System.out.println(driver.getTitle());
	driver.close();
}

}
