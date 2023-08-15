package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsWithKeysConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(By.name("firstname")), "Dipti")
			.sendKeys(Keys.TAB)
			.pause(1000)
			.sendKeys("Patro")
			.pause(1000)
			.sendKeys(Keys.TAB)
			.sendKeys("dipti@gmail.com")
			.pause(1000)
			.sendKeys(Keys.TAB)
			.sendKeys("9898989898")
			.pause(1000)
			.sendKeys(Keys.TAB)
			.sendKeys("Dipti@181")
			.pause(1000)
			.sendKeys(Keys.TAB)
			.sendKeys("Dipti@181")
			.pause(1000)
			.sendKeys(Keys.TAB)
			.pause(1000)
			.sendKeys(Keys.TAB)
			.pause(1000)
			.sendKeys(Keys.TAB)
			.pause(1000)
			.click()
			.sendKeys(Keys.TAB)
			.pause(1000)
			.click()
			.build().perform();
	}

}
