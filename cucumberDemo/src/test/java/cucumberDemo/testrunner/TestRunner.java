package cucumberDemo.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner {
	
	        @CucumberOptions(features = {"src/test/resources/Feature"}, glue = {"cucumberDemo.stepDef","cucumberDemo.hooks"},
	        		 tags="@Login",plugin = {"pretty", "html:cucumberDemo/target/cucumber.html"})
			public class CucumberRunner extends AbstractTestNGCucumberTests {

			}

}
