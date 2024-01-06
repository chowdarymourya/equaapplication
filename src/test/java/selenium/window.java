package selenium;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class window {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");	
	WebDriver b=new ChromeDriver();	
b.manage().window().maximize();
b.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
String prentwindow=b.getWindowHandle();
//System.out.println(prentwindow);
b.findElement(By.xpath("//button[@onclick=\"newBrowserWindow()\"]")).click();
Set<String> twowindows=b.getWindowHandles();
for(String main:twowindows) {
	if(!main.equals(prentwindow)) {
		b.switchTo().window(main);
	b.manage().window().maximize();
	//b.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	b.findElement(By.id("lastName")).sendKeys("mourya");
	Thread.sleep(5000);
	b.close();
}
	//System.out.println(twowindows+b.getTitle());
}
b.switchTo().window(prentwindow);
b.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("banu");
Thread.sleep(5000);
System.out.println(b.getWindowHandle());
b.quit();
}
}


