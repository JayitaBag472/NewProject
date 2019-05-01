package Runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		
		features={"Features"},
		glue={"Cucumber"},
		format={"html:target/cucumber-html-report"}
		)



public class TestRunner {
	

	
	
	
	
	

}
