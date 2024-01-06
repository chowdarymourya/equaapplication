package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class alert2 {
	public static void main(String[] args) {	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");
	WebDriver a=new ChromeDriver();
	a.get("https://testautomationpractice.blogspot.com/");
	a.manage().window().maximize();
	a.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
a.findElement(By.xpath("//button[text()='Alert']")).click();
a.switchTo().alert().accept();
a.findElement(By.xpath("//button[.='Confirm Box']")).click();
System.out.println(a.switchTo().alert().getText());
a.switchTo().alert().accept();
a.findElement(By.xpath("//button[text()=\"Prompt\"]")).click();


	

}
}