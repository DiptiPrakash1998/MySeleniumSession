package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	@Test
	public void homePage(	) {
		System.out.println("HomePageTest");
		int i =9/0;
	}
	
	@Test(dependsOnMethods = "homePage")
	public void searchPage(){
		System.out.println("searchPageTest");
	}
	
	@Test(dependsOnMethods = "searchPage")
	public void cartPage() {
		System.out.println("cartPageTest");
	}

	
	//AAA Rule -- Arrange, act, assertion
	
	//test cases should be independent
	//CRUD - 
	//createUserTest --> create a new user -- assert
	//getUserTest --> create a new user(xxxxx) + get the same user(xxxxx) -- assert
	//invalid - getUserTest --> use the same userid(124) + get the same user -- assert --> 123 -- QA ---> stg --123X
	//updateUserTest --> create new user(xxxx) + get the same user (xxxxx) -- update user (xxxx) -- assert
	//deleteUserTest --> create new user(xxxx) + get the same user (xxxxx) -- delete the user (xxx) -- assert
	
	//C - R - U - D 
}
