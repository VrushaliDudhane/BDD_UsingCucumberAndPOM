/**
 * 
 */
package com.TripAdvisor.WebApp.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TripAdvisor.WebApp.Base.BasePage;

/**
 * This is the Page class for Sign in frame of the application
 * this class has two parts 
 * first part contains all the By locators of the sign in  frame WebElements
 * and second part contains all the action methods on page 
 * @author Vrushali
 *
 */
public class SignInPage extends BasePage{

	private By header=By.xpath("//*[@id='overlayHeader']/div");
	private By continueWithGoogle=By.cssSelector("button[id='googleBtn']");
	private By continueWithFacebook=By.cssSelector("button[id='facebookBtn']");
	private By continueWithEmail=By.xpath("//*[@id=\"ssoButtons\"]/button/span[2]");
	private By EmailHeader=By.xpath("//div[@id='regSignIn']/div[2]/div");
	private By emailAddress=By.cssSelector("input[id='regSignIn.email']");
	private By password=By.cssSelector("input[id='regSignIn.password']");
	private By signInButton=By.cssSelector("button[class='ui_button primary coreRegPrimaryButton  regSubmitBtnEvent']");

	public SignInPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	public  WebElement getContinueWithGoogle() {
		waitForElementToBeClickable(continueWithGoogle);
		return getElement(continueWithGoogle);
	}

	public WebElement getContinueWithFacebook() {
		waitForElementToBeClickable(continueWithFacebook);
		return getElement(continueWithFacebook);
	}

	public WebElement getContinueWithEmail() {
		waitForElementToBePresent(continueWithEmail);
		return getElement(continueWithEmail);
	}
		
	public WebElement getEmailAddress() {
		waitForElementToBePresent(emailAddress);
		return getElement(emailAddress);
	}
	
	public WebElement getPassword() {
		waitForElementToBePresent(password);
		return getElement(password);
	}
	
	public WebElement getSignInButton() {
		waitForElementToBePresent(signInButton);
		return getElement(signInButton);
	}
	
	
	
	public String textOnContinueWithFacebook()
	{
		return getContinueWithFacebook().getText();
	}
	
	
	public String textOnContinueWithGoogle()
	{
		return getContinueWithGoogle().getText();
	}
	
	public String textOnContinueWithEmail()
	{
		return getContinueWithEmail().getText();
	}
	
	
	public String getSignInPageHeader()
	{
		waitForElementToBePresent(header);
		return getPageHeader(header);
	}
	
	
	public void clickOnContinueWithEmail()
	{
		getContinueWithEmail().click();
		
	}

	public String getEmailHeader()
	{
		waitForElementToBePresent(EmailHeader);
		return getPageHeader(EmailHeader);
	}
	
	public UserHomePage signInWithCredentials(String email,String pass) {
		getEmailAddress().sendKeys(email);
		getPassword().sendKeys(pass);
		getSignInButton().click();
		return new UserHomePage(driver);
	}
}
