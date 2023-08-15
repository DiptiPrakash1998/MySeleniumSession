package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleurl {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		By forgotPwd= By.linkText("Forgot Password?");
		By pricing = By.linkText("Pricing");
		ElementUtil eleUtil = new ElementUtil(driver);
		//eleUtil.clickElementWhenReady(forgotPwd, 5);
		eleUtil.clickElementWhenReady(pricing, 5);
		String Url = waitForURLAndCapture("pricing.html", 5);
		System.out.println(Url);
		

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		if(wait.until(ExpectedConditions.urlContains("pricing.html"))) {
//			String url = driver.getCurrentUrl();
//			System.out.println(url);
//		}
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		if (wait.until(ExpectedConditions.titleContains("In Screen"))) {
//			String title = driver.getTitle();
//			System.out.println(title);
//		}
		
//		String title =waitFortitleIsAndCapture("Screen", 5);
//		System.out.println(title);

	}

	public static String waitFortitleIsAndCapture(String titleFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
			String title = driver.getTitle();
			System.out.println(title);
			return title;
		}
		else {
			System.out.println("title not found within the given time: "+ timeOut);
			return null;          
		}
	}
	
	public static String waitForActualtitleAndCapture(String titleValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		if (wait.until(ExpectedConditions.titleIs(titleValue))) {
			String title = driver.getTitle();
			System.out.println(title);
			return title;
		}
		else {
			System.out.println("title not found within the given time: "+ timeOut);
			return null;          
		}
	}
	
	public static String waitForURLContainsAndCapture(String URLFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.urlContains(URLFraction))) {
			String url = driver.getCurrentUrl();
			//System.out.println(url);
			return url;
		}
		else {
			System.out.println("URL not found within the given time: "+ timeOut);
			return null;
		}
	}
	
	public static String waitForURLAndCapture(String URLValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.urlToBe(URLValue))) {
			String url = driver.getCurrentUrl();
			//System.out.println(url);
			return url;
		}
		else {
			System.out.println("URL not found within the given time: "+ timeOut);
			return null;
		}
	}

}
