package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class abhibus {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");	
WebDriver ap=new ChromeDriver();
ap.get("https://www.abhibus.com/");
ap.manage().window().maximize();
ap.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
ap.findElement(By.xpath("//input[@placeholder=\"From Station\"]")).sendKeys("goa");
ap.findElement(By.xpath("//input[@placeholder=\"To Station\"]")).sendKeys("Hyderabad");
String user_month="January";
String user_year="2024";
String user_date="10";
ap.findElement(By.xpath("//input[@style=\"padding: 0px;\"]")).click();
		while(true) {
String cal =ap.findElement(By.xpath("//div[@style=\"text-align: center;\"]")).getText();
String []savecal=cal.split(" ");
String month=savecal[0];
String year=savecal[1];
if(month.equals(user_month)&& year.equals(user_year)) {
break;
}
else {	
	ap.findElement(By.xpath("//span[@class=\"calender-month-change\"]")).click();
}
List<WebElement>rr=ap.findElements(By.xpath("//span[@style=\"grid-column: auto;\"]"));
for(WebElement bb:rr)
{
	if(bb.getText().equals(user_date)) {
bb.click();
}}
}
		Thread.sleep(5000);
ap.findElement(By.xpath("//div[@id=\"search-button\"]")).click();
		
		
		
}
}