package genericUtilityOrLib;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import objectRepository.HomePage;
import objectRepository.LoginPage;
import seleniumUtility.SeleniumUtility;

public class BaseClass {
	public static WebDriver driver = null;
	SeleniumUtility SUTIL = null;
	PropertiesUtility PUTIL = new PropertiesUtility();

	@BeforeSuite(alwaysRun = true)
	public void createConnection() {
		System.out.println("connection successfully!!");
	}
//@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws Exception {
		String URL = PUTIL.getDataFromProperties("url");
		SUTIL = new SeleniumUtility();
		/*if(browser.contains("chrome"))
		{
			driver=new FirefoxDriver();
			System.out.println("Firefox launched");
		}
		if(browser.contains("firefox"))
		{
			driver=new ChromeDriver();
			System.out.println("Chrome launched");
		}*/
		
		driver = new ChromeDriver();
		SUTIL.implicitWait(driver, 10);
		SUTIL.maximizeWindow(driver);
		driver.get(URL);
		System.out.println("launching successfully");
	}

	@BeforeMethod(alwaysRun = true)
	public void loginApp() throws Exception {
		String USERNAME = PUTIL.getDataFromProperties("username");
		String PASSWORD = PUTIL.getDataFromProperties("password");
		LoginPage lp = new LoginPage(driver);
		lp.loginOperation(USERNAME, PASSWORD);
		System.out.println("login successfully!!");

	}

	@AfterMethod(alwaysRun = true)
	public void logoutApp() throws Exception {
		HomePage hp = new HomePage(driver);
		hp.logoutOperation(driver);
		System.out.println("logout successfully!!");
	}

	@AfterClass(alwaysRun = true)
	public void closeApp() {
		driver.quit();
		System.out.println("browser closed successfully!!");
	}

	@AfterSuite(alwaysRun = true)
	public void closeConnection() {
		System.out.println("connection closed successfully!!");
	}
}
