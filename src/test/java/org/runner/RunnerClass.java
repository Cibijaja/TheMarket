package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"C:\\Users\\CIBI\\eclipse-workspace\\TheMarket\\src\\test\\java\\org\\feature\\Search.Feature",
		"C:\\Users\\CIBI\\eclipse-workspace\\TheMarket\\src\\test\\java\\org\\feature\\Login.Feature"},
				glue= {"org.stepDefinition","org.hooks"},dryRun=false,monochrome=true,
				plugin= {"pretty",
						"json:target/cucumber-report/cucumber.json",
						
						
})


public class RunnerClass {
//	@AfterClass
//	public static void jvmReport() {
//		Report.generateReport("C:\\Users\\CIBI\\eclipse-workspace\\TheMarket\\target\\cucumber-report");
//		
//		
//	}
	
	

}
