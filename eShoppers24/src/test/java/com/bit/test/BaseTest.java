package com.bit.test;

import org.testng.annotations.BeforeMethod;

import com.bit.pages.OpenBrowser;

public class BaseTest extends OpenBrowser {
	@BeforeMethod
	
	public void navigation() {
		OpenBrowser op = new OpenBrowser();
		op.open();
		
	}
}


