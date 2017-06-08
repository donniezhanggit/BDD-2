package Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class a {

	public static void main(String[] args) {
		WebDriver driver;
		 System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.get("https://www.creditkarma.com/");
		 
		 driver.findElement(By.xpath(".//*[normalize-space(text())='Sign up']")).click();
		 
	}

}
