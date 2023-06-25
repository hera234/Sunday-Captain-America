package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.MacysiframeActions;

public class MacysiframeSteps {
	
	 MacysiframeActions  MacysiframeActionsObj = new MacysiframeActions();

@Given("^Open Macys Homepage$")
public void open_Macys_Homepage() throws Throwable {
	 MacysiframeActionsObj.Openmacyshome();
}

@When("^Click on iframe Shop Now$")
public void click_on_iframe_Shop_Now() throws Throwable {
	 MacysiframeActionsObj.clickiframeShopNow();
}

@Then("^User should able to see DKNY page$")
public void user_should_able_to_see_DKNY_page() throws Throwable {
	 MacysiframeActionsObj.verifynewpage();
}




}
