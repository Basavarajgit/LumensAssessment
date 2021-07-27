package com.lumens.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lumens.utilities.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath = "//span[@title='Lighting']")
	WebElement mouseOverOnLigtings;

	@FindBy(xpath = "//a[text()='Ceiling Lights']")
	WebElement navigateToCeilingLights;

	@FindBy(xpath = "//span[text()='Chandeliers']")
	WebElement navigateToChandeliers;

	@FindBy(xpath = "//p[text()='Large Chandeliers']")
	WebElement navigateToLargeChandeliers;

	@FindBy(xpath = "//a[contains(text(),'Archer Chandelier')]")
	WebElement selectProduct;
	
	
	public HomePage()

	{
		 //This initElements method will create all WebElements

		PageFactory.initElements(driver, this);
	}

	public void navigatingToLargeChandelier() {

		Actions act = new Actions(driver);

		act.moveToElement(mouseOverOnLigtings).build().perform();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", navigateToCeilingLights);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("arguments[0].click();", navigateToChandeliers);
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;

		js2.executeScript("arguments[0].click();", navigateToLargeChandeliers);

	}

	public void selectProduct() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", selectProduct);
}
}