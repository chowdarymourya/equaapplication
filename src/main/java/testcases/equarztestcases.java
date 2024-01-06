package testcases;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.base1;

import pageobjectclass.equfunctionality;
import utils.utilsclass;

public class equarztestcases extends base1 {
	equfunctionality register;
	String Excelsheet_name="equa";
	@DataProvider
	public String[][] equa() throws Throwable {
		return utilsclass.setdata(Excelsheet_name);
	}
	@BeforeMethod
	public void setup() {
		baserules(); 
		 register=new equfunctionality(driver);
	}
@Test(dataProvider="equa",dataProviderClass=equarztestcases.class)
public void equfunctionality(String nm,String paswd) {
	register.equacredntials(nm, paswd);
		
	}

	}


