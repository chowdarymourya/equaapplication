package selenium;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Autos {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");			
ChromeDriver r=new ChromeDriver();
r.get("https://www.google.com/");
r.manage().window().maximize();
r.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
r.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("images");
List<WebElement>store=r.findElements(By.xpath("//div[@class=\"wM6W7d\"][@role=\"presentation\"]"));
System.out.println(store.size());
for(WebElement m:store) {
	String d=m.getText();
	System.out.println(d);
if(m.getText().equals("images to pdf")) {
m.click();
break;

	}

}
}
}