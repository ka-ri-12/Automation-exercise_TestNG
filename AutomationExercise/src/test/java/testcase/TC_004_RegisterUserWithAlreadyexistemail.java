
package testcase;

import org.testng.annotations.Test;

import pageObject.AccountSignuppage;
import pageObject.Homepage;
import testBase.Baseclass;

public class TC_004_RegisterUserWithAlreadyexistemail extends Baseclass

{
	@Test(groups= {"sanity", "functional"})
public void test()
{
		logger.info("......starting......");
		Homepage hp =new Homepage(driver);
		logger.info("......click o signup.......");
		hp.clicksignup();
		
		AccountSignuppage accpage = new AccountSignuppage(driver);
		accpage.username("mena");
		accpage.setemail("mena76@gmail.com");
		accpage.clicksignup();
		logger.info("......check email already exist.......");
		accpage.checkemailalreadyexist();
		
}
}
