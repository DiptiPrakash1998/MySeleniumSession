package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeOptions co = new ChromeOptions();
		
		//co.addArguments("--headless");
		//co.addArguments("--incognito");
		FirefoxOptions fo= new FirefoxOptions();
		fo.addArguments("--incognito");
		WebDriver driver= new FirefoxDriver(fo);
		
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());

	}

}
