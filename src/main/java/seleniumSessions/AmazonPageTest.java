package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtil brutil= new BrowserUtil();
		WebDriver driver= brutil.initDriver("chrome");
		brutil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(brutil.getTitle());
		System.out.println(brutil.getPageURL());
		
		ElementUtil eutil = new ElementUtil(driver);
		//By email = By.id("input-email");
		//By pwd = By.id("input-password");
//		eutil.doSendKeys(email, "naveen@gmail.com");
//		eutil.doSendKeys(pwd, "naveen@123");
		
		By Fname= By.id("input-firstname");
		By Lname= By.id("input-lastname");
		By Email= By.id("input-email");
		By Tele= By.id("input-telephone");
		By Password= By.id("input-password");
		By CPassword= By.id("input-confirm");
		eutil.doSendKeys(Fname, "Dipti");
		eutil.doSendKeys(Lname, "Patro");
		eutil.doSendKeys(Email, "dip@gmail.com");
		eutil.doSendKeys(Tele, "9668197181");
		eutil.doSendKeys(Password, "dip123");
		eutil.doSendKeys(CPassword, "dip123");
		
		
	//	brutil.quitBrowser();

	}

}
