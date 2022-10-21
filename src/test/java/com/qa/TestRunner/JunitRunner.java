package com.qa.TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)


@CucumberOptions(
		
		features = {"C:\\Users\\Admin\\eclipse-workspace\\HybridCucumber\\src\\test\\resources\\com\\qa\\features"},
		
		glue = {"C:\\Users\\Admin\\eclipse-workspace\\HybridCucumber\\src\\test\\java\\com\\qa\\stepdefinitions","Hooks"},

tags = "@smoke",

dryRun = false)

public class JunitRunner {
	


}
