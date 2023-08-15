package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownHandelWithoutSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By countryOptions = By.xpath("//select[@id ='Form_getForm_Country']/option");

	}

	public static boolean DoSelectValueFromDropDownWithoutSelect(By locator, String value) {
		List<WebElement> optionsList = driver.findElements(locator);
		boolean flag = false;
		for (WebElement e : optionsList) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				flag = true;
				break;
			}

		}
		if(flag == false) {
			System.out.println(value +"value is not present"+ locator);
		}
		return flag;
	}
}
