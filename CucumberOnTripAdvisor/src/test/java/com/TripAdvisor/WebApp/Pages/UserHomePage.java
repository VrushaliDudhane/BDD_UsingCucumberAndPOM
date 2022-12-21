/**
 * 
 */
package com.TripAdvisor.WebApp.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.TripAdvisor.WebApp.Base.BasePage;



/**
* This is the Page class for User Home Page of the application
* this class has two parts 
* first part contains all the By locators of the User Home Page WebElements
* and second part contains all the action methods on page 
* @author Vrushali
*
*/

public class UserHomePage extends BasePage {

				
			
	public UserHomePage(WebDriver driver) {
		super(driver);
	}



	
	
	public String getTheUserHomePageTitle()
	{
		waitForPageTitle("Tripadvisor: Over a billion reviews & contributions for Hotels, Attractions, Restaurants, and more");
		return getPageTitle();
	}
		
}
