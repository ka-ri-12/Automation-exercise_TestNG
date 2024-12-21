package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.ProductQuantityPage;
import testBase.Baseclass;

public class TC_010_VerifyProductQuantityInCartTest extends Baseclass
{
	@Test(groups= {"functional","regression"})
public void test() throws InterruptedException
{
		
		
		ProductQuantityPage  pq= new ProductQuantityPage (driver);
		
		
		String homePageTitle = driver.getTitle();
		logger.info(".....verify home page is displayed .......");
		
	     Assert.assertTrue(homePageTitle.contains("Automation Exercise"), "Home page is not visible");
		
		pq.clickViewProductButton();
		
		 String productPageTitle = driver.getTitle();
		 logger.info("......verify products detail ......");
	     Assert.assertTrue(productPageTitle.contains("Product Details"), "Product detail page is not opened");
	        
	        pq.setQuantity("4");
	        
	        pq.clickAddToCart();
	        
	        pq.clickViewCart();
		
	        String cartQuantity = pq.getCartQuantity();
	        logger.info("......verify cart quantity......");
	        Assert.assertEquals(cartQuantity, "4", "Product quantity in cart is not as expected");
		
		
		
		}
}
