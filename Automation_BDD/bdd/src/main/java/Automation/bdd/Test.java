package Automation.bdd;

public class Test {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static final long MAX_TIME_OUT_IN_SECS = 120L;
	public static List<String> log = new ArrayList<String>();


	public static <T> T getPage(Class<T> page)
	{
	return org.openqa.selenium.support.PageFactory.initElements(TestFactory.driver, page);
	}


	public static WebDriver getDriver()
	{
	return TestFactory.driver;
	}


	public static void setDriver(String browser, String url)
	{
	try
	{
	String userDir = System.getProperty("user.dir");
	switch(browser.replaceAll(" ", "").toLowerCase())
	{
	case "ie" :
	System.setProperty("webdriver.ie.driver", userDir+"/lib/IEDriverServer.exe");
	TestFactory.driver = new InternetExplorerDriver(); 
	break;
	case "chrome" :
	System.setProperty("webdriver.chrome.driver",  userDir+"/lib/chromedriver.exe");
	TestFactory.driver = new ChromeDriver();
	break;
	case "firefox":
	//
	System.setProperty("webdriver.gecko.driver", userDir+"/lib/geckodriver.exe");
	//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	TestFactory.driver = new FirefoxDriver(); 
	break;
	default:
	System.out.println("Browser value is incorrect");
	org.junit.Assert.assertFalse("Browser type entered is not correct", false);
	//Assert.assertFalse("Browser type entered is not correct", false);
	break;
	}
	TestFactory.driver.manage().deleteAllCookies();
	TestFactory.driver.get(url);
	log.add(url+ "is launched\n");
	TestFactory.driver.manage().window().maximize();
	}
	catch(Exception e) 
	{
	e.printStackTrace();
	}
	}
	/* This Method is for destroying the driver istance
	* 
	* @param NA
	* @return void
	* @author Sumit Jadhav
	* @exceptions NullPointerExeception
	* */
	public static void closeWebDriver() 
	{
	 
	TestFactory.driver.close();
	TestFactory.driver.quit();
	TestFactory.driver = null;
	 
	}
	/* This method is used to wait for mentioned MAX_TIME_OUT and if the element is found  loop will get abandaned
	* and if it is not displayed within time it will throw an Exception.
	* @param WebElement as InPut
	* @author Sumit Jadhav
	* @exception NoSuchElementFoundException
	*
	  Thrown to indicate there is Nosuchelement is present in DOM with given locator
	* @exception TimeOutException 
	* 
	  Thrown to indicate maximum Time out has elasped still element is not found.
	* */
	public static boolean waitforpageLoad(WebElement we)throws TestException
	{
	waitForJStoLoad();
	long end = System.currentTimeMillis() + (MAX_TIME_OUT_IN_SECS * 1000);
	//Reporter.addStepLog("Loading );
	boolean status = false;
	try
	{
	while(System.currentTimeMillis()< end && !status){
	try{
	if(we.isDisplayed()){
	status = true;
	break;
	}
	Thread.sleep(1000);
	}
	catch(NoSuchElementException e){
	continue;
	}
	catch(InterruptedException e){}
	}
	}
	catch(NoSuchElementException e){
	e.printStackTrace();
	TestException ce = new TestException("WaitForPageLoad", "No such element with such locator" + we);
	throw ce;
	}catch (org.openqa.selenium.TimeoutException e){
	e.printStackTrace();
	TestException ce = new TestException("WaitForPageLoad", "Unable to navigate to element" + we);
	throw ce;
	}catch(ElementNotVisibleException e){
	e.printStackTrace();
	TestException ce = new TestException("WaitForPageLoad", "Element is not visible" + we);
	throw ce;
	}
	return status;
	}
	
}
