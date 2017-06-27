package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import Automation.bdd.TestFactory;
import Automation.pom.Home;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeStep {
	
	WebDriver driver;

	// Home homePage = TestFactory.getPage(Automation.pom.Home.class);
	
	@Given("^I navigate to flipkart site$")
	public void goToSite() throws Exception{
	//	Home homePage = TestFactory.getPage(Automation.pom.Home.class);
		Home homePage = PageFactory.initElements(TestFactory.getWebDriver(), Automation.pom.Home.class);	
		homePage.setBrowser();
		homePage.getWebDriver().get("http://www.flipkart.com");
		homePage.clickOnLoginTxt();
	}

	@When("^I click on sign in button$") 
	   public void clickSignInButton() {   
		Home homePage = org.openqa.selenium.support.PageFactory.initElements(TestFactory.getWebDriver(), Automation.pom.Home.class);	
		homePage.clickOnLoginBtn();	
	   }

	 @Then("^I enter email id$") 
	   public void enterEmailID() { 
		 Home homePage = org.openqa.selenium.support.PageFactory.initElements(TestFactory.getWebDriver(), Automation.pom.Home.class);	
		 homePage.enterEmailId();	 
	 }
	 
	 
	 @And("^I enter password$") 
	   public void enterPassword() {  
		 Home homePage = org.openqa.selenium.support.PageFactory.initElements(TestFactory.getWebDriver(), Automation.pom.Home.class);	
		 homePage.enterPassword();	 
	 }
	
	 @And("^Click on login button$") 
	   public void clickLogInInButton() throws Exception {
		 Home homePage = org.openqa.selenium.support.PageFactory.initElements(TestFactory.getWebDriver(), Automation.pom.Home.class);	
		 homePage.clickOnLoginBtn();
	 }
	  
	 @Then("^I close browser$") 
	 public void closeBrowser(){
		 Home homePage = org.openqa.selenium.support.PageFactory.initElements(TestFactory.getWebDriver(), Automation.pom.Home.class);	
		 homePage.getWebDriver().close();
	 }	

}
