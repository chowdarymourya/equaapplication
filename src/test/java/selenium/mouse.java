package selenium;
import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class mouse {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");
WebDriver a=new ChromeDriver();
a.get("https://www.flipkart.com/");
a.manage().window().maximize();
a.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
a.findElement(By.xpath("//span[@role=\"button\"]")).click();
WebElement t=a.findElement(By.xpath("//span[.=\"Login\"]"));
Actions  r=new Actions(a);
r.moveToElement(t).perform();

	}

}
