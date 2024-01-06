package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class basic1 {
public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");	
WebDriver driver=new ChromeDriver();//syantx
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//enter url
driver.manage().window().maximize();//full screen
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//waiting time
driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
Thread.sleep(3000);
//driver.navigate().back();
//driver.navigate().forward();

}
}


	


