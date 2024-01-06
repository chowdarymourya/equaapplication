package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class calendar {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");			
	ChromeDriver r=new ChromeDriver();
	r.get("https://www.hyrtutorials.com/p/calendar-practice.html");
	r.manage().window().maximize();
	r.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	String user_month="January";
	String user_year="2025";
	String user_date="10";
	r.findElement(By.xpath("//input[@id=\"first_date_picker\"]")).click();
	while(true) {
	String cal=r.findElement(By.xpath("//div[@class=\"ui-datepicker-title\"]")).getText();
	String[]datesplit=cal.split(" ");
	String monthu=datesplit[0];
	String yearu=datesplit[1];
	if(monthu.equals(user_month)&& yearu.equals(user_year)) {
	break;
	}
	else {
		r.findElement(By.xpath("//span[text()=\"Next\"]")).click();
	}
	}

List<WebElement>store=r.findElements(By.xpath("//td[@data-handler=\"selectDay\"]"));
	for(WebElement dates:store)
	{
		if(dates.getText().equals(user_date)) {
			
			dates.click();
		}
		
		List<WebElement>save=r.findElements(By.xpath(" "));
		for(WebElement hide:save)
		{
			if(dates.getText().equals(user_date)) {
				
				dates.click();
			}
	
		
	}
}
}	
}

