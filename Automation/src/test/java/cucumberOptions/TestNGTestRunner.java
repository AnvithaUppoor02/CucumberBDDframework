package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="E:\\Automation\\src\\test\\java\\Feature", glue="stepDefinations")
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
