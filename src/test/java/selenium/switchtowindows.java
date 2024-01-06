package selenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class switchtowindows {
public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");	
WebDriver b=new ChromeDriver();	
b.get("https://www.redbus.in/");
b.manage().window().maximize();
b.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
b.findElement(By.xpath("//span[text()=\"Help\"]")).click();
Set<String>d=b.getWindowHandles();
System.out.println(d);
//b.findElement(By.xpath("//div[@class=\"modalCloseSmall\"]")).click();

	}


}
