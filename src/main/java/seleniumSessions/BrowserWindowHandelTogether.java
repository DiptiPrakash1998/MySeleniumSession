package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandelTogether {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");// parent page
		Thread.sleep(3000);
		String parentWindowId = driver.getWindowHandle();

		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		
		//total windows=5

		Set<String> handels = driver.getWindowHandles();
		Iterator<String> it = handels.iterator();
		while (it.hasNext()) {
			String windowID = it.next();
			driver.switchTo().window(windowID);
			String Url = driver.getCurrentUrl();
			System.out.println(Url);
			Thread.sleep(1000);

			if (!windowID.equals(parentWindowId)) {
				driver.close();
			}

		}
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent window URL:"+ driver.getCurrentUrl());
	}

}
