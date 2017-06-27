package StepDefination;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 

/*@CucumberOptions(

features = "src/test/java/Automation/bdd",
glue={"LoginStep"}				
) 
*/

@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},
features = "src/test/resources/Features")


public class RunTest {

}
