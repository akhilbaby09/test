package cucumberrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;





@CucumberOptions(features = "features/Secanrio.feature", glue ="testcase.Search" , format = {
		"html:target/cucumber-html-report",
		"json:target/cucumber-json-" + "report.json"  })
public class cucurun extends AbstractTestNGCucumberTests {
}