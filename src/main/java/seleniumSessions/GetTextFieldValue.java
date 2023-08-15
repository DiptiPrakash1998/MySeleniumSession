package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement element = driver.findElement(By.id("input-email"));
		element.sendKeys("dipti@gmail.com");
//		String text = element.getText();
//		System.out.println(text);----> //This will not fetch the mail id this will give Blank Value
		String attrValue = element.getAttribute("value");
		System.out.println(attrValue);
	}

}
