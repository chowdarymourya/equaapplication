package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.base1;

import pageobjectclass.homepage;
import pageobjectclass.pomclass;

public class logindetails extends base1 {
	pomclass login;
@BeforeMethod
public void first() {
	baserules();
	 login=new pomclass(driver);
}
@Test
public void homepagelogin() {
	login.login();
	System.out.println(driver.getCurrentUrl());
	
}

@AfterMethod
public void close() {
driver.close();


}
}
//}