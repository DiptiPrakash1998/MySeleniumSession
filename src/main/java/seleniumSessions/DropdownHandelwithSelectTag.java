package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandelwithSelectTag {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country =By.id("Form_getForm_Country");
		WebElement countryElement = driver.findElement(country);
		Select select =new Select(countryElement);
		
		//select.selectByIndex(5);
		//select.selectByVisibleText("Belgium");
		//select.selectByValue("Aruba");
		select.selectByValue("Dipti");
		select.selectByIndex(500);

	}

}
