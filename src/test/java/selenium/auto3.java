package selenium;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//select box
public class auto3 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");	
WebDriver m=new ChromeDriver();	
m.get("https://demo.automationtesting.in/Register.html");
Thread.sleep(3000);
m.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("mourya");
m.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("banu");
m.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("kurnool");
m.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("mourya@gmail.com");
m.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).sendKeys("23456");
m.findElement(By.xpath("//input[@type=\"radio\"]")).click();
m.findElement(By.xpath("//input[@value=\"Cricket\"]")).click();
Thread.sleep(3000);
JavascriptExecutor n= (JavascriptExecutor) m;  
n.executeScript("(0,500)");
Thread.sleep(3000);
n.executeScript("m.findElementBy.id('Refresh').scrollIntoview();");
m.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
m.findElement(By.xpath("//a[text()='English']")).click();
if(m.findElement(By.xpath("//h1[text()='Automation Demo Site ' ]")).isDisplayed());{
 System.out.println("automation");	
}
}
}