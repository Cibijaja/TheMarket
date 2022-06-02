package org.hooks;

import org.base.BaseClass;



import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	
	@Before
	public void initializer() {
		initializeChrome();
		System.out.println("Hiiii");
		
	}
	
	@After
	public void tearDown() {
		closeBrowser();
	}
	

}
