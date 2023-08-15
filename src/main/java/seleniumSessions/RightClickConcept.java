package seleniumSessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClikcBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightClikcBtn).build().perform();
		
		List<WebElement> rightClickEles = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li"));
		System.out.println(rightClickEles.size());
		for(WebElement e : rightClickEles) {
			String text = e.getText();
			System.out.println(text);
				if(text.equals("Copy")) {
					e.click();
					break;
				}
		}
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		

	}

}
