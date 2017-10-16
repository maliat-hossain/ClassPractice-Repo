package com.bit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
	
	WebDriver dr;
	

	public void open() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\malia\\Desktop\\Driver\\geckodriver.exe");
		dr = new FirefoxDriver();
		dr.get("https://www.eshopper24.com/");
		
		
	}

}
