package com.TestLauncher;

import org.testng.annotations.Listeners;
import com.generics.CustomReporter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Listeners(CustomReporter.class)
@CucumberOptions(features = ("src/test/java/com/features/sample/Testcases.feature"), glue = {
		"com.stepDef" },
		// tags = { "@13343" },
		plugin = { "html:custom-reports/cucumber-htmlreports",
				"json:custom-reports/cucumber-reports/cucumber-jsonreports.json",
				"junit:custom-reports/cucumber-reports/cucumber-junitreports.xml",
				"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm" }, monochrome = true
// , dryRun = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

}