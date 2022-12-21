/**
 * 
 */
package com.TripAdvisor.WebApp.RunnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * This the Junit Runner class
 * @author Vrushali
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/featureFiles"},
				glue={"com/TripAdvisor/WebApp/StepDefinationFiles","com/TripAdvisor/WebApp/Base"},
				plugin= {"pretty","html:target/cucumber-reports/report.html","junit:target/cucumber-reports/report.xml","json:target/cucumber-reports/report.json"},
				monochrome=true,
				publish = true
				)
public class MyTestRunner {

}
