package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.qa.browserfactory.Browserfactory;
import com.qa.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginpageTest  {
	
     private LoginPage loginpage= new LoginPage(Browserfactory.getDriver());
     String forgetpwd;
     
@Given("user is on login page")
public void user_is_on_login_page() {
	Browserfactory.getDriver().get("https://www.facebook.com/");
}

@When("user enter username and password {string} and {string}")
public void user_enter_username_and_password_and(String username, String pwd) {
	
loginpage.enterusername(username);
loginpage.enterpassword(pwd);

}

@When("click on login button")
public void click_on_login_button()  {
loginpage.submitbutton();
 
}

@Then("verify the home page title should be {string}")
public void verify_the_home_page_title_should_be(String pagetitle) {
	//driver= new ChromeDriver();
	String actualtitle = loginpage.gettitle();
	System.out.println(actualtitle);
   Assert.assertEquals(actualtitle, pagetitle);
   
}
@When("user clicks on forget password link")
public void user_clicks_on_forget_password_link() {
	loginpage.clickforgetpwdlink().click();
}

@Then("user navigates to forget passwork page and page title contains {string}")
public void user_navigates_to_forget_passwork_page_and_page_title_contains(String expectedtitle) {
	forgetpwd = loginpage.gettitle();
	System.out.println(forgetpwd);
	Assert.assertTrue(forgetpwd.contains(expectedtitle));
}



}
