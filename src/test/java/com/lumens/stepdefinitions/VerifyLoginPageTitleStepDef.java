package com.lumens.stepdefinitions;

import com.lumens.pageobject.VerifyLoginPageTitle;

import cucumber.api.java.en.Then;

public class VerifyLoginPageTitleStepDef {
	
	@Then("^verify the title of lumens page$")
	public void verify_the_title_of_lumens_page() throws Throwable {
		
		VerifyLoginPageTitle title=new VerifyLoginPageTitle();
		
		title.verifyTitle();
		
		System.out.println("User successfully Verify the Title of the Page");
	    
	}


}

