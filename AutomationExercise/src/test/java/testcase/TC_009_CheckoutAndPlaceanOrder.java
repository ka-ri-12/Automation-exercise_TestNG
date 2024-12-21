package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AddproducttocartandRemove;
import pageObject.Homepage;
import pageObject.LoginPage;
import pageObject.PlaceOrderPage;
import testBase.Baseclass;

public class TC_009_CheckoutAndPlaceanOrder extends Baseclass
{
	@Test(groups= {"regression","sanity"})
public void test() throws InterruptedException
{
	
		Homepage hp =new Homepage(driver);	
		hp.clicksignup();
		
		logger.info(".......entering login credentials.......");
		
		LoginPage lp= new LoginPage(driver);
		lp.loginpagedisplayed();
		lp.setemail("safa76@gmail.com");
		lp.setpassword("safask7689");
		lp.clicklogin();
		
		logger.info(".........completed login...........");
		lp.isLoggedInAsVisible();
	//click on products
		hp.clickproduct();
		
//add products to cart  and open cart
		AddproducttocartandRemove ap = new AddproducttocartandRemove(driver);
		logger.info(".......first product added to cart.........");
		ap.addFirstProductToCart();
		
		logger.info("......Clicked Continue Shopping...............");
		ap.clickContinueShopping();
		
		logger.info(".......second product added to cart............");
		ap.addSecondProductToCart();
		
		logger.info(".......Navigated to Cart Page........");
		ap.clickViewCart();
		
		
//proceed to checkout
		
		 PlaceOrderPage po=new	PlaceOrderPage(driver);
		 po.clickProceedToCheckout();
		 logger.info("......verify address and order details......");
		 Assert.assertTrue(po.verifyAddressAndOrderDetails(), "Address or order details not displayed!");
		
		    po.enterComment("Please deliver between 10 AM and 12 PM.");
	        po.clickPlaceOrder();
		
	        po.enterPaymentDetails("Test User", "4111111111111111", "123", "12" ,"2027");
	        po.clickPayAndConfirmOrder();
		
	        logger.info("...... verify success message ......");
	        Assert.assertTrue(po.verifyOrderSuccessMessage(), "Order placement failed!");
		
	        po.downloadInvoice();
	        po.clickcontinue();
		
		
		
		
		
		
		
		
		
}
}
