/**
 * 
 */
package com.TripAdvisor.WebApp.StepDefinationFiles;

import org.apache.log4j.Logger;
import org.junit.Assert;


import com.TripAdvisor.WebApp.Factory.WebDriverFactory;
import com.TripAdvisor.WebApp.Pages.HomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Vrushali
 *
 */
public class HomePageStepDefination {
	public Logger logger=Logger.getLogger( HomePageStepDefination.class.getName());
	private HomePage objHomePage=new HomePage(WebDriverFactory.getDriver());
	
	@When("User is on the Home Page")
	public void user_is_on_the_home_page() {
	  System.out.println("User is on home pagge");
	}

	@Then("He gets The Home Page Title as {string}")
	public void he_gets_the_home_page_title_as(String pageTitle) {
	  String actualTitle=objHomePage.getPageTitle();
	  Assert.assertEquals(actualTitle, pageTitle);
	  logger.info("Agoda HomePage opened");	
	  //Assert.assertTrue(false);
	}
	
	@Then("Apllication logo has been displayed")
	public void apllication_logo_has_been_displayed() {
		if(objHomePage.isLogoDisplayed())
		{
			logger.info("Agoda logo has been displayed");
		}
		else
		{
			logger.error("Agoda logo haven't been displayed");
		}
	}

	@Then("Sign In Link Is displayed and Clickable")
	public void sign_in_link_is_displayed_and_clickable() {
		Assert.assertTrue(objHomePage.isSignInDisplayed());
		 logger.info("Sign In Link Is displayed and Clickable");	
	}


}
