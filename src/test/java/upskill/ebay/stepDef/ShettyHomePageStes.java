package upskill.ebay.stepDef;

import cucumber.api.java.en.Given; 
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.ShettyHomePageActions;

public class ShettyHomePageStes {
	ShettyHomePageActions ShettyHomePageActionsObj = new ShettyHomePageActions();

@Given("^Open Shetty Homepage$")
public void open_Shetty_Homepage() throws Throwable {
ShettyHomePageActionsObj.loadShettyHomePage();
}

@When("^Click on iFrame Home$")
public void click_on_iFrame_Home() throws Throwable {
	ShettyHomePageActionsObj.clickframeHome();
}

@Then("^It should reload iframe homepage$")
public void it_should_reload_iframe_homepage() throws Throwable {
	ShettyHomePageActionsObj. VerifyShettyHome();
}

}



