package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabelTraversing {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		System.out.println(getColumCount());
		System.out.println(getcolumnValue());
		
		System.out.println(getcolumnValue().contains("Company"));
		//table[@id="customers"]/tbody/tr[2]/td[1]
				//table[@id="customers"]/tbody/tr[3]/td[1]
				//table[@id="customers"]/tbody/tr[7]/td[1]
				
				String beforeXpath = "//table[@id=\"customers\"]/tbody/tr[";
				String afterXpath = "]/td[2]";
				
				for(int row=2; row<=getRowCount(); row++) {
					String fullXpath = beforeXpath + row + afterXpath;
					//System.out.println(fullXpath);
					String text = driver.findElement(By.xpath(fullXpath)).getText();
					System.out.println(text);
				}
				
				
		

	}
	
	public static int getRowCount() {
		return driver.findElements(By.xpath("//table[@class='ws-table-all']//tr")).size();
	}

	public static int getColumCount() {
		return driver.findElements(By.xpath("//table[@class='ws-table-all']//tr/th")).size();
	}

	public static List<String> getcolumnValue() {

		List<WebElement> columnvalue = driver.findElements(By.xpath("//table[@class='ws-table-all']//tr/th"));
		
		List<String> colValList= new ArrayList<String>();
		for (WebElement e: columnvalue) {
			String text= e.getText();
			colValList.add(text);			
		}
		return colValList;
	
	
	}

}
