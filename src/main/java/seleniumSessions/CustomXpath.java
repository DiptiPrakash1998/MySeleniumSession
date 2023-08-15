package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		//xpath: 
		//1. Absolute xpath:
		//2. Relative Xpath:
		  // 1. xpath Functions
		  // 2. xpath properties
		  // 3. xpath access
		
		//double // -> direct+ Indirect Child element
		// Single / -> direct Child Element
		
		//htmltag[@attrubute= 'value']
		
		//input[@name='email']-- username
		//input[@value='Login']-- Login button
		//input[@name='firstname']-- First name
		//img[@title='naveenopencart']--image/logo
		
		//htmltag[@attrubute1= 'value' and @attrubute2= 'value']
		//img[@title='naveenopencart' and @alt='naveenopencart']
		//WebDriver driver = new ChromeDriver();
		//driver.findElement(By.xpath("//img[@title='naveenopencart' and @alt='naveenopencart']")).click();
		//input[@type='text' and @name= 'firstname']
		
		//htmltag[@text()='value']
		
		//a[text()='Downloads']
		
		//a[text()='Terms & Conditions']
		//h1[text()='Register Account']
		//span[text()='business impact.']
		//label[text()='First Name']
		
		//contains() with attribute
		//htmltag[contains(@attribute,'value')]
		//input[contains(@placeholder,'E-Mail')]
		//a[contains(@href,'account/forgotten')]
		
		//contains with two attribute
		//input[contains(@placeholder,'E-Mail') and contains(@name,'email')]
		
		//contains with 1st attribute and no contains with 2nd attribute
		//input[contains(@placeholder,'E-Mail') and @id='input-email']		
		
		
		//contains() with text():
		//htmltag[contains(text(), 'value')]
		//a[contains(text(),'Delivery')]
		//div[contains(text(),' Warning')]
		//p[contains(text(),'By creating an account you will be able to shop faster')]
		
		//contains() with text()and contains with @attr :
		//htmltag[contains(text(), 'value') and contains(@attr,'value')]
		
		//a[contains(text(),'Terms & Conditions') and contains(@href,'information')]
		
	    //starts-with():
		
		//htmltag[starts-with(@attr,'value')]
		//input[starts-with(@placeholder,'E-Mail')]
		
		//index:
		//      (//input[@class='form-control'])[1]
		//		(//input[@class='form-control'])[position()=1]
		
		//      (//input[@class='form-control'])[last()]
		//      (//input[@class='form-control'])[last()-1]
		
		//      ((//div[contains(@class,'navFooterLinkCol navAccessibility')])[last()]//a)[last()]
		//      ((//td[contains(@class,'navFooterDescItem')])[last()-7])//span[text()='Smart Security']
		//      ((//td[contains(@class,'navFooterDescItem')])[last()-7])//span[contains(text(),'Smart Security')]
		
			
		
		
		
		
		
		
		

	}

}
