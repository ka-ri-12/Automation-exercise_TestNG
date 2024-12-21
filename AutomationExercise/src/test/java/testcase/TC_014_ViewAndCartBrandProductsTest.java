package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.BrandProductsPage;
import pageObject.Homepage;
import testBase.Baseclass;

public class TC_014_ViewAndCartBrandProductsTest extends Baseclass
{
	@Test(groups= {"functional","regression"})
public void test()
{
	
		Homepage hp =new Homepage(driver);
		hp.clickproduct();
		
		BrandProductsPage bp = new BrandProductsPage(driver);
		logger.info("......verify Brands are displayed......");
		Assert.assertTrue(bp.isBrandsVisible(), "Brands are not visible on the sidebar");
		
		 bp.clickOnBrandLink();
		 logger.info("......verify brand products are displayed......");
		 Assert.assertTrue(bp.isBrandProductsDisplayed(), "Brand products are not displayed");
		 
		 bp.clickOnAnotherBrandLink();
		 logger.info(".....verify another brand products are displayed.......");
		 Assert.assertTrue(bp.isAnotherBrandProductDisplayed(), "Another brand's products are not displayed");


		
		
	}
}
