package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Basepage
{
	
public LoginPage(WebDriver driver)
{
	super(driver);
	}

@FindBy(xpath="//h2[normalize-space()='Login to your account']") 
WebElement loginToYourAccount;

@FindBy(xpath="//input[@data-qa='login-email']") 
WebElement emailAddress;

@FindBy(xpath="//input[@placeholder='Password']") 
WebElement password;

@FindBy(xpath="//button[normalize-space()='Login']") 
WebElement login;


@FindBy(xpath="//header[@id='header']//li[1]//a[1]") 
WebElement loggedInAsMunni;

@FindBy(xpath="//a[normalize-space()='Delete Account']") 
WebElement deleteAccount;


@FindBy(xpath="//b[normalize-space()='Account Deleted!']") 
WebElement accountDeleted;

@FindBy(xpath="//a[normalize-space()='Continue']")
WebElement clickcontinue;




public void loginpagedisplayed()
{
	loginToYourAccount.isDisplayed();
}

public void setemail(String email)
{
	emailAddress.sendKeys(email);
}

public void setpassword(String pwd)
{
	password.sendKeys(pwd);
}

public void clicklogin()
{
	login.click();
}
public boolean isLoggedInAsVisible() {
	return loggedInAsMunni.isDisplayed();
}

public void dltaccount()
{
	deleteAccount.click();
}
public boolean accdeletedvisible()
{
	return accountDeleted.isDisplayed();
}

public void clickcon()
{
	clickcontinue.click();
}
}
