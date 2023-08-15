package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsSections {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		List<WebElement> rightpannelLinksList = driver.findElements(By.className("list-group-item"));
//		System.out.println(rightpannelLinksList.size() == 13);
//
//		for (WebElement e : rightpannelLinksList) {
//			String text = e.getText();
//			System.out.println(text);
//		}

//		By rightPannelList = By.className("list-group-item");
//		if (getElements(rightPannelList).size() == 13) {
//			System.out.println("Right pannel list count is correct");
//		}
//		List<String> rightPannelLinksList = getElementsTextList(rightPannelList);
//		if (rightPannelLinksList.contains("My Account")) {
//			System.out.println("My Account --- PASS");
//		}

		By rightPannelList = By.className("list-group-item");
//		List<WebElement> rightpannelLinksList = getElements(rightPannelList);
//		for (WebElement e : rightpannelLinksList) {
//			String text = e.getText();
//			if (text.equals("Forgotten Password")) {
//				e.click();
//				break;
//			}
//		}
//		clickElementFromSpecificPageSection(rightPannelList, "Forgotten Password");

		By footerLinks = By.xpath("//div//a");

	}

	public static void clickElementFromSpecificPageSection(By locator, String elementText) {
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(elementText)) {
				e.click();
				break;
			}
		}
	}

	public static List<String> getElementsTextList(By locator) {
		List<WebElement> elementsLinksList = getElements(locator);
		List<String> elementsTextList = new ArrayList<String>();

		for (WebElement e : elementsLinksList) {
			String text = e.getText();
			elementsTextList.add(text);
		}
		return elementsTextList;
	}

	public static List<WebElement> getElements(By loactor) {
		return driver.findElements(loactor);
	}

}
