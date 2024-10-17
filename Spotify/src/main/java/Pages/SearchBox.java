package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBox {
	
	@FindBy(xpath = "//span[text()='Log in']")
	private WebElement login;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath = "//span[text()='Log In']")
	private WebElement loginbutton;
	
	@FindBy(xpath = "//input[@type='search' and @placeholder='What do you want to play?' ]")
	private WebElement searchbox;
	
	@FindBy(xpath="//div[@id='onetrust-close-btn-container']")
	private WebElement close;
	
	
	@FindBy(xpath = "//button[@aria-label=\"Browse\"]")
	private WebElement browse;
	
	@FindBy(xpath = "//div[@aria-rowindex=\"1\"]")
	private WebElement box;

	
	@FindBy(xpath = "//button[@tabindex=\"0\" and @data-roving-interactive=\"1\"]")
	private WebElement play2;

	@FindBy(xpath = "//button[@aria-label='Play']")
	private WebElement play;
	
	@FindBy(xpath = "//(button[@aria-label='Add to Liked Songs' ])[1]")
	private WebElement addtofav;
	
	
	
 
	public SearchBox (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	public void login() {
		login.click();
		
	}
	public void email() {
		email.clear();
		email.sendKeys("phrishi36@gmail.com");
		
	}
	
	public void password() {
		password.clear();
		password.sendKeys("Hrishi@1234");
		
	}
	
	public void loginbutton(){
		loginbutton.click();
	}
	
	public void close() {
		close.click();
	}
	

	public void box(){
		box.click();
	}
	

	public void searchbox() {
		searchbox.click();
		searchbox.sendKeys("Bonita");
		
	}
	
	public void Searchbox2() {
		searchbox.sendKeys("90'bollywood");
	}
	public void browse() {
		browse.click();
		
	}
	
	
	public void play2(){
		play2.click();
	}
	
	
	public void play(){
		play.click();
	}
	
	public void addtofav() {
		addtofav.click();
		
	}
	
	
	
}

