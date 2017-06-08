package Automation.bdd;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.steadystate.css.dom.Property;

public class BaseTest {

	WebDriver driver;
	
	String extentReportImage = System.getProperty("user.dir") + "\\extentReportImage.png";

//	public ExtentReports extent = new ExtentReports("C:\\Users\\Snehal Shinde\\Documents\\Automation\\extentReportFile.html");
	
	public ExtentReports extent = new ExtentReports(System.getProperty("user.dir") + "\\extentReportFile.html");

	public  WebDriver getWebDriver(){
		return driver;
	}
	
	public <T> T getPage(Class<T> page)
	{
	return org.openqa.selenium.support.PageFactory.initElements(driver, page);
	}
	
	
	public void setBrowser(){
		System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 getWebDriver().manage().deleteAllCookies();
		 getWebDriver().manage().window().maximize();
		 getWebDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	
	public WebElement getWebElement(String propValue){
		String[] eleName = readProperty(propValue).trim().split(":");
		String locator=eleName[0];
		String element=eleName[1];
		WebElement ele=null;
	if(locator.equalsIgnoreCase("id"))  {
		ele = getWebDriver().findElement(By.id(element));
	}else if(locator.equalsIgnoreCase("xpath")) {
		ele = getWebDriver().findElement(By.xpath(element));
	}else if(locator.equalsIgnoreCase("class")) {
		ele = getWebDriver().findElement(By.className(element));
	}else{
		ele = getWebDriver().findElement(By.tagName(element));
	}
	return ele;
	}
	
	public WebElement getWhenVisible(By locator, int timeout) {
		 
		WebElement element = null;
		 
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		 
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 
		return element;
		 
		}
	
	public void waitOnElement(String keyValue,int time){
 
		WebDriverWait wait = new WebDriverWait(driver, time);
		WebElement element = getWebElement(keyValue);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	public String readProperty(String keyName){
		String filepath = "C:\\Users\\Snehal Shinde\\workspace\\bdd\\Utils\\Property.properties";
		String value="";
		try{
			Properties prop = new Properties();
			InputStream input=new FileInputStream(filepath);
			prop.load(input);
			
			value = prop.getProperty(keyName);
			System.out.println(value);
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return value;
	}
	
	public void clickOnElement(String keyValue){
		WebElement element = getWebElement(keyValue);
		element.click();
	}
	
	public boolean clickOnHiddenElement(String keyValue){
		WebElement element = getWebElement(keyValue);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (element != null){
			js.executeScript("arguments[0].click()", element);
			return true;
		} else {
			System.out.println("Element not found : ");
			return false;
		}
		
	}
	
	 public boolean clearCache() throws Exception {
		 for (int i = 0; i < 20; i++) {
			 ((JavascriptExecutor) driver).executeScript(String.format("window.localStorage.clear();"));
			 }
		 return true;
	}
	
/*	public static void main(String args[]){
		BaseTest bt = new BaseTest();
		bt.readProperty();
	}*/
}
