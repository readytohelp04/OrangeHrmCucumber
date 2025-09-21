package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeesteps {
	public WebDriver driver;
	
	@Given("user is in employee page")
	public void user_is_in_employee_page() {
		System.out.println("is in employee page");
	}
	@When("user clicks the add button")
	public void user_clicks_the_add_button() {
	  
	}
	@Then("validate employee is displayed")
	public void validate_employee_is_displayed() {
	   
	}


}
