package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnScreenSong {

	@FindBy(xpath = "(//button[@data-testid='play-button'])[1]")
	private WebElement Play;
	
	@FindBy(xpath = "//ul[@aria-label='Your Library']")
	private WebElement yourlibr;
	
	public OnScreenSong(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void play() {
		Play.click();
	}
	
	public void yourlib() {
		yourlibr.click();
	}
}
