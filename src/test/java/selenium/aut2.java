package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aut2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");
WebDriver a=new ChromeDriver();
a.get("https://demo.automationtesting.in/Register.html");
a.manage().window().maximize();
a.findElement(By.xpath("//a[text()='SwitchTo']")).click();
a.findElement(By.xpath("//a[text()='Windows']")).click();
Thread.sleep(3000);
a.findElement(By.xpath("//a[.='Open New Seperate Windows']")).click();
a.findElement(By.xpath("//button[@onclick=\"newwindow()\"]")).click();
//System.out.println(a.getTitle());
Set<String>d=a.getWindowHandles();//identify the all wnidows ids
Thread.sleep(3000);
for(String m:d)
{
//System.out.println(m);//here print ids
String h=a.switchTo().window(m).getTitle();//here switch to windows	
//System.out.println(h);
if(h.contains("frames & windows")) //close parent window
{	
a.close();
}
}
	}
  
	
}


	


