package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\CIBI\\eclipse-workspace\\TheMarket\\src\\test\\resources\\FeatureFiles\\Login.Feature"},
				glue= {"org.stepDefinition","org.hooks"},dryRun=false,monochrome=true)

public class RunnerClass {
	
	
	

}
