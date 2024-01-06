package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class autosugestion {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");			
ChromeDriver r=new ChromeDriver();
r.get("https://www.google.com/");
r.manage().window().maximize();
r.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
r.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("cricket");
List<WebElement> store=r.findElements(By.xpath("//div[@class=\"wM6W7d\"][@role=\"presentation\"]"));
System.out.println(store.size());
for(WebElement l:store) {
	String mc=l.getText();
	System.out.println(mc);
	if(l.getText().contains("cricket live score today")){
		l.click();
		break;
	
}
}
}
}	


