package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amzon.com");
//		String pagesource= driver.getPageSource();
//		System.out.println(pagesource);
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.navigate().refresh();

	}

}
