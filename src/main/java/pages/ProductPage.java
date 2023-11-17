package pages;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
@FindBy(xpath = "//a[@class='product photo product-item-photo']//img[@alt='Desiree Fitness Tee']")
private WebElement product;
@FindBy(xpath = "//div[@id='option-label-size-143-item-167']")
private WebElement size;
@FindBy(xpath = "//div[@id='option-label-color-93-item-56']")
private WebElement colour;
@FindBy(xpath = "//span[.='Add to Cart']")
private WebElement addtocart;
@FindBy(xpath = "//div[@class='message-success success message']")
private WebElement successfulmsg;
 
public void setSuccessfulmsg(WebElement successfulmsg) {
	this.successfulmsg = successfulmsg;
}
public ProductPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getProduct() {
	return product;
}
public WebElement getSize() {
	return size;
}
public WebElement getColour() {
	return colour;
}
public WebElement getAddtocart() {
	return addtocart;
}
public WebElement getSuccessfulmsg() {
	return successfulmsg;
}
public void ProductPage() {
	product.click();
	size.click();
	colour.click();
	addtocart.click();
	
	String text = successfulmsg.getText();
	if(text.contains("You added")) {
		System.out.println("product added successfuly to cart");
	}
		else {
			System.out.println("product not added   to cart");

		}
	}
    
}

