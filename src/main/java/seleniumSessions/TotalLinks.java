package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		int totalLinks = linksList.size();
		System.out.println(totalLinks);

//		for (int i = 0; i < totalLinks; i++) {
//			String text = linksList.get(i).getText();
//			System.out.println(i + "=" + text);
//		}

		int count = 0;
		for (WebElement e : linksList) {
			String text = e.getText();
			if (text.length() > 0) {
				System.out.println(count + "=" + text);
			}
			count++;
		}

	}

}
