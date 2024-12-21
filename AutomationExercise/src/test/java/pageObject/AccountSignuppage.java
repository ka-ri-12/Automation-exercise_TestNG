package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountSignuppage extends Basepage
{
public AccountSignuppage(WebDriver driver)
{
	super(driver);
}

@FindBy(xpath="//input[@placeholder='Name']") 
WebElement uname;

@FindBy(xpath="//input[@data-qa='signup-email']") 
WebElement emailAddress;

@FindBy(xpath="//button[normalize-space()='Signup']") 
WebElement signup;

//Register User With Already exist email    ..to verify for error msg
@FindBy(xpath="//p[normalize-space()='Email Address already exist!']") 
WebElement emailAddressAlreadyExist;


//enter account details
@FindBy(xpath="//input[@id='id_gender2']") 
WebElement mrs;



@FindBy(xpath="//input[@id='password']") 
WebElement password;

@FindBy(xpath="//select[@id='days']") 
WebElement dayDropdown;

@FindBy(xpath="//select[@id='months']")
WebElement monthDropdown;

@FindBy(xpath="//select[@id='years']")  
WebElement yearDropdown;

@FindBy(xpath="//input[@id='newsletter']")
WebElement newsletterCheckbox;

@FindBy(xpath="//input[@id='first_name']") 
WebElement firstName;

@FindBy(xpath="//input[@id='last_name']")
WebElement lastName;

@FindBy(xpath="//input[@id='address1']") 
WebElement addressStreetAddress1;

@FindBy(xpath="//input[@id='address2']") 
WebElement addressStreetAddress2;

@FindBy(xpath="//select[@id='country']")  
WebElement countryDropdown;


@FindBy(xpath="//input[@id='state']")  
WebElement state;

@FindBy(xpath="//input[@id='city']")  
WebElement city;

@FindBy(xpath="//input[@id='zipcode']")  
WebElement zipcode;

@FindBy(xpath="//input[@id='mobile_number']") 
WebElement mobileNumber;

@FindBy(xpath="//button[normalize-space()='Create Account']") 
WebElement createAccount;


public void username(String name)
{
	uname.sendKeys(name);
}

public void setemail(String email)
{
	emailAddress.sendKeys(email);
}

public void clicksignup()
{
	signup.click();
}
//for email is already exist
public boolean checkemailalreadyexist()
{
	return emailAddressAlreadyExist.isDisplayed();
}
//for account detail methods
public void  clickmrs()
{
	mrs.click();
}



public void  setpwd(String pwd)
{
	password.sendKeys(pwd);
}

public void  setfirstname(String fname)
{
	firstName.sendKeys(fname);
}

public void  setlastname(String lname)
{
	lastName.sendKeys(lname);
}

public void  setaddress1(String address)
{
	addressStreetAddress1.sendKeys(address);
}
public void  setaddress2(String address)
{
	addressStreetAddress2.sendKeys(address);
}

public void setstate (String user)
{
	state.sendKeys(user);
}

public void setcity (String user)
{
	city.sendKeys(user);
}

public void setzipcode (String user)
{
	zipcode.sendKeys(user);
}

public void setmobilenumber(String user)
{
	mobileNumber.sendKeys(user);
}
public void clickcreateacc ()
{
	createAccount.click();
}
public void subscribeToNewsletter() {
    if (!newsletterCheckbox.isSelected()) {
        newsletterCheckbox.click();
    }
}
public void selectCountry(String country) {
    Select selectCountry = new Select(countryDropdown);
    selectCountry.selectByVisibleText(country);
}

public void selectDateOfBirth(String day, String month, String year) {
    new Select(dayDropdown).selectByVisibleText(day);
    new Select(monthDropdown).selectByVisibleText(month);
    new Select(yearDropdown).selectByVisibleText(year);
}



}
