package seleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementsConcept {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://freshworks.com/");

		By footer = By.xpath("//footer//ul/li/a");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> eleList =wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footer));
		System.out.println(eleList.size());

	}
	/** 
	 * An expectation for checking that all elements present on the web page that match the locator are visible. 
	 * Visibility means that the elements are not only displayed but also have a height and width that is greater than 0.
	 * @param loactor
	 * @param timeOut
	 * @return
	 */
	
	public static List<WebElement> waitForElementVisible(By loactor, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(loactor));
		
	}

}
