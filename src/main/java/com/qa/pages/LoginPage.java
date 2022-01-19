package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.browserfactory.Browserfactory;

public class LoginPage  {

    private WebDriver driver;
	
private By emailid=By.id("email");
private By password= By.id("pass");
private By signin=By.xpath("//button[@name='login']");
private By forgetpasswordlink=By.linkText("Forgotten password?");

public LoginPage(WebDriver driver) 
{
this.driver=driver;
}

public void submitbutton()
{
	driver.findElement(signin).click();
}


public void enterusername(String username) {
	driver.findElement(emailid).sendKeys(username);
	
}



public void enterpassword(String pwd) {
	driver.findElement(password).sendKeys(pwd);
	
}

public String gettitle() {
	return driver.getTitle();
	
}

public WebElement clickforgetpwdlink()
{
	return driver.findElement(forgetpasswordlink);
}

public HomePage dologin(String username, String pwd)
{
	driver.findElement(emailid).sendKeys(username);
	driver.findElement(password).sendKeys(pwd);
	driver.findElement(signin).click();
	return new HomePage(driver);
}

}