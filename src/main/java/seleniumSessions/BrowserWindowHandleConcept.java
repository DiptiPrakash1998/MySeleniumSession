package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
		//parent(driver)+ child windows
		
		Set<String> handels =driver.getWindowHandles();
		Iterator<String> it =handels.iterator();
		
		String parentWindowId =it.next();
		String childWindowId =it.next();
		
		System.out.println("parent window id is: "+parentWindowId);
		System.out.println("child window id is:  "+childWindowId);
		// switch
		
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
