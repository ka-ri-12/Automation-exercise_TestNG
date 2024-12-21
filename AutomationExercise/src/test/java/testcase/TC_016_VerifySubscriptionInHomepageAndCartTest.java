package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.SubscriptionPage;
import testBase.Baseclass;

public class TC_016_VerifySubscriptionInHomepageAndCartTest extends Baseclass
{
	@Test(priority = 1)
public void verifySubscriptionOnHomePage()
{

		SubscriptionPage sp = new SubscriptionPage(driver)	;
		
		// Verify home page is visible
		logger.info(".....verify home page is displayed.......");
        Assert.assertEquals(driver.getTitle(), "Automation Exercise");

        // Scroll down and verify subscription text
        logger.info("......scroll  up to subscription test is visible......");
        Assert.assertTrue(sp.isSubscriptionTextVisible(), "Subscription text is not visible");
        
        sp.enterEmailAndSubscribe("test@example.com");
        
        Assert.assertTrue(sp.isSuccessMessageVisible(), "Success message is not visible");
	
}
		
        @Test(priority = 2)
        public void verifySubscriptionOnCartPage()
        {
        	SubscriptionPage sp = new SubscriptionPage(driver)	;
            // Navigate to cart page
            sp.navigateToCartPage();

            // Scroll down and verify subscription text
            logger.info(".....verify subscription text is visible.......");
            Assert.assertTrue(sp.isSubscriptionTextVisible(), "Subscription text is not visible on Cart page");

            // Enter email and subscribe
            sp.enterEmailAndSubscribe("test@example.com");

            // Verify success message
            logger.info("......verify success msg is displayed......");
            Assert.assertTrue(sp.isSuccessMessageVisible(), "Success message is not visible on Cart page");
        }	
		
		
		
		
		
		
		
		
		
		
		
}

