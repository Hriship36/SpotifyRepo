package ModuleOrPopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath = "//span[text()='Log In']")
	private WebElement login;
	
	@FindBy (xpath ="//button[@data-testid='user-widget-link']")
	private WebElement accandlist;
	
	@FindBy (xpath = "//span[text()='Log out']")
	private WebElement logout;
 
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//driver.get("https://accounts.spotify.com/en/login?creation_point=https%3A%2F%2Fwww.spotify.com%2Fin-en%2Fsignup%2F&continue=https%3A%2F%2Faccounts.spotify.com%2Fen%2Fstatus%3Fflow_ctx%3D997b2437-7560-463c-abc8-91db823aacc4%253A1726614157&flow_ctx=997b2437-7560-463c-abc8-91db823aacc4%3A1726614157");
	}
	
	public void email() {
		email.sendKeys("Hrishipatil00@gmail.com");
		
	}
	public void password() {
		password.sendKeys("02101997");
		
	}
	
	public void login(){
		login.click();
	}
	
	public void accandlist() {
		accandlist.click();
	}
	
	public void logout() {
		logout.click();
	}
}
