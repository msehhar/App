package com.App.Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.App.Utilities.CONSTANTS;
import com.App.PageObjects.HomePage;
import com.App.Utilities.BaseFunctions;

public class SmokeTest {
	public BaseFunctions basefunction;
	public HomePage homePage;
	
	
	@BeforeTest
	public void setup(){
		basefunction = new BaseFunctions();
		homePage = new HomePage();
	}
	
	@BeforeMethod
	public void startDriver(){
		basefunction.startDriver();
		basefunction.openURL(CONSTANTS.URL);
		homePage.crossButtonClick();
	}
	
	@Test
	public void verifyNavigationBar(){
		assertTrue(homePage.verifyNav());
			
	}
	
	@Test
	public void verifyFooter(){
		assertTrue(homePage.verifyFooter());
	}
	
	@Test
	public void verifySearchAndComeBackToHomeScreen(){
		assertTrue(homePage.searchAndVerifyApple());
		assertTrue(homePage.verifyHomePage());
	}
	
	@AfterMethod
	public void stopDriver(){
		basefunction.stopDriver();
	}
}
