package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		WebElement ele = driver.findElement(By.linkText("Stony Plain, Canada"));
		String rightScore= driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightScore);
		String leftIndex = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftIndex);
		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);
		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);
		String nearCity = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearCity);
	}

}
