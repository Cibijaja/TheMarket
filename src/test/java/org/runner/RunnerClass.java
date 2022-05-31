package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"C:\\Users\\CIBI\\eclipse-workspace\\TheMarket\\src\\test\\resources\\FeatureFiles\\search.Feature"},
				glue= {"org.stepDefinition","org.hooks"},dryRun=false,monochrome=true,tags="not @notNow",
				plugin= {"pretty",
						"json:target\\MyReport\\report1.json",
						"html:target\\\\MyReport\\\\report1.html"
})


public class RunnerClass {
	
	
	

}
