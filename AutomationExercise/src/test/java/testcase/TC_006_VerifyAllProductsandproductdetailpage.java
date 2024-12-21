package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Homepage;
import pageObject.VerifyProductdetails;
import testBase.Baseclass;

public class TC_006_VerifyAllProductsandproductdetailpage extends Baseclass
{
	@Test(groups= {"regression"})
public void test()
{
	try {
		logger.info("........Starting .......");
		Homepage hp =new Homepage(driver);
		hp.clickproduct();
		
		logger.info(".......navigate product page ......");
		VerifyProductdetails vp = new VerifyProductdetails(driver);
		vp.allproductsdisplayed();
		logger.info("......verify product list....");
		vp.allproductslist();
		vp.clickproduct();
		
	}catch(Exception e)
	{
		Assert.fail();
		logger.info(".....finish .......");
	
	}
		
}
}
