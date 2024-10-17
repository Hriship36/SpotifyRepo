package Test_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ModuleOrPopup.LoginPage;
import Pages.SearchBox;

public class SearchTest1 {
	WebDriver driver;
	SearchBox searchbox;
	WebDriverWait wait;
	LoginPage loginPage;

	@BeforeClass
	public void launch() {

		driver = new ChromeDriver();
		searchbox = new SearchBox(driver);
		loginPage= new LoginPage(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.get("https://open.spotify.com/");

	}

	@BeforeMethod
	public void login() throws InterruptedException {
		driver.manage().deleteAllCookies();
		//driver.get("https://open.spotify.com/");
		searchbox.login();
		Thread.sleep(2000);
		searchbox.email();
		searchbox.password();
		searchbox.loginbutton();
		Thread.sleep(5000);
	}

	@Test (priority = 1)
	public void search() throws InterruptedException {
		
		searchbox.searchbox();
		Thread.sleep(3000);
		searchbox.box();
		searchbox.play2();
		Thread.sleep(30000);
		
	}
	
	@Test
	public void addto() throws InterruptedException {
		searchbox.Searchbox2();
		Thread.sleep(3000);
		searchbox.box();
		searchbox.play2();
		searchbox.addtofav();
		
	}

	
	  @AfterMethod 
	  public void logout() 
	  {
		   loginPage.accandlist();
		   loginPage.logout();
		   driver.manage().deleteAllCookies();
	  }
	  
	  @AfterClass
	  public void close() {
		  driver.close();
	  }
	 
}
