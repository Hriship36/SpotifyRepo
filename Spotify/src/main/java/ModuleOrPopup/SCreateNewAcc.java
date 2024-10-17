package ModuleOrPopup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SCreateNewAcc {
	

	@FindBy(xpath = "//input[@id='username']")
	private WebElement email;
	
	@FindBy(xpath = "(//button[@aria-label='Close'])[1]")
	private WebElement button;
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement next;
	
	@FindBy (xpath ="//input[@id='new-password']")
	private WebElement password;
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement next1;
	
	@FindBy(xpath = "//input[@id='displayName']")
	private WebElement name;
	
	@FindBy(xpath = "//input[@id='year']")
	private WebElement year;
	
	@FindBy (xpath ="//select[@id='month']")
	private WebElement month;
	

	@FindBy(xpath = "//input[@id='day']")
	private WebElement day;
	
	@FindBy (xpath ="//span[text()='Man']")
	private WebElement gender;
	

	@FindBy(xpath = "//span[text()='Next']")
	private WebElement next2;
	
	@FindBy (xpath ="(//span[@class='Indicator-sc-1airx73-0 lhZnAn'])[1]")
	private WebElement checkbox;
	
	private WebDriverWait wait;
	
	
	public SCreateNewAcc (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver = new ChromeDriver();
		driver.get("https://www.spotify.com/in-en/signup?flow_id=997b2437-7560-463c-abc8-91db823aacc4%3A1726604294&forward_url=https%3A%2F%2Faccounts.spotify.com%2Fen%2Fstatus");
	}
	
	
	public void email(){
		email.sendKeys("Hrishipatil00@gmail.com");
	}
	
	public void button() {
		wait.until(ExpectedConditions.visibilityOf(button));
		button.click();
	}
	public void next() {
		next.click();
		wait.until(ExpectedConditions.visibilityOf(next));
	}
	
	public void password() {
		password.sendKeys("Hrishi@12345");;
		wait.until(ExpectedConditions.visibilityOf(password));
	}
	public void next1(){
		next1.click();
	}
	
	public void name() {
		name.sendKeys("Hrishi");
		
	}
	public void year() {
		year.sendKeys("1997");
		
	}
	
	public void month() {
		Select select = new Select(month);
		select.selectByVisibleText("October");
	}
	
	public void day() {
		day.sendKeys("02");
		
	}
	
	public void gender() {
		gender.isSelected();
		gender.click();
		
	}
	
	public void next2(){
		next2.click();
		wait.until(ExpectedConditions.visibilityOf(next2));
	}
	
	public void checkbox() {
		checkbox.isSelected();
		checkbox.click();
		
	}
	
}
