package pageobjectclass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class pomclass{
@FindBy(xpath="//input[@name='user_id']")
WebElement name;
@FindBy(name="password")
WebElement password;
@FindBy(xpath="//button[text()='Sign in']")
WebElement submit;
@FindBy(xpath="//a[text()='Home']")
WebElement click;
public pomclass(WebDriver driver) {
	PageFactory.initElements( driver, this);
}
public homepage login() {
	
	name.sendKeys("user name");
	password.sendKeys("password");
	submit.click();
	click.click();
	return  new homepage();
}
	}


