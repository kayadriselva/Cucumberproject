package stepDefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.qa.browserfactory.Browserfactory;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageTest {
	
	private LoginPage loginpage= new LoginPage(Browserfactory.getDriver());
	private HomePage HomePage;
	public List<String> listo;
	
	
		@Given("User already login and in home page")
		public void user_already_login_and_in_home_page(DataTable dataTable) throws InterruptedException {
			List<Map<String, String>> asMaps = dataTable.asMaps();
			String username = asMaps.get(0).get("username");
			String password = asMaps.get(0).get("password");
			Browserfactory.getDriver().get("https://www.facebook.com/");
			HomePage = loginpage.dologin(username, password);
			Thread.sleep(5000);
		}

		@When("get the given menu list")
		public void get_the_given_menu_list(DataTable menulist) {
			List<String> expectedmenu = menulist.asList();
			System.out.println("Expected menu" + expectedmenu);
			listo= new ArrayList<>();
			List<WebElement> menus = HomePage.homemenu();
			for (WebElement newlist:menus)
			{
				String text = newlist.getText();
				
				listo.add(text);
			
			}
			System.out.println(listo);
			//List<String> actualmenu = homePage.gethomemenulist();
			//System.out.println("Actual menu" + actualmenu);
			Assert.assertTrue(listo.containsAll(expectedmenu));
		}

		@Then("list should be displayed correctly")
		public void list_should_be_displayed_correctly() {
			System.out.println("list is displayed correctly");
		}
		
		@Given("User in home page")
		public void user_in_home_page() {
		    System.out.println("homepage");
		}

	}


