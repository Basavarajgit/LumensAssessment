package com.lumens.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"FeatureFiles"},glue = {"com.lumens.stepdefinitions"},
plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent reports/report.html",
"pretty","junit:target/MyReports/report.xml","html:target/cucumber-html-report",
	"json:target/MyReports/report.json"},dryRun=false,monochrome=true)
public class TestRunner {
	
}

