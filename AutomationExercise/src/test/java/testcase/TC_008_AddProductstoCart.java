package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AddproducttocartandRemove;
import pageObject.Homepage;
import testBase.Baseclass;

public class TC_008_AddProductstoCart extends Baseclass
{
	@Test(groups= {"functional"})
	public void test()
	{
		logger.info("....Starting ........");
	try {
		Homepage hp =new Homepage(driver);
		logger.info(".....open the products page.....");
		hp.clickproduct();
		
		
		
		AddproducttocartandRemove ap = new AddproducttocartandRemove(driver);
		logger.info("......first product added to cart......");
		ap.addFirstProductToCart();
		
		logger.info(".....Clicked Continue Shopping...............");
		ap.clickContinueShopping();
		
		
		logger.info("........second product added to cart........");
		ap.addSecondProductToCart();
		
		logger.info("........Navigated to Cart Page.........");
		ap.clickViewCart();
		

		String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Checkout"), "Page title does not contain 'Checkout'.");
        logger.info(".......Products successfully added to cart......");

    } catch (Exception e) {
        logger.error("Error encountered: " + e.getMessage());
        Assert.fail("Test case failed due to an exception.");
    }

    logger.info("......Finished Add Products to Cart Test..........");

	}
	
}
