package seleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
/**
 * date :24th March 2023
 * @author diptipatro
 *
 */
public class BrowserUtil {

	WebDriver driver;
/**
 * The method is initializing the driver on the basis of browser
 * @param BrowserName
 */
	public WebDriver initDriver(String BrowserName) {
		System.out.println("launching the Browser" + BrowserName);
		if (BrowserName == null) {
			System.out.println("Browser can not be Null");
			throw new MySeleniumException("BrowserNullException");
		}

		switch (BrowserName.toLowerCase().trim()) {
		case "chrome":
//			ChromeOptions co = new ChromeOptions();
//			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("pls pass the right browsername" + BrowserName);
			throw new MySeleniumException("Wrong browser exception");

		}
		return driver;

	}

	public void launchUrl(String url) {
		if (url == null) {
			System.out.println("URL can not be Null");
			throw new MySeleniumException("URLNULLException");
		}
		if (url.contains("http")) {
			driver.get(url);
		} else {
			System.out.println("http(s) is missing");

		}
	}
	
	/*
	 * added on april05
	 */
	public void launchUrl(URL url) {
		if (url == null) {
			System.out.println("URL can not be Null");
			throw new MySeleniumException("URLNULLException");
		}
	//	driver.navigate().to(url);
		String mainUrl= String.valueOf(url);
		if(mainUrl.contains("http")) {
			driver.get(mainUrl);
		}
		else {
			System.out.println("http(s) is missing");

		}
	}
	

	public String getTitle() {
		return driver.getTitle();
	}

	public String getPageURL() {
		return driver.getCurrentUrl();
	}
	public void quitBrowser() {
		 driver.quit();
	}
	public void closeBrowser() {
		 driver.close();
	}

}
