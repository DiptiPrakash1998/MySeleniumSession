package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();

		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");

		By parentMenu = By.className("menulink");
		By childMenu = By.linkText("COURSES");
		//handleTwoLevelMenu(parentMenu, childMenu);
		handleTwoLevelMenu(parentMenu, "ARTICLES");
		
	}

	public static void handleTwoLevelMenu(By parentMenu, By childMenu) {

		WebElement contactMenu = driver.findElement(parentMenu);
		Actions act = new Actions(driver);
		act.moveToElement(contactMenu).build().perform();
		driver.findElement(childMenu).click();
	}
	
	public static void handleTwoLevelMenu(By parentMenu, String childMenu) {

		WebElement contactMenu = driver.findElement(parentMenu);
		Actions act = new Actions(driver);
		act.moveToElement(contactMenu).build().perform();
		driver.findElement(By.linkText(childMenu)).click();
	}

}
