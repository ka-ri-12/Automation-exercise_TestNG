package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubscriptionPage extends Basepage
{
public SubscriptionPage(WebDriver driver)
{
	super(driver);
}


@FindBy(xpath = "//h2[normalize-space()='Subscription']")
public WebElement subscriptionText;

@FindBy(xpath= "//input[@id='susbscribe_email']")
public WebElement emailInput;

@FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
public WebElement subscribeButton;

@FindBy(xpath = "//div[@class='alert-success alert']")
public WebElement successMessage;

@FindBy(xpath = "//a[normalize-space()='Cart']//i[@class='fa fa-shopping-cart']")
public WebElement cartButton;


public boolean isSubscriptionTextVisible() {
    return subscriptionText.isDisplayed();
}

public void enterEmailAndSubscribe(String email) {
    emailInput.clear();
    emailInput.sendKeys(email);
    subscribeButton.click();
}

public boolean isSuccessMessageVisible() {
    return successMessage.isDisplayed();
}

public void navigateToCartPage() {
    cartButton.click();
}











}
