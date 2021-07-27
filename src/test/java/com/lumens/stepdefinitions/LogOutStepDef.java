package com.lumens.stepdefinitions;



import com.lumens.pageobject.LogOutPage;

import cucumber.api.java.en.Then;

public class LogOutStepDef {
	
	@Then("^Move the mouse hover on Sign out$")
	
	public void move_the_mouse_hover_on_Sign_out() throws Throwable {
	  
		LogOutPage signout=new LogOutPage();
		
		signout.logOut();
		
		signout.verifyLogOut();
		
		System.out.println("User successfully logout");
	}



}

