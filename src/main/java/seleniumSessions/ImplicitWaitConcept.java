package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook");// 10sec
		String label= driver.findElement(By.id("nav-logo-sprites")).getAttribute("aria-label");// 10sec
		System.out.println(label);
		// e3--- 10sec
		//e4--- 10sec
		//e5--- 10sec
		// e6 --- 10sec
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// e7, e8, e9 --- 20sec
		
		
		//homepage
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// registerpage
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//productpage:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

}
