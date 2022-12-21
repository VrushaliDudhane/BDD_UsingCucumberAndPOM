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
	private By continueWithEmail=By.cssSelector("button[class='ui_button w100p regEmailContinue newRegFormButtonStyles roundedRegFormButton emailButtonMargin']>span[class='textContainer']");
	private By EmailHeader=By.xpath("//div[@id='regSignIn']/div[2]/div");
	private By emailAddress=By.cssSelector("input[id='regSignIn.email']");
	private By password=By.cssSelector("input[id='regSignIn.password']");
	private By signInButton=By.cssSelector("button[class='ui_button primary coreRegPrimaryButton  regSubmitBtnEvent']");
	private By errorMessageOnInvalideCredentials=By.xpath("//*[@id='regErrors']/ul/li");
	private By errorMessageOnBlankEmailAddress=By.cssSelector("div[class='body_text']");
	
	public SignInPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	public  WebElement getContinueWithGoogle() {
		//waitForElementToBeClickable(continueWithGoogle);
		return getElement(continueWithGoogle);
	}

	public WebElement getContinueWithFacebook() {
		//waitForElementToBeClickable(continueWithFacebook);
		return getElement(continueWithFacebook);
	}

	public WebElement getContinueWithEmail() {
		//waitForElementToBePresent(continueWithEmail);
		return getElement(continueWithEmail);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		WebElement element=(WebElement)js.executeScript("return document.querySelector(\"button[class='ui_button w100p regEmailContinue newRegFormButtonStyles roundedRegFormButton emailButtonMargin']>span[class='textContainer']\")");
//		return element;
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
	
	public WebElement getErrorMessageOnInvalideCredentials()
	{
		waitForElementToBePresent(errorMessageOnInvalideCredentials);
		return getElement(errorMessageOnInvalideCredentials);
	}
	
	public WebElement getErrorMessageOnBlankEmailAddress()
	{
		waitForElementToBePresent(errorMessageOnBlankEmailAddress);
		return getElement(errorMessageOnBlankEmailAddress);
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
	
	public void signInWithCredentials(String email,String pass) {
		getEmailAddress().sendKeys(email);
		getPassword().sendKeys(pass);
		
	}

	
	public UserHomePage clickOnSignIn() {
		getSignInButton().click();
		return new UserHomePage(driver);
	}


	public String getTheErrorMessageOnInvalidCredetials() {
		
		return getErrorMessageOnInvalideCredentials().getText();
	}



	public void signInWithCredentials(String crdentials, char ch) {
		if(ch=='P')
		{
			//getEmailAddress().sendKeys(" ");
			getPassword().sendKeys(crdentials);
			
		}
		else if(ch=='E')
		{
			getEmailAddress().sendKeys(crdentials);
			//getPassword().sendKeys(" ");
		}
	
		
	}



	public String getTheErrorMessageOnBlankEmailAddress() {
		return getErrorMessageOnBlankEmailAddress().getText();
	}



	public String getTheErrorMessageOnBlankPassword() {
		return getErrorMessageOnBlankEmailAddress().getText();
	}
}
