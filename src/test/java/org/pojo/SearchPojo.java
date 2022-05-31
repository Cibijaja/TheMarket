package org.pojo;

import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPojo extends BaseClass{
	
	public SearchPojo() {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@FindBy(xpath="//input[@type='text']")private WebElement searchBox;
	
	@FindBy(xpath="//div[@class='cursor-pointer col-xs-1 search-btn-container']")private WebElement searchBtn;
	
	public void fillSearch(String item) {
		fillTextBox(searchBox, item);
		
	}
	
	public void cliskSearch() {
		clickElement(searchBtn);
	}

}
