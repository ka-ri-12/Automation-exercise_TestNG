package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Homepage;
import pageObject.LoginPage;
import testBase.Baseclass;

public class TC_002_LoginPage extends Baseclass
{
	@Test(groups={"sanity", "regression"})
	public void logintest()
	{
		logger.info(".....Starting TC_002_Login.......");
	
	try {	
		Homepage hp =new Homepage(driver);
	hp.clicksignup();
	
	logger.info(".......Starting TC_002_entering login credentials......");
	
	LoginPage lp= new LoginPage(driver);
	lp.loginpagedisplayed();
	lp.setemail(p.getProperty("email"));
	lp.setpassword(p.getProperty("pwd"));
	lp.clicklogin();
	
	logger.info("......completed TC_002_login.....");
	lp.isLoggedInAsVisible();
	lp.dltaccount();
	logger.info("......validation TC_002_login......");
	lp.accdeletedvisible();
	lp.clickcon();
	
	
	
	}
	catch(Exception e)
	{
		Assert.fail();
	}
	
	logger.info("........finish TC_002_login......");
	
	}
	
}
