package com.App.Utilities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseFunctions {
	public static WebDriver driver;
	
	public void startDriver(){
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
	}
	
	public void stopDriver(){
		driver.quit();
	}
	
	public void openURL(String URL){
		driver.get(URL);
	}
	
	public void clickElement(String element){
		driver.findElement(By.xpath(element)).click();
	}
	
	public void enterText(String element, String text){
		driver.findElement(By.xpath(element)).clear();
		driver.findElement(By.xpath(element)).sendKeys(text);
	}
	
	public String getText(String element){
		return driver.findElement(By.xpath(element)).getText();
	}
	
	public void scrollTo(String element){
		WebElement scrollToElement = driver.findElement(By.xpath(element));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollToElement);
	}
	
	public String getPageTitle(){
		return driver.getTitle();
	}
	
	public List<WebElement> getList(String element){
		List<WebElement> rows = driver.findElements(By.xpath(element));
		return rows;
	}
		
}
