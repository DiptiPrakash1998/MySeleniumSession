package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementAndFindElements {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
//		driver.findElement(By.name("search11")).sendKeys("mackbook");
//		//NoSuchElementException
//		
//		List<WebElement> rightpannel =driver.findElements(By.className("list-group-item"));
//		System.out.println(rightpannel.size());
		
		By search = By.name("search");
		if(checkElementIsDisplayed(search)) {
			System.out.println("enter the value");
		}

	}
	
	public static boolean checkElementIsDisplayed(By locator) {
		List<WebElement> eleList =driver.findElements(locator);
		if(eleList.size()>0) {
			System.out.println("Element is present on the page");
			return true;
		}
		else {
			System.out.println("Element is not present");
			return false;
		}
	}

}
