package selenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class threads {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");	
WebDriver m=new ChromeDriver();
m.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
m.manage().window().maximize();
m.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
m.findElement(By.xpath("//button[.='Change Text to Selenium Webdriver']")).click();
if(m.findElement(By.xpath("//h2[.='Selenium Webdriver']")).isEnabled());
{
	System.out.println("Selenium Webdriver");
}
m.findElement(By.xpath("//button[.='Display button after 10 seconds']")).click();
Thread.sleep(3000);
if(m.findElement(By.xpath("//button[.='Enabled']")).isEnabled());
{
System.out.println("Enabled");
}
m.findElement(By.xpath("//button[.='Enable button after 10 seconds']")).click();
if(m.findElement(By.xpath("//button[text()='Button']")).isDisplayed());
{
	System.out.println("button");
}
Thread.sleep(3000);
m.findElement(By.xpath("//button[@id=\"checkbox\"]")).click();
if(m.findElement(By.xpath("//input[@type=\"checkbox\"]")).isSelected());
{
	System.out.println("checkbox");	
}
m.close();
}

	}


