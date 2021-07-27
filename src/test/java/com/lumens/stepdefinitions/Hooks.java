package com.lumens.stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.lumens.utilities.BaseClass;
import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Hooks extends BaseClass{
	
	@After(order=1)
	public void tearDown(Scenario scenario) {
	    if (scenario.isFailed()) {
	      // Take a screenshot...
	      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	      scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
	    }
	}
		@After(order=0)
		public void quitbrowser() {
			driver.quit();
		}

}


