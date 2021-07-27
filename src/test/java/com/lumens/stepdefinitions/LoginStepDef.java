package com.lumens.stepdefinitions;

import java.util.ArrayList;

import com.lumens.data.ExcelFileData;
import com.lumens.pageobject.LoginPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {

	@Then("^enter the valid credentails and submit$")
	public void enter_the_valid_credentails_and_submit() throws Throwable {

		LoginPage loginPage = new LoginPage();

		ExcelFileData excel = new ExcelFileData();

		ArrayList<String> testdata = excel.getData("user1");

		loginPage.login(testdata.get(3), testdata.get(5));

		System.out.println("User Successfully Login to the lumens Application ");
	}
}
