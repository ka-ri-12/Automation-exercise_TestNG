package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage
{
public Homepage(WebDriver driver)
{
	super(driver);
}

@FindBy(xpath="//a[normalize-space()='Signup / Login']") 
WebElement signup;

@FindBy(xpath="//a[normalize-space()='Contact us']") 
WebElement contactUs;

@FindBy(xpath="//a[@href='/products']") 
WebElement Products;

public void clicksignup()
{
	signup.click();
}

public void clickcontactus()
{
	contactUs.click();
}

public void clickproduct()
{
	Products.click();
}


















}
