package genericlibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import objectrepository.loginpage;
import objectrepository.welcomepage;
import objectrepository.welcomepage.WelcomePage;


public class baseclass {
	public WebDriver driver;
	@BeforeSuite
	public void bs() {
		System.out.println("before suite");
	}
	@BeforeTest
	public void bt() {
		System.out.println("before test");
	}
	@BeforeClass
	public void launchbrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("before class");
	}
	@BeforeMethod
	public void login() {
		WelcomePage welcome=new WelcomePage(driver);
		
		loginpage login=new loginpage(driver);
		welcome.getLoginLink().click();
		
		login.getLoginButton().click();
		
		System.out.println("Before method");
	}
	
	
	@AfterSuite
	public void as() {
		System.out.println("After suite");
	}
	
	@AfterTest
	public void at() {
		System.out.println("After test");
	}
	
	@AfterClass
	public void closeBrowser() {
		
		driver.quit();
		System.out.println("After class");
	}
	
	@AfterMethod
	public void logout() {
		WelcomePage welcome=new WelcomePage(driver);
		
		welcome.getLogoutLink().click();
		System.out.println("After method");
	}
		
	}
	
}
