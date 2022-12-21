/**
 * 
 */
package com.TripAdvisor.WebApp.StepDefinationFiles;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;

import com.TripAdvisor.WebApp.Factory.WebDriverFactory;
import com.TripAdvisor.WebApp.Pages.HomePage;
import com.TripAdvisor.WebApp.Pages.SignInPage;
import com.TripAdvisor.WebApp.Pages.UserHomePage;

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
	private UserHomePage objUserHomePage;
	
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
	
	@Then("the second option {string} gets displayed")
	public void the_second_option_gets_displayed(String expectedGoogleOption) {
	   String actual=objSignInPage.textOnContinueWithGoogle();
	   Assert.assertEquals(expectedGoogleOption,actual);
		logger.info(expectedGoogleOption+" displayed");
	}
	
	@Then("the first option {string} gets displayed")
	public void the_first_option_gets_displayed(String expectedFacebookOption) {
		 String actual=objSignInPage.textOnContinueWithFacebook();
		   Assert.assertEquals(expectedFacebookOption,actual);
			logger.info(expectedFacebookOption+" displayed");
	}
	
	@When("User clicked on Continue with email")
	public void user_clicked_on_continue_with_email() {
		objSignInPage.clickOnContinueWithEmail();
	}

	@When("enter email and password as")
	public void enter_email_and_password_as(io.cucumber.datatable.DataTable validCredentials) {
	    List<List<String>> credentials=validCredentials.asLists();
	    Iterator<List<String>> itrRow=credentials.iterator();
	    while(itrRow.hasNext())
	    {
	    	List<String> rowData=itrRow.next();
	    	Iterator<String> itrData=rowData.iterator();
	    	while(itrData.hasNext())
	    	{
	    		objSignInPage.signInWithCredentials(itrData.next(), itrData.next());
	    	}
	    }
	}
	
	@When("clicked on login button")
	public void clicked_on_login_button() {
		objUserHomePage=objSignInPage.clickOnSignIn();
	}

	@Then("User gets signed in to application using valid credentials and your's home page gets displayed with Page Title as {string}")
	public void user_gets_signed_in_to_application_using_valid_credentials_and_your_s_home_page_gets_displayed_with_page_title_as(String  userHomepageTitle) {
		String actualTitle=objUserHomePage.getPageTitle();
		  Assert.assertEquals(actualTitle,userHomepageTitle);
		  logger.info("User Home Page Opened");	
	}
	
	@When("enter email as {string} and {string}")
	public void enter_email_as_and(String emailId, String password) {
		objSignInPage.signInWithCredentials(emailId, password);
	}

	@Then("error message gets displayed")
	public void error_message_gets_displayed() {
	  String actual=objSignInPage.getTheErrorMessageOnInvalidCredetials();
	  String expected="Either your email or password was incorrect. Please try again or click the \"Forgot password?\" link below.";
	  Assert.assertEquals(expected, actual);
	  logger.info("User cannot login to the application with invalid credentials");	
	}
	
	@Then("User put blank emailId field and password as {string}")
	public void user_put_blank_email_id_field_and_password_as(String pass) {
		objSignInPage.signInWithCredentials(pass, 'P');
	}

	@Then("{string} error message gets displayed")
	public void error_message_gets_displayed(String expected) {
	  String actual=objSignInPage.getTheErrorMessageOnBlankEmailAddress();
	  Assert.assertEquals(expected, actual);
	  logger.info("User cannot login to the application with blank email Id");	
	}

	@Then("User put  emailId as {string} and blank password field")
	public void user_put_email_id_as_and_blank_password_field(String email) {
		objSignInPage.signInWithCredentials(email, 'E');
	}

	@Then("{string} password error message gets displayed")
	public void password_error_message_gets_displayed(String expected) {
		String actual=objSignInPage.getTheErrorMessageOnBlankPassword();
		  Assert.assertEquals(expected, actual);
		  logger.info("User cannot login to the application with blank Password");	
	}

}
