package com.lumens.pageobject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lumens.utilities.BaseClass;


public class RemoveProductFromCartPage extends BaseClass {
	
	// All WebElements are identified by @FindBy annotation


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

	@FindBy(xpath = "//button[@title='Add to Cart']")
	WebElement addToCart;

	@FindBy(xpath = "//a[text()='CHECKOUT']")
	WebElement checkOut;

	@FindBy(xpath = "//a[@class='logo-link lu-sprite']")
	WebElement clickOnlogo;

	@FindBy(xpath = "//span[text()='Cart']")
	WebElement clickOnCart;

	@FindBy(xpath = "(//span[text()='Remove'])[1]")
	WebElement remove;

	public RemoveProductFromCartPage()

	{
		 //This initElements method will create all WebElements

		PageFactory.initElements(driver, this);
	}

	public void navigatingToLargeChandelier() {

		Actions act = new Actions(driver);

		act.moveToElement(mouseOverOnLigtings).build().perform();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", navigateToCeilingLights);

		navigateToChandeliers.click();

		navigateToLargeChandeliers.click();

	}

	public void selectProductAndAddToCart() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", selectProduct);
	

		addToCart.click();
		
		if(clickOnCart.isDisplayed())
		{
			 File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 
		        try{
		        	
		            FileHandler.copy(srcfile, new File("D:\\selenium\\LumensAssesment\\screenshot\\LumensAddToCart.png"));
		            
		            System.out.println("screenshot taken");
		            
		        }
		        catch(IOException e)
		        {
		            e.printStackTrace();
		        }
		        checkOut.click();
		}

		//checkOut.click();

	}

	public void removeProduct() {
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", clickOnlogo);

		clickOnCart.click();

		remove.click();
	}

}

