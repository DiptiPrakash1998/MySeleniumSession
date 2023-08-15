package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindow {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		By twitterLink = By.xpath("//a[contains(@href,'twitter')]");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.clickElementWhenReady(twitterLink, 5);

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		Boolean flag = wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		if(waitForTotalWindows(2,5)) {
			driver.getWindowHandles();
		}

	}
	
	public static boolean waitForTotalWindows(int totalWindowsToBe, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.numberOfWindowsToBe(totalWindowsToBe));
	}

}
