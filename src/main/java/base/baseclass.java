package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");	
	WebDriver ap=new ChromeDriver();
	ap.get("url");
	ap.manage().window().maximize();
	ap.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
}