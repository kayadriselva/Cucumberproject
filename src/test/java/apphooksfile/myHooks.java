package apphooksfile;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.browserfactory.Browserfactory;
import com.qa.pages.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class myHooks {
	
	private ConfigReader configreader;
	Properties prop;
	private WebDriver driver;
	String browsername;
	private Browserfactory browserfactory;
	
	@Before (order=0)
	public void getProperty()
	{
		configreader= new ConfigReader();
		prop=configreader.init_prop();
	}
	
	@Before (order=1)
	public void launchBrowser()
	{
		browsername= prop.getProperty("browser");
		browserfactory= new Browserfactory();

		browserfactory.init_browser(browsername);
	}
	
@After(order=1)
public void teardown (Scenario scenario)
{
	if (scenario.isFailed())
	{
		String screenshotname = scenario.getName();
		
		byte[] sourcepath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcepath, "image/png", screenshotname);
		
		
	}
}
	
}
