package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		//chrome111.x
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new SafariDriver();
		driver.get("https://www.amazon.com");
		String title= driver.getTitle();
		System.out.println(title);

	}

}
