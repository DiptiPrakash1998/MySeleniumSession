package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartPageTest {

	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title =driver.getTitle();
		System.out.println(title);
		By email = By.id("input-email");
		By pwd = By.id("input-password");
		
		ElementUtil ele = new ElementUtil(driver);
		ele.doSendKeys(email, "abv@gmal.com");
		ele.doSendKeys(pwd, "abc123");

	}

}
