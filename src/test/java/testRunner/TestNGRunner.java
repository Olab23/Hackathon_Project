package testRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {".//features/Project.feature"},
		glue="stepDefinitions",
		plugin = { 
				"pretty",
				"html:reports/myreport.html", 
				"rerun:target/rerun.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
		dryRun = false, 
		monochrome = true)

public class TestNGRunner extends AbstractTestNGCucumberTests{

}
