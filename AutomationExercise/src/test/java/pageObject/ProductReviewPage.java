package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReviewPage extends Basepage
{
public ProductReviewPage(WebDriver driver)
{
	super(driver);
}



@FindBy(xpath = "//a[normalize-space()='Write Your Review']")
WebElement writeYourReviewSection;

@FindBy(xpath = "//input[@id='name']")
WebElement nameInput;

@FindBy(xpath = "//input[@id='email']")
WebElement emailInput;

@FindBy(xpath = "//textarea[@placeholder='Add Review Here!']")
WebElement reviewInput;

@FindBy(xpath= "//button[@id='button-review']")
WebElement submitButton;

@FindBy(xpath = "//span[normalize-space()='Thank you for your review.']")
WebElement successMessage;



public boolean isWriteYourReviewVisible() {
    return writeYourReviewSection.isDisplayed();
}

public void enterReviewDetails(String name, String email, String review) {
    nameInput.sendKeys(name);
    emailInput.sendKeys(email);
    reviewInput.sendKeys(review);
}

public void clickSubmitButton() {
    submitButton.click();
}

public boolean isSuccessMessageDisplayed() {
    return successMessage.isDisplayed();
}


}
