package Utilities;

import Pages.loginPage;
import Pages.splashDevPage;

public class PageInitializer extends BaseClass {
	
	
	public static splashDevPage sDp;
	public static loginPage lp;
	
	
	
	public static void initialize() {
		
		sDp = new splashDevPage();
		lp = new loginPage();
		
		
	}

}
