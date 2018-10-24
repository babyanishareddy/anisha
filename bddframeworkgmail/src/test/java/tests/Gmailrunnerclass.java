package tests;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\batch238\\bddframework\\src\\test\\resources\\gmailbdd\\feature1.feature",
				"C:\\batch238\\bddframework\\src\\test\\resources\\gmailbdd\\feature2.feature"},
		         plugin={"pretty","html:target"},monochrome=true)
public class Gmailrunnerclass
 {
		
	
 }


