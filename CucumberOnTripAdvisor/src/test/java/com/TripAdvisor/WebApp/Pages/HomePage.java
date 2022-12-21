/**
 * 
 */
package com.TripAdvisor.WebApp.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.TripAdvisor.WebApp.Base.BasePage;



/**
 * This is the Page class for Home page of the application
 * this class has two parts 
 * first part contains all the By locators of the Home page WebElements
 * and second part contains all the action methods on page 
 * @author Vrushali
 *
 */
public class HomePage extends BasePage {

	private By logo=By.cssSelector("img[class='TRRBg _R']");
			
	private By signInLink=By.cssSelector("a[class='rmyCe _G B- z _S c Wc wSSLS w jWkoZ sOtnj']");		
		
	private By signInFrame=By.cssSelector("iframe[class='bFOrV _R B- o']");				
			
	public HomePage(WebDriver driver) {
		super(driver);
	}

	/**
	 * these are the getters of WebElements these methods wait for perticular webelement to be get displayed and return that webElement to the caller
	 * @return WebElement
	 */

	public WebElement getSignInLink() {
		waitForElementToBeClickable(signInLink);
		return getElement(signInLink);
	}


	public WebElement getLogo() {
		waitForElementToBePresent(logo);
		return getElement(logo);
	}
	
	public String getTheHomePageTitle()
	{
		waitForPageTitle("Tripadvisor: Over a billion reviews & contributions for Hotels, Attractions, Restaurants, and more");
		return getPageTitle();
	}
	
	public WebElement getSignInFrame() {
		//waitForFrame(signInFrame);
		return getElement(signInFrame);
	}
	
	public boolean isLogoDisplayed()
	{
		return getLogo().isDisplayed();
	}

	public boolean isSignInDisplayed()
	{
		return getSignInLink().isDisplayed();
	}
	
	
	/**
	 * this method click on sign in link
	 * which opens the iframe 
	 * @return SignIn Page object
	 */
	public SignInPage clickOnSignIn()
	{
		getSignInLink().click();
		driver.switchTo().frame(getSignInFrame());
		return new SignInPage(driver);
	}




	
	
	
}
