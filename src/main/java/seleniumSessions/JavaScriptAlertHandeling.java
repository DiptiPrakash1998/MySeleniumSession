package seleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertHandeling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Alert alert=driver.switchTo().alert();
//		String text= alert.getText();
//		System.out.println(text);
//		alert.accept();
//		alert.dismiss();
		
		//button[text()='Click for JS Alert']
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Alert alert=driver.switchTo().alert();
//		String text= alert.getText();
//		System.out.println(text);
//		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Test Automation");
		String alertText= alert.getText();
		System.out.println(alertText);
		alert.accept();
		
		
		

	}

}
