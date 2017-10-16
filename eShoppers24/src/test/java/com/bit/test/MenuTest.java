package com.bit.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MenuTest {
	WebDriver dr;
	@Test
	public void menu() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\malia\\Desktop\\Driver\\geckodriver.exe");
		dr = new FirefoxDriver();
		dr.get("https://www.eshopper24.com/");
		int s=dr.findElements(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li/a/b")).size();
		for(int i=1;i<=s;i++) {
			dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li["+i+"]/a/b")).click();
			Thread.sleep(3000);
			
			List<WebElement> ele = dr.findElements(By.xpath("html/body/div[4]/div[2]/div/div/aside/figure[2]/div/ul/li["+i+"]/ul/li/a/b"));
			int ss = ele.size();
			for(int j=1; j<=ss; j++) {
				dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div/aside/figure[2]/div/ul/li["+i+"]/ul/li["+j+"]/a/b")).click();
				Thread.sleep(3000);
				dr.navigate().back();
			}
					
		}
		
		
		
	}
	
	
	



}
