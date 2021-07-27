package com.lumens.stepdefinitions;

import com.lumens.pageobject.HomePage;

import cucumber.api.java.en.Then;

public class HomePageStepDef {
	
    HomePage home=new HomePage();
	
	@Then("^Selcted Product and click on cart in HomePage$")
	public void selcted_Product_and_click_on_cart_in_HomePage() throws Throwable {
		
		home.navigatingToLargeChandelier();
		home.selectProduct();
	    
	}

}
