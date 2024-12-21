package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends Basepage
{
	
public LogoutPage(WebDriver driver)
{
	super(driver);
}

@FindBy(xpath="//a[normalize-space()='Logout']")
WebElement logout;

@FindBy(xpath="//img[@alt='Website for automation practice']") 
WebElement websiteForAutomationPractic;

public void clicklogout()
{
	logout.click();
}

public boolean msgdisplayed()
{
	return websiteForAutomationPractic.isDisplayed();
}



}
