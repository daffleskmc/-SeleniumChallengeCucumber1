package com.sel.cum.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\indeztruk\\eclipse-workspace\\SeleniumChallengeCucumber1\\src\\main\\java\\com\\sel\\cum\\features\\zoopla.feature", glue = {
		"com.sel.cum.stepDefinitions" }, format = { "pretty", "html:test-output", "json:json-output/cucumber.json",
				"junit:junit-output/cucumber.xml" }, monochrome = true, strict = true, dryRun = false)

public class ZTestRunner {

}
