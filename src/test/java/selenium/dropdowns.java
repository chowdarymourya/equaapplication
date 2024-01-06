package selenium;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class dropdowns {
public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");	
ChromeDriver m=new ChromeDriver();
m.get("https://testautomationpractice.blogspot.com/");
m.manage().window().maximize();
m.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//m.findElement(By.xpath(" //select[@id=\"country\"]")).click();
List<WebElement> all=m.findElements(By.xpath("//select[@id=\"country\"]//option"));
System.out.println(all.size());

Thread.sleep(3000);
for(WebElement h:all) {
h.click();
}
	
}
}




	


