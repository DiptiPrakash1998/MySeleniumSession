package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathAxes {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		// TODO Auto-generated method stub
		// parent to child:
		// Single forward slash--(Means directly associated Child we can fetch using Single forward slash)
		// double forward  slash--(Means directly + Indirectly associated Child we can fetch using Single forward slash)
		// div[@class='private-form__input-wrapper']/input[@id='username']
		// form[@id='hs-login']//input[@id='username']
        // div[@class='private-form__input-wrapper']/child::input[@id='username']
		
		
		// form[@id='hs-login']/div -- direct child 8
		// form[@id='hs-login']/child::div
		// form[@id='hs-login']//div -- direct +indirect Child 20
		// form[@id='hs-login']//child::div
		
		
		//Child to Parent: backward traversing is possible in xpath
		// input[@id='username']/parent::div ---->(direct Parent)
		// input[@id='username']/../../../..
		// input[@id='username']/ancestor::div ---->(direct + Indirect grand parent)
		
		//sibling:
		//1. Preceding sibling
		
		//input[@id='input-email']/preceding-sibling::label
		
		//2. Following sibling
		//label[@for='input-email']/following-sibling::input
		//div[text()='Get to Know Us']/following-sibling::ul//a[text()='Blog']
		
		//div[text()='Get to Know Us']/following-sibling::ul//a
		//div[text()='Make Money with Us']/following-sibling::ul//a
		getColumnValues("Get to Know Us");
		getColumnValues("Make Money with Us");
		
		

	}
	
	public static void getColumnValues(String ColumnName) {
		System.out.println("Column name is:"+ ColumnName);
		List<WebElement> ColumnValues= driver.findElements(By.xpath("//div[text()='"+ColumnName+"']/following-sibling::ul//a"));
		for(WebElement e: ColumnValues) {
			String text = e.getText();
			System.out.println(text);
			
		}
	}
	

}
