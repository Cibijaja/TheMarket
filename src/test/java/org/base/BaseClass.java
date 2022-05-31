package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 protected static WebDriver driver;
	
	public static void initializeChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public void windowMaximize() {
		driver.manage().window().maximize();
	}
	public static void passUrl(String url) {
		driver.get(url);
	}
	
	public void fillTextBox(WebElement element,String text) {
		element.clear();
		element.sendKeys(text);
	}
	public void clickElement(WebElement element) {
		element.click();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	public void quitBrowser() {
		driver.quit();
	}
	
	
	
	
	
	

}
