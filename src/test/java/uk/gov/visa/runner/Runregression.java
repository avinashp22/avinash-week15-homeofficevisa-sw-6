package uk.gov.visa.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "uk/gov/visa/steps",
        plugin = {"html:target/cucumber-reports/cucumber.html",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@regression"
)

public class Runregression extends AbstractTestNGCucumberTests {


}
