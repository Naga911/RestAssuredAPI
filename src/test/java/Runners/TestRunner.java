package Runners;

import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(publish = true,
		features = {"src/test/java/features/GetApplicationByApplicationIdAPI.feature"},
		glue = {"stepDefinations", "stepDefinations.GetApplicationByApplicationIdAPI"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
		})

public class TestRunner extends AbstractTestNGCucumberTests {

}
