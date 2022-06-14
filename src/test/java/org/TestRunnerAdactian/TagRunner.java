package org.TestRunnerAdactian;


import org.Baseclass.ReportBaseClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureTag",glue="org.adactian",dryRun=false,monochrome=true,tags= {"@reg,@smoke,@sanity,@E2E"},plugin= {"pretty","html:C:\\Users\\sures\\eclipse-workspace\\workspace2\\CucumberBDD01\\Reports","json:C:\\Users\\sures\\eclipse-workspace\\workspace2\\CucumberBDD01\\Reports\\jsonrep.json"})
public class TagRunner {
	@AfterClass
	public static void Afterclass() 
	{
       ReportBaseClass.Jsonreport("C:\\Users\\sures\\eclipse-workspace\\workspace2\\CucumberBDD01\\Reports\\jsonrep.json");
	}
	

}
