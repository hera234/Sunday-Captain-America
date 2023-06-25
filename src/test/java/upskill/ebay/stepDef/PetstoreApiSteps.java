package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.api.restassured.PetstoreRestAssuredActions;

public class PetstoreApiSteps {
	PetstoreRestAssuredActions PetstoreRestAssuredActionsObj = new PetstoreRestAssuredActions();
	@Given("^Creat Pet$")
	public void creat_Pet() throws Throwable {
		PetstoreRestAssuredActionsObj.creatPet();
	}

	@Given("^Get Pet$")
	public void get_Pet() throws Throwable {
		PetstoreRestAssuredActionsObj.getPet();
	}

	@When("^Update pet$")
	public void update_pet() throws Throwable {
		PetstoreRestAssuredActionsObj.updatePet();
	}

	@Then("^Delete pet$")
	public void delete_pet() throws Throwable {
		PetstoreRestAssuredActionsObj.deletePet();
	}


}
