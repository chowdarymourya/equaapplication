package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class redbus {
public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
	a.get(" https://www.redbus.in/");	
	a.manage().window().maximize();
	a.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
	a.findElement(By.xpath(" //label[text()=\"From\"]//preceding::input")).sendKeys("hyderabad");
	a.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("banglore");
	a.findElement(By.xpath("//div[@class=\"sc-kAzzGY llxTcS\"]")).click();
	//String user_month="Dec";
	//String user_year="2023";
	//String user_date="20";
	//while(true) {
		
	//String redbus=a.findElement(By.xpath("//div[@style=\"flex-grow: 2; font-size: 0.875rem;\"]")).getText();
	//String []bussplit=redbus.split(" ");
	//String month=bussplit[0];
	//String year=bussplit[1];
	//if(month.equals(user_month)&& year.equals(user_year)) {
		//break;
	//}
	a.findElement(By.xpath("//span[text()=\"20\"]")).click();
	//Thread.sleep(3000);
	
	//List <WebElement>store=a.findElements(By.xpath("//div[@class=\"DayTiles__CalendarTileText-sc-1xum02u-2 fMKRZf\""));
	//for(WebElement hide:store)
	//{
		//if(hide.getText().equals(user_date)) {
			//hide.click();
			//a.close();
	Thread.sleep(5000);
	a.findElement(By.xpath("//button[@tabindex=\"5\"]")).click();
		}
	}
	


//}
//}
//}

