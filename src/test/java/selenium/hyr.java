package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hyr {
public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath()
	}

}
