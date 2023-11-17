package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
public WebDriver driver;
		
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
 		driver= new ChromeDriver();
		driver.manage().window().maximize();
 		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}
	
	//@AfterMethod
	public void tearDown()
	{
		if(driver!=null)
			driver.quit();
	}
	
}
