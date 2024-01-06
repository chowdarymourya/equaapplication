package selenium;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Twowindow {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");	
WebDriver b=new ChromeDriver();	
b.manage().window().maximize();
b.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
b.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
b.findElement(By.xpath("//button[@id=\"newWindowBtn\"]")).click();
String parent=b.getWindowHandle();//23456hju
//System.out.println(parent);
Set <String>twowindows =b.getWindowHandles();
//System.out.println();
for(String main:twowindows) {
if(!main.equals(parent)) {
b.switchTo().window(main);
b.manage().window().maximize();
b.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("rani");
System.out.println(b.getWindowHandle()+b.getTitle());
Thread.sleep(3000);
b.close();
}
}
b.switchTo().window(parent);
b.findElement(By.xpath("//input[@class=\"whTextBox\"]")).sendKeys("radikarani");
Thread.sleep(3000);
b.close();
}
}