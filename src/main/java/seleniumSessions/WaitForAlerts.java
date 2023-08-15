package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlerts {

	static WebDriver driver ;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(alert.getText());
//		alert.accept();
		//waitForAlertJSPopUp(5);
		String text = alertJSGetText(6);
		System.out.println(text);
	}
	
	public static Alert waitForAlertJSPopUp(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static String alertJSGetText(int timeOut) {
		return waitForAlertJSPopUp(timeOut).getText();
	}
	
	public static void alertAccept(int timeOut) {
		waitForAlertJSPopUp(timeOut).accept();
	}
	public static void alertDismiss(int timeOut) {
		waitForAlertJSPopUp(timeOut).dismiss();
	}
	public static void enterAlertValue(int timeOut, String value) {
		waitForAlertJSPopUp(timeOut).sendKeys(value);
	}
	

}
