package testRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features={".//features/Project.feature"}, 
	glue="stepDefinitions",
	plugin = {
			"pretty","html:target/cucumber-reports/cucumber-pretty", 
            "json:target/cucumber-reports/CucumberTestReport.json",
            "rerun:target/cucumber-reports/rerun.txt",
            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	monochrome = true,
	publish=true)
 
public class TestRunner {

}
