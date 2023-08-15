package seleniumSessions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverBinaryConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		
		//Dimension dim = new Dimension(800,500);
		//driver.manage().window().setSize(dim);
		driver.manage().window().setSize(new Dimension(1080,780));
		driver.get("https://www.myntra.com");
		Thread.sleep(5000);
		
		//driver.quit();
		//driver.close();
	}

}
