package test;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductPage;

public class DemoTest extends BaseTest
{

    @Test
    public void DemoExample() throws InterruptedException
    {
    
    	// Application URL : https://magento.softwaretestingboard.com/
    	    
        HomePage homepage = new HomePage(driver);
        homepage.navigateTo("Women","Tops","Tees");
        ProductPage pp=new ProductPage(driver);
        pp.ProductPage();
        
        
        // 1. Select any product
        
        // 2. Select the size, color and click Add to cart
		
		// 3. Verify the message "You added <ProdcutName> to your shopping cart.”
  }
}