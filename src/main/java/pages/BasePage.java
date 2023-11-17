package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//li//a")
	WebElement header;
	
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