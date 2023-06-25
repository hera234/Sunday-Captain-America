package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.RahulHandleAlertAction;

public class RahulHandleAlertSteps {
	
	 RahulHandleAlertAction  RahulHandleAlertActionObj = new  RahulHandleAlertAction();
	 
	 
	 @Given("^Open Rahul Shetty Practice Home Page$")
	 public void open_Rahul_Shetty_Practice_Home_Page() throws Throwable {
		
	 }

	 @When("^Enter Your Name Switch to Alert box$") 
	 public void enter_Your_Name_Switch_to_Alert_box() throws Throwable {
		 RahulHandleAlertActionObj.typeNametoAlertBox();
		 Thread.sleep(3000);
	 } 

	 @When("^user should click Alert Button to accept$")
	 public void user_should_click_Alert_Button_to_accept() throws Throwable {
		 RahulHandleAlertActionObj.ClickAlertButtonAccept();
	 }

	 @When("^Again Enter your Name Switch to Alert box$")
	 public void again_Enter_your_Name_Switch_to_Alert_box() throws Throwable {
		 RahulHandleAlertActionObj.typeNametoAlertBox();
	 }

	 @Then("^user should click confirm button to cancel$")
	 public void user_should_click_confirm_button_to_cancel() throws Throwable {
		 RahulHandleAlertActionObj.Enterconfirmtoclickcancle();
	 }

	 
	 
	 
	 
	 
	 
	 
	
	
	}



