package testrunner;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//bdd.feature",
        glue ={"stepdefinition"},
        plugin= {"junit:target/junitreports/junitreports.xml"},tags = "@SmokeTest",
        monochrome = false)
public class runnerjunit
{
}
