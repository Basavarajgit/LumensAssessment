package com.lumens.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lumens.utilities.BaseClass;



	public class LoginPage extends BaseClass {
		// All WebElements are identified by @FindBy annotation
		
		@FindBy(id="dwfrm_login_username")
		WebElement userName;
		
		@FindBy(name="dwfrm_login_password")
		WebElement password;
		
		@FindBy(xpath="//button[@value='Log In']")
		WebElement loginBtn;
		
		public LoginPage()
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


	}

    
	