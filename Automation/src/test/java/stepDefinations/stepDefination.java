package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepDefination {
	@Given("^User is on practicetestautomation page$")
	public void practicetestautomation_page() {
		System.out.println("practice Automation");
	}
	@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void Login(String strArg1, String strAgr2) {
	System.out.println(strArg1);	
	System.out.println(strAgr2);
	}
	
	@Then("^Home Page is populated$")
	public void Home_page() {
	System.out.println("Homepage populated");	
	}
	@And("^Logout button is displayed in homepage \"([^\"]*)\"$")
	public void Logout_button_verification(String strArg1) {
	System.out.println(strArg1);	
	}
	
	@When("^User data$")
	public void user_data(DataTable data) {
		List<List<String>> obj = data.asLists(String.class);		
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		
		}
	@When("^User credentials (.+) and (.+)$")
	public void user_credential(String username, String password) {	
		System.out.println(username);
		System.out.println(password);
		
		}
	
	@Given("^validate the browser$")
	public void BrowserValidate() {
		System.out.println("Validate the browser");
	}
	@When("^Browser is triggered$")
	public void BrowserTriggered() {
		System.out.println("Check if browser triggered");
		}
	@Then("^Check if browser is started$")
	public void BrowserStart() {
	System.out.println("Check if browser is started");	
	}
}
