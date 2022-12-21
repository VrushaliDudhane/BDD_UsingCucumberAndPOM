
package com.TripAdvisor.WebApp.Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This is the Abstract class has declaration of common methods which would be inherited by BasePage class
 * @author Vrushali
 *
 */
public abstract class Page {
	
	protected WebDriver driver;
	WebDriverWait wait;

	public Page(WebDriver driver) {
		this.driver = driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	}
	
	public abstract String getPageTitle();
	
	public abstract String getPageHeader(By locator);
	
	public abstract WebElement getElement(By locator);
	
	public abstract void waitForElementToBePresent(By locator);
	
	public abstract void waitForPageTitle(String title);
	
	public abstract void waitForFrame(By locator);
	
//	public<Tpage extends BasePage> Tpage getInstanceOfPageClass(Class<Tpage> pageClass)
//	{
//		
//	}
	

}
