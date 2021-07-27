package com.lumens.pageobject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lumens.utilities.BaseClass;

public class VerifyLoginPageTitle extends BaseClass{
	
	@FindBy(id="dwfrm_login_username")
	WebElement userName;
	
	@FindBy(name="dwfrm_login_password")
	WebElement password;
	
	@FindBy(xpath="//button[@value='Log In']")
	WebElement loginBtn;
	
	public VerifyLoginPageTitle()
	{
		 //This initElements method will create all WebElements

		PageFactory.initElements(driver,this);
	}
	
	public void login(String username,String pwd)
	{
		userName.sendKeys(username);
		
		password.sendKeys(pwd);
		
		loginBtn.click();
	}
	public void verifyTitle()
	{
		String actualTitle=driver.getTitle();
		
		String expectedTitle="Modern Lighting, Ceiling Fans, Furniture & Home Decor | Lumens.com";
		
		Assert.assertEquals(actualTitle,expectedTitle);
		
		System.out.println("Title of the Page :"+ actualTitle);
	}
	
}

