package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://google.com");
		By search = By.name("q");
		By suggestion = By.xpath("//div[@class ='wM6W7d']/span");
		search("dsdsdsdsds", search, "webdriver", suggestion);

	}

	public static void search(String searchKey, By searchLoactor, String suggName, By suggestion)
			throws InterruptedException {
		driver.findElement(searchLoactor).sendKeys(searchKey);
		Thread.sleep(5000);
		List<WebElement> suggList = driver.findElements(suggestion);
		int suggSize = suggList.size();
		System.out.println("Total suggestion: " + suggSize);
		if (suggList.size() > 0) {

			for (WebElement e : suggList) {
				String text = e.getText();
				if (text.length() > 0) {
					System.out.println(text);
					if (text.contains(suggName)) {
						e.click();
						break;
					}
				} else {
					System.out.println("Blank value---- No suggestions");
					break;
				}
			}
		} else {
			System.out.println("No suggestion found");
		}
	}

}
