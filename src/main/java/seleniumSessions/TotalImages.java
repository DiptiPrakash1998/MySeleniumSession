package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com");

//		List<WebElement> imgList = driver.findElements(By.tagName("img"));
//		System.out.println("total Images="+imgList.size());
//		
//		for (WebElement e: imgList) {
//			String attrValue =e.getAttribute("alt");
//			System.out.println(attrValue);
//		}

		By image = By.tagName("img");
		By links = By.tagName("a");
		getElementsAttributeValue(image, "alt");
		getElementsAttributeValue(links, "href");
		int linkCount = getElementCount(links);

		if (linkCount >= 10) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

	}

	public static int getElementCount(By locator) {
		return driver.findElements(locator).size();
	}

	public static List<String> getElementsAttributeValue(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleAttrList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String attrValue = e.getAttribute(attrName);
//			System.out.println(attrValue);
			eleAttrList.add(attrValue);
		}
		return eleAttrList;
	}

	public static List<WebElement> getElements(By loactor) {
		return driver.findElements(loactor);
	}

}
