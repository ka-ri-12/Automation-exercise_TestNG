package testcase;

import org.testng.annotations.Test;

import pageObject.Contactusform;
import pageObject.Homepage;
import testBase.Baseclass;

public class TC_005_ContactUsform extends Baseclass
{
	@Test(groups= {"functional","regression"})
public void test() throws InterruptedException
 {
	try {
			logger.info("......starting.......");
			Homepage hp =new Homepage(driver);
			logger.info("......click on contact us.......");
			hp.clickcontactus();
			
			Contactusform cf=new Contactusform(driver);
			cf.checkgetintouchdisplayornot();
			logger.info("......enter details.......");
			cf.setname("nashma");
			cf.setemail("nashma76@gmail.com");
			cf.setsubject("Test Subject");
			cf.setmessage("This is a test message");
			
			logger.info(".......upload file......");
			
			cf.uploadFile("C:\\workspace\\java programs-aug12\\javaprogramming\\src\\day1");
			cf.clicksubmit();
			
	
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
