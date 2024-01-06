package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");	
	WebDriver ap=new ChromeDriver();
	ap.get("https://testautomationpractice.blogspot.com/");
	ap.manage().window().maximize();
	ap.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement image=ap.findElement(By.xpath("//button[@onclick=\"myFunctionAlert()\"]"));
	//TakesScreenshot ts= (TakesScreenshot)ap;
File src=image.getScreenshotAs(OutputType.FILE);
File dst=new File("D:\\galleray.png");
FileUtils.copyFile(src, dst);	

	}

}
