package selenium;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Webtable {
public static void main(String[] args) throws Throwable {
		
System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");			
	ChromeDriver r=new ChromeDriver();
	r.get("https://cosmocode.io/automation-practice-webtable/");
	r.manage().window().maximize();
	r.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	List<WebElement> save=r.findElements(By.xpath("//table[@id=\"countries\"]//tr//td[@style=\"width: 134.667px;\"]"));
	List<WebElement>store=r.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	System.out.println(save.size());
	for(WebElement m:save)
	{    // String mourya=m.getText();
		//System.out.println(mourya);
		//for(WebElement mourya:store) {
		//	mourya.click();
		
			
		//}
		//}
		if(m.getText().equalsIgnoreCase("India"))
		{
			

			
		
	}
	}

}
}