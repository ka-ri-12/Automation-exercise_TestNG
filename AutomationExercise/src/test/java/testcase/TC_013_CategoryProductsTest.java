package testcase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pageObject.CategoryProductsPage;
import testBase.Baseclass;

public class TC_013_CategoryProductsTest extends Baseclass
{
	@Test(groups= {"regression"})
public void test()
{
	
		CategoryProductsPage cp = new CategoryProductsPage(driver);
		
		logger.info("......Categories is displayed ......");
		assertTrue(cp.isCategoriesVisible(), "Categories are not visible");
		
		 cp.clickWomenCategory();
		
		 logger.info("....click on sub category........");
		 cp.clickWomenDressSubcategory();
		
		 logger.info(".....verify  women category page is displayed.......");
		 assertTrue(cp.isWomenCategoryPageDisplayed(), "Women - Tops Products page is not displayed");
		 
		 cp.clickMenCategory();
		 logger.info(".....click on men sub category.......");
	        cp.clickMenTshirtsSubcategory();
	        
	        logger.info(".....verify men category page is displayed.......");
	        assertTrue(cp.isMenCategoryPageDisplayed(), "Men - Tshirts Products page is not displayed");

		
				
}
}
