package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownWithoutSelectMethod {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By country = By.id("Form_getForm_Country");
		ElementUtil eutil = new ElementUtil(driver);
		boolean flag = eutil.doSelectDropDownValue(country, "Aruba");
		System.out.println(flag);
//		WebElement countryElement = driver.findElement(country);
//		int actCount = getDropDownValueCount(country);
//		if (actCount == 233) {
//			System.out.println("PASS -- count");
//		}
//
//		List<String> actCountryList = getAllDropDownOptions(country);
//
//		System.out.println(actCountryList.contains("India"));
////		System.out.println(actCountryList.contains("Brazil"));
//
//		doSelectDropDownValue(country, "India");
		
		

	}

//	public static int getDropDownvalueCount() {
//		return getAllDropDownOptions(locator).size();
//	}
//	public static List<String> getAllDropDownOptions() {
//		//Select select = new Select(getElement(locator));
//		Select select= new Select(getElement(locator));
//		List<WebElement> optionsList= select.getOptions();
//		List<String> optionsValueList=new ArrayList<String>();
//		System.out.println("Total Country:"+optionsList.size());
//		for(WebElement c:optionsList) {
//			String text=c.getText();
//			System.out.println(text);
//			optionsValueList.add(text);
//		}
//		return optionsValueList;
//	}
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static int getDropDownValueCount(By locator) {
		return getAllDropDownOptions(locator).size();
	}

	public static List<String> getAllDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		List<String> optionsValueList = new ArrayList<String>();
		System.out.println("total values : " + optionsList.size());

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			optionsValueList.add(text);
		}
		return optionsValueList;
	}

	public static boolean doSelectDropDownValue(By locator, String dropDownValue) {
		boolean flag = false;
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println("total values : " + optionsList.size());

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(dropDownValue)) {
				e.click();
				flag = true;
				break;
			}
		}
		if(flag == false) {
			System.out.println(dropDownValue +"value is not present"+ locator);
		}
		return flag;
	}
}
