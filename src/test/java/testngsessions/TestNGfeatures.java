package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGfeatures {
	//global pre condition
	//pre condition
	//test steps- act vs exp results -- PASS/FAIL
	//post steps
	//Global post steps
	
	
	//1
	@BeforeSuite
	public void dbConnection() {
		System.out.println("BS- dbConnection");
	}
	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT- create user");
	}
	//3
	@BeforeClass
	public void openBrowser() {
		System.out.println("BC- open Browser");
	}
	//4//7//10
	@BeforeMethod
	public void logintoApp() {
		System.out.println("BM- Login to App");
	}
	//11
	@Test
	public void searchProductTest() {
		System.out.println("Search Product");
	}
	//5
	@Test
	public void addtoCartTest() {
		System.out.println("Add to Cart");
	}
	//8
	@Test
	public void paymentOptionTest() {
		System.out.println("Payment Option");
	}
	//6//9//12
	@AfterMethod
	public void logoutfromApp() {
		System.out.println("AM- Log out from App");
	}
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC- close browser");
	}
	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("AT- Delete User");
	}
	//15
	@AfterSuite
	public void closeDBconnection() {
		System.out.println("AS- Close DB connection");
	}

}
