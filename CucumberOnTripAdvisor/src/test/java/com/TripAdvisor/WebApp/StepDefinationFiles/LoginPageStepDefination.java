/**
 * 
 */
package com.TripAdvisor.WebApp.StepDefinationFiles;

import org.apache.log4j.Logger;

import com.TripAdvisor.WebApp.Factory.WebDriverFactory;
import com.TripAdvisor.WebApp.Pages.HomePage;
import com.TripAdvisor.WebApp.Pages.SignInPage;
import org.junit.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


/**
 * @author Vrushali
 *
 */
public class LoginPageStepDefination {
	public Logger logger=Logger.getLogger( HomePageStepDefination.class.getName());
	private HomePage objHomePage=new HomePage(WebDriverFactory.getDriver());
	private SignInPage objSignInPage;
	
	@When("clicked on sign in link")
	public void clicked_on_sign_in_link() {
	 objSignInPage=objHomePage.clickOnSignIn();
	}

	@Then("the option {string} gets displayed")
	public void the_option_gets_displayed(String expectedEmailOption) {
		String actual=objSignInPage.textOnContinueWithEmail();
		Assert.assertEquals(expectedEmailOption,actual);
		logger.info(expectedEmailOption+" displayed");
		
	}
}
