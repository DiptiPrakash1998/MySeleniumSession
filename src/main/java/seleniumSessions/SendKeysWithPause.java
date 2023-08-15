package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithPause {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement mailId =driver.findElement(By.id("input-email"));
		//mailId.sendKeys("dipti@gmail.com");
		
		String id = "dipti@gmail.com";
		Actions act = new Actions(driver);
		
		char c[]= id.toCharArray();
		
		for(char e: c) {
			act.sendKeys(mailId, String.valueOf(e)).pause(500).build().perform();
		}
	}

}
