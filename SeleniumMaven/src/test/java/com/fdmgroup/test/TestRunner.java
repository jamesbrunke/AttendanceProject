package com.fdmgroup.test;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"features"}, plugin={"pretty", "junit:target/cucumber.xml","json:target/cucumber.json",
									"html:target/cucumber.html"})
public class TestRunner {

}
