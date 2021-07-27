package com.lumens.pageobject;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lumens.utilities.BaseClass;


public class AccountCreationPage extends BaseClass{
	
	// All WebElements are identified by @FindBy annotation
	
	@FindBy(xpath="//a[@class='ltkpopup-close']")
	WebElement closePopUp;
	
	@FindBy(xpath="//div[@class='btn-group dropdown-group']")
	WebElement mouseOverOnAccount;;
	
	@FindBy(id="my_account_hdr_link")
	WebElement slectMyAccount;
	
	@FindBy(name="dwfrm_profile_customer_firstname")
	WebElement firstName;
	
	@FindBy(id="dwfrm_profile_customer_lastname")
	WebElement lastName;
	
	@FindBy(xpath="//input[@name='dwfrm_profile_customer_email']")
	WebElement email;
	
	@FindBy(id="dwfrm_profile_customer_emailconfirm")
	WebElement confirmEmail;
	
	@FindBy(id="dwfrm_profile_login_password")
	WebElement password;
	
	@FindBy(name="dwfrm_profile_login_passwordconfirm")
	WebElement confirmPassword;
	
	@FindBy(xpath="//button[@name='dwfrm_profile_confirm']")
	WebElement creatAccountBtn;
	
	@FindBy(xpath="//span[text()='Create a New']")
	WebElement creatAccount;
	
	public AccountCreationPage()
	{
		 //This initElements method will create all WebElements

		PageFactory.initElements(driver,this);
	}
	
	public void accountCreation()
	{
		closePopUp.click();
		Actions ac=new Actions(driver);
		ac.moveToElement(mouseOverOnAccount).build().perform();
		slectMyAccount.click();
		
	}
	
	public void creatLumensAccount(String firstname,String lastname,String email1,String confirmemail,String pwd,String confirmPwd)
	{
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		email.sendKeys(email1);
		confirmEmail.sendKeys(confirmemail);
		password.sendKeys(pwd);
		confirmPassword.sendKeys(confirmPwd);
		creatAccountBtn.click();
	}
	
	public void takeScreenShot()
	{
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
            FileHandler.copy(srcfile, new File("C:\\Users\\ACER\\workspace\\LumensAssessment\\screenshot\\CreatAccount.png"));
            System.out.println("screenshot taken");
        }catch(IOException e){
            e.printStackTrace();
        }
	}
}