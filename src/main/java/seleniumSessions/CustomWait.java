package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
	static WebDriver driver;
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement reTryingElemnt(By locator, int timeOut) {
		WebElement element= null;
		int attempts = 0;
		
		while(attempts<timeOut) {
			try {
			element = getElement(locator);
			System.out.println("Element is Found"+locator+"in attempt"+attempts);
			break;
			}
			catch(NoSuchElementException e) {
				System.out.println("Element not Found"+locator+"in attempt"+attempts);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			attempts ++;
		}
		
		if(element == null) {
			System.out.println("Elemnt not found"+timeOut+"with default polling time 500ms");
		}
		return element;
	}
	public static WebElement reTryingElemnt(By locator, int timeOut, int pollingTime) {
		WebElement element= null;
		int attempts = 0;
		
		while(attempts<timeOut) {
			try {
			element = getElement(locator);
			System.out.println("Element is Found"+locator+"in attempt"+attempts);
			break;
			}
			catch(NoSuchElementException e) {
				System.out.println("Element not Found"+locator+locator+"in attempt"+attempts);
				try {
					Thread.sleep(pollingTime);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			attempts ++;
		}
		
		if(element == null) {
			System.out.println("Elemnt not found"+timeOut+"with default polling time 500ms");
		}
		return element;
	}

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		By twitterLink = By.xpath("//a[contains(@href,'twitter')]");
		//reTryingElemnt(twitterLink, 20).click();
		reTryingElemnt(twitterLink, 20, 1000).click();
	}

}
