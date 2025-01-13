package com.vaadin.testbenchexample;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.textfield.testbench.PasswordFieldElement;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import com.vaadin.testbench.HasStringValueProperty;
import com.vaadin.testbench.IPAddress;
import com.vaadin.testbench.Parameters;
import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.TestBenchTestCase;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public abstract class BaseLoginTest extends TestBenchTestCase {
/*

	@Before
	public void setUp() {
    //ChromeOptions options = new ChromeOptions();
    //options.addArguments("--headless", "--disable-gpu");
    //setDriver(new ChromeDriver(options));
		setDriver(new ChromeDriver());
		performLogin();

		Parameters.setScreenshotReferenceDirectory( "src/test/screenshots");
		Parameters.setScreenshotComparisonTolerance(1.0);
		driver.manage().window().setSize( new Dimension( 1024, 768));
		Parameters.setScreenshotRetryDelay(10);
		Parameters.setScreenshotComparisonCursorDetection(true);
        String downloadFilepath = "C:\\Users\\MariiaCherniak\\Documents\\GitHub\\new\\downloadFiles";
	Map<String, Object> prefs = new HashMap<>();
	prefs.put("download.default_directory", downloadFilepath);
	prefs.put("download.prompt_for_download", false); // Disable download prompts
	prefs.put("safebrowsing.enabled", true); // Disable safety warnings for downloads

	}


*/


		@After
	public void tearDown() throws Exception {
			getDriver().quit();
	}

	@Before
	public void setUp() {
	// Configure download preferences for Chrome
//	String downloadFilepath = "C:\\Users\\MariiaCherniak\\Documents\\GitHub\\Amplify\\downloadFiles";
	String downloadFilepath = System.getProperty("user.dir") + File.separator + "downloadFiles";
	Map<String, Object> prefs = new HashMap<>();
	prefs.put("download.default_directory", downloadFilepath);
	prefs.put("download.prompt_for_download", false); // Disable download prompts
	prefs.put("safebrowsing.enabled", true); // Disable safety warnings for downloads

	// Set Chrome options
	ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("prefs", prefs);

	// Optional: If you want to run the tests in headless mode (without a UI)
	 options.addArguments("--headless", "--disable-gpu");
//	setDriver(new ChromeDriver());
	// Initialize the ChromeDriver with the specified options and capabilities
//	driver = new ChromeDriver(options);
		setDriver(new ChromeDriver(options));
	// Perform login or other initial setup
	performLogin();

	// Set TestBench parameters for screenshot comparison
	Parameters.setScreenshotReferenceDirectory("src/test/screenshots");
	Parameters.setScreenshotComparisonTolerance(1.0);
	driver.manage().window().setSize(new Dimension(1024, 768));
	Parameters.setScreenshotRetryDelay(10);
	Parameters.setScreenshotComparisonCursorDetection(true);
}

	// Your login method

	private void performLogin() {
		getDriver().get("http://localhost:8080/amplify_webui/");
	//	getDriver().get( "http://" + IPAddress.findSiteLocalAddress() + ":8080/navy_webui/");


		$( TextFieldElement.class).first().setValue( "jBond");
		$( PasswordFieldElement.class).first().setValue( "JBond007");
		$( ButtonElement.class).first().click();
	//	getDriver().get("https://test.navymutual.calcfocus.net/policyadmin/oauth2/login/cognito");
	//	WebElement usernameFieldElement = findElement( By.id( "signInFormUsername" ));
	//	usernameFieldElement.click();
	//	usernameFieldElement.sendKeys( "helpdesk" );
	//	WebElement passwordFieldElement = findElement( By.id( "signInFormPassword" ));
	//	passwordFieldElement.click();
	//	passwordFieldElement.sendKeys( "JBond007$" );

	//	WebElement buttonElement = findElement( By.id( "signInSubmitButton" ));
	//	TestBenchElement loginButton = ( TestBenchElement )findElement( By.name( "signInSubmitButton" ));
	//	loginButton.click();





	}
}

