package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class web {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");			
	ChromeDriver r=new ChromeDriver();
	r.get("https://cosmocode.io/automation-practice-webtable/");
	r.manage().window().maximize();
List<WebElement>hide=r.findElements(By.xpath("//table[@id=\"countries\"]//tr//td[@style=\"width: 134.667px;\"]"));
List<WebElement>save=r.findElements(By.xpath("//input[@type=\"checkbox\"]"));
for(int n=1;n<=hide.size();n++) {
	if(hide.get(n).getText().equalsIgnoreCase("Iraq")) {
		save.get(n).click();
	}
	
}
	}

}
