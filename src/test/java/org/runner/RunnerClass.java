package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"C:\\Users\\CIBI\\eclipse-workspace\\TheMarket\\src\\test\\resources\\FeatureFiles\\search.Feature",
		"C:\\Users\\CIBI\\eclipse-workspace\\TheMarket\\src\\test\\resources\\FeatureFiles\\Login.Feature"},
				glue= {"org.stepDefinition","org.hooks"},dryRun=false,monochrome=true,
				plugin= {"pretty",
						"json:target\\MyReport\\report1.json",
						"html:target\\\\MyReport\\\\report2.html",
						"junit:target\\\\MyReport\\\\report3.xml",
						
})


public class RunnerClass {
	
	
	

}
