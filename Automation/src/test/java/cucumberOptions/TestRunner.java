package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(features="E:\\Automation\\src\\test\\java\\Feature", glue="stepDefinations", stepNotifications= true,monochrome=true,
plugin= {"pretty","html:target/cucumber.html"}
)


public class TestRunner {

}
