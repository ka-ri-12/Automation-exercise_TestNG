package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Homepage;
import pageObject.Searchproductpage;
import pageObject.VerifyProductdetails;
import testBase.Baseclass;

public class TC_007_SearchProduct extends Baseclass
{
	@Test(groups= {"sanity"})
	public void logut()
	{
		try {
			logger.info(".......Starting ........");
			
			Homepage hp =new Homepage(driver);
			hp.clickproduct();
			
			logger.info("....navigate to product page.....");
			VerifyProductdetails vp = new VerifyProductdetails(driver);
			vp.allproductsdisplayed();
			
			logger.info("......search product .....");
			Searchproductpage sp = new Searchproductpage(driver);
			sp.searchproduct("Tshirts");
			sp.clicksearch();
			sp.searchproductsvisible();
			logger.info("......verifyallproducts .......");
			sp.verifyproductsvisible();
		}catch(Exception e) {
			Assert.fail();
			logger.info("..........failed .......");
		}
	}
}
