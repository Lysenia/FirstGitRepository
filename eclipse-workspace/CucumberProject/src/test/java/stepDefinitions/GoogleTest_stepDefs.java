package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Browser;

public class GoogleTest_stepDefs {

	@When("^user goes to google\\.com$")
	public void user_goes_to_google_com() throws Throwable {
	    Browser.getDriver().get("http://google.com");
	}

	@Then("^user should get proper title$")
	public void user_should_get_proper_title() throws Throwable {
	   String expected = "Google";
	   String actual = Browser.getDriver().getTitle();
	   System.out.println("Expected: " + expected);
	   System.out.println("Actual: " + actual);
	}
	
	@Then("^user types \"([^\"]*)\" in the search bar$")
	public void user_types_in_the_search_bar(String data) throws Throwable {
	    System.out.println("Coming data is: " + data);
	}

	@Then("^user gets \"([^\"]*)\" related result$")
	public void user_gets_related_result(String data) throws Throwable {
	    System.out.println("Coming data is 2: " + data);
	}
}
