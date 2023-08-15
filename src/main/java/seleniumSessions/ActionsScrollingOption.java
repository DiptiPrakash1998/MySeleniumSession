package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrollingOption {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
//		driver.get("https:www.flipkart.com ");
//		
//		Actions act = new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		act.sendKeys(Keys.PAGE_UP).build().perform();
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).build().perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).build().perform();
//		//refresh the page
//		act.keyDown(Keys.COMMAND).sendKeys(Keys.F5).keyUp(Keys.COMMAND).build().perform();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String s1 = "Priya";
		String s2 = "Patro";
		StringBuffer s3 = new StringBuffer("Test");
		StringBuilder s4 = new StringBuilder("Automation");
		
		//driver.findElement(By.name("search")).sendKeys(s1 +" "+ s2+" "+s3+" "+s4);
		driver.findElement(By.name("search")).sendKeys(null);
		
		
	}

}
