package com.lumens.stepdefinitions;

import com.lumens.pageobject.RemoveProductFromCartPage;

import cucumber.api.java.en.Then;

public class RemoveProductStepDef {
	


	
	@Then("^Selcted Product add to cart and click on cart in HomePage$")
	public void selcted_Product_add_to_cart_and_click_on_cart_in_HomePage() throws Throwable {
		
		RemoveProductFromCartPage removeItem=new RemoveProductFromCartPage();
		
		removeItem.navigatingToLargeChandelier();
		
		removeItem.selectProductAndAddToCart();
	    
	}

	@Then("^Remove Product from the Cart$")
	public void remove_Product_from_the_Cart() throws Throwable {
		
		RemoveProductFromCartPage removeItem=new RemoveProductFromCartPage();
		
		removeItem.removeProduct();
		
		System.out.println("User successfully Remove The Product From The Cart");
	   
	}

}

