package com.lumens.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lumens.utilities.BaseClass;

public class HomePageScrollupScrollDown extends BaseClass{
	
	@FindBy(xpath="//img[@alt='Shop All Ceiling Fans']")
	WebElement ceilingFans;
	
	
	@FindBy(xpath="//img[@alt='Shop All Gus Modern']")
	WebElement gusModern;
	
	public HomePageScrollupScrollDown()

	{
		 //This initElements method will create all WebElements

		PageFactory.initElements(driver, this);
	}

	
	
	public void Scrolldown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",ceilingFans);
	
	}
	
	public void Scrollup()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",gusModern);
	
	}
}
