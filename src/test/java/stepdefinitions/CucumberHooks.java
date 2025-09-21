package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.FileReaderManager;

public class CucumberHooks {
	public static WebDriver driver;
	@Before
	public void setUp() throws Exception {
		if(FileReaderManager.getProperty("Browser").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		
		System.out.println("Before hook");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@After
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
		System.out.println("After hook");
	}

}
