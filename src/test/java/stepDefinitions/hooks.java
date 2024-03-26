package stepDefinitions;

import Pages.splashDevPage;
import Utilities.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	splashDevPage sDp = new splashDevPage();
	
	@Before
	public void setUp() {
			BaseClass.getDriver();
	}
	
	@After
	public void tearDown() {
		BaseClass.teardDown();
	}
	
	

}
