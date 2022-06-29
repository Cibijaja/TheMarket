package org.stepDefinition;
import java.time.Duration;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
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
	
	
	private static void collec() {
		List<String> l = new ArrayList<String>();
		l.add("Genos");
		l.add("Raiden");
		l.add("2B");
		
		Iterator<String> iterator = l.iterator();
		
		l.add("Android 17");
		
		
		FluentWait wait  = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1)).ignoring(TimeoutException.class);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.)
		
	
		
		
		
		
		
		
		
		
		

		
		

	}
	
	public static void main(String[] args) {
		collec();
	}




}
