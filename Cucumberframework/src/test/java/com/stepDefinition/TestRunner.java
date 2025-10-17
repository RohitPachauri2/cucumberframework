package com.stepDefinition;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
    features = "src/test/resources/Features/Login.feature", // Path to your feature file
    glue = "com.stepDefinition", // Path to your step definitions
    plugin = {"pretty", "html:target/cucumber-reports"},
    monochrome = true,
    dryRun =false,
    tags= "@smoke or @regression"
    //tags = @smoke// This will run scenarios tagged with either of the two tags
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
