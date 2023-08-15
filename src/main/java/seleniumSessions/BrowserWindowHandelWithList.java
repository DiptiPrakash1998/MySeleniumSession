package seleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandelWithList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");// parent page
		Thread.sleep(3000);
		Set<String> handels = driver.getWindowHandles();
		List<String> handelsList =new ArrayList<String> ();
		
		String parentWindowID = handelsList.get(0);
		String childWindowID = handelsList.get(1);	
		driver.switchTo().window(childWindowID);
		System.out.println("Child window Url:"+driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println("Child window Url:"+driver.getCurrentUrl());
		driver.close();
		

	}

}
