package selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//all xpaths store one time using find elements
public class parentchild {
public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");	
WebDriver m=new ChromeDriver();
m.get("https://testautomationpractice.blogspot.com/");
List<WebElement>store=m.findElements(By.xpath("//input[@class=\"form-check-input\"][@type=\"checkbox\"]"));
Thread.sleep(3000);
System.out.println(store.size());
for(WebElement n:store) {
	n.click();
	
	if(n.getText().equals("sunday")) {
	n.click();
	
	
}	
}
}
}	


