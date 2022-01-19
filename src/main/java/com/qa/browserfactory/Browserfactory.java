package com.qa.browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserfactory {
	
	
	  public static ThreadLocal<WebDriver> tlDriver= new ThreadLocal<>();
	
	public WebDriver init_browser(String browser)
	{
		if (browser.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}
	   getDriver().manage().window().maximize();
		
		return getDriver();
	
}

public static WebDriver getDriver() {
	
	return tlDriver.get();
}


}
