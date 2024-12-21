package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaceOrderPage extends Basepage
{
public PlaceOrderPage(WebDriver driver)
{
	super(driver);
}

@FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
WebElement proceedToCheckoutButton;

@FindBy(xpath = "//ul[@id='address_delivery']")
WebElement addressDetails;

@FindBy(xpath = "//h2[normalize-space()='Review Your Order']")
WebElement reviewOrder;

@FindBy(xpath = "//div[@class='form-group']//textarea[@class='form-control']")
WebElement commentTextArea;

@FindBy(xpath = "//a[normalize-space()='Place Order']")
WebElement placeOrderButton;

@FindBy(xpath = "//input[@name='name_on_card']")
WebElement nameOnCardField;

@FindBy(xpath = "//input[@name='card_number']")
WebElement cardNumberField;

@FindBy(xpath = "//input[@name='cvc']")
WebElement cvcField;

@FindBy(xpath = "//input[@placeholder='MM']")
WebElement expirationDateField;

@FindBy(xpath = "//input[@placeholder='YYYY']")
WebElement  expirationYearField;

@FindBy(xpath = "//button[@id='submit']")
WebElement payAndConfirmOrderButton;

/*@FindBy(xpath = "//p[contains(text(),'Your order has been placed successfully!')]")
WebElement successMessage;*/

@FindBy(xpath = "//p[normalize-space()='Congratulations! Your order has been confirmed!']")
WebElement confirmedMessage;

@FindBy(xpath = "//a[normalize-space()='Download Invoice']")
WebElement downloadInvoiceButton;

@FindBy(xpath = "//a[normalize-space()='Continue']")
WebElement btncontinue;


public void clickProceedToCheckout() {
    proceedToCheckoutButton.click();
}

public boolean verifyAddressAndOrderDetails() {
    return addressDetails.isDisplayed() && reviewOrder.isDisplayed();
}

public void enterComment(String comment) throws InterruptedException 
{
	Thread.sleep(2000);
    commentTextArea.sendKeys(comment);
}

public void clickPlaceOrder() {
    placeOrderButton.click();
}

public void enterPaymentDetails(String name, String cardNumber, String cvc, String expirationDate, String expirationYear) 
{
    nameOnCardField.sendKeys(name);
    cardNumberField.sendKeys(cardNumber);
    cvcField.sendKeys(cvc);
    expirationDateField.sendKeys(expirationDate);
    expirationYearField.sendKeys(expirationYear);
}


public void clickPayAndConfirmOrder() {
    payAndConfirmOrderButton.click();
}

public boolean verifyOrderSuccessMessage() {
    return confirmedMessage.isDisplayed();
}

public void downloadInvoice() {
    downloadInvoiceButton.click();
}

public void clickcontinue()
{
	btncontinue.click();
}











}
