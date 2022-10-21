package applicationhooks;



import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.driverfactory.Driverfactory;
import com.qa.utilities.Configreader;

import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	
	private Driverfactory driverFactory;
	private WebDriver driver;
	private Configreader configReader;
	Properties prop;

	@Before(order = 0)
	public void getProperty() {
		configReader = new Configreader();
		prop = configReader.init_prop();
	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new Driverfactory();
		driver = driverFactory.init_driver(browserName);
		
		
	}

	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		
		if (scenario.isFailed()) {
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			(scenario).attach(sourcePath, "image/png", screenshotName);

		}
	}
	
	

}
