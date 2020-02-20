package stepDefinition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class StepDefinition {
	@Given("^user is on login page$")
	public void user_is_on_login_page()
	{
		System.out.println("Given");
	}
	@When("^login with User name and password$")
	public void login_with_User_name_and_password()
	{
		System.out.println("When");
	}
	@Then("^Home page is open$")
	public void Home_page_is_open()
	{
		System.out.println("Then");
	}
	
	@And("^chcek we are able to see cards$")
	public void chcek_we_are_able_to_see_cards()
	{
		System.out.println("And");
	}
	
}
