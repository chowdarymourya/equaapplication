package selenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class alerts {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");	
WebDriver m=new ChromeDriver();
m.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
m.manage().window().maximize();
WebDriverWait wait=new WebDriverWait(m,15);
m.findElement(By.xpath("//button[.='Click me, to Open an alert after 5 seconds']")).click();
Thread.sleep(5000);
System.out.println(m.switchTo().alert().getText());
m.switchTo().alert().accept();
m.close();





}

}
