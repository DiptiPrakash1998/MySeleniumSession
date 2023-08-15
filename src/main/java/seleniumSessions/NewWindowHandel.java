package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandel {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent window
		String parentWindowID= driver.getWindowHandle();
		// New feature in selenium 4.x
		//driver.switchTo().newWindow(WindowType.TAB);// open a blank tab
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://chrome.com");// new tab
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());
	}

}
