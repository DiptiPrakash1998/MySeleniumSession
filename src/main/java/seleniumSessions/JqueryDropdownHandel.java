package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropdownHandel {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(1500);
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(1000);
//		List<WebElement> optionList = driver.findElements(
//				By.xpath("(//div[@class ='comboTreeDropDownContainer'])[1]//li[@class='ComboTreeItemChlid']/span"));
//		System.out.println(optionList.size());
//
//		for (WebElement e : optionList) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.equals("choice 1")) {
//				e.click();
//				break;
//			}
//		}

		By choices = By.xpath("(//div[@class ='comboTreeDropDownContainer'])[1]//li/span");
		// 1. TC01: Single Selection
		 //selectChoice(choices,"choice 1");
		// 2. TC02: Multiple Selection
		selectChoice(choices, "choice 1", "choice 2", "choice 6 2 1");
		// 3. TC03: All Choices
		//selectChoice(choices, "all");
	}

	public static void selectChoice(By locator, String... value) {
		List<WebElement> optionList = driver.findElements(locator);
		System.out.println(optionList.size());
		if (!value[0].equalsIgnoreCase("all")) {
			for (WebElement e : optionList) {
				String text = e.getText();
				System.out.println(text);

				// Multiple selection login
				for (int i = 0; i < value.length; i++) {
					if (text.equals(value[i])) {
						e.click();
						break;
					}
				}
			}
		} 
		else {// logic for select all options
			for (WebElement e : optionList) {
				String text = e.getText();
				if (!text.equals("−")) 
				{
					e.click();
				}
			}
		}
	}

}
