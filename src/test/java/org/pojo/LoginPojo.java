package org.pojo;

import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	public LoginPojo() {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@FindBy(xpath="//i[@class='tm tm-user']") private WebElement loginBtn;
	
	@FindBy(xpath="//input[@id='email']") private WebElement emailBox;
	
	@FindBy(xpath="//input[@id='email-password']") private WebElement passBox;
	
	@FindBy(xpath="(//button[@type='submit'])[2]") private WebElement submitBtn;
	
	@FindBy(xpath="//div[@class='alert alert-warning']") private WebElement alertBox;
	
	public void doLogin(String emailId,String password) {
		fillTextBox(emailBox, emailId);
		fillTextBox(passBox, password);
		clickElement(submitBtn);
		
		TakesScreenshot ts = (TakesScreenshot)new PageFactory();
		
	}
	
	public void clickLoginBtn() {
		clickElement(loginBtn);
	}
	
	public String getAlertStatus() {
		if(alertBox.isEnabled()) {
		return alertBox.getText();
		}
		return null;
	}
	
	public void what(){
	}
	
	

}
