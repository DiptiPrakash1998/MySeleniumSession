package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickElement {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		By email = By.id("input-email");
		By pwd = By.id("input-password");
		By loginBtn= By.id("loginBtn");
		
		ElementUtil eutil = new ElementUtil(driver);
		eutil.doSendKeys(email, "naveen@gmail.com");
		eutil.doSendKeys(pwd, "naveen@123");
		eutil.doClick(loginBtn);
		
		


	}
	
	public static void doClear(By locator) {
		getElement(locator).clear();
	}
	
	public static void doSendKeys(By locator, String value) {
		if(value == null) {
			System.out.println("Value can not be null");
			throw new MySeleniumException("VALUECANNOTBENULL");
		}
		doClear(locator);
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}

	
	

}
