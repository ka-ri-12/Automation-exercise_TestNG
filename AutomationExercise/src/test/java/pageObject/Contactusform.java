package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contactusform extends Basepage
{
public Contactusform(WebDriver driver)
{
	super(driver);
}

@FindBy(xpath="//h2[normalize-space()='Get In Touch']") 
WebElement getInTouch;


@FindBy(xpath="//input[@placeholder='Name']")  
WebElement name;

@FindBy(xpath="//input[@placeholder='Email']")
WebElement email;

@FindBy(xpath="//input[@placeholder='Subject']")  
WebElement subject;

@FindBy(xpath="//textarea[@id='message']")  
WebElement yourMessageHere;

@FindBy(xpath="//input[@name='upload_file']")  
WebElement uploadFile;

@FindBy(xpath="//input[@name='submit']") 
WebElement submit;

public boolean checkgetintouchdisplayornot()
{
	return getInTouch.isDisplayed();
}

public void setname(String user)
{
	name.sendKeys(user);
}

public void setemail(String user)
{
	email.sendKeys(user);
}

public void setsubject(String user)
{
	subject.sendKeys(user);
}

public void setmessage(String user)
{
	yourMessageHere.sendKeys(user);
}

public void uploadFile(String filePath) throws InterruptedException 
{
	Thread.sleep(2000);
    uploadFile.sendKeys(filePath);
}

public void clicksubmit() throws InterruptedException
{
	Thread.sleep(2000);
	 submit.click();
}
}
