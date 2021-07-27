package com.lumens.stepdefinitions;

import java.util.ArrayList;

import com.lumens.data.ExcelFileData;
import com.lumens.pageobject.AccountCreationPage;
import com.lumens.utilities.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountCreation extends BaseClass{
	

	@Given("^launch the lumens website using property file$")
	public void launch_the_lumens_website_using_property_file() throws Throwable {
		
		BaseClass.browserInitialization();
	    
	}

	@When("^Go to  Account and Select My Account$")
	public void go_to_My_Account_and_Select_MyAccount() throws Throwable {
		
		AccountCreationPage registerAccount=new AccountCreationPage();
		
		registerAccount.accountCreation();
	}

	@Then("^enter the given details in the input field and click submit$")
	public void enter_the_given_details_in_the_input_field_and_click_submit() throws Throwable {
		
		AccountCreationPage registerAccount=new AccountCreationPage();
		
		ExcelFileData	excel=new ExcelFileData();
		
		ArrayList<String> testdata=excel.getData("user1");
		
		registerAccount.creatLumensAccount(testdata.get(1),testdata.get(2),testdata.get(3),testdata.get(4),testdata.get(5),testdata.get(6));
		
		System.out.println("Account succsessfully created");
		
		registerAccount.takeScreenShot();
	}



}
