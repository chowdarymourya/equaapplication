package selenium;
import java.io.File;
import java.nio.file.Files;

//tagname[@attribute="value"]
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class selectd {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");	
WebDriver m=new ChromeDriver();	
m.get("https://testautomationpractice.blogspot.com/");
WebElement dc=m.findElement(By.xpath("//button[.=\"Copy Text\"]"));
Actions g=new Actions(m);
g.doubleClick(dc).perform();
WebElement rc=m.findElement(By.xpath("//button[@onclick=\"myFunctionAlert()\"]"));
g.contextClick(rc).perform();
WebElement pickup=m.findElement(By.xpath("//p[text()=\"Drag me to my target\"]"));
WebElement drop=m.findElement(By.xpath("//div[@id=\"droppable\"]"));
g.dragAndDrop(pickup, drop).perform();

}

}