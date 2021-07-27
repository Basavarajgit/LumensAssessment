package com.lumens.stepdefinitions;

import com.lumens.pageobject.HomePageScrollupScrollDown;

import cucumber.api.java.en.Then;

public class HomePageScrollupScrollDownStepDef {
	
	HomePageScrollupScrollDown scrollaction=new HomePageScrollupScrollDown();
	@Then("^Use scroll up/down method in home page$")
	public void use_scroll_up_down_method_in_home_page() throws Throwable {
	    
		
		scrollaction.Scrolldown();
		scrollaction.Scrollup();
		
	}
}
