package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//bdd.feature",
       glue ={"stepdefinition"},
plugin= {"pretty","html:target/htmlreports.html"}, tags = "@SmokeTest",
        monochrome = false)
public class runnercucumber extends AbstractTestNGCucumberTests
{
}
