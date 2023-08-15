package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.safari.SafariDriver;

public class SseleniuManagerConcept {

	public static void main(String[] args) {
	ChromeOptions co= new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(co);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		String cpath=SeleniumManager.getInstance().getDriverPath(co);
		System.out.println(cpath);
		driver.quit();
		

	}

}
