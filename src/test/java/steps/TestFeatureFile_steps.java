package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestFeatureFile_steps {
	

	@Given("I have numbers")
	public void i_have_numbers() {
	    System.out.println("Inside I have numbers");
	    System.out.println("Job id = " + System.getenv("JOB_ID_TRS"));
	    System.out.println("Example Key from Postman = " + System.getenv("TEST_ORDER_NUM"));
	    String clientPyaload = System.getenv("TEST_CLIENT_PAYLOAD");
	    System.out.println("clientPyaload = " + clientPyaload);
	    System.out.println("ICC from postman = " + System.getenv("TEST_CLIENT_ICC"));
	    System.out.println("GITHUB_RUN_URL = " + System.getenv("GITHUB_RUN_URL"));
	}

	@When("I add them")
	public void i_add_them() {
		System.out.println("Inside I add them");
	}

	@Then("I get the sum")
	public void i_get_the_sum() {
		System.out.println("Inside I get the sum");
	}
	
}
