package testngsessions;

import org.testng.annotations.Test;

public class TestWithPriority {
	//11
		@Test(priority = 1)
		public void searchProductTest() {
			System.out.println("Search Product");
		}
		//5
		@Test(priority = 5)
		public void addtoCartTest() {
			System.out.println("Add to Cart");
		}
		//8
		@Test(priority = -1)
		public void paymentOptionTest() {
			System.out.println("Payment Option");
		}
		@Test
		public void aTest() {
			System.out.println("aTest");
		}
		@Test(priority = 2)
		public void bTest() {
			System.out.println("bTest");
		}

}
