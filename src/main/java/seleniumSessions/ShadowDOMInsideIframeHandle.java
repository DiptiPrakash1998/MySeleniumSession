package seleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMInsideIframeHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		Thread.sleep(3000);
		//Browser
				//page -- elements
					//iframe -- elements
							//shadow DOM (open)
									//elements
		String tea_JSPath = "return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
		driver.switchTo().frame("pact");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement tea = (WebElement)js.executeScript(tea_JSPath);
		
		tea.sendKeys("Kadak masala Chai");

	}

}
