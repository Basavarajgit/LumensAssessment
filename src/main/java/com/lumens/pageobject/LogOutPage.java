package com.lumens.pageobject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lumens.utilities.BaseClass;
public class LogOutPage extends BaseClass {
	
	
	
	@FindBy(xpath="//div[@class='btn-group dropdown-group']")
	WebElement mouseOverOnAccount;;
	
	@FindBy(xpath="//a[@class='logout']")
	WebElement signOut;
	
	public LogOutPage()
	{
		 //This initElements method will create all WebElements

		PageFactory.initElements(driver, this);
	}
	
	public void logOut()
	{
		
		mouseOverOnAccount.click();
		
		signOut.click();
		
	}
	
	public void verifyLogOut()
	{
		String actual=driver.getTitle();
		
		String expected="Modern Lighting, Ceiling Fans, Furniture & Home Decor | Lumens.com";
		
		Assert.assertEquals(actual,expected);
	}

}
