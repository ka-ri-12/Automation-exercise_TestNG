package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Homepage;
import pageObject.ProductQuantityPage;
import pageObject.ProductReviewPage;
import testBase.Baseclass;

public class TC_012_AddProductReviewTest extends Baseclass
{
	@Test(groups= {"sanity"})
public void test() 
{
	
		Homepage hp =new Homepage(driver);
		
		String homePageTitle = driver.getTitle();
		logger.info("......verify home page is displayed......");
        Assert.assertTrue(homePageTitle.contains("Automation Exercise"), "Home page is not visible");
        hp.clickproduct();
        
        
        ProductQuantityPage  pq= new ProductQuantityPage (driver);
        
        logger.info(".....click view product.......");
        pq.clickViewProductButton();
        
        ProductReviewPage pr= new ProductReviewPage(driver);
	    
	     
	    
        logger.info(".....verify write your review is visible.......");
	     Assert.assertTrue(pr.isWriteYourReviewVisible(), "Write Your Review section not visible.");
	     pr.enterReviewDetails("John Doe", "johndoe@example.com", "Great product! Highly recommend.");

	     pr.clickSubmitButton();
	     logger.info("......verify success message is displayed......");
	    Assert.assertTrue(pr.isSuccessMessageDisplayed(), "Success message not displayed.");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
