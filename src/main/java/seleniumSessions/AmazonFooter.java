package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFooter {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://google.com");

		List<WebElement> footerList = driver.findElements(By.xpath("//table[@class = 'navFooterMoreOnAmazon']//td/a"));
		int footerSize = footerList.size();
		
		System.out.println(footerSize);
		for (WebElement e : footerList) {
			String text = e.getText();
			System.out.println(text);
		}

	}

}
