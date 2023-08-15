package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionConcept {
	@Test
	public void searchTest() {
		String name = "Mackbook";
		Assert.assertEquals(name, "Mackbook");
	}
	@Test
	public void sumTest() {
		int a=10;
		int b=20;
		int sum = a+b;
		Assert.assertEquals(sum, 30);
	}
	@Test
	public void nameTest() {
		String userName= "Naveen";
		Assert.assertNotNull(userName);
	}
	@Test
	public void isDisplayed() {
		String loginBtn = "loginAmazonButton";
		Assert.assertTrue(loginBtn.contains("loginAmazon"));
	}
	@Test
	public void isUserInActive() {
		boolean inActiveFlag = false;
		Assert.assertFalse(inActiveFlag);
	}

}
