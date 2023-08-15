package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelection {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://demo.1crmcloud.com/login.php");
		By lang = By.id("login_lang");
		By theme = By.id("login_theme");
		
		//doselectDropDownbyIndex(lang, 2);
		//doselectDropDownbyIndex(theme, 3);
		doSelectDropDownByVisibleText(lang, "IT Italiano");
		doSelectDropDownByValueAttribute(theme, "Delight");

	}
	
	public static void doselectDropDownbyIndex(By locator,int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public static void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public static void doSelectDropDownByValueAttribute(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
