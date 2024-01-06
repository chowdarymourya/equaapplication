package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ann {
  @Test
  public void test() {
	  System.out.println("@test");
  }  
  @Test
  public void test2() {
	  System.out.println("@test");
  }  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@beforemethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@aftermethod");
  }
  

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@beforesuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@aftersuite");
  }

}
