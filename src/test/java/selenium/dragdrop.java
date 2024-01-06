package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");	
WebDriver ap=new ChromeDriver();
ap.get("https://testautomationpractice.blogspot.com/");
ap.manage().window().maximize();
ap.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement pickup=ap.findElement(By.xpath("//p[.=\"Drag me to my target\"]"));
WebElement drop=ap.findElement(By.xpath("//div[@id=\"droppable\"]"));
//Actions h=new Actions(ap);
//h.dragAndDrop(pickup, drop).perform();
WebElement g=ap.findElement(By.xpath("//input[@id=\"datepicker\"]"));
//Actions i=new Actions(ap);
//i.contextClick(g).perform();
WebElement j=ap.findElement(By.xpath("//button[.=\"Copy Text\"]"));
//Actions k=new Actions(ap);
//k.doubleClick(j).perform();
Thread.sleep(3000);
WebElement l=ap.findElement(By.xpath("//button[.=\"Prompt\"]"));
Actions z=new Actions(ap);
z.moveToElement(l).perform();


	}


}


