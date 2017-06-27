package Automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Automation.bdd.TestFactory;

public class Home extends TestFactory
{
	
	//@FindBy(how = How.XPATH, using=".//*[normalize-space()='Log In']")
	@FindBy(xpath=".//*[normalize-space()='Log In']")
	public WebElement logInTxt;
	
	@FindBy(how = How.XPATH, using=".//*[normalize-space()='Enter Email/Mobile number']")
	WebElement emailId;
	
	@FindBy(how = How.XPATH, using=".//*[normalize-space()='Enter Password']")
	WebElement password;
	

	@FindBy(how = How.XPATH, using=".//form//span[normalize-space()='Login']")
	WebElement loginBtn;
	

/*	public Home(WebDriver driver){
		//getWebDriver();
		getPage(Home.class);
	}
	*/
	public void clickOnLoginTxt() throws Exception{
		Thread.sleep(5000);
		logInTxt.click();
	}
	
	public void enterEmailId(){
		emailId.sendKeys("snehalshinde.xoriant@gmail.com");
	}
	
	public void enterPassword(){
		password.click();
		password.sendKeys("kandepohe");
	}
	
	public void clickOnLoginBtn(){
		loginBtn.click();
	}
}
