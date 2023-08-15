package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
//		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
//		System.out.println(flag);
		By search =By.id("twotabsearchtextbox");
		ElementUtil ele = new ElementUtil(driver);
		if(ele.checkElementIsDisplayed(search) ){
			System.out.println("Search is present");
			ele.doSendKeys(search, "macbook m1");
		}
		else
		{
			System.out.println("Search is not present");
		}

	}

}
