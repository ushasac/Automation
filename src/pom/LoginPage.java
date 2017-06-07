package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	@FindBy(id="username")
	private WebElement unTextBox;
    
	@FindBy(name="pwd")
	private WebElement pwTextBox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath="//span[contains(.,'inavlid')]")
	private WebElement errMsg;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String un){
		unTextBox.sendKeys(un);
		
	}
	
	public void setPassword(String pw){
		pwTextBox.sendKeys(pw);
		
	}
	
}