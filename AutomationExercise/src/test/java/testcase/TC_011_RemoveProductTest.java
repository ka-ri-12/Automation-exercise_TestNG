package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AddproducttocartandRemove;
import pageObject.Homepage;
import testBase.Baseclass;

public class TC_011_RemoveProductTest extends Baseclass
{
@Test(groups= {"functional"})
public void test() throws InterruptedException	
{

	Homepage hp =new Homepage(driver);
	hp.clickproduct();
	logger.info(".....open the products page.....");
	
	AddproducttocartandRemove ap = new AddproducttocartandRemove(driver);
	
	ap.addFirstProductToCart();
	
	logger.info("......click on view cart......");
	ap.clickViewCart();
	
	ap.removeProductFromCart();
	logger.info("......verify cart is empty......");
	Assert.assertTrue(ap.isCartEmpty(), "The cart is not empty!");
	
	
	
	
	
	
	
	
}	
	
}
