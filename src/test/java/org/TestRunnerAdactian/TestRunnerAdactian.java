package org.TestRunnerAdactian;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureADACTIAN",glue="org.adactian",dryRun=false)
public class TestRunnerAdactian {

}
