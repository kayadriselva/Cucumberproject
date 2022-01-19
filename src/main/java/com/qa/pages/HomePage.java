package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}

	private By homemenuList=By.xpath("//div[@class='sn7ne77z buofh1pr cbu4d94t j83agx80']//following::span[2]");
	
	public List<WebElement> homemenu() {
		
		List<WebElement> homelist = driver.findElements(homemenuList);
		return homelist;
	}


	
	/*public List<String> gethomemenulist()
	{
		List<String> arrayhome= new ArrayList<>();
		List<WebElement> homemenu= driver.findElements(homemenuList);
		for (WebElement storehomemenu:homemenu)
		{
			String homemenutext = storehomemenu.getText();
			System.out.println(homemenutext);
			arrayhome.add(homemenutext);
		}
		return arrayhome;
	}*/
	
}
