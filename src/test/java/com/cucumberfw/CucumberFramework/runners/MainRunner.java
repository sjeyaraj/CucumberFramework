package com.cucumberfw.CucumberFramework.runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
	features = {"src/test/java/com/cucumberfw/CucumberFramework/features"},
	glue = {"com.cucumberfw.CucumberFramework.steps"},
	monochrome = true,
	tags = {},
	plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:target/extentReport.html"}
)
public class MainRunner {


}
