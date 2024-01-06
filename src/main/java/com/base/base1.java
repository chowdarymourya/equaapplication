package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class base1 {
	public static WebDriver driver;
	public static Properties p;//here declaregolbal
	private static FileInputStream s;//
String cpath="./src/main/java/configurationproperties/config";
public  base1() {//here create construcor is acces data in side constructor
	 p=new Properties();//this is class should be acess inside config data
	try {
		 s=new FileInputStream(cpath);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	try {
		p.load(s);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
public static void baserules() {
	String browser=p.getProperty("browser");
	if (browser.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");	
	 driver=new ChromeDriver();
	}	
	else if(browser.equalsIgnoreCase("Edge")) {	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\rani\\chromedriver.exe");
		driver=new EdgeDriver();
}
	driver.manage().window().maximize();
driver.get(p.getProperty("url"));
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


}
}


