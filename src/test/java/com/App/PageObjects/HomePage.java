package com.App.PageObjects;

import com.App.Utilities.BaseFunctions;

public class HomePage extends BaseFunctions{

	public String crossButton = "//*[contains(@id, 'modal')]/div/div/div[1]/button";
	public String weeklyAds = "//*[@id='header']/div[1]/div[1]/nav/ul/li[1]";
	public String dealOfTheDay = "//*[@id='header']/div[1]/div[1]/nav/ul/li[2]";
	public String creditCards =	"//*[@id='header']/div[1]/div[1]/nav/ul/li[3]";
	public String forYourBusiness =	"//*[@id='header']/div[1]/div[1]/nav/ul/li[4]";
	public String giftCards	= "//*[@id='header']/div[1]/div[1]/nav/ul/li[5]";
	public String giftIdeas	= "//*[@id='header']/div[1]/div[1]/nav/ul/li[6]";
	public String pointsAndCertificates = "//*[@id='footer']/div[2]/div[1]/div[1]/div[1]/ul/li[1]";
	public String memberOffers = "//*[@id='footer']/div[2]/div[1]/div[1]/div[1]/ul/li[2]";
	public String searchTextBox = "//*[@id='gh-search-input']";
	public String searchButton = "//*[@id='header']/div[1]/div[2]/div[2]/form/button[2]";
	public String appleText= "//*[@id='site-control-content']/div[2]/div[2]/div[2]/div/div/div/div/h1";
	public String logo = "//*[@id='header']/div[1]/div[2]/div[1]";

	public void crossButtonClick(){
		clickElement(crossButton);
	}
	
	public boolean verifyNav(){
		if(getText(weeklyAds).equals("Weekly Ad") &&
		   getText(dealOfTheDay).equals("Deal of the Day") &&
		   getText(creditCards).equals("Credit Cards") &&
		   getText(forYourBusiness).equals("For Your Business") &&
		   getText(giftCards).equals("Gift Cards") &&
		   getText(giftIdeas).equals("Gift Ideas")){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean verifyFooter(){
		scrollTo(memberOffers);
		if(getText(pointsAndCertificates).equals("View Points & Certificates") &&
		   getText(memberOffers).equals("Member Offers")){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean searchAndVerifyApple(){
		enterText(searchTextBox, "Apple");
		clickElement(searchButton);
		if(getText(appleText).equals("Apple")){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean verifyHomePage(){
		clickElement(logo);
		if(getPageTitle().contains("Best Buy")){
			return true;
		}else{
			return false;
		}
	}
	
}
