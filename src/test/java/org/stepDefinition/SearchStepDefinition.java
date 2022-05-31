package org.stepDefinition;
import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pojo.SearchPojo;

import cucumber.api.java.en.*;

public class SearchStepDefinition extends BaseClass{
	SearchPojo sp;
	
	
	@Given("User is in Homepage")
	public void user_is_in_Homepage() {
	   passUrl("https://themarket.com/nz/");
	}

	@When("User a product Name {string} in search box")
	public void user_a_product_Name_in_search_box(String string) throws InterruptedException {
		System.out.println(string);
	   sp=new SearchPojo();
	   sp.fillSearch(string);
	}

	@When("click search button")
	public void click_search_button() {
	   sp.cliskSearch();
	}

	@Then("user should be shown same product in search page")
	public void user_should_be_shown_same_product_in_search_page() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.urlContains("sekiro"));
	  String currentUrl = driver.getCurrentUrl();
	  Assert.assertEquals(true, currentUrl.contains("sekiro"));
	}




}
