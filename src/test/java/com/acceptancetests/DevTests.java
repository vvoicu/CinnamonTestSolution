package com.acceptancetests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "com" }, features = "src/test/resources/features", plugin = { "json:target/cucumber-reports/cucumber.json" }, tags = { "@dev,@wip" })
public class DevTests {
}
