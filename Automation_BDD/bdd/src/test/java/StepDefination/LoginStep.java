package StepDefination;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Automation.bdd.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStep extends BaseTest {
	
	// Start the test using the ExtentTest class object.
		ExtentTest extentTest = extent.startTest("Login to the flipkart");
		
	
	@Given("^I navigate to flipkart site$")
	public void goToSite() throws Exception{
		setBrowser();
		getWebDriver().get("https://www.flipkart.com/");
		// Thread.sleep(5000);
	}

	@When("^I click on sign in button$") 
	   public void clickSignInButton() {   
		waitOnElement("logInTxt",20000);
		getWebElement("logInTxt").click();
		extentTest.log(LogStatus.PASS, "Login click Successfully");
	   }

	 @Then("^I enter email id$") 
	   public void enterEmailId() { 
		 getWebElement("emailId").sendKeys("snehaldshinde02@gmail.com");
	 }
	 
	 
	 @And("^I enter password$") 
	   public void enterPassword() {  
		 WebElement password = getWebElement("password");
		 password.click();
		 password.sendKeys("kandepohe");
	 }
	
	 @And("^Click on login button$") 
	   public void clickLogInInButton() throws Exception {
		 Thread.sleep(2000);
		 getWebElement("loginBtn").click();
		 extentTest.log(LogStatus.PASS, "Login Successfully");
	 }
	  
	 @Then("^I close browser$") 
	 public void closeBrowser(){
		
		 extentTest.log(LogStatus.PASS, "Browser closed");
		 
		 // close report.
		 extent.endTest(extentTest);
	 
		// writing everything to document.
		 extent.flush();
		 getWebDriver().get("file:///C:/Users/Snehal%20Shinde/Documents/Automation/extentReportFile.html");
		 
	//	 driver.quit();
		 
	 }	

}


