package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConst {
	public WebDriver driver;
	
	@BeforeMethod
	public void preCondition(){
		driver=new FirefoxDriver();
		driver.get("http://local");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod 
	public void postCondition(){
		driver.close();
	}
}

