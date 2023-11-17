package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
    
	public HomePage(WebDriver driver) {
	super(driver);
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//h1")
	WebElement Header;
	
	public void navigateTo(String Womennn, String topps, String Teessss) throws InterruptedException {
		Thread.sleep(4000);
		
		WebElement womenele = driver.findElement(By.xpath("//span[normalize-space()='"+Womennn+"']"));
		new Actions(driver).moveToElement(womenele);
		womenele.click();
		
		
		Thread.sleep(1000);
		WebElement topss = driver.findElement(By.xpath("//a[contains(text(),'"+topps+"')]"));
		new Actions(driver).moveToElement(topss);
		topss.click();
		
	
		WebElement categ = driver.findElement(By.xpath("//div[normalize-space()='Category']"));
		categ.click();
		
		WebElement teessele = driver.findElement(By.xpath("//a[contains(text(),'"+Teessss+"')]"));
		new Actions(driver).moveToElement(teessele);
		teessele.click();

		
	}

}
