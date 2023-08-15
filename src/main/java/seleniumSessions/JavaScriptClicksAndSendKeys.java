package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptClicksAndSendKeys {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		
		Thread.sleep(1000);
		
		WebElement ele = driver.findElement(By.id("persistent"));
		//ele.click();
//		
//		Actions action = new Actions(driver);
//		action.click(ele).build().perform();
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		
		jsUtil.clickElementByJS(ele);
		jsUtil.sendKeysUsingWithId("login-username", "dipti@yahoo.com");

	}

}
