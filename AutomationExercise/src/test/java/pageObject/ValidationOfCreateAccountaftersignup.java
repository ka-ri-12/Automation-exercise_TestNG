package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ValidationOfCreateAccountaftersignup extends Basepage
{
	
public ValidationOfCreateAccountaftersignup(WebDriver driver)
{
	super(driver);
}

@FindBy(xpath="//h2[@class='title text-center']")
WebElement accountCreatedMessage;


public void isAccountCreatedMessageDisplayed() throws InterruptedException
{
	 if(accountCreatedMessage.isDisplayed())
	 {
		 String conmsg =accountCreatedMessage.getText();
		 Assert.assertEquals(conmsg, "ACCOUNT CREATED!");
		 Assert.assertTrue(true);
		// Assert.assertEquals(conmsg, "ACCOUNT CREATED!");
	 }
	 else {
		 Thread.sleep(3000);
		 Assert.fail("Account creation message is not displayed");
	 }
	 }
	 
	 




@FindBy(xpath = "//a[normalize-space()='Continue']")
WebElement continueButton;

@FindBy(xpath = "//li[10]//a[1]")
WebElement loggedInAsText;

@FindBy(xpath = "//header[@id='header']//li[5]")
WebElement deleteAccountButton;

@FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
WebElement accountDeletedText;




public void clickContinue() {
    continueButton.click();
}

public boolean isLoggedInAsVisible() {
    return loggedInAsText.isDisplayed();
}

public void clickDeleteAccount() {
    deleteAccountButton.click();
}

public boolean isAccountDeletedVisible() {
    return accountDeletedText.isDisplayed();
}
}


