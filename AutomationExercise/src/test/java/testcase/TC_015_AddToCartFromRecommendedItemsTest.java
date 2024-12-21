package testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.RecommendedItemsPage;
import testBase.Baseclass;

public class TC_015_AddToCartFromRecommendedItemsTest extends Baseclass
{
	@Test(groups= {"functional","sanity"})
public void test ()
{
	
		
		RecommendedItemsPage rp = new RecommendedItemsPage(driver)	;
		
		logger.info(".....scroll to bottom of page.......");
		 // Scroll to bottom of page
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
       
        logger.info(".....verify recommended items are displayed.......");
        Assert.assertTrue(rp.isRecommendedItemsHeaderVisible(), "'RECOMMENDED ITEMS' is not visible");
        
        rp.clickAddToCart();
        
        rp.clickViewCart();
		
        logger.info(".....verify products displayed in cart.......");
        Assert.assertTrue(rp.isProductDisplayedInCart(), "Product is not displayed in the cart");
		
		
		
		}
}
