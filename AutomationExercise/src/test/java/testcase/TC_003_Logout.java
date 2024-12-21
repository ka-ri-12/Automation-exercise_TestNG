package testcase;

import org.testng.annotations.Test;

import pageObject.Homepage;
import pageObject.LoginPage;
import pageObject.LogoutPage;
import testBase.Baseclass;

public class TC_003_Logout extends Baseclass
{
	@Test(groups= {"functional"})
public void logut()
{
		logger.info(".....Starting TC_003_Logout..");
		
		Homepage hp =new Homepage(driver);
		hp.clicksignup();
		
		logger.info(".....enter login details.......");
		LoginPage lp= new LoginPage(driver);
		lp.loginpagedisplayed();
		lp.setemail("shahid76@gmail.com");
		lp.setpassword("shahid1234");
		lp.clicklogin();
		lp.isLoggedInAsVisible();
		
		LogoutPage lg = new LogoutPage(driver);
		lg.clicklogout();
		lg.msgdisplayed();
		logger.info("......................Finish TC_003_Logout............");
		
}
}
