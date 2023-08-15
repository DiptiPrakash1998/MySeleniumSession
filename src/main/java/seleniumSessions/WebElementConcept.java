package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// 1st
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("naveen@123");

		// 2nd
//		WebElement emailid= driver.findElement(By.id("input-email"));
//		WebElement password= driver.findElement(By.id("input-password"));
//		emailid.sendKeys("naveen@gmail.com");
//		password.sendKeys("naveen@123");

		// 3rd:By Locator
//		By email= By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		WebElement emailID= driver.findElement(email);
//		WebElement password= driver.findElement(pwd);
//		emailID.sendKeys("naveen@gmail.com");
//		password.sendKeys("naveen@123");

		// 4th: By Locator and create an generic function for web element
//
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		WebElement emailID= getElement(email);
//		WebElement password= getElement(pwd);
//		emailID.sendKeys("naveen@gmail.com");
//		password.sendKeys("naveen@123");

		// 5th: By Locator and create an generic functions for web element and actions

//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		doSendKeys(email, "naveen@gmail.com");
//		doSendKeys(pwd,"naveen@123");

		// 6th: By Locator and create an generic functions for web element and actions in util class
		By email = By.id("input-email");
		By pwd = By.id("input-password");
		
		
		ElementUtil eutil = new ElementUtil(driver);
		eutil.doSendKeys(email, "naveen@gmail.com");
		eutil.doSendKeys(pwd, "naveen@123");
		
		
		

	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
