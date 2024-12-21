package testcase;

import org.apache.commons.lang3.RandomStringUtils;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountSignuppage;
import pageObject.Homepage;
import pageObject.ValidationOfCreateAccountaftersignup;
import testBase.Baseclass;

public class TC_001_AccountSignup extends Baseclass
{
	@Test(groups= {"Sanity","Functional"})
	

public void test()
{
	logger.info("..........Starting TC_001_AccountSignup........");
	try {
	Homepage hp =new Homepage(driver);
	hp.clicksignup();
	
	logger.info(".........Account signup started...............");
	
	AccountSignuppage accpage = new AccountSignuppage(driver);
	
	accpage.username(randomstring().toLowerCase());
	accpage.setemail(randomalphanumeric()+"@gmail.com");
	accpage.clicksignup();
	accpage.clickmrs();
	accpage.setpwd(randomalphanumeric());
	accpage.selectDateOfBirth("10", "May", "2005");
	 accpage.subscribeToNewsletter();
	accpage.setfirstname(randomstring().toLowerCase());
	accpage.setlastname(randomstring().toLowerCase());
	accpage.setaddress1("123 Elm Street, Springfield");
	accpage.setaddress2("12 Reddy Street");
	accpage.selectCountry("India");
	accpage.setstate("AndhraPradesh");
	accpage.setcity("Guntur");
	accpage.setzipcode("522510");
	accpage.setmobilenumber(randomnumber());
	accpage.clickcreateacc();
  logger.info("..........account signup completed................");
  
	Thread.sleep(2000);
	
	ValidationOfCreateAccountaftersignup validation=new ValidationOfCreateAccountaftersignup(driver);
	
	validation.isAccountCreatedMessageDisplayed();
	

}
catch(Exception e)
{
	Assert.fail();
	logger.info("........................Finish TC_001_AccountSignup...............");
}
}
public String randomstring()
{
	@SuppressWarnings("deprecation")
	String generatedstring =RandomStringUtils.randomAlphabetic(6);
	return generatedstring;
}

public String randomnumber()
{
	@SuppressWarnings("deprecation")
	String generatednumber=RandomStringUtils.randomNumeric(9);
	return generatednumber;
}

public String randomalphanumeric()
{
	@SuppressWarnings("deprecation")
	String generatedalphanumeric =RandomStringUtils.randomAlphanumeric(6);
	return generatedalphanumeric;
}








}
