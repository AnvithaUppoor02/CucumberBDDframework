package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before("@RegTest")
	public void Regression() {
		System.out.println("Regression Test");
	}
	@After("@RegTest")
	public void RegressionComplete() {
		System.out.println("Regression Test Completed");
	}
	@Before("@SmokeTest")
	public void SmokeTest() {
		System.out.println("Smoke Test");
	}
	@After("@SmokeTest")
	public void SmokeTesCompletet() {
		System.out.println("Smoke Test Completed");
	}

}
