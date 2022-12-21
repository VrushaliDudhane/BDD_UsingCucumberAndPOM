/**
 * 
 */
package com.TripAdvisor.WebApp.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Vrushali
 *
 */
public class WebDriverFactory {
	
	public static ThreadLocal<WebDriver> tl=new ThreadLocal<>();
	
	public static WebDriver initDriver(String browser)
	{
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			tl.set(new ChromeDriver());
		}

		else if (browser.equalsIgnoreCase("microsoftEdge")) {
			WebDriverManager.edgedriver().setup();
			tl.set(new EdgeDriver()); 
		}
		
		return getDriver();
		
		
	}
	
	public static WebDriver getDriver()
	{
		return tl.get();
	}
}
