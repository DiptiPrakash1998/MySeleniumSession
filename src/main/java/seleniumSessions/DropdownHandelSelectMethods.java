package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandelSelectMethods {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");
		
		By week = By.id("select-demo");
		By state = By.id("multi-select");
		
		WebElement weekEle = driver.findElement(week);
		WebElement stateEle = driver.findElement(state);
		
		Select select1 = new Select(weekEle);
		System.out.println(select1.isMultiple());
		Select select2 = new Select(stateEle);
		System.out.println(select2.isMultiple());
		
		select2.selectByVisibleText("California");
		select2.selectByVisibleText("New Jersey");
		select2.selectByVisibleText("Texas");
		
		List<WebElement> allStateSelectList = select2.getAllSelectedOptions();
		
		for(WebElement e:allStateSelectList) {
			String text =e.getText();
			System.out.println(text);
		}
		
		String firstOption =select2.getFirstSelectedOption().getText();
		System.out.println(firstOption);
		
		select2.deselectByValue("Texas");
		select2.deselectAll();
		
		

	}

}
