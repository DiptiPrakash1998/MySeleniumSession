package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabelHandel {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type= 'checkbox']
		
//		driver= new ChromeDriver();
//		driver.get("https://selectorshub.com/xpath-practice-page/");
//		Thread.sleep(5000);
//		getSelectUser("Joe.Root");
//		getSelectUser("John.Smith");
//		List<String> JoeInfo=getUserInfo("Joe.Root");
//		System.out.println(JoeInfo);
		//a[text()='Ali khan']/parent::td/preceding-sibling::td/input[@type='checkbox']

	}
	
//	public static void getSelectUser(String username) {
//		driver.findElement(By.xpath("//a[text()='"+username+"']/parent::td/preceding-sibling::td/input[@type= 'checkbox']")).click();
//		
//	}
//	
//	public static List<String> getUserInfo(String username) {
//		List<WebElement> UserInfoList =driver.findElements(By.xpath("//a[text()='"+username+"']/parent::td/following-sibling::td"));
//		List<String> InfoList= new ArrayList<String>();
//		for (WebElement e: UserInfoList) {
//			String text= e.getText();
//			InfoList.add(text);
//			
//		}
//		return InfoList;
//		
//	}
	public static void getSelectUser(String username) {
		driver.findElement(By.xpath("//a[text()='Ali khan']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
	}
	
	public static List<String> getUserInfo(String username) {
		List<WebElement> UserInfoList =driver.findElements(By.xpath("//a[text()='"+username+"']/parent::td/following-sibling::td"));
		List<String> InfoList= new ArrayList<String>();
		for (WebElement e: UserInfoList) {
			String text= e.getText();
			InfoList.add(text);
			
		}
		return InfoList;
		
	}

}
