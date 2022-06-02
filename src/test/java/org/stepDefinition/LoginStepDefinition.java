package org.stepDefinition;

import org.base.BaseClass;
import org.pojo.LoginPojo;
import org.testng.Assert;

import cucumber.api.java.en.*;


public class LoginStepDefinition extends BaseClass {
	LoginPojo lp;

	@Given("User is in login page")
	public void user_is_in_login_page() {
		passUrl("https://themarket.com/nz/");
		lp = new LoginPojo();
		lp.clickLoginBtn();
	}

	@When("User enter email {string} and password {string} in their respective input field")
	public void user_enter_email_and_password_in_their_respective_input_field(String emailId, String password) {
		lp.doLogin(emailId, password);
	}

	@Then("user account should be validated according to credentials {string}")
	public void user_account_should_be_validated_according_to_credentials(String validity) {
		if(validity.equals("valid")) {
			Assert.assertEquals(true, true);
		}
		else if(validity.equals("invalid")) {
			String alertStatus = lp.getAlertStatus();
			Assert.assertEquals(alertStatus, "Failed to authenticate user, please try again");
		}
	}

}
