package Test_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ModuleOrPopup.LoginPage;
import Pages.OnScreenSong;
import Pages.SearchBox;

public class FavoriteTest2 {

	WebDriver driver;
	SearchBox searchbox;
	OnScreenSong onscreensong;
	WebDriverWait wait;
	LoginPage loginPage;
	 Actions action;
	
	
	@BeforeClass
	public void launch() {
		
		 driver = new ChromeDriver();
		 searchbox= new SearchBox(driver);
		 onscreensong= new OnScreenSong(driver);
		 loginPage = new LoginPage(driver);
		 wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		 driver.manage().deleteAllCookies();
	      action= new Actions(driver);
		 
	}
	
	@BeforeMethod
	public void login() throws InterruptedException {
		driver.get("https://open.spotify.com/");
		  searchbox.login();
		  
		  Thread.sleep(2000);
		  searchbox.email();
		  searchbox.password();
		  searchbox.loginbutton();
		  Thread.sleep(4000); 

	}
	
	
	  @Test 
	  public void play() throws InterruptedException { 
		  Thread.sleep(3000);
		onscreensong.yourlib();
		Thread.sleep(4000);
		onscreensong.play();
	     System.out.println(driver.getTitle());
	     searchbox.close();
	  }
	  
    @AfterMethod
    public void Log() {
    	loginPage.accandlist();
    	loginPage.logout();
    	
    }
    
    @AfterClass
    public void close() {
    	driver.quit();
    }
		
	
	 
	  
	  
}
